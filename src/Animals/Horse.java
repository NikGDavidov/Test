package Animals;

import java.util.Date;

public class Horse extends PackAnimal{
    public Horse(String name, Date birthday) {
        super(name, birthday);
        commands.add("говорить игого");
    }
    public void say(){
        System.out.println(name + "say igogo");
    }

    @Override
    public void addCommand() {
        commands.add ("прыгать через препятствия");
    }
}
