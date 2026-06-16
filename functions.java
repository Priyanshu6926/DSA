// returnType functionName(type arg1, type arg2, ...)
// operations
// return 

/** 

import java.util.*;
public class functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);
    }
}

import java.util.*;
public class functions{
    public static int printSum(int a,int b){
        int sum = a + b;
        return sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = printSum(a,b);
        System.out.println(sum);
    } 
}

 
import java.util.*;
public class functions{
    public static int printSum(int a,int b){
        
        return a*b;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        System.out.println(printSum(a,b) );
    } 
}


// factorial

import java.util.*;
public class functions {
    public static void printFactorial(int n){
        int factorial = 1;
        for (int i = n; i >=1; i--){
            factorial = factorial * i ;
        }
        System.out.println(factorial);
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
    
}
 
import java.util.*;
public class functions {
    public static int printAvg(int a,int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(printAvg(a,b,c));
        sc.close();
        
    }
}
*/
//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
public static int printSumofOdd(int n){
    int sum = 0;
    for( int i=1;i<=n;i++){
        if (i%2 != 0){
            sum = sum + i;
        }}
            return sum;
        }
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSumofOdd(n));
        sc.close();
    }    


