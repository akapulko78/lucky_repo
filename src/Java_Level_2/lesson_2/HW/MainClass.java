package Java_Level_2.lesson_2.HW;

public class MainClass {

    private static String[][] numbers =
            new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}};
    private static String[][] numbers1 =
            new String[][]{{"s", "2", "3", "4"}, {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
    private static int sumOfNumbers;

    public static void main(String[] args) {
       /* System.out.println(numbers.length);
        System.out.println(numbers1.length);*/
        try {
            massiveOfNumbers(numbers);
        } catch (MyArrayDataException myArrayDataException) {
            System.out.println("illegal type of array members");
        } catch (MyArraySizeException myArraySizeException) {
            System.out.println("illegal number of array members");
        }

        try {
            massiveOfNumbers(numbers1);
        } catch (MyArrayDataException myArrayDataException) {
            System.out.println("illegal type of array members");
        } catch (MyArraySizeException myArraySizeException) {
            System.out.println("illegal number of array members");
        }

    }

    private static void massiveOfNumbers(String[][] stringNumbers) throws MyArrayDataException, MyArraySizeException {

        for (int i = 0; i < stringNumbers.length; i++) {
            if (stringNumbers.length < 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < stringNumbers[i].length; j++) {
                if (stringNumbers[i].length < 4) {
                    throw new MyArraySizeException();
                }
                if (stringNumbers[i][j].length() > 1 ||
                        !stringNumbers[i][j].matches("[-+]?\\d+")) {
                    throw new MyArrayDataException();
                }
                sumOfNumbers += Integer.parseInt(stringNumbers[i][j]);
            }
        }
        System.out.println(sumOfNumbers);
    }


}
