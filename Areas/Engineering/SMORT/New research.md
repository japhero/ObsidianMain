- [dead reckoning reddit](https://www.reddit.com/r/robotics/comments/14p839t/have_anyone_tinkered_with_mpu_6050/)


## Ideas for rebooting to run a file in "data mode"

- CLass
- Have a singleton type class that just grabs the state of a yaml file or text called `state.txt` and at the beginning you just call a class method .

doesnt work because i need to mount internally before changing things in the state file.

- Flip between states on restart

```mermaid
---

title: on file run

---

  

flowchart LR

    2((restart and mount \n the  file system)) -->

    3((run code.py)) --> unm((restart and \nunmount)) -->

    5((wait for next \n file to run)) --> 2
```
- this is done by having a state txt file that is modified to check weather in the last run the system was mounted 
- this basically means that on every restart we just flip the last state this also means there would have to be 2 restarts which could be done by having one restart at the beginning of the file that's conditional on the state being unmounted and one at the end checking that the file is mounted
```mermaid
---
title: on file run
---

stateDiagram-v2

beg: Ran and unmounted
quest : is mounted
nth : do nothing

r: run code

state if_s <<choice>>

beg -->  quest 
quest --> if_s 
if_s --> False 
True -->  mount
if_s --> True
False --> nth
True --> r
isM: is mounted
r --> isM

state sif <<choice>>
isM --> sif
At : True
AF : False
sif --> At
sif --> AF

dn: do nothing
AF --> dn

At --> unmount
wait: wait for next run
unmount --> wait
wait -->beg
```