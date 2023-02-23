package Animals;

import java.util.Date;

public class Dog extends Pet {
    public Dog(String name, Date birthday) {
        super(name, birthday);
        commands.add ("гавкать");
    }
    public void voice () {
        System.out.println(name + "say hav!");
    }

    @Override
    public void addCommand() {
        commands.add ("бежать за палкой");
    }
}
