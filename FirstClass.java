import java.util.Scanner;

/** 
class FirstClass {
    public static void main(String args[]) {
        System.out.println("*\n** ");
    }
}


class FirstClass {
    public static void main(String args[]) {
        //VARIABLE
        
        int a = 20;
        int b = 10;
        int sum = a+b;
        // System.out.println(sum);
        int difference = a-b;
        // System.out.print(difference);
        int product = a*b;
        // System.out.println(product);

        int divide = a/b;
        // System.out.println(divide);
        int ans = a*b / a-b;
        int ans1 = (a*b) / (a-b);
        System.out.println(ans);
        System.out.println(ans1);



    }
}



import java.util.*;

public class FirstClass {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        //nextLine
        //nextFloat()
        //nextInt

        System.out.println(name);

    }
}
    


import java.util.*;

public class FirstClass {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}


import java.util.*;
public class FirstClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }
        

    }

}



import java.util.*;
public class FirstClass {
        public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

}


import java.util.*;
public class FirstClass{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();

        if (button == 1){
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid");
        }
    }
}

import java.util.*;
public class FirstClass{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();

        switch(button) {
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
}  



import java.util.*;
public class FirstClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();
        switch(button) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Invalid");
                break;
            
        }

    }
}



import java.util.*;
public class FirstClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();
        switch (operator) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
            System.out.println(a%b);
            break;
            default:
            System.out.println("Invalid");
        
        }
    }

}


//LOOPS
// FOR LOOP

import java.util.*;
public class FirstClass {
    public static void main(String[] args) {
        for ( int counter = 0; counter < 10; counter ++){
            System.out.println("Hello World");
        }
    }
}


import java.util.*;
public class FirstClass {
    public static void main(String[] args) {
        for (int i = 1;i<=69 ; i++){
            System.out.println(i);
        }
    }
 
}
// WHILE


import java.util.*;
public class FirstClass {
    public static void main(String[] args) {
        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }
        }
    }



// DO WHILE

import java.util.*;
public class FirstClass {
    public static void main(String[] args) {
        int i = 2;
        do {
         System.out.println("priyanshu");
            i++;
        } while(i<=10);
    }
}


// SUM of natural nos

import java.util.*;
public class FirstClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);
         
    }
}


// table 
import java.util.*;
public class FirstClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(i*table);
        
        }
    }
}
*/


// print all even nos
import java.util.*;
public class FirstClass{
    public static void main(String args[]){
        for (int i = 1;i <=100000 ; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }}
// no is prime or not\
import java.util.*;
public class FirstClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i<=n-1 ; i++){
            