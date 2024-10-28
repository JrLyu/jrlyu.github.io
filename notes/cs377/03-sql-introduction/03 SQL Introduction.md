## RA Review
- RA is procedural
	- An RA query itself suggests a procedure for constructing the result (i.e., how one could implement the query).
	- We say that it is **procedural**
- How good is a RA query?
	- Any problem has multiple RA solution, and some may be more efficient.
	- However, we don't care much about efficiency.
- In a DBMS, queries actually are executed, & efficiency matters!
	- Which query execution plan is most efficient depends on the data in the database and what indices you have.
	- Fortunately, the DBMS optimizes our queries.
	- We can focus on what we want, not how to get it

## SQL: Structured Query Language
- Two sub-parts:
	- **DDL (Data Definition Language)**: defining schemas.
	- **DML (Data Manipulation Language)**: writing queries and modifying the database.
### Basic Queries
```sql
SELECT attributes
FROM Table
WHERE <condition>;
```

>[!example] Example: Link SQL and RA
>```sql
>SELECT name
>FROM Course
>WHERE dept = 'CSC';
>```
> Equiv. to ${\Large\pi}_{\text{name}}\left({\Large\sigma}_{\text{dept}=\text{``csc''}}(\text{Course})\right)$

>[!example] Example: `,` is the Cartesian Product
>```sql
>SELECT name
>FROM Course, Offering, Took
>WHERE dept = 'CSC';
>```
>Equiv. to ${\Large\pi}_{\text{name}}\left({\Large\sigma}_{\text{dept}=\text{``csc''}}(\text{Course}\times\text{Offering}\times\text{Took})\right)$

>[!example] Example: Renaming
>```sql
>SELECT e.name, d.name
>FROM employee e, department d
>WHERE d.name = 'marketing'
>	and e.name = 'Horton';
>```
>This is link $\rho$ in relational algebra.
>Can be convenient vs. the longer full names
>```sql
>SELECT employee.name, department.name
>FROM employee, department
>WHERE department.name = 'marketing'
>	and employee.name = 'Horton';
>```

>[!example] Example: Self-Joins
>- Renaming is required fro self joins
>```sql
>SELECT e1.name, e2.name
>FROM employee e1, employee e2
>WHERE e1.salary < e2.salary
>```

### Use of `*`, `AS`, Conditions, and `ORDER BY`
- Using `*` in `SELECT` clauses
	- A `*` in the `SELECT` clause means "all attributes of this relation"
>[!example] Example: Using `*`
>```sql
>SELECT *
>FROM Course
>WHERE dept = 'CSC';
>```

- Renaming attributes
	- Use `As <new name>` to rename an attribute in the result
>[!example]
>```sql
>SELECT name AS title, dept
>FROM Course
>WHERE breadth;
>```

- Complex Conditions in a `WHERE`
	- Operators:
		- Comparison operators: `=`, `<>` (aka `!=`), `>`, `<`, `>=`, `<=`
	- Combine boolean expressions: `AND`, `OR`, `NOT`
>[!example] Example: Conditions
>```sql
>SELECT *
>FROM Offering
>WHERE dept = ‘CSC’ AND cnum >= 300;
>```

- Order by
	- To put the tuples in order, `ORDER BY <attritbue list> [DESC]`
	- The default is ascending order; `DESC` overrides it to force descending order
	- You can order some attributes in `ASC` order, others in `DESC`: 
	- The attribute list can include expressions, such as `ORDER BY sales+rentals`
>[!example] Multiple ordering
>```sql
>SELECT * FROM Course
>ORDER BY cnum ASC, dept DESC;
>```

- Case-sensitivity and whitespace
```sql
select surName
from Student
where campus = 'StG';
```
- Keywords, like `select`, are not case-sensitive.
	- One convention is to use UPPERCASE for keywords
- Identifiers, like `Student` are not case-sensitive.
	- one convention is to use lowercase for attributes, and a leading capital letter followed by lowercase for relations
- Literal strings, like `'StG'`, are case sensitive, and require single quotes.
- Whitespaces (other than inside quotes) is ignored. 

### More on `SELECT` Clauses
- Expression in `SELECT` clauses
	- Instead of a simple attribute name, you can use an expression in a `SELECT` clause.
	- Operands: attributes, constants
	- Operators: arithmetic ops, string ops
>[!example]
>- `||` means string concatenation
>```sql
>SELECT sid, grade-10 as adjusted
>FROM Took;
>SELECT dept| |cnum as fullCourseName
>FROM course;
>```

- Expressions that are a constant
	- Sometimes it makes sense for the whole expression to be a constant (something that doesn’t involve any attributes!).
>[!example]
>```sql
>SELECT name, 
>	‘satisfies’ AS breadthRequirement
>FROM Course
>WHERE breadth;
>```

### Pattern Operations
- Two ways to compare a string to a pattern by
```sql
<attribute> LIKE <pattern>
<attribute> NOT LIKE <pattern>
```
- Pattern is a quoted string
	- `%` means: any string (0 or more)
	- `_` means: any single character
```sql
SELECT *
FROM Course
WHERE name LIKE = '%Comp%';
```
- More examples:
	- `... WHERE phone LIKE '268_ _ _ _ _ _'`
		- phone numbers with area code 268
	- `... WHERE Dictionary.entry NOT LIKE '%est'`
		- Ignore 'biggest', 'tallest', 'fastest', 'rest', ... (i.e., ignore any strings ends with 'est')
		- Note: 'est' itself is also ignored. 
	- `... WHERE sales LIKE '%30!%%' ESCAPE '!'`
		- Sales of 30%
		- Note: PostgreSQL allows you to define your own `ESCAPE`
		- The thing after the `ESCAPE` character should be treated as a normal string (not a special character). 