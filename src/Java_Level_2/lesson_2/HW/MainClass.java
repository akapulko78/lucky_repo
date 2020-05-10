package Java_Level_2.lesson_2.HW;

public class MainClass {

    private static String[][] numbers =
            new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}};

    private static String[][] numbers1 =
            new String[][]{{"s", "2", "3", "4"}, {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

    private static String[][] numbers2 =
            new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
    private static int sumOfNumbers;

    public static void main(String[] args) {
       /* System.out.println(numbers.length);
        System.out.println(numbers1.length);*/
        try {
            //massiveOfNumbers(numbers2);
            massiveOfNumbers(numbers1);
            //massiveOfNumbers(numbers);
        } catch (MyArraySizeException | MyArrayDataException myArraySizeException) {
            myArraySizeException.printStackTrace();
        }

        try {
            massiveOfNumbers(numbers);
        } catch (MyArrayDataException | MyArraySizeException myArrayDataException) {
            myArrayDataException.printStackTrace();
        }
    }

    private static void massiveOfNumbers(String[][] stringNumbers) throws MyArraySizeException,
            MyArrayDataException {
        if (stringNumbers.length != 4) {
            throw new MyArraySizeException();
        }
        for (String[] stringNumber : stringNumbers) {
            for (int j = 0; j < stringNumber.length; j++) {
                if (stringNumber.length != 4) {
                    throw new MyArraySizeException();
                }
                try {
                    sumOfNumbers += Integer.parseInt(stringNumber[j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(stringNumber[j]);// чтобы передать что-то в
                    // качестве параметра, необходимо создлать конструктор в классе исключения
                }
            }
        }
        System.out.println(sumOfNumbers);
    }


}
