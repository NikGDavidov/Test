
import java.util.Scanner;

public class Presenter {
    AnimalInfo animalinfo;
    ConsoleView view;
    public Presenter(ConsoleView view, String pathDb) {
        this.view = view;
        animalinfo = new AnimalInfo(pathDb);
    }
    public void add(){
        animalinfo.add();
        }

        public void showNotes(){
        view.show(animalinfo.getAnimals());
        }
        public void choose(){
        showNotes();
            System.out.println("Нажмите на порядковый номер животного (от нуля)");
            Scanner sc3 = new Scanner(System.in);
            int i = sc3.nextInt();
            if (i>=animalinfo.getAnimals().size()){
                System.out.println("Нет такого номера");
                return;
            }
            view.choose(animalinfo.getAnimals(), i);

        }
        public void save(){
        Save.write(animalinfo.getAnimals());
        }
    }


