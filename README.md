# Rod-Cutter
A company is in the business of buying rods in wholesale, cutting it, and
selling the pieces in the retain market. The market fluctuates and the price 
for different sizes of rods changes by the day. Here's where we come in, the
company wants our help to know how much maximum money they can make, and how 
to cut the rods of a given length to get that maximum money.

For example, if the rods of various lengths sell at the following prices on
a given day:

Inch   price
1       $1
2       $1
3       $2
4       $3
5       $4
6       $5
7       $5
8       $9
9       $9
10      $10

Cutting a 20 inches rod into pieces of 2 inches each will only get them 
$10. However, if they cut it into 6 pieces of two 8-inches, and four 1-inches
will get them $22. There may be other combinations that produce better price.
The additional challenge is the prices fluctuate each day.

We're asked to write a program, but in a way the algorithm for computing
the sizes can be changed.

Write a class RodCutter that will take the various lengths and their prices.
Then write one method on the class, cutRod that takes a length as parameter
and returns two things - maximum price the company can expect and the
size of the rods that they should cut the given length to get that price.
For example, if the input parameter is 2 (and the prices are as above),
then the output will be $2 and the sizes will be 1, 1 (for 2 pieces).

First write the class RodCutter so it works with a simple algorithm.
Then (and only after fully completing the above, not before), create another
version of RodCutter that will use techniques to shorten the
time to compute the result. The two versions must produce the same result,
just their computations efficiencies must be different.

