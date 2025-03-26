&emsp;
# Main Structure
 The document is separated into 3 sheets they go as follows:


#### **Form submission sheet** 
- This sheet is a storage place for all submissions and is where the manipulation sheet pulls its data.
- This sheet also can store data not needed in the manipulation sheet such as email, notification preference ect.

**Extra stored Data**
- Weather or not the email has been sent(to avoid duplicates)
- The actual email of the user 
- Form submission number(total number of  form submissions eg #1011)

&emsp;

#### **Manipulation sheet**
- This is the sheet where the user is supposed to spend most of their time changing the status of prints having access to the print files and being able to see the notes requested and other important information such as color requests and the name and number of the submitted ticket.
- This could conglomerate information found in the Form submission sheet for example color requested and part information



&emsp;

#### **Batch sheet**
- This sheet is automatically created when a batch number is inputed through in the manipulation sheet and lets the user separate out prints that are done together 

How are batches usefull and are they needed 

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