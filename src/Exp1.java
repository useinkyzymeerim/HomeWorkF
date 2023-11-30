import java.util.Scanner;

public class Exp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();

        char [] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]){
                s = s.replace(String.valueOf(chars[i]), "");
            }
        }
        System.out.println("Уникальные символы: " + s);
    }

}
