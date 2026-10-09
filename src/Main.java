
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");

        Calculator calculator1 = new Operation(
                new Number(3),
                new Number(5),
                OperationType.ADD);

        Calculator calculator2 = new Operation(
                new Number(2),
                new Number(7),
                OperationType.MULTIPLY);

        Calculator calculator3 = new Operation(
                calculator1,
                calculator2,
                OperationType.SUBSTRACT);


        System.out.println(calculator3.evaluate());

    }
}