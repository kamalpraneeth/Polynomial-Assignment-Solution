Polynomial Assignment – Lagrange Interpolation
Overview

This project reconstructs a polynomial using given roots where the y-values are encoded in different number bases.
Using the minimum required number of roots (k), the program computes the constant term of the polynomial, i.e., f(0).

The solution is based on Lagrange Interpolation, evaluated directly at x = 0.

Key Details

Language: Java

External Libraries: None

Large Number Handling: BigInteger

JSON Parsing: Not used (inputs handled manually)

Approach

Decode each root value from its given base to decimal.

Select the minimum required k roots.

Apply the Lagrange interpolation formula:

f(0) = Σ yi × Π (−xj / (xi − xj)) for j ≠ i

Output the computed constant term f(0).

Test Cases
Test Case 1

Polynomial Degree: 2

Output:

First Test Case Secret (f(0)) = 3
Test Case 2

Polynomial Degree: 6

Output:

Second Test Case Secret (f(0)) = -6290016743746469883
Files

Main.java – Java source code

README.md – Documentation

output.txt – Program output

How to Run
javac Main.java
java Main
Conclusion

The program correctly decodes values from different bases, reconstructs the polynomial using Lagrange interpolation, and computes the constant term efficiently using BigInteger.
