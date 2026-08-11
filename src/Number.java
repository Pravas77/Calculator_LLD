public class Number implements ArithmeticOperation{
    private int value;

    public Number(int value) {
        this.value = value;
    }


    @Override
    public int evaluate() {
        return value;
    }
}
