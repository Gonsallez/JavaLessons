package HWLesson5;
/**
 * Выполнил: Осыкин Александр
 * Факультет "Тестирование ПО"
 * Домашнее задание урока 5 (Cотрудники старше 40 лет, массив, конструктор)
 */

public class HomeWork5 {


    public static void main(String[] args) {
        employee[] list = {
                new employee("Рыжиков", "Александр","Алексеевич",
                        "Тех.дир", "alex@mail.ru", "89216568899",2000, 20),
                new employee("Лучина", "Анастасия","Алексеевна",
                        "Менеджер", "petr@mail.ru", "89128827733",5000, 30),
                new employee("Бреговский", "Афанасий","Иванович",
                        "Дизайнер", "iva@mail.ru", "89995436735",500, 40),
                new employee("Данилов", "Аристарх","Петрович",
                        "Уборщик", "dani@mail.ru", "87654342332",300, 50),
                new employee("Ругаев", "Александр","Игоревич",
                        "Зам.дир", "ruga@mail.ru", "89453456573",8000, 60)
        };
        System.out.println();
        showlist(list);
        System.out.println();
        System.out.println("Сотрудники старше 40 лет: ");
        howold(list, 40);

    }
    private static void showlist(employee[] list) { //Метод вывода списка сотрудников
        System.out.println("Список сотрудников: ");
        for (int i = 0; i < list.length; i++)
            System.out.println((i+1) + " " + list[i].getFullInfo());// нумерация сотрудников
    }

    private static void howold(employee[] list, int year) { // метод определяющий, кто старше заданного возраста
        for (int i = 0; i < list.length; i++)
            if (list[i].getAge() >= year) {
                System.out.println("  " + list[i].getFullInfo());
            }
    }
}
