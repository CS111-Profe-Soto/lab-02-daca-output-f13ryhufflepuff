# Lab 02 - DACA + Output

![Image of DACA Employment Authorization Card](https://i.imgur.com/xRUVy3O.jpg)

## Learning Objective
- Demonstrate an understanding of basic variables and output applied to DACA article_

You're working for the U.S. Citizenship and Immigration Services (USCIS) office and are in charge of a project to create quick-print replacements for Employment Authorization Cards. In case someone has their card stolen or is lost, they can come into the office and receive a low-resolution print that will be honored until your replacement card is mailed out.

One of the interns on the team just got the template back to you [see Main.java](./Main.java). It's your job to complete the prototype before submitting it, fully documented, to the project manager.

## Given

- ASCII art and structure for an Employment Authorization Card (EAC)
- Documentation at the top and `main` method section headings

## Definitions

- **ASCII art :** graphic design technique using computer characters to draw images. For example, `¯\_(ツ)_/¯` or `(╯°□°）╯︵ ┻━┻`
- **Unicode :** Universal Coded Character Set (like ASCII but _way_ bigger!) Can use them using escape character `\u` followed by a Unicode value, but much simpler/more readable to just copy/paste character into code
- **Box Drawing Unicode characters :** [https://unicode-table.com/en/blocks/box-drawing/ (explore website later for more!)](https://unicode-table.com/en/blocks/box-drawing/)

## To-Do

1. Complete program documentation at the top (lines 1-4)
   - This is how the project manager will know when and who completed the prototype.
   - Replace the `Program description` with a description of the program. 
2. Create appropriate variables, in the appropriate section of the `main` method, to store data from EAC
   - This is how the backend team will know what kind of data and names to use for the database that will store over 700,000 DACA recipients information.
   - You can fill in your data or some sample data.
3. Substitute ██ parts with data from variables you created
   - This will eventually be upgraded to pull from a database and store the data into the variables you created, so this flexibility is key for scaling up.
4. Follow all coding convention/style and documentation practices

**Once you have completed the lab, commit and push changes to your repository. There are _no tests_ to run for this lab.**

Done with the lab above? Only then can you attempt the hacker challenge below.

## Hacker Challenge

- Close off the right side of the card (note this will depend on the values you have for your variables, that's ok!)
- Upgrade ASCII art and/or look of EAC (checkout Unicode webpage link above)
