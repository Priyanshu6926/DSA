package Basics_and_Patterns;

import java.util.Scanner;

/*
 * ============================================================================
 * MODULE: Java Basics & Fundamentals
 * FILE: FirstClass.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Comprehensive beginner exercises covering Java output, variables, arithmetic 
 * operations, Scanner input handling, conditional statements (if-else, switch-case),
 * loop constructs (for, while, do-while), and basic mathematical algorithms.
 */

public class FirstClass {

    /*
     * ------------------------------------------------------------------------
     * QUESTION 1: Print Star Pattern
     * ------------------------------------------------------------------------
     * Task: Output a simple 2-line star pattern using escape sequence \n.
     * Expected Output:
     * *
     * ** 
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void printStarPattern() {
        System.out.println("*\n** ");
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 2: Variable Declaration & Arithmetic Operations
     * ------------------------------------------------------------------------
     * Task: Perform basic arithmetic (+, -, *, /, %) and evaluate operator precedence.
     * Inputs: a = 20, b = 10
     * Expected Output:
     * 30 (sum)
     * 10 (difference)
     * 200 (product)
     * 2 (divide)
     * 10 (ans = a*b / a - b => 200 / 20 - 10 = 10 - 10 = 0? Wait: 20*10/20 - 10 = 0)
     * 20 (ans1 = (a*b) / (a-b) => 200 / 10 = 20)
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void arithmeticOperations() {
        int a = 20;
        int b = 10;
        int sum = a + b;
        // System.out.println(sum);
        int difference = a - b;
        // System.out.print(difference);
        int product = a * b;
        // System.out.println(product);

        int divide = a / b;
        // System.out.println(divide);
        int ans = a * b / a - b;
        int ans1 = (a * b) / (a - b);
        System.out.println(ans);
        System.out.println(ans1);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 3: String Input using Scanner
     * ------------------------------------------------------------------------
     * Task: Read a single token String using sc.next().
     * Input: "Priyanshu"
     * Expected Output: "Priyanshu"
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void inputStringExample(Scanner sc) {
        String name = sc.next();
        // nextLine() reads whole line
        // nextFloat() reads float
        // nextInt() reads integer

        System.out.println(name);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 4: Sum of Two Numbers from User Input
     * ------------------------------------------------------------------------
     * Task: Take two integer inputs and output their sum.
     * Input: 5, 10
     * Expected Output: 15
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void sumTwoNumbers(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 5: Conditional Check - Adult or Not
     * ------------------------------------------------------------------------
     * Task: Check if given age is greater than 18.
     * Input: 20 -> Output: Adult
     * Input: 15 -> Output: Not Adult
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void checkAdult(Scanner sc) {
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 6: Odd or Even Check
     * ------------------------------------------------------------------------
     * Task: Determine if a number x is even (x % 2 == 0) or odd.
     * Input: 4 -> Output: Even
     * Input: 7 -> Output: Odd
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void checkOddEven(Scanner sc) {
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 7: Greeting Button Selection (If-Else-If Ladder)
     * ------------------------------------------------------------------------
     * Task: Output greeting based on button (1: Hello, 2: Namaste, 3: Bonjour).
     * Input: 2
     * Expected Output: Namaste
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void greetingIfElse(Scanner sc) {
        int button = sc.nextInt();
        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid");
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 8: Greeting Button Selection (Switch-Case)
     * ------------------------------------------------------------------------
     * Task: Same as Question 7 using switch statement.
     * Input: 1 -> Output: Hello
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void greetingSwitch(Scanner sc) {
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid");
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 9: Print Month Name from Number (1-12)
     * ------------------------------------------------------------------------
     * Task: Output month abbreviation corresponding to month number 1-12.
     * Input: 5 -> Output: May
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void printMonth(Scanner sc) {
        int button = sc.nextInt();
        switch (button) {
            case 1:  System.out.println("Jan"); break;
            case 2:  System.out.println("Feb"); break;
            case 3:  System.out.println("Mar"); break;
            case 4:  System.out.println("Apr"); break;
            case 5:  System.out.println("May"); break;
            case 6:  System.out.println("Jun"); break;
            case 7:  System.out.println("Jul"); break;
            case 8:  System.out.println("Aug"); break;
            case 9:  System.out.println("Sep"); break;
            case 10: System.out.println("Oct"); break;
            case 11: System.out.println("Nov"); break;
            case 12: System.out.println("Dec"); break;
            default: System.out.println("Invalid"); break;
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 10: Simple Calculator using Switch-Case
     * ------------------------------------------------------------------------
     * Task: Perform operation (1:+, 2:-, 3:*, 4:/, 5:%) on inputs a and b.
     * Input: a=10, b=5, operator=1 -> Output: 15
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void calculator(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();
        switch (operator) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid");
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 11: Print "Hello World" 10 Times (For Loop)
     * ------------------------------------------------------------------------
     * Time Complexity: O(1) [10 iterations]
     * Space Complexity: O(1)
     */
    public static void printHelloWorldLoop() {
        for (int counter = 0; counter < 10; counter++) {
            System.out.println("Hello World");
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 12: Print Numbers 1 to 69 (For Loop)
     * ------------------------------------------------------------------------
     * Time Complexity: O(N) where N = 69
     * Space Complexity: O(1)
     */
    public static void printNumbersLoop() {
        for (int i = 1; i <= 69; i++) {
            System.out.println(i);
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 13: Print Numbers 0 to 9 (While Loop)
     * ------------------------------------------------------------------------
     * Time Complexity: O(1) [10 iterations]
     * Space Complexity: O(1)
     */
    public static void printWhileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 14: Print String (Do-While Loop)
     * ------------------------------------------------------------------------
     * Time Complexity: O(1) [9 iterations]
     * Space Complexity: O(1)
     */
    public static void printDoWhileLoop() {
        int i = 2;
        do {
            System.out.println("priyanshu");
            i++;
        } while (i <= 10);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 15: Sum of First N Natural Numbers
     * ------------------------------------------------------------------------
     * Task: Calculate 1 + 2 + ... + N.
     * Input: 5 -> Output: 15
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static void sumOfNaturalNumbers(Scanner sc) {
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 16: Multiplication Table of N
     * ------------------------------------------------------------------------
     * Task: Print table from 1 to 10 for a given number.
     * Input: 2
     * Expected Output: 2 4 6 8 10 12 14 16 18 20
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void printMultiplicationTable(Scanner sc) {
        int table = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * table);
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 17: Print All Even Numbers up to 100,000
     * ------------------------------------------------------------------------
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static void printAllEvenNumbers() {
        for (int i = 1; i <= 100000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 18: Prime Number Check
     * ------------------------------------------------------------------------
     * Task: Check whether an integer n is prime.
     * Input: 7 -> Output: Prime
     * Input: 12 -> Output: Not Prime
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     * 
     * ERRORS / CORRECTIONS IN ORIGINAL CODE:
     * In the original draft, the loop `for (int i = 2; i<=n-1 ; i++){` was cut off 
     * without a boolean flag or closing braces.
     * ------------------------------------------------------------------------
     */
    public static void checkPrime(Scanner sc) {
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void main(String args[]) {
        System.out.println("--- Executing FirstClass Basics ---");
        printStarPattern();
        arithmeticOperations();
    }
}
