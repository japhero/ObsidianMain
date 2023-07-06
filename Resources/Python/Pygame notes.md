

# Pygame objects 

### pygame.Surface()
Basic object for representing images 
```python
Surface((width,hight)) -> Surface
```
Its a container that contains an image its not noteworthy for its atributes but for its methods. These are very useful for mapping RGB or generally just geting setting or changing an image. 

#### Methods of note
* **Surface.get_rect()** returns a [[#pygame.Rect()]] object that contains all coordinate data the object 

---
### pygame.Rect() 
Rectangle object a container for rectangle attributes.
```python
Rect(left, top, width, height) -> Rect
# Official names for the atributes
```
* __Left__ is the x position of the rectangle based on the plane/pygame display
* __Top__ is the y position of the rectangle
* __Width/Hight__ the width and height of the object in pixels

# **Pygame functions** 

### pygame.draw.rect()
is the method used in [[implementation]] for drawing rectangles.
```python
pygame.draw.rect(window,color,rectangle Object)
```
* __Window__ typically referenced at start with ==pygame.display.set_mode==
* __Color__ a tuple that contains RGB values. (R, G, B)
* __[[#pygame.Rect|Rectangle Object]]__  an object that stores the attributes of a rectangle to be drawn.

---
### pygame.mouse.get_pressed()
Method used to check whether something was clicked.
```python
pygame.mouse.get_pressed()
# Returns list of boleans 
```
Returns a list of Booleans of all mouse buttons and if they are pressed it returns that sequence  