package arrays;
import java.util.*;
public class TwoDArrays {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();
       int[][] numbers = new int[rows][cols];
       //input
       //rows
       for(int i=0; i<rows; i++) {
           //columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }
       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
                   System.out.print(numbers[i][j]+" ");
               }
               System.out.println();
           }
   }
}

/*** 

// print x location of an element

import java.util.*;
public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] numbers = new int [rows][cols];
        //input 
        //rows
        for (int i = 0;i<rows;i++){
            //columns
            for (int j = 0;j<cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //search x
        int x = sc.nextInt();
        for (int i = 0;i<rows;i++){
            for (int j = 0;j<cols;j++){
                if(numbers[i][j] ==x){
                System.out.println("X found at locations(" + i +"," +j+")");

                }
            }
        }
       
    }
}



// transpose

import java.util.*;
public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] numbers = new int [rows][cols];
        //input 
        //rows
        for (int i = 0;i<rows;i++){
            //columns
            for (int j = 0;j<cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        //output
        for (int j = 0;j<cols;j++){
            for (int i=0;i<rows;i++){

                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

}


*/