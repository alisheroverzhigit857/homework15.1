import person.Builder;
import person.Driver;
import person.Programmer;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer() ;
        System.out.println("Name: "+programmer.getName());
        Programmer.setAge(18);
        System.out.println("Age: " + Programmer.getAge());
        programmer.working();
        System.out.println("------------------");

        Driver driver = new Driver();
        System.out.println("Name: "+driver.getName());
        Driver.setAge(18);
        System.out.println("Age: "+Driver.getAge());
        driver.working();
        System.out.println("------------------");

        Builder builder = new Builder() ;
        System.out.println("Name: "+builder.getName());
        Builder.setAge(18);
        System.out.println("Age: "+Builder.getAge() );
        builder.working();
    }
}