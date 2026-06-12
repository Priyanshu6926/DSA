/**
public class pattersn {
    public static void main (String[] args){

    // RECTANGLE STAR PATTERN
        int n = 5;
        int m = 4;

        // outer loop for rows
        for (int i = 1; i <= n; i++){
            // inner loop for columns
            for (int j = 1;j <= m; j++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
        
    }
    
}


// rows outer loop  // colums inner loop


// hollow rectangle star pattern
public class pattersn {
    public static void main (String[] args){
        int n = 4;
        int m = 5;
        for (int i = 1;i <=n; i++){
            for (int j = 1;j <=m ; j++){ 
                if (i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

}

// star pattern 1

public class pattersn {
    public static void main (String[] args){
        int n = 5;
        for (int i = 1; i <= n ; i++){
            for (int j = 1;j <= i; j++){
                System.out.print ("*");
            }
            System.out.println();
        }
}}

// star pattern 2
public class pattersn {
    public static void main (String[] args){
        int n = 5;
        for (int i = n; i >= 1 ; i--){
            for (int j = 1;j <= i; j++){
                System.out.print ("*");
            }
            System.out.println();
        }
}}

// star pattern 3
public class pattersn {
    public static void main (String[] args){
        int n = 5;
        // outer loop for rows
        for (int i = 1; i <= n ; i++){
            // inner loop for spaces
            for (int j = 1;j <= n - i + 1; j++){
                System.out.print (" ");
            }
            // inner loop for stars
             for (int j = 1;j <= i; j++){
                System.out.print("*"); 
            
     }
     System.out.println();
        }
 }}
 

 // star pattern 4
public class pattersn {
    public static void main (String[] args){
        int n = 6;
        // outer loop for rows
        for (int i = 1; i<=n ; i++){
            for(int j = 1;j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


// star pattern 5
public class pattersn {
    public static void main (String[] args){
        int n = 5;
        // outer loop for rows
        for (int i = 1; i <= n ; i++) {
            for (int j = 1;j<= n-i+1; j++){
                System.out.print(j);
            
            }
            System.out.println();
        }
    }
}

// floyds trinagle
public class pattersn{
    public static void main (String args[]){
        int n = 5;
        int number = 1;
        for (int i = 1; i <= n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
*/
public class pattersn{
    public static void main (String args[]){
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1;j<=i;j++){
                int sum = i +j;
                if (sum % 2 ==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}

