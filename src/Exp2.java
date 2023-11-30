import java.util.Scanner;

public class Exp2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println("Перевернутая строка: " + stringBuilder.reverse());
    }
}

