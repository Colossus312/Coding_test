WITH FirstGen AS (
    SELECT ID AS Gen1_ID
    FROM ECOLI_DATA
    WHERE PARENT_ID IS NULL
),
     SecondGen AS (
         SELECT E.ID AS Gen2_ID
         FROM ECOLI_DATA E
                  JOIN FirstGen F ON E.PARENT_ID = F.Gen1_ID
     ),
     ThirdGen AS (
         SELECT E.ID AS Gen3_ID
         FROM ECOLI_DATA E
                  JOIN SecondGen S ON E.PARENT_ID = S.Gen2_ID
     )
SELECT
    Gen3_ID AS ID
FROM
    ThirdGen
ORDER BY
    Gen3_ID ASC;
