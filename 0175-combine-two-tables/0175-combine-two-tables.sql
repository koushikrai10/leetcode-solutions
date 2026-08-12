# Write your MySQL query statement below
SELECT firstName,lastName,city,state
FROM Person
LEft JOIN Address
ON Person.personId=Address.personId;


