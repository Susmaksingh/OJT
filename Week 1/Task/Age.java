    import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        //  the first person input
        System.out.print("Enter age of person 1: ");
        int A1 = s.nextInt();

        // the second person input
        System.out.print("Enter age of person 2: ");
        int A2 = s.nextInt();

        // the third person input
        System.out.print("Enter age of person 3: ");
        int A3 = s.nextInt();

        if((A1>A2) && (A1>A3)){
            System.out.println("Oldest person is" + A1);
        }
        else if((A2>A1) && (A2>A3)){
            System.out.println("Oldest person is" + A2);
        }
        else{
            System.out.println("Oldest person is "  + A3);
        }
        ///
        if((A1<A2) && (A1<A3)){
            System.out.println("Youngest person is" + A1);
        }
        else if((A2<A1) && (A2<A3)){
            System.out.println("Youngest person is" + A2);
        }
        else{
            System.out.println("Youngest person is "  + A3);
        }
         
    }
}


