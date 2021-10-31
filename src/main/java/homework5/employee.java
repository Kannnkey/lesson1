package homework5;

public class Employee {
    private final String name;
    private final String position;
    private final String email;
    private final String Number;
    private final int salary;
    private final int age;

    public int Age() {
        return age;
    }

    public Employee(String name, String position, String email, String Number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.Number = Number;
        this.salary = salary;
        this.age = age;
    }


    public void info() {
        System.out.println("Имя: " + name + " | " + " Должность: " + position + " | " + " email: " + email + " | " +
                " Номер: " + Number + " | " + " Зарплата: " + salary + " | " + " Возраст: " + age);

    }

}