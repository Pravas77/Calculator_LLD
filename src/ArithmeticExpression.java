public class ArithmeticExpression implements ArithmeticOperation{
    private ArithmeticOperation leftExpression;
    private ArithmeticOperation rightExpression;
    private ExpressionType expressionType;

    public ArithmeticExpression(ArithmeticOperation leftExpression, ArithmeticOperation rightExpression, ExpressionType expressionType) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.expressionType = expressionType;
    }


    @Override
    public int evaluate() {

        if(expressionType == ExpressionType.ADD) return leftExpression.evaluate() + rightExpression.evaluate();
        else if(expressionType == ExpressionType.SUBSTRACT) return leftExpression.evaluate() - rightExpression.evaluate();
        else if(expressionType == ExpressionType.MULTIPLY) return leftExpression.evaluate() * rightExpression.evaluate();
        else if(expressionType == ExpressionType.DIVIDE) return leftExpression.evaluate() / rightExpression.evaluate();
        else throw new RuntimeException("Invalid input");

    }
}
