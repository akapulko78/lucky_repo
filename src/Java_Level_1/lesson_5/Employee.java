package Java_Level_1.lesson_5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;
    private static Employee[] employees = new Employee[5];

    public static void main(String[] args) {
        System.out.println("Старт программы");
        employees[0] = new Employee("Гаврилов", "проектный менеджер",
                "dgavrilovdv@gmail.com", "+71", 65000, 30);
        employees[1] = new Employee("Иванов", "директор",
                "dgavrilov@gmail.com", "+72", 5000, 31);
        employees[2] = new Employee("Сидоров", "менеджер",
                "dgavrilo@gmail.com", "+73", 6500, 32);
        employees[3] = new Employee("Сергеев", "охранник",
                "dgavril@gmail.com", "+74", 6000, 40);
        employees[4] = new Employee("Попов", "секретарь",
                "dgavri@gmail.com", "+75", 650, 42);

        older_40();

    }


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

    public static void employeeInfo(Employee employee) {
        System.out.printf("ФИО: %s%nДолжность: %s%nEmail: %s%nPhoneNumber: %s%nSalary: %d%nAge: %d%n",
                employee.getName(), employee.getPosition(), employee.getEmail(),
                employee.getPhoneNumber(), employee.getSalary(), employee.getAge());
    }

    public static void older_40() {
        for (int i = 0; i < employees.length - 1; i++) {
            System.out.println(employees[i].getAge());
            if (employees[i].getAge() > 40) {
                employeeInfo(employees[i]);
                System.out.println("Конец программы");
            } else{
                System.out.println("<40");
            }
        }
    }

}
