import java.util.Scanner;

//Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
//если нет, то вывести "Нет такого имени"

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = console.nextLine();

        if(name.equalsIgnoreCase("Вячеслав"))
            System.out.println("Привет, Вячеслав");
        else
            System.out.println("Нет такого имени");

        console.close();
    }
}