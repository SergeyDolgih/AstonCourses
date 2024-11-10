public class Employee {
    private String FIO;
    private String post;
    private String email;
    private long phoneNumber;
    private int salary;
    private int age;
    public Employee(String FIO, String post, String email, long phoneNumber, int salary, int age) {
        this.FIO = FIO;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.println("ФИО: " + FIO);
        System.out.println("Должность: " + post);
        System.out.println("Email: " + email);
        System.out.println("Номер телефона: " +phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}
