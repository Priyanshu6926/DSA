//tower of hanoi.  O(2^n)
/***
public class Recursion2 {
    public static void towerofhanoi(int n, String src, String helper,String dest){
        if (n==1){
            System.out.println("transfer disk" +n+ "from"+src+"to"+dest);
        return;
        }
        towerofhanoi(n-1,src,dest,helper);
        System.out.println("transfer disk" + n + "from" + src + "to" + dest);
        towerofhanoi(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        int n=4;
        towerofhanoi(n,"S","H","D");
        
    }
}

*/

 // reverse of a string using recursion. O(n)
public class Recursion2{
    public static void printRev(String str,int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        printRev(str,index-1);
    }
    public static void main(String args[]){
        String str = "qwerty";
        printRev(str,str.length()-1);
    }
}