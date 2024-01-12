import java.util.Scanner;

//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите числовой массив через пробел: ");
        String input = console.nextLine();
        String[] numbers = input.split(" ");

        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        System.out.println("Элементы массива, кратные 3:");
        for (int value : array) {
            if (value % 3 == 0) {
                System.out.println(value);
            }
        }
        console.close();
    }
}