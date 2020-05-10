package Java_Level_2.lesson_2.exceptions;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            aaa(); //это код который контролируется
        } catch (MyException myException) { //это вид исключения, который мы хотим обработать
            System.out.println("personal exception");
        } catch (Exception ex) { //это вид исключения, который мы хотим обработать
            System.out.println("unknown exception");
        } finally {
            System.out.println("shows anywhere"); //это выполнится вне зависимости от исхода catch
        }

    }

    private static void aaa() throws Exception {
        bbb();
    }

    private static void bbb() throws Exception {
        ccc();
    }

    private static void ccc() throws Exception {
        throw new MyException("mistake");
    }


}

