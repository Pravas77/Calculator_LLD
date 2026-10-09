public class Operation implements Calculator {
    private final Calculator left;
    private final Calculator right;
    private final OperationType operationType;

    public Operation(Calculator left, Calculator right, OperationType operationType) {
        this.left = left;
        this.right = right;
        this.operationType = operationType;
    }


    @Override
    public double evaluate() {

        if(operationType == OperationType.ADD) return left.evaluate() + right.evaluate();
        else if(operationType == OperationType.SUBSTRACT) return left.evaluate() - right.evaluate();
        else if(operationType == OperationType.MULTIPLY) return left.evaluate() * right.evaluate();
        else if(operationType == OperationType.DIVIDE) return left.evaluate() / right.evaluate();
        else throw new RuntimeException("Invalid input");

    }
}
