package Animals;

import java.util.Date;

public class Hamster extends Pet {
    public Hamster(String name, Date birthday) {
        super(name, birthday);
    }
    public void addCommand(){
        commands.add("крутить колесо");
    }
}
