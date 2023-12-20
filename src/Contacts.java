import java.util.HashMap;
import java.util.Scanner;

public class Contacts {
    public static void main(String[] args) {
        HashMap<String, Long> contacts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choose = 1;
        while (choose != 0){
            System.out.println("Выберете действие" +
                    "\n1.Добавить контакт" +
                    "\n2.Удалить контакт" +
                    "\n3.Поиск контактов" +
                    "\n4.Списак контактов" +
                    "\n0.Выход");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose){
                case 1:
                    System.out.print("Введите имя: ");
                    String nameOfContacts = scanner.nextLine();
                    System.out.print("Введите номер: ");
                    Long numberOfContacts = scanner.nextLong();

                    contacts.put(nameOfContacts, numberOfContacts);

                    System.out.println("Контакт успешно сохранено");

                    break;
                case 2:
                    System.out.print("Введите имя контакта для удаления: ");
                    String deleteName = scanner.nextLine();
                    if (contacts.containsKey(deleteName)) {
                        contacts.remove(deleteName);
                        System.out.println("Контакт удален");
                    } else {
                        System.out.println("Контакт не найден");
                    }
                    break;
                case 3:
                    System.out.print("Введите имя контакта для поиска: ");
                    String searchName = scanner.nextLine();
                    if (contacts.containsKey(searchName)) {
                        System.out.println("Найден контакт, номер телефона: " + contacts.get(searchName));
                    } else {
                        System.out.println("Контакт не найден");
                    }
                    break;
                case 4:
                    System.out.println("Список вашых контакт:");
                for (String name : contacts.keySet()) {
                        Long number = contacts.get(name);
                        System.out.println("Имя: " + name + ", Номер телефона: " + number);
                    }
                    break;
                case 0:
                    System.out.println("Вы вышли");
                    break;
                default:
                    System.out.println("Неправильный выбор, попробуйте снова");
                    break;
            }
        }

    }
    }

