# Scala: 99 Problems
This repository provides some solution to the 99 scala problems. 
See:
* <http://aperiodic.net/phil/scala/s-99/>

## P01 (*) Find the last element of a list
Example:
```
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
```
[blue-print solution](src/main/scala/org/problems/p01/blue-print-solution.md)

## P02 (*) Find the last but one element of a list.
Example:
```
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
```
[blue-print solution](src/main/scala/org/problems/p02/blue-print-solution.md)

## P03 (*) Find the Kth element of a list.
By convention, the first element in the list is element 0.

Example:
```
scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
```
[blue-print solution](src/main/scala/org/problems/p03/blue-print-solution.md)

## P04 (*) Find the number of elements of a list.
Example:
```
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
```
[blue-print solution](src/main/scala/org/problems/p04/blue-print-solution.md)

## P05 (*) Reverse a list.
Example:
```
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
```
[blue-print solution](src/main/scala/org/problems/p05/blue-print-solution.md)

## P06 (*) Find out whether a list is a palindrome.
Example:
```
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
```
[blue-print solution](src/main/scala/org/problems/p06/blue-print-solution.md)

## P07 (**) Flatten a nested list structure.
Example:
```
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
```
[blue-print solution](src/main/scala/org/problems/p07/blue-print-solution.md)

## P08 (**) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  
Example:
```
scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
```
[blue-print solution](src/main/scala/org/problems/p08/blue-print-solution.md)

## P09 (**) Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements they should be placed in separate sublists.

Example:
```
scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
```   
[blue-print solution](src/main/scala/org/problems/p09/blue-print-solution.md)

## P10 (*) Run-length encoding of a list.
Use the result of problem P09 to implement the so-called run-length encoding data compression method. 
Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.

Example:
```
scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
```
[blue-print solution](src/main/scala/org/problems/p10/blue-print-solution.md)

## P11 (*) Modified run-length encoding.
Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.

Example:
```
scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
```   
[blue-print solution](src/main/scala/org/problems/p11/blue-print-solution.md)

## P12 (**) Decode a run-length encoded list.
Given a run-length code list generated as specified in problem P10, construct its uncompressed version.

Example:
```
scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
``` 
[blue-print solution](src/main/scala/org/problems/p12/blue-print-solution.md)

## P13 (**) Run-length encoding of a list (direct solution).
Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.

Example:
```
scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
```
[blue-print solution](src/main/scala/org/problems/p13/blue-print-solution.md)

## P14 (*) Duplicate the elements of a list.
Example:
```
scala> duplicate(List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
```
[blue-print solution](src/main/scala/org/problems/p14/blue-print-solution.md)

## P15 (**) Duplicate the elements of a list a given number of times.
Example:
```
scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
```
[blue-print solution](src/main/scala/org/problems/p15/blue-print-solution.md)

## P16 (**) Drop every Nth element from a list.
Example:
```
scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
```
[blue-print solution](src/main/scala/org/problems/p16/blue-print-solution.md)

## P17 (*) Split a list into two parts.
The length of the first part is given. Use a Tuple for your result.
Example:
```
scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
```
[blue-print solution](src/main/scala/org/problems/p17/blue-print-solution.md)

## P18 (**) Extract a slice from a list.
Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
Example:
```
scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)
```
[blue-print solution](src/main/scala/org/problems/p18/blue-print-solution.md)

## P19 (**) Rotate a list N places to the left.
Examples:
```
scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
```
```
scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
```
[blue-print solution](src/main/scala/org/problems/p19/blue-print-solution.md)

## P20 (*) Remove the Kth element from a list.
Return the list and the removed element in a Tuple. Elements are numbered from 0.
Example:
```
scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
```
[blue-print solution](src/main/scala/org/problems/p20/blue-print-solution.md)

## P21 (*) Insert an element at a given position into a list.
Example:
```
scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
```
[blue-print solution](src/main/scala/org/problems/p21/blue-print-solution.md)

## P22 (*) Create a list containing all integers within a given range.
Example:
```
scala> range(4, 9)
res0: List[Int] = List(4, 5, 6, 7, 8, 9)
```
[blue-print solution](src/main/scala/org/problems/p22/blue-print-solution.md)

## P23 (**) Extract a given number of randomly selected elements from a list.
Example:
```
scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
res0: List[Symbol] = List('e, 'd, 'a)
```
Hint: Use the solution to problem P20

[blue-print solution](src/main/scala/org/problems/p23/blue-print-solution.md)

## P24 (*) Lotto: Draw N different random numbers from the set 1..M.
Example:
```
scala> lotto(6, 49)
res0: List[Int] = List(23, 1, 17, 33, 21, 37)
```
[blue-print solution](src/main/scala/org/problems/p24/blue-print-solution.md)

## P25 (*) Generate a random permutation of the elements of a list.
Hint: Use the solution of problem P23.

Example:
```
scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
```
[blue-print solution](src/main/scala/org/problems/p25/blue-print-solution.md)


...

...

...

## P31 (**) Determine whether a given integer number is prime.
```
scala> 7.isPrime
res0: Boolean = true
```
[blue-print solution](src/main/scala/org/problems/p31/blue-print-solution.md)

## P32 (**) Determine the greatest common divisor of two positive integer numbers.
Use Euclid's algorithm.
```
scala> gcd(36, 63)
res0: Int = 9
```
[blue-print solution](src/main/scala/org/problems/p32/blue-print-solution.md)

## P33 (*) Determine whether two positive integer numbers are coprime.
Two numbers are coprime if their greatest common divisor equals 1.
```
scala> 35.isCoprimeTo(64)
res0: Boolean = true
```
[blue-print solution](src/main/scala/org/problems/p33/blue-print-solution.md)

## P34 (**) Calculate Euler's totient function phi(m).
Euler's so-called totient function phi(m) is defined as the number of positive integers r (1 <= r <= m) that are coprime to m.
```
scala> 10.totient
res0: Int = 4
```
[blue-print solution](src/main/scala/org/problems/p34/blue-print-solution.md)

## P35 (**) Determine the prime factors of a given positive integer.
Construct a flat list containing the prime factors in ascending order.
```
scala> 315.primeFactors
res0: List[Int] = List(3, 3, 5, 7)
```
[blue-print solution](src/main/scala/org/problems/p35/blue-print-solution.md)

## P36 (**) Determine the prime factors of a given positive integer (2).
Construct a list containing the prime factors and their multiplicity.
```
scala> 315.primeFactorMultiplicity
res0: List[(Int, Int)] = List((3,2), (5,1), (7,1))
```
Alternately, use a Map for the result.
```
scala> 315.primeFactorMultiplicity
res0: Map[Int,Int] = Map(3 -> 2, 5 -> 1, 7 -> 1)
```
[blue-print solution](src/main/scala/org/problems/p36/blue-print-solution.md)

## P37 (**) Calculate Euler's totient function phi(m) (improved).
See problem P34 for the definition of Euler's totient function. 
If the list of the prime factors of `a` number `m` is known in the form of problem P36 then the function `phi(m)` can be efficiently calculated as follows: 
Let `[[p1, m1], [p2, m2], [p3, m3], ...]` be the list of prime factors (and their multiplicities) of a given number `m`. 
Then `phi(m)` can be calculated with the following formula:
`phi(m) = (p1-1)*p1^(m1-1) * (p2-1)*p2^(m2-1) * (p3-1)*p3(m3-1) * ...`

Note that `a^b` stands for the `b`-th power of `a`.
```
scala> 10.totient
res0: Int = 4
```
[blue-print solution](src/main/scala/org/problems/p37/blue-print-solution.md)

## P38 (*) Compare the two methods of calculating Euler's totient function.
Use the solutions of problems P34 and P37 to compare the algorithms. 
Try to calculate `phi(10090)` as an example.

[blue-print solution](src/main/scala/org/problems/p38/blue-print-solution.md)

## P39 (*) A list of prime numbers.
Given a range of integers by its lower and upper limit, construct a list of all prime numbers in that range.
```
scala> listPrimesinRange(7 to 31)
res0: List[Int] = List(7, 11, 13, 17, 19, 23, 29, 31)
```
[blue-print solution](src/main/scala/org/problems/p39/blue-print-solution.md)

## P40 (**) Goldbach's conjecture.
Goldbach's conjecture says that every positive even number greater than 2 is the sum of two prime numbers. 
E.g. `28 = 5 + 23`. 
It is one of the most famous facts in number theory that has not been proved to be correct in the general case. 
It has been numerically confirmed up to very large numbers (much larger than Scala's Int can represent). 
Write a function to find the two prime numbers that sum up to a given even integer.
```
  scala> 28.goldbach
  res0: (Int, Int) = (5,23)
```
[blue-print solution](src/main/scala/org/problems/p40/blue-print-solution.md)

## P41 (**) A list of Goldbach compositions.
Given a range of integers by its lower and upper limit, print a list of all even numbers and their Goldbach composition.
```
scala> printGoldbachList(9 to 20)
10 = 3 + 7
12 = 5 + 7
14 = 3 + 11
16 = 3 + 13
18 = 5 + 13
20 = 3 + 17
```
In most cases, if an even number is written as the sum of two prime numbers, one of them is very small. 
Very rarely, the primes are both bigger than, say, 50. 
Try to find out how many such cases there are in the range 2..3000.

Example (minimum value of 50 for the primes):
```
scala> printGoldbachListLimited(1 to 2000, 50)
992 = 73 + 919
1382 = 61 + 1321
1856 = 67 + 1789
1928 = 61 + 1867
```
[blue-print solution](src/main/scala/org/problems/p41/blue-print-solution.md)

## P46 (**) Truth tables for logical expressions.
Define functions and, or, nand, nor, xor, impl, and equ (for logical equivalence) which return true or false according to the result of their respective operations; e.g. and(A, B) is true if and only if both A and B are true.
```
scala> and(true, true)
res0: Boolean = true
```
```
scala> xor(true. true)
res1: Boolean = false
```
A logical expression in two variables can then be written as an function of two variables, e.g: `(a: Boolean, b: Boolean) => and(or(a, b), nand(a, b))`
Now, write a function called table2 which prints the truth table of a given logical expression in two variables.

```
scala> table2((a: Boolean, b: Boolean) => and(a, or(a, b)))
A     B     result
true  true  true
true  false true
false true  false
false false false
```
[blue-print solution](src/main/scala/org/problems/p46/blue-print-solution.md)

## P47 (*) Truth tables for logical expressions (2).
Continue problem P46 by redefining and, or, etc as operators. (i.e. make them methods of a new class with an implicit conversion from Boolean.) not will have to be left as a object method.
```
scala> table2((a: Boolean, b: Boolean) => a and (a or not(b)))
A     B     result
true  true  true
true  false true
false true  false
false false false
```
