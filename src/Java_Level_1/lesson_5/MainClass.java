package Java_Level_1.lesson_5;



public class MainClass {

  private static Employee[] employees = new Employee[5];

  public static void main(String[] args) {

    employees[0] = new Employee("Гаврилов", "проектный менеджер",
            "dgavrilovdv@gmail.com", "+71", 65000, 30);
    employees[1] = new Employee("Иванов", "директор",
            "dgavrilov@gmail.com", "+72", 5000, 31);
    employees[2] = new Employee("Сидоров", "менеджер",
            "dgavrilo@gmail.com", "+73", 6500, 32);
    employees[3] = new Employee("Сергеев", "охранник",
            "dgavril@gmail.com", "+74", 6000, 44);
    employees[4] = new Employee("Попов", "секретарь",
            "dgavri@gmail.com", "+75", 650, 39);

    older_40();
  }

  public static void older_40() {
    for (Employee tempEmployee : employees) {
      if (tempEmployee.getAge() > 40) {
        tempEmployee.employeeInfo();
      }
    }
  }


}
