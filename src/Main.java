import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> print = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int line = 0;
        while (line != 3) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Добавить задачу");
            System.out.println("2 - Список дел");
            System.out.println("3 - выход");
            line = scanner.nextInt();
            switch (line) {

                case 1:
                    System.out.println("Введите задачу");
                    Scanner scanner1 = new Scanner(System.in);
                    String add = scanner1.nextLine();
                    print.add(add);
                    System.out.println("Задача добавлено в список дел");

                    break;
                case 2:
                    if (print.isEmpty()) {
                        System.out.println("Список дел пуст");
                    } else {
                        System.out.println("Текущий список дел");
                        System.out.println(print);
                        System.out.println("Введите задачи для отметки выполненной");
                        Scanner scanner2 = new Scanner(System.in);
                        String delete = scanner2.nextLine();
                        print.remove(delete);
                        System.out.println("Задача отмечена как выполненная и удалена");
                    }
                    break;
                case 3:
                    System.out.println("Вы вышли");
                    break;
                default:
                    System.out.println("Ощибка, попробуйте занова");
                    break;
            }


        }

    }
}
