package use_case_impl.model;

public class Employe {

    public String name;
    public int age;
    public String phonenumber;

    public Employe(String name,int age, String phonenumber){
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
