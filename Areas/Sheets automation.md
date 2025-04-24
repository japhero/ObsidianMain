&emsp;
# Main Structure
 The document is separated into 3 sheets they go as follows:


#### **Form submission sheet (DATABASE)**  
- This sheet is a storage place for all submissions and is where the manipulation sheet pulls its data.
- This sheet also can store data not needed in the manipulation sheet such as email, notification preference ect.
- This could have extra collum that uses googlesheet functions to automaticaly solve conditionals such as "unwanted data"


**Extra stored Data**
- Weather or not the email has been sent(to avoid duplicates)
- The actual email of the user 
- Form submission number(total number of  form submissions eg #1011)

**Features**
- [ ]  Source for display of all other sheets
- [ ] Have information for our program (extra stored data) not stored in manipulation
- [ ] Ideally this sheet should not be manually manipulated 
- [ ] Could update at set times automatically or on form submissions 


&emsp;

#### **Manipulation sheet**
- This is the sheet where the user is supposed to spend most of their time changing the status of prints having access to the print files and being able to see the notes requested and other important information such as color requests and the name and number of the submitted ticket.
- This could conglomerate information found in the Form submission sheet for example color requested and part information




**Features**
- [ ]  Sorting aglo
	- [ ] Ask jakob and gibson what they want
	- [ ] Should be a different UI tab 
		- [ ] Timestamp
		- [ ] In Queue 
- [ ] Remove Data that we dont want from the datasheet 
- [ ] Function that clears done tickets (should simply  change a value within the display sheet)
- [ ] Tags 
	- [ ] Done
	- [ ] Printing 
	- [ ] In queue 
	- [ ] N/a
	- [ ] Not needed


&emsp;

#### **Batch sheet**
- This sheet is automatically created when a batch number is inputed through in the manipulation sheet and lets the user separate out prints that are done together 
- Will automatically create a zip of the batch sheet STL's 

- How are batches usefull and are they needed 


**Features**
- [ ] Have a batch marker that lets you mark all parts within a batch as done  
- [ ] 


#### **Student View** 


**Features**
- [ ] Within Student view have an option within the public form that lets them edit their ticket as to remove it if they want to.



#### APP data sheet
- This stores some data about the sheet  such as total  submitions and current sorting  method along with things like total submition  number
- Would be a good place  to put analytics like average ticket completion ect.





---

### Sending emails
- [ ] Send emails when print is rejected with the notes in the email this can either be done periodically(when a new form is submitted) or by the user manually  when they select the send all emails option 

### Sorting
- [ ] Sort the sheet by custom status order 
	1. New submissions (blank tags)
	2. In print queue (marked with tag) 
	3. Sliced 
	4. printing (printing tag)
	5. Needs second batch 


# Notes 

-  [HTML service templating](https://developers.google.com/apps-script/guides/html/templates#index.html)
- 