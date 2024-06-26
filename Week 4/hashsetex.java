import java.util.*;

 public class hashsetex{
    public static void main(String[] args) {
        HashSet<String> s1=new HashSet<>();
        s1.add("IBM");
        s1.add("ADIT");
        s1.add("TCS");
        s1.add("TATA");

        Iterator<String> itr=s1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        s1.remove("TCS");
        System.out.println(s1);

    }
}