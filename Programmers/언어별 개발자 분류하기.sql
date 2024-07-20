WITH Skills AS (
    SELECT
        D.ID,
        D.EMAIL,
        D.FIRST_NAME,
        D.LAST_NAME,
        MAX(CASE WHEN S.CATEGORY = 'Front End' THEN 1 ELSE 0 END) AS HAS_FRONT_END,
        MAX(CASE WHEN S.NAME = 'Python' THEN 1 ELSE 0 END) AS HAS_PYTHON,
        MAX(CASE WHEN S.NAME = 'C#' THEN 1 ELSE 0 END) AS HAS_CSHARP
    FROM
        DEVELOPERS D
            JOIN
        SKILLCODES S ON (D.SKILL_CODE & S.CODE) = S.CODE
    GROUP BY
        D.ID, D.EMAIL, D.FIRST_NAME, D.LAST_NAME
),
     Grades AS (
         SELECT
             ID,
             EMAIL,
             FIRST_NAME,
             LAST_NAME,
             CASE
                 WHEN HAS_FRONT_END = 1 AND HAS_PYTHON = 1 THEN 'A'
                 WHEN HAS_CSHARP = 1 THEN 'B'
                 WHEN HAS_FRONT_END = 1 THEN 'C'
                 END AS GRADE
         FROM
             Skills
     )
SELECT
    GRADE,
    ID,
    EMAIL
FROM
    Grades
WHERE
    GRADE IS NOT NULL
ORDER BY
    GRADE ASC,
    ID ASC;
