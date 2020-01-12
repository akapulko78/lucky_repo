package Java_Level_1.lesson_5;

public class Cat {

  private final String name;
  private String color;
  private int age;

  public Cat(String name, String color, int age) {
    this.name = name;// this обращается к полю класса (которое выше "private String name")
    // и этом полю присваивается значние аргумента в конструкторе. Так заполняются поля класса.
    // Данное выражение может стоять только первым в контсрукторе.
    this.color = color;
    this.age = age;
  }

  public Cat(String name) {
    this(name, "black", 2); // вызов внтури этого конструктора другого контсруктора,
    // поэтому name задается аргументом текущего контсруктора, а два других аргумента - с помощью другого
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public int getAge() {
    return age;
  }


}
