## The joins we know from RA
|          Expression within SQL          | Meaning in RA                     |
| :-------------------------------------: | --------------------------------- |
|                 `R, S`                  | $$R\times S$$                     |
|            `R CROSS JOIN S`             | $$R\times S$$                     |
|           `R NATURAL JOIN S`            | $$R\bowtie S$$                    |
|        `R JOIN S ON <condition>`        | $$R\bowtie_\texttt{condition} S$$ |
|     `R NATURAL LEFT [OUTER] JOIN S`     | $$R⟕S$$                           |
|    `R NATURAL RIGHT [OUTER] JOIN S`     | $$R⟖S$$                           |
|     `R NATURAL FULL [OUTER] JOIN S`     | $$R⟗S$$                           |
| `R LEFT [OUTER] JOIN S ON <condition>`  | $$R⟕_\texttt{condition}S$$        |
| `R RIGHT [OUTER] JOIN S ON <condition>` | $$R⟖_\texttt{condition}S$$        |
| `R FULL [OUTER] JOIN S ON <condition>`  | $$R⟗_\texttt{condition}S$$        |
- If your query includes left/right/full, adding `OUTER` is optional
- If your outer join is not natural, then adding on `<condition> `becomes necessary

### In practice, `NATURAL JOIN` is dangerous
- Attributes with matching names don’t necessarily mean matching meanings!
- Having implicit comparisons impairs readability.
- Also: if the schema changed, a query that _looks_ fine may actually be broken, without being able to tell.
- Best practice: Don’t over-use `NUATURAL JOIN`.

### Other Optional key words
- We get an `OUTER` join iff you use the keywords `LEFT`, `RIGHT`, or `FULL`.
- If you don’t use the keywords `LEFT`, `RIGHT`, or `FULL` you get an `INNER` join.
