package Animals;

import java.util.Date;

public class Cat extends Pet {
    public Cat(){
        super();
        commands.add ("мяукать");
    }
    public Cat(String name, Date birthday) {
         super(name, birthday);
        commands.add ("мяукать");
    }
    public void voice () {
        System.out.println(name + "say meow.");
    }
    public void addCommand (){
        commands.add ("мурлыкать");
    }

}
