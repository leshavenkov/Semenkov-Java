import java.util.Scanner;

//Составить алгоритм: если введенное число больше 7, то вывести “Привет”

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число: ");
        double input = console.nextDouble();
        if (input > 7)
            System.out.println("Привет");

        console.close();
    }
}