import Animals.Animal;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    public void show(List<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            String s = animals.get(i).getClass().toString();
            String type = s.substring(s.lastIndexOf(".")+1);
            System.out.println(i + " Name " + animals.get(i).getName() + " Birhday " + animals.get(i).getBirtday().getDate() + "/" + animals.get(i).getBirtday().getMonth() + "/" + animals.get(i).getBirtday().getYear() + " " + "Type " + type);
        }
    }

    public void choose(List<Animal> animals, int i) {
       // try (Scanner sc2 = new Scanner(System.in)) {

          //  while (true) {
               Scanner sc2 = new Scanner(System.in);
                System.out.println("Введите опцию - 1 - вывести список команд; 2- научить новой команде; 3 - удалить запись");
                String key = sc2.next();

                //   System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        List<String> commands = animals.get(i).getCommands();
                        for (String s : commands) {
                            System.out.println(s);
                        }
                        break;
                    case "2":
                        animals.get(i).addCommand();
                        System.out.println("новая команда добавлена. Новый список команд:");
                        commands = animals.get(i).getCommands();
                        for (String s : commands) {
                            System.out.println(s);
                        }
                        break;

                    case "3":
                        animals.remove(i);
                        System.out.println("запись о животном удалена");
                        show(animals);
                        break;

                }
            }
        }




