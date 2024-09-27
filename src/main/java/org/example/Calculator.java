package org.example;

public class Calculator implements CalcApp<Double> {
    public Calculator() {
        super();
    }

    @Override
    public Double sumExpression(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double delExpression(Double a, Double b) {
        if (b == 0) {
            try {
                throw new ArithmeticException();
            } catch (Exception e) {
                throw new RuntimeException(e);

            }
        }
        return a * 1.0 / b;
    }


    @Override
    public Double mulExpression(Double a, Double b) {
        return 0.0;
    }

    @Override
    public Double subExpression(Double a, Double b) {
        return 0.0;
    }
}
