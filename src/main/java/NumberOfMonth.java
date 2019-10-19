import java.util.Scanner;


 //Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.


public class NumberOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        if (sc.hasNextInt()) {
            int numberMonth = sc.nextInt();
            nameMonth(numberMonth);
        } else {
            System.out.println("Проверьте правильность введного числа...");
        }

    }

    private static void nameMonth(int a) {
        String[] month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String nameMonth;
        try {
            nameMonth = month[a - 1];
            System.out.println(nameMonth);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого месяца нет...");
        }
    }
}
