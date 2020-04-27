
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    public boolean equals (Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Person)){
            return false;
        }
        
        Person hell = (Person) compared;
        if(this.name.equals(hell.name)&&this.birthday.equals(hell.birthday)&& this.height == hell.height && this.weight == hell.weight){
            return true;
        }
        return false;
    }

    // implement an equals method here for checking the equality of objects
}