import java.util.*;

public class hashing {
    public static void main(String[] args) {
        //creating
    HashSet<Integer> set = new HashSet<>();
    //inserting
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1);

    //size
    System.out.println(set.size());

    //print set
    System.out.println(set);

    //iterator
    Iterator it = set.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }




    // if(set.contains(1)){
    //     System.out.println("set contains 1");
    // }
    // if(!set.contains(6)){
    //     System.out.println("set does not contains 6");
    // }
    // //delete
    // set.remove(1);
    // if(!set.contains(1)){
    //     System.out.println("set does not contains 1");
    // }



    }
    
}






