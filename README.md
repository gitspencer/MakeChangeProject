# MakeChangeProject

## Overview
Create a cash register that determines the correct change based on inputs (price & amount tendered) and directs the user to return the largest bill and coin denominations possible.

## Technologies Used
- Java
- Eclipse
- Git

## Lessons Learned
- First step was applying basic Java commands to print out instructions for the user, as well as importing a scanner to read the required inputs of price and amount tendered. The data type 'double' was used to capture inputs given the need for fractions of whole numbers when dealing with accurate change down to a penny.
- The next step was to calculate the correct change and assign it a variable 'change', for which I again used a double. 
- I then created an 'if statement' to determine if the amount tendered was below the purchase price. If true this would print out an error message.
- Similarly, I used an 'else if' to determine if the exact change was tendered, which would close the program. For both statements the use of 'return;' made sure the program ended without continuing through the code and printing the final line "Provide customer change: ". 

- The hardest part of this project for me was creating a way to calculate and show only the largest required denominations possible. I leaned towards using the logic from the Floor and Ceiling labs we completed on 3/17/23 to calculate the answer.
- As part of this calculation I needed to cast the double values to int's for each denomination value and determine how may were included in the variable 'change'. 
- Then I used the modulus operator in a simple formula ('change' %= [denomination]) to calculate the remainder. These last two steps were done for each denomination from $20 down to a penny.
- To get the remainder of a penny to round properly I had to add +0.005 to the first formula which cast the user double to an int. 

- The final step was creating a series of 'if statements' to print out the appropriate change if true. For this I placed them in descending order from largest to smallest denominations.

