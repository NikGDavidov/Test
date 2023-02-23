package Animals;

import java.util.Date;

public class Camel extends PackAnimal{
    public Camel(String name, Date birthday) {
        super(name, birthday);
        commands.add("жевать");
    }
    public void chew(){
        System.out.println(name + " is chewing");
    }
    public void addComand(){
        commands.add ("возить туристов");
    }
}
