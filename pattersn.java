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
*/

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
