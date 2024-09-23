/*
 Sql query will return the account that has the highest transaction value along with the highest transaction amount
*/

WITH AccountWithHighestTransaction AS (
    SELECT 
        a.id AS account_id,
        a.account_name,
        MAX(t.transaction_value) AS highest_transaction_value
    FROM 
        accounts a
    JOIN 
        transactions t ON a.id = t.account_id
    GROUP BY 
        a.id, a.account_name
)

SELECT * 
FROM AccountWithHighestTransaction
ORDER BY highest_transaction_value DESC
LIMIT 1;
