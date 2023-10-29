# Threading lib Python
[Lib link](https://docs.python.org/3/library/threading.html)

## Basics
### Innit a thread
To innit a thread we pass the values of the function and the arguments of that functions to the thread 

```python
t1 = threading.Thread(target, args)  
t2 = threading.Thread(target, args)
```

### Start a Thread
To start a thread, we use the **start()** method of the Thread class.
```python
t1.start()
t2.start()
```
### Ending a thread
Once the threads start, the current program (you can think of it like a main thread) also keeps on executing. In order to stop the execution of the current program until a thread is complete, we use the **join()*** method.  
```python
t1.join()  
t2.join()
```
