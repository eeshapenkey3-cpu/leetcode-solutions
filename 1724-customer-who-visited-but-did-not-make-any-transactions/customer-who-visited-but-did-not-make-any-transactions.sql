# Write your MySQL query statement below
SELECT customer_id, COUNT(customer_id) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions t
ON v.visit_id = t.visit_id
WHERE NOT EXISTS
    (
        SELECT * FROM Transactions WHERE v.visit_id = t.visit_id
    )
GROUP BY customer_id