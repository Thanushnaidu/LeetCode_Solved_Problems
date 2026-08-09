# Write your MySQL query statement below
select class from (select class, count(*) as cnt from Courses group by class )t where cnt>5;