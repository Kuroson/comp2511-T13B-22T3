package calculator.expression;

public class MultiplicationExpression implements Expression {
    private Expression e1;
    private Expression e2;

    public MultiplicationExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double compute() {
        return this.e1.compute() * this.e2.compute();
    }

}