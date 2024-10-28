## Duplicates in SQL
- A table can have duplicate tuples, unless this would violate an integrity constraint.
- And `SELECT-FROM-WHERE (SFW)` statements leave duplicates in, unless you say not to!
- Why?
	- Getting rid of duplicates is expensive! 
	- We may want the duplicates because they tell us how many times something occurred.

### Bags in SQL
- SQL treats tables as “bags” (or “multisets”) rather than sets.
- Bags are just like sets, but duplicates are allowed.
>[!example]
>- $\{6, 2, 7, 1, 9\}$ is a set and a bag
>- $\{6, 2, 7, 1, 9, 1\}$ is not a set but a bag

- Let sets, order doesn't matter: $\{6, 2, 7, 1, 9, 1\}=\{1, 1, 2, 6, 7, 9\}$
- Operations $\cap$, $\cup$, and $-$ with bags: 
	- For $\cap$, $\cup$, and $-$ the number of occurrences of a tuple in the result requires some thought.
	- Suppose tuple $t$ occurs:
		- $m$ times in relation $R$, and 
		- $n$ times in relation $S$

| Operation | Number of Occurrences of $t$ in tuples |
| :-------: | :------------------------------------: |
| $R\cap S$ |              $\min(m,n)$               |
| $R\cup S$ |                 $m+n$                  |
|   $R-S$   |             $\max(m-n,0)$              |
- $\cap$, $\cup$, and $-$ in SQL: 
```sql
(<subquery>) UNION (<subquery>)
(<subquery>) INTERSECT (<subquery>)
(<subquery>) EXCEPT (<subquery>)
```
- The parentheses `()` are mandatory
- The operands must be queries; you can’t simply use a relation name.
>[!example]
>```sql
>(SELECT sid
> FROM Took
> WHERE grade > 95)
>	UNION
>(SELECT sid
> FROM Took
> WHERE grade < 50);
>```
- Bag vs. Set Semantics: which is used and when
	- A `SELECT-FROM-WHERE` statement uses *bag* semantics by default.
		- Duplicates are *kept* in the result
	- The set (`INTERSECT/UNION/EXCEPT`) operations use *set* semantics by default
		- Duplicates are *eliminated* from the result
- Motivation: Efficiency
	- When doing projection, it is easier not to eliminate duplicate
		- Just work one tuple at a time
	- For intersection or difference, it is most efficient to sort the relations first.
		- At that point you may was well eliminate the duplicates anyway
- However, we can control which semantic is used.
	- We can force the result of a `SFW` query to be a set by using `SELECT DISTINCT`
	- We can force the result of a set operation to be a bag by using `ALL`. 
>[!example]
>```sql
>(SELECT sid
> FROM Took
> WHERE grade > 95)
>	UNION ALL
>(SELECT sid
> FROM Took
> WHERE grade < 50);
>```

>[!example]
>```sql
>(SELECT x FROM A) EXCEPT (SELECT x FROM B)
>```
>- A single occurrence of a value for x in **B** wipes out all occurrences of it from **A**
>```sql
>(SELECT x FROM A) EXCEPT (SELECT x FROM B)
>```
>- with `EXCEPT ALL`, we match up the value one by one


## Views
### The idea
- A view is a relation defined in terms of stored tables (called base tables) and possibly also other views.
- Access a view like any base table. 
- Two kinds of view:
	- **Virtual**: no tuples are stored; view is just a *query* for constructing the relation when needed. 
	- **Materialized**: actually constructed and stored. Expensive to maintain. 
- Views are particularly important when you want to give different access rights (i.e. permissions) to different users viewing data in your tables!
>[!example]
>Canvas student page vs. instructor page

>[!example] A view for students who earned an 80 or higher in a CSC course:
>```sql
>CREATE VIEW topresults AS
>SELECT firstname, surname, cnum
>FROM Student, Took, Offering
>WHERE
>	Student.sid = Took.sid AND
>	Took.oid = Offering.oid AND
>	grade >= 80 AND dept = 'CSC';
>```
### Uses of Views
- Break down a large query
- Provide another way of looking at the same data, e.g. for one category of user
- Wrap commonly used complex queries

