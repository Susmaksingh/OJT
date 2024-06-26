class employee{
    private String name;
    private int age;

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int newAge){
        age = newAge;
    }

    public void ageinc(){
        age++;
    }
    public void agedec(){
        age--;
    }

    public int getAge(){
        return age;
    }
}
public class encapsulation{
    public static void main(String[] args) {
        employee emobj=new employee();
        emobj.setName("Susma");
        emobj.setAge(24);
        System.out.println(emobj.getName());
        emobj.ageinc();
        System.out.println(emobj.getAge());
        emobj.agedec();
        System.out.println(emobj.getAge());


    }

}