import java.lang.annotation.*;

@interface MyAnnotation{
    String value();
}

public class customann{
    @MyAnnotation("custom annotation")
    public viod annmethod(){
        System.out.println("this method is annoteted");

    }

    public static void main(String[] args){
        Customann obj=new customann();

        MyAnnotation
    }
}