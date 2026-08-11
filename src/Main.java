
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");

        ArithmeticOperation arithmeticOperation1 = new ArithmeticExpression(
                new Number(3),
                new Number(5),
                ExpressionType.ADD);

        ArithmeticOperation arithmeticOperation2 = new ArithmeticExpression(
                new Number(2),
                new Number(7),
                ExpressionType.MULTIPLY);

        ArithmeticOperation arithmeticOperation3 = new ArithmeticExpression(
                arithmeticOperation1,
                arithmeticOperation2,
                ExpressionType.SUBSTRACT);


        System.out.println(arithmeticOperation3.evaluate());

    }
}