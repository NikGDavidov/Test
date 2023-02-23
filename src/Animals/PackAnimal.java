package Animals;

import java.util.Date;

abstract public class PackAnimal extends Animal {
    public PackAnimal(String name, Date birthday) {
        super(name, birthday);
        commands.add("скакать");
        commands.add("нести груз");
    }
    public void run () {
        System.out.println(name + " is running.");
    }
    public void carry (){
        System.out.println(name + "is carrying cargo.");
    }

}
