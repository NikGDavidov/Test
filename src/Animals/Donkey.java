package Animals;

import java.util.Date;

public class Donkey extends PackAnimal{
    public Donkey(String name, Date birthday) {
        super(name, birthday);
        commands.add("говорить ИА");
    }
    public void say (){
        System.out.println(name + " say ya-yore.");
    }

    @Override
    public void addCommand() {
        commands.add ("возить тележку");
    }
}
