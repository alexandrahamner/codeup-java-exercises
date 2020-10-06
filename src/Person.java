public class Person {
//Object basics
    private String name;

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
        Person person1 = new Person();
        person1.setName("Bob");
        System.out.println(person1.getName());
        person1.sayHello();
    }

}
