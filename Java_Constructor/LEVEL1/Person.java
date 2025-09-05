public class Person {
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    Person(Person previos){
        this.name=previos.name;
        this.age=previos.age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String args[]){
        Person p1=new Person("Rishabh",25);
        p1.display();
        Person p2=new Person(p1);
        p2.display();
    }
}
