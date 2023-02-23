import Animals.Animal;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Save {
    public static void write(List<Animal> animals ) {
        String fileName = Main.pathDb;
        for (Animal a: animals){
        StringBuilder sb = new StringBuilder();

        sb.append(a.getName());
        sb.append(',');

        Date dt = a.getBirtday();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        sb.append(f.format(dt));
        sb.append(',');
           String temp = a.getClass().toString();
           String type = temp.substring(temp.lastIndexOf(".")+1);
            sb.append(type);
            sb.append(',');

            for (String com:a.getCommands()){
                sb.append(com);
                sb.append(',');
            }


        sb.append('\n');

        try( FileWriter fw = new FileWriter(fileName, true)){

            fw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

}
