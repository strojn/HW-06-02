package pack;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();

        animals.add(0, "кіт");
        animals.add(1, "пес");
        animals.add(2, "лис");
        animals.add(3, "білка");
        animals.add(4, "заець");
        animals.add(5, "слон");
        animals.add(6, "лось");
        animals.add(7, "їжак");

        System.out.println("\nHW - 06 - 01\n" + animals);

        System.out.println("\nHW - 06 - 02");
        System.out.println("розмір списку animals ДО видалень: " + animals.size());

//        animals.remove("їжак");//краще так ніж через індекси
        animals.remove(6);//7
        animals.remove(4);//5
        animals.remove(2);//3
//якщо змінити цей порядок видалень, то прийдеться враховувати зміну номера індексу елемента

        System.out.println("розмір списку animals ПІСЛЯ видалень: " + animals.size());
        System.out.println(animals);
    }
}
