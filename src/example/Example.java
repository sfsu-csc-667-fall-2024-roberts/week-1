package example;

public class Example {
    private int firstNumber;
    private int secondNumber;

    public Example(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int add() {
        return this.firstNumber + this.secondNumber;
    }
}