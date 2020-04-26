package Java_Level_1.lesson_7.equipment;


public class Plate {
    private double amountOfFood;

    public Plate(double amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public double getAmountOfFood() {
        return amountOfFood;
    }

    public void setAmountOfFood(double amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public void decreaseFood(double appetite) {
        amountOfFood -= appetite;
    }

    public void giveMoreFood(double necessaryFood){
        setAmountOfFood(getAmountOfFood() + necessaryFood);
    }
}
