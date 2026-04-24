# Write your MySQL query statement below
SELECT u.name as NAME, SUM(t.amount) AS BALANCE 
FROM Users u
LEFT JOIN Transactions t
ON u.account = t.account
GROUP BY t.account
HAVING BALANCE > 10000