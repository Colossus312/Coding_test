SELECT
    RH.HISTORY_ID,
    ROUND(
                CR.DAILY_FEE * (DATEDIFF(RH.END_DATE, RH.START_DATE) + 1) *
                COALESCE(
                            (1 - (SELECT DP.DISCOUNT_RATE FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN DP
                                  WHERE DP.CAR_TYPE = CR.CAR_TYPE
                                    AND (DATEDIFF(RH.END_DATE, RH.START_DATE) + 1) >= CASE
                                                                                          WHEN DP.DURATION_TYPE = '90일 이상' THEN 90
                                                                                          WHEN DP.DURATION_TYPE = '30일 이상' THEN 30
                                                                                          WHEN DP.DURATION_TYPE = '7일 이상' THEN 7
                                                                                          ELSE 0
                                      END
                                  ORDER BY DP.DISCOUNT_RATE DESC LIMIT 1) / 100.0),
            1)
    ) AS FEE
FROM
    CAR_RENTAL_COMPANY_CAR CR
        JOIN
    CAR_RENTAL_COMPANY_RENTAL_HISTORY RH ON CR.CAR_ID = RH.CAR_ID
WHERE
        CR.CAR_TYPE = '트럭'
ORDER BY
    FEE DESC,
    RH.HISTORY_ID DESC;
