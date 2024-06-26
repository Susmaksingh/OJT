import java.util.*;
class program6{
    int num1, num2, res;
    public void calculate(){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the two values for num1 and num2");
    num1=sc.nextInt();
    num2=sc.nextInt();
    /*try{
        res= num1/num2;
        System.out.println("the result is"+res);
    }
    catch(ArithmeticException e){
        System.out.println("Exception occor");
        System.out.println("Exception error"+e);
    }
    finally{
        System.out.println("finally block executed after axception");
    }*/
    res= num1/num2;
        System.out.println("the result is"+res);

    }
}

public class exceptionex{
    public static void main(String[] args) {
        Program p= new Program();
        p.calculate();
    }

    private static class Program {

        public Program() {
        }
    }

    

}