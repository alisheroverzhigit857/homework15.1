package person;

public class Person {
    private  final  String name = "Erzhigit";
    private  static  int age;

    public  Person () {
    }

    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
    public  void  working  () {
        System.out.println("Working");
    }
}
