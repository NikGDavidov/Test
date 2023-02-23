package Animals;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Animal {
     String name;
    // int age;
     Date birtday;
     List<String> commands;

     public Animal (){
         commands = new LinkedList<>();
         commands.add("Есть");
         commands.add("Спать");
     }

    public Animal(String name, Date birthday) {
        this.name = name;
        this.birtday = birthday;
        commands = new LinkedList<>();
        commands.add("Есть");
        commands.add("Спать");
    }

    public List<String> getCommands() {
        return commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirtday() {
        return birtday;
    }

    public void setBirtday(Date birtday) {
        this.birtday = birtday;
    }

    public void eat (){
        System.out.println(name + " ест.");
    }

    public void addCommand()
    {

    }
}
