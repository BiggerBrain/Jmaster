package com.leetcode.solutions;

import java.util.stream.Stream;

/**
 * 537. Complex Number Multiplication
 *
 * Given two strings representing two complex numbers.

 You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

 Example 1:
 Input: "1+1i", "1+1i"
 Output: "0+2i"
 Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.

 Example 2:
 Input: "1+-1i", "1+-1i"
 Output: "0+-2i"
 Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.

 Note:
 The input strings will not have extra blank.
 The input strings will be given in the form of a+bi, where the integer a and b will both belong to the range of [-100, 100]. And the output should be also in this form.
 */
public class _537 {

    public static class Solution1 {
        public String complexNumberMultiply(String a, String b) {
            String[] part1And2 = a.split("\\+");
            String[] part3And4 = b.split("\\+");
            String product1 = String
                .valueOf(Integer.parseInt(part1And2[0]) * Integer.parseInt(part3And4[0]));//this is real number multiplication
            String product2 = multiply(part1And2[0], part3And4[1]);
            String product3 = multiply(part3And4[0], part1And2[1]);
            String product4 = multiplyTwoIs(part3And4[1], part1And2[1]);
            String twoISum = sumTwoI(product2, product3);
            String numberValue = String
                .valueOf(Integer.valueOf(product1) + Integer.valueOf(product4));
            return numberValue + "+" + twoISum;
        }

        private String sumTwoI(String product2, String product3) {
            int number2 = Integer.parseInt(product2.substring(0, product2.length() - 1));
            int number3 = Integer.parseInt(product3.substring(0, product3.length() - 1));
            return (number2 + number3) + "i";
        }

        private String multiplyTwoIs(String p, String q) {
            int number1 = Integer.parseInt(p.substring(0, p.length() - 1));
            int number2 = Integer.parseInt(q.substring(0, q.length() - 1));
            int numberProduct = number1 * number2;
            return String.valueOf(-numberProduct);
        }

        private String multiply(String p, String withI) {
            int numberPart = Integer.parseInt(withI.substring(0, withI.length() - 1));
            return numberPart * Integer.valueOf(p) + "i";
        }
    }

    public static class Solution2 {
        /**
         * (a + bi) * (c + di) could become (ac - bd) + (ad + bc)*i
         * Thus, we have the following function
         */
        public String complexNumberMultiply(String a, String b) {
            int[] coefficients1 = Stream.of(a.split("\\+|i")).mapToInt(Integer::parseInt).toArray();
            int[] coefficients2 = Stream.of(b.split("\\+|i")).mapToInt(Integer::parseInt).toArray();
            return (coefficients1[0] * coefficients2[0] - coefficients1[1] * coefficients2[1]) + "+"
                   + (coefficients1[0] * coefficients2[1] + coefficients1[1] * coefficients2[0]
                      + "i");
        }
    }

}
