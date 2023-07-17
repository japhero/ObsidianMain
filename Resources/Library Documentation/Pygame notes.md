

# Pygame objects 

### pygame.Sprite.Group()
The sprite group object is a way to as you guessed group together sprites. The object is a container for sprites and allows the user to instead of looping over all used sprites or individual doing actions you can group them together and apply sprite methods.
```python
newGroup = pygame.sprite.Group()
#constructer
```
#### Methods
```python 
newGroup.add(mySpriteObj)
# Adds a sprite to the group

newGroup.has(mySpriteObj)
# Checks if the container has the sprite similar to "in" keyword

newGroup.draw(displayObj)
# "blits" the sprites on the canvas. Meaning it overlays the drawing on top of whatevers on the canvas 
```


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