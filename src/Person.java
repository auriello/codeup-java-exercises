

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public static void main(String[] args) {
        Person person = new Person("Meadow Bright");
        person.sayHello();
        System.out.println("My name is " + person.getName());
        person.setName("Meadow Bright");
        System.out.println("My name is now " + person.getName());
    }
}

