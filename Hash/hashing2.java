import java.util.*;
public class hashing2 {
    public static void main(String[] args) {
        //key value pair

        HashMap<String,Integer> map = new HashMap<>();
    

        //insert
        map.put("India",150);
        map.put("china",100);
        map.put("US",50);
    
        System.out.println(map);
        //unordered map

        map.put("china",200);
        System.out.println(map);

        //search lookup
        // if(map.containsKey("india")){
        //     System.out.println("map contains the key");
        // }else{
        //     System.out.println("key not present");
        
        // }
        
        // System.out.println(map.get("china"));
        // System.out.println(map.get("japan"));
        

        // int arr[] = {12,14,15};
        // for(int i=0;i<3;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();


        // //


        // for(int val : arr){
        //     System.out.print(val+" ");
        // }
        // System.out.println();

        
        //iteration
        // for(Map.Entry<String,Integer> e : map.entrySet()){
        // System.out.println(e.getKey());
        // System.out.println(e.getValue());

        // }

        // Set<String> keys = map.keySet();
        // for(String key : keys){
        //     System.out.println(key);
            
        // }

        map.remove("china");
        




    }
}
