import java.util.*;
public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        // addd element
        list.add(4);    
        list.add(5);
        list.add(6);
        System.out.println(list);

        //get element
        int element = list.get(0);
        System.out.println(element);

        // to add element in btw
        list.add(0,3);
        System.out.println(list);

        //set element
        list.set(0,10);
        System.out.println(list); 

        //deleete
        list.remove(3);
        System.out.println(list); 
 

        //size
        System.out.println(list.size());


        //for loops
        for(int i =0; i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();  

        //sorting
        Collections.sort(list);
        System.out.println(list);

    }
}

