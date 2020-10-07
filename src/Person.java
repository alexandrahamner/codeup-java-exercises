public class Person {
//Object basics
    private String name;

//Made a constructor in order for the "using references" to work.
    public Person(String personName) {
        this.name = personName;
    }

    public String getName(){
        return name;
    }

    public void setName(String personName){
        name = personName;
    }

    public void sayHello(){
        System.out.printf("Hello, %s!", this.name);
    }

    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.setName("Bob");
//        System.out.println(person1.getName());
//        person1.sayHello();

//The first SOUT is true because the strings are equal, but the second SOUT is false because they are two different objects with different object reference.
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//I initially thought it would be false, since it is two different objects. I am guessing you are just making an exact duplicate of person1 and assigning it to person2, they are both point to the same reference location
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//It is going to set both person1 and person2 names as Jane because they are duplicates of each other.
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }



}
