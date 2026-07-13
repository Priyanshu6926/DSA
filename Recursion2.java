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




// find 1st and last occurrence of an element in an array using recursion. O(n)
public class Recursion2{
    public static int first = -1;
    public static int last = -1;

    public static void findOcc(String str, int idx,char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }else{  
                last = idx;
            }   
    }
    findOcc(str,idx+1,element);
    }
    public static void main(String args[]){
        String str = "abaacdaefaah";
        findOcc(str,0,'a');
}
}



// check if an array is sorted or not using recursion. O(n)
public class Recursion2{
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if (arr[idx] < arr[idx+1]){
            return isSorted(arr,idx+1);
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,4,4,5};
        System.out.println(isSorted(arr,0));    
    }
}
*/

public class recursion2 {
   public boolean isSafe(char[][] board, int row, int col, int number) {
       //column
       for(int i=0; i<board.length; i++) {
           if(board[i][col] == (char)(number+'0')) {
               return false;
           }
       }
      
       //row
       for(int j=0; j<board.length; j++) {
           if(board[row][j] == (char)(number+'0')) {
               return false;
           }
       }
      
       //grid
       int sr = 3 * (row/3);
       int sc = 3 * (col/3);
      
       for(int i=sr; i<sr+3; i++) {
           for(int j=sc; j<sc+3; j++) {
               if(board[i][j] == (char)(number+'0')) {
                   return false;
               }
           }
       }
      
       return true;
   }
  
   public boolean helper(char[][] board, int row, int col) {
       if(row == board.length) {
           return true;
       }
      
       int nrow = 0;
       int ncol = 0;
      
       if(col == board.length-1) {
           nrow = row + 1;
           ncol = 0;
       } else {
           nrow = row;
           ncol = col + 1;
       }
      
       if(board[row][col] != '.') {
           if(helper(board, nrow, ncol)) {
               return true;
           }
       } else {
          
           //fill the place
           for(int i=1; i<=9; i++) {
               if(isSafe(board, row, col, i)) {
                   board[row][col] = (char)(i+'0');
                   if(helper(board, nrow, ncol))
                       return true;
                   else
                        board[row][col] = '.';
               }
           }
       }
                     
       return false;
   }
  
   public void solveSudoku(char[][] board) {
       helper(board, 0, 0);
   }
}
