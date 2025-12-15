import java.math.BigInteger;
import java.util.*;

public class Main {

```
// Class to store each root (x, y)
static class Root {
    BigInteger x;
    BigInteger y;

    Root(String x, int base, String value) {
        this.x = new BigInteger(x);
        this.y = new BigInteger(value, base);
    }
}

public static void main(String[] args) {

    /* =========================
       FIRST TEST CASE
       ========================= */
    int k1 = 3;
    List<Root> testCase1 = new ArrayList<>();

    testCase1.add(new Root("1", 10, "4"));
    testCase1.add(new Root("2", 2,  "111"));
    testCase1.add(new Root("3", 10, "12"));
    testCase1.add(new Root("6", 4,  "213"));

    BigInteger secret1 = lagrangeAtZero(testCase1, k1);
    System.out.println("First Test Case Secret (f(0)) = " + secret1);


    /* =========================
       SECOND TEST CASE
       ========================= */
    int k2 = 7;
    List<Root> testCase2 = new ArrayList<>();

    testCase2.add(new Root("1", 6,  "13444211440455345511"));
    testCase2.add(new Root("2", 15, "aed7015a346d635"));
    testCase2.add(new Root("3", 15, "6aeeb69631c227c"));
    testCase2.add(new Root("4", 16, "e1b5e05623d881f"));
    testCase2.add(new Root("5", 8,  "316034514573652620673"));
    testCase2.add(new Root("6", 3,  "2122212201122002221120200210011020220200"));
    testCase2.add(new Root("7", 3,  "20120221122211000100210021102001201112121"));

    BigInteger secret2 = lagrangeAtZero(testCase2, k2);
    System.out.println("Second Test Case Secret (f(0)) = " + secret2);
}

// Lagrange interpolation evaluated at x = 0
static BigInteger lagrangeAtZero(List<Root> roots, int k) {

    BigInteger result = BigInteger.ZERO;

    for (int i = 0; i < k; i++) {
        BigInteger term = roots.get(i).y;

        for (int j = 0; j < k; j++) {
            if (i == j) continue;

            BigInteger numerator = roots.get(j).x.negate();
            BigInteger denominator =
                    roots.get(i).x.subtract(roots.get(j).x);

            term = term.multiply(numerator).divide(denominator);
        }
        result = result.add(term);
    }
    return result;
}
```

}

