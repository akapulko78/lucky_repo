package Java_Level_1.lesson_5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;


    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void employeeInfo() {
        System.out.printf("ФИО: %s%nДолжность: %s%nEmail: %s%nPhoneNumber: %s%nSalary: %d%nAge: %d%n",
                name, position, email, phoneNumber, salary, age);
    }

    }
