package Animals;

import Animals.Animal;

import java.util.Date;

abstract public class Pet extends Animal {
    public Pet(){
        super();
        commands.add("играть");
    }
    public Pet(String name, Date birthday) {
        super(name, birthday);
        commands.add("играть");
    }
    public void play (){
        System.out.println(name + " играет");
    }
}
