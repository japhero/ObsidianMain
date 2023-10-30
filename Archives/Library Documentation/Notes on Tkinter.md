
# Grid system 

dump:
- In grid, widgets are assigned a `column` number and a `row` number. These indicate each widget's position relative to other widgets.
- Column and row numbers must be positive integers (i.e., 0, 1, 2, ...). You don't have to start at 0 and can leave gaps in column and row numbers (e.g., column 1, 2, 10, 11, 12, 20, 21). This is useful if you plan to add more widgets in the middle of the user interface later.
- The width of each column will vary depending on the width of the widgets contained within the column.
- sticky with cardinal directions decides what side of the cell the wiget sticks to.
- padding is space in-between 2 widgets 
- Every column and row in the grid has a `weight` option associated with it. This tells grid how much the column or row should grow if there is extra room in the master to fill. 
- The weight is the rate of expansion to fill up expanded space. 0 meaning no expansion 
- internal padding adds padding to the internal object for exaple text to space around a button
- you can nest wigets in a new independant grid system with frames
```


```python

```