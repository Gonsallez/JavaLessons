package HWLesson5;

public class employee {
    String surname;
    String name;
    String secondName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

//конструктор
    public employee(String surname, String name, String secondName, String position, String email, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    String getFullInfo() {
        return
        this.surname + " " +
        this.name + " " +
        this.secondName + " \t \t " + "Должность: " +
        this.position + " | Адрес почты: " +
        this.email + " | Номер телефона: " +
        this.phone + " | Зарплата :" +
        this.salary + "$" + " | Возраст: " +
        this.age + " лет.";
    }
}