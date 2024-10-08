WITH MaxSizePerYear AS (
    SELECT
        EXTRACT(YEAR FROM DIFFERENTIATION_DATE) AS YEAR,
    MAX(SIZE_OF_COLONY) AS MAX_SIZE
FROM
    ECOLI_DATA
GROUP BY
    EXTRACT(YEAR FROM DIFFERENTIATION_DATE)
    ),
    EcoliWithDeviation AS (
SELECT
    E.ID,
    EXTRACT(YEAR FROM E.DIFFERENTIATION_DATE) AS YEAR,
    (M.MAX_SIZE - E.SIZE_OF_COLONY) AS YEAR_DEV
FROM
    ECOLI_DATA E
    JOIN
    MaxSizePerYear M ON EXTRACT(YEAR FROM E.DIFFERENTIATION_DATE) = M.YEAR
    )
SELECT
    YEAR,
    YEAR_DEV,
    ID
FROM
    EcoliWithDeviation
ORDER BY
    YEAR ASC,
    YEAR_DEV ASC;
