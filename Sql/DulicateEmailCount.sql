/* Sql Query to find duplicate email addresses in a users table, 
you can use a SQL query that groups the records by the email column and then filters for groups with more than one occurrence.
*/

SELECT email, COUNT(*) as email_count
FROM users
GROUP BY email
HAVING COUNT(*) > 1;
