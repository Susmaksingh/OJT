import java.util.*;

public class hashmapex{
    public static void main(String[] arg){
        HashMap<Integer,String> m1=new HashMap<>();
        m1.put(1,"Apple");
        m1.put(2,"Mango");
        m1.put(3,"Banana");
        m1.put(4,"Orange");

        System.out.println("Value at key 1"+ m1.get(1));

        for(Integer key:m1.keySet()){
            System.out.println("Key:"+key+", Value:"+m1.get(key));
        }

        m1.replace(key:3, Value:"Banana",Value:"Kivi");
        for(Integer key:m1.keySet()){
            System.out.println("Key:"+key+", Value:"+m1.get(key));
        }
    }
}