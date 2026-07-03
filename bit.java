/*** 

import java.util.*;
public class bit {
    public static void main(String args[]){
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;
        
        if((bitMask & n) == 0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}


import java.util.*;
public class bit {
    public static void main(String args[]){
        int n = 5;
        int pos = 1 ;
        int bitMask = 1 << pos;
        
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}


import java.util.*;
public class bit {
    public static void main(String args[]){
        int n = 5;
        int pos = 2  ;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);
        
        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}


import java.util.*;
public class bit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt(); 

        //oper = 1 set bit , oper = 0 clear bit
        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper == 1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            int newBitMask = ~(bitMask);
            int newNumber =newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
*/

//Write a program to find if a number is a power of 2 or not.
import java.util.*;
public class bit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0 && (n&(n-1)) == 0 )
            {
                System.out.println("Yes it is a power of 2");
            }
        else{
            System.out.println("No it is not a power of 2");
        }
    }ß
}