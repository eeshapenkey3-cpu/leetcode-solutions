# Write your MySQL query statement below
SELECT p.product_id, IFNULL(ROUND(sum(price*units)/sum(units),2),0) AS average_price from Prices as p
left join UnitsSold as u
on p.product_id = u.product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
Group by product_id;