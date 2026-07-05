/*** 

//print nos from 5 to 1 using recursion
public class Recursion1 {
    public static void printNumb(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumb(n - 1);
    }
    public static void main(String[] args) {
        int n = 9;
        printNumb(n);
    }
}



// print nos from 1 to 5 using recursion
public class Recursion1 {
    public static void printNumb(int n){
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNumb(n + 1);
    }
    public static void main(String[] args) {
        int n = 1;
        printNumb(n);
    }
}
*/
// print sum of n natural nos using recursion
public class Recursion1{
    public static void printSum(int i,int n, int sum){
        if(i == n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1,n,sum);

    }
    public static void main(String[] args) {
        printSum(1,5,0);
    }
}