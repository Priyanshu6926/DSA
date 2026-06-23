/***
 * import java.util.*;
 * public class strings {
 * public static void main(String[] args) {
 * String firstName = "tony";
 * String lastName = "stark";
 * String fullName = firstName + "@" + lastName;
 * 
 * System.out.println(fullName.length());
 * 
 * for (int i=0;i<fullName.length();i++){
 * System.out.println(fullName.charAt(i)); }
 * }
 * }
 * // comparision of strings
 * 
 * public class strings{
 * public static void main(String[] args) {
 * String s1 ="Rriyanshu";
 * String s2 ="Priyanshu";
 * 
 * // if(s1.compareTo(s2)==0){
 * // System.out.println("String are equla");
 * // }else{
 * // System.out.println("not equal");
 * // }
 * if(new String("Tony") == new String("Tony")){
 * System.out.println("Equal");
 * }else{
 * System.out.println("Not Equal");
 * }
 * }
 * }
 * 
 * 
 * import java.util.*;
 * public class strings {
 * public static void main(String[] args) {
 * String notname = "Priyanshu";
 * String name = notname.substring(2,4);
 * System.out.println(name);
 * }
 * }
 * 
 * 
 * // STRING BUILDER
 * import java.util.*;
 * public class strings {
 * public static void main(String[] args) {
 * StringBuilder sb = new StringBuilder("Priyanshu");
 * System.out.println(sb);
 * // CHAR AT INDEX 0 charAt function..
 * // System.out.println(sb.charAt(1));
 * 
 * // // SET CHAR
 * // sb.setCharAt(0,'P');
 * // System.out.println(sb);
 * 
 * // // INSERT
 * // sb.insert(9,'Z');
 * // System.out.println(sb);
 * 
 * // // DELETE
 * // sb.delete(0,2);
 * // System.out.println(sb);
 * }
 * 
 * }
 * 
 * //REVERSR OF A STRING
 * 
 * import java.util.*;
 * public class strings {
 * public static void main(String[] args) {
 * StringBuilder sb = new StringBuilder("priyanshu");
 * for(int i = 0;i<sb.length()/2;i++){
 * int front = i;
 * int back = sb.length() -1 -i;
 * 
 * char frontChar = sb.charAt(front);
 * char backChar = sb.charAt(back);
 * 
 * sb.setCharAt(front,backChar);
 * sb.setCharAt(back,frontChar);
 * }
 * System.out.println(sb);
 * }
 * 
 * }
 */
public class strings {
    public static void main(String[] args) {
        String original = "Priyanshu";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}