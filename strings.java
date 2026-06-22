/*** 
import java.util.*;
public class strings {
    public static void main(String[] args) {
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + "@" + lastName;

        System.out.println(fullName.length());
        
        for (int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));        }
    }
}*/
// comparision of strings

public class strings{
    public static void main(String[] args) {
        String s1 ="Rriyanshu";
        String s2 ="Priyanshu";

        if(s1.compareTo(s2)==0){
            System.out.println("String are equla");
        }else{
            System.out.println("not equla");
        }      
    }
}
