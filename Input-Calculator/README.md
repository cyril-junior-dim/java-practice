# Input Calculator
Write a method called <b>inputThenPrintSumAndAverage</b> that does not have any parameters.
The method <b>should not return anything</b> (void) and it needs to keep reading <b>int</b> numbers from the keyboard.
When the user enters something that is not an int then it needs to print a message in the format <b>"SUM = XX AVG = YY"</b>.
<b>XX</b> represents the sum of all entered numbers of type int. <b>YY</b> represents the calculated average of all numbers of type long.

EXAMPLES OF INPUT/OUTPUT:
EXAMPLE 1:
<br />
INPUT:
* 		1
* 		2
* 		3
* 		4
* 		5
* 		a
OUTPUT
SUM = 15 AVG = 3

EXAMPLE 2:
INPUT:
hello
OUTPUT:
SUM = 0 AVG = 0

TIP: Use Scanner to read an input from the user.
TIP: Use casting when calling the round method since it needs double as a parameter.
NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.
NOTE: Be mindful of spaces in the printed message.
NOTE: Be mindful of users who may type an invalid input right away (see example above).
