public class Operation implements Calculator {
    private final Calculator leftOperation;
    private final Calculator rightOperation;
    private final OperationType operationType;

    public Operation(Calculator leftOperation, Calculator rightOperation, OperationType operationType) {
        this.leftOperation = leftOperation;
        this.rightOperation = rightOperation;
        this.operationType = operationType;
    }


    @Override
    public double evaluate() {

        if(operationType == OperationType.ADD) return leftOperation.evaluate() + rightOperation.evaluate();
        else if(operationType == OperationType.SUBSTRACT) return leftOperation.evaluate() - rightOperation.evaluate();
        else if(operationType == OperationType.MULTIPLY) return leftOperation.evaluate() * rightOperation.evaluate();
        else if(operationType == OperationType.DIVIDE) return leftOperation.evaluate() / rightOperation.evaluate();
        else throw new RuntimeException("Invalid input");

    }
}
