import Animals.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalInfo {
    private List<Animal> animals;

    String path;

    public AnimalInfo(String path) {
        this.path = path;
        animals = new ArrayList<Animal>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void add() {
        Scanner sc1 = new Scanner(System.in);
        Animal animal = new Animal();
        System.out.println("Введите имя животного");
        animal.setName(sc1.nextLine());

        System.out.println("Введите дату его рождения в формате dd/MM/yyyy");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String temp = sc1.nextLine();
        try {
            animal.setBirtday(simpleDateFormat.parse(temp));
        } catch (ParseException e) {
            System.out.println("ошибка ввода даты");
            add();
        }

        Animal animal1 = setClass(animal);
        animals.add(animal1);
        try (Counter c = new Counter()) {
            c.add();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }
    public Animal setClass(Animal animal){


   Scanner sc2 = new Scanner(System.in);

        System.out.println("Выберите наименование животного: введите 1 - cat, 2 - dog, 3 - hamster, 4 - horse, 5 - camel, 6 - donkey");
    String key = sc2.nextLine();
        switch (key) {
        case "1":
          Cat cat = new Cat (animal.getName(),animal.getBirtday());
            return cat;
          //  employee.setDepartment(Department.MANAGERIAL);
       //     break;
        case "2":
            Dog dog = new Dog (animal.getName(),animal.getBirtday());
            return dog;
           // break;
        case "3":
            Hamster hamster = new Hamster (animal.getName(),animal.getBirtday());
            return hamster;
            //break;
        case "4":
            Horse horse = new Horse (animal.getName(),animal.getBirtday());
            return horse;
            //break;
        case "5":
            Camel camel = new Camel (animal.getName(),animal.getBirtday());
            return camel;
            //break;
            case "6":
                Donkey donkey = new Donkey (animal.getName(),animal.getBirtday());
                return donkey;
        default:
            System.out.println("Таких животных в реестре нет");
            add();
            break;
    }
    return animal;
}
}
