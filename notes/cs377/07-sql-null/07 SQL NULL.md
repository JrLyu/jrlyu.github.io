## Null values in SQL
- Missing Information: 
	- Missing value. 
		- E.g., we know a student has some _email_ address, but we don’t know what it is.
	- Inapplicable attribute.
		- E.g., the value of attribute _spouse_ for a person who is _single_.
- Representing missing information:
	- One possibility: use a special value as a placeholder. E.g., 
		- If age unknown, use -1.
		- If StNum unknown, use 999999999.
	- Pros and cons?
		- Better solution: use a value not in any domain. We call this a null value.
		- Tuples in SQL relations can have NULL as a value for one or more components.
- Check for `NULL` values
	- You can compare an attribute value to `NULL` with
		- `IS NULL`
		- `IS NOT NULL`
>[!Example]
>```sql
>SELECT *
>FROM Course
>WHERE breadth IS NULL;
>```
- Note: do not use WHERE breadth = NULL;

### Impact of Null Values
- Assume $x$ is `NULL`
- Arithmetic expression: Result is always `NULL`
>[!example]
>$$x+\texttt{grade}=\texttt{NULL}$$
>$$x*0=\texttt{NULL}$$
>$$x-x=\texttt{NULL}$$
- Comparison operators ($>$, $<$, $=$, $\dots$): Result is `UNKNOWN` (neither `TRUE` nor `FALSE`)
>[!example]
>$$x<32 \quad\texttt{ --> UNKNOWN}$$

- This `UNKNOWN` is a truth-value
- Truth-values in SQL are: `TRUE`, `FALSE`, `UNKNOWN` (a 3-value truth value system!)
	- Logic with `UNKNOWN`: $$\begin{aligned}
\texttt{UNKNOWN} \lor\texttt{FALSE}&\equiv\texttt{UNKNOWN}\\
\texttt{UNKNOWN} \lor\texttt{TRUE}&\equiv\texttt{TRUE}\\
\texttt{UNKNOWN} \land\texttt{FALSE}&\equiv\texttt{FALSE}\\
\texttt{UNKNOWN} \land\texttt{TRUE}&\equiv\texttt{UNKNOWN}\\
\neg\texttt{UNKNOWN}&\equiv\texttt{UNKONWN}
\end{aligned}$$
	- A tuple is in a query result $\iff$ the result of the `WHERE` clause is `TRUE`.
### Impact of Null Values on Aggregation
- “Aggregation ignores `NULL`.”
	- NULL never contributes to a sum, average, or count, and can never be the minimum or maximum of a column (unless _every_ value is `NULL`).
- If ALL values are `NULL` in a column, then the result of the aggregation is NULL.
- Exception: `COUNT` of an empty set is 0. (think of `COUNT`(columnName) as a function that counts the non-null values in that column.)
>[!example]
>R&S&T are defined as: 
>```
>   x                   x                    x
> ----                 ----                 ----
>NULL                 NULL
>   1
>```
> - `COUNT()`
> 	- `COUNT(R.*)=2` and `COUNT(R.x)=1`
> 	- `COUNT(S.*)=1` and `COUNT(S.x)=0`
> 	- `COUNT(T.*)=0` and `COUNT(T.x)=0`
> - Other aggregates:
> 	- `MIN(R.x)=1` and `MAX(R.x)=1`
> 	- `MIN(S.x)=NULL` and `MAX(S.x)=NULL`
> 	- `MIN(T.x)=NULL` and `MAX(T.x)=NULL`


### NULL in Set Operations
- `NULL` is treated differently by the set operators `UNION`, `EXCEPT`, and `INTERSECT` than it is in search conditions.
- When comparing rows, set operators treat `NULL` values as equal to each other.
- In contrast, when `NULL` is compared to `NULL` in a search condition the result is `UNKNOWN` (not true). 