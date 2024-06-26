import java.util.*;
class MyMarks extends Exception{
    public MyMarks(String msg){
        super(msg);
    }
}
public class exceptionex1{
    public static void accept(int marks) throws  MyMarks{
        if(marks>100 && marks!=0){
            throw new MyMarks("total marks");
        }
        else if(marks>=90){
            System.out.println("eXCELLENT");
        }
        else if (marks>35 && marks <=70){
            System.out.println("good");
        }
        else{
            System.out.println("Fail");
        }
    }
    public static void main(String[] args){
        System.out.println("enter the total marks");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        try {
            accept(marks);
        } catch (MyMarks ex) {
        }
    }
}