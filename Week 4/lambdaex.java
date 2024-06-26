interface  Moperation{
    int operate(int a, int b);
}
public class lambdaex{
    public static void main(String[] args) {
        Moperation add=(a, b)->a+b;         //lambda expression
        Moperation sub=(a, b)->a-b;

        int res1=add.operate(2, 8);
        int res2=add.operate(2, 5);
        System.out.println("add result"+res1);
        System.out.println("add result"+res2);
    }

}