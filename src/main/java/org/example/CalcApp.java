package org.example;

public interface CalcApp<T extends Number> {
    T sumExpression(T a, T b);

    Double delExpression(T a, T b);

    T mulExpression(T a, T b);

    T subExpression(T a, T b);
}
