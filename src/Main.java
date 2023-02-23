import java.util.Scanner;

public class Main {
    public static String pathDb = "dataAnimals.txt";
    public static void main(String[] args) {


        System.out.print("\033[H\033[J");// ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
       ConsoleView view = new ConsoleView();
       Presenter presenter = new Presenter(view, pathDb);

        start(presenter);
    }

    public static void start(Presenter presenter) {
        System.out.println();
        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                try (Scanner scanner = new Scanner(System.in)) {
                    while (true) {
                        System.out.println("Введите опцию - 1 - добавить новое животное; 2- вывести записи на экран; 3 - выбрать животное; 4 - сохранить в файл");
                        String key = scanner.next();
                        System.out.print("\033[H\033[J");

                        switch (key) {
                            case "1":
                                presenter.add();

                                break;
                            case "2":
                                presenter.showNotes();
                                break;
//
                            case "3":
                                presenter.choose();
                                break;

                            case "4":
                                presenter.save();

                            default:
                                System.out.println();
                                break;
                        }
                    }
                }
            }


        }
    }
}