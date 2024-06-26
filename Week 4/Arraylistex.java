import java.util.*;

public class Arraylistex{
    public static void main(String[] args) {
        ArrayList<String>l1= new ArrayList<>();
        l1.add("HTML");
        l1.add("JAVA");
        l1.add("JSP");
        l1.add("SERVLET");

        System.out.println("Element at index number 2:" +l1.get(2));

        for(String course:l1){
            System.out.println(course);
        }
         System.out.println(l1);
          System.out.println("------------");

          Iterator<String> itr=l1.iterator();
          while(itr.hasNext()){
            System.out.println(itr.next());
            
            
          }

    }
}