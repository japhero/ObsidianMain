
links 
- https://stackoverflow.com/questions/3085696/adding-a-scrollbar-to-a-group-of-widgets-in-tkinter scrollbar


# Code structure for UI
Main GUI class has properties for its containers such as tabs each tab then has a subclass each component in the "GUI" is a property 

## Component Structure example
```python
class MyFrame(customtkinter.CTkFrame):
    def __init__(self, master, **kwargs):
        super().__init__(master, **kwargs)

        # add widgets onto the frame, for example:
        self.label = customtkinter.CTkLabel(self)
        self.label.grid(row=0, column=0, padx=20)


class App(customtkinter.CTk):
    def __init__(self):
        super().__init__()
        self.geometry("400x200")
        self.grid_rowconfigure(0, weight=1)  # configure grid system
        self.grid_columnconfigure(0, weight=1)

        self.my_frame = MyFrame(master=self)
        self.my_frame.grid(row=0, column=0, padx=20, pady=20, sticky="nsew")


app = App()
app.mainloop()
```



## programs solutions
- [Use image as label Background while keeping text](https://stackoverflow.com/questions/33200257/create-a-text-over-an-image-using-python-tkinter)
- 