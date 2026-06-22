
// basic arrays
/*** 
public class arrays {
    public static void main(String[] args) {
        int marks[] = new int [3];
        marks[0] = 98;
        marks[1] = 78;
        marks[2] = 85;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}

// short cut method
public class arrays {
    public static void main(String[] args) {
        int marks[] = {98, 78, 85};
        
        for (int i=0; i<3;i++){
            System.out.println(marks[i]);
        }
    }}

//take array size and elements of array
import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int [size];
// taking input
        for (int i = 0;i< size;i++){
            numbers[i] = sc.nextInt();
        }
// print output
        for (int i = 0;i< size;i++){
            System.out.println(numbers[i]);
        }
    }
}


import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int [size];
// taking input
        for (int i = 0;i< size;i++){
            numbers[i] = sc.nextInt();
        }
// taking x
        int x = sc.nextInt();
        
// print output
        for (int i = 0;i<numbers.length;i++){
// find and print x
            if ( numbers[i] == x){
            System.out.println(i);
        }
    }
}
}
*/ 
//Take an array of names as input from the user and print them on the screen.
import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];

        for (int i=0;i<size;i++){
            names [i] = sc.next();
            
        }
        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}

