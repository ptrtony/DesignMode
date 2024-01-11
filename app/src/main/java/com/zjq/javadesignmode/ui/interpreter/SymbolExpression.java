package com.zjq.javadesignmode.ui.interpreter;

import java.util.HashMap;

public class SymbolExpression extends Expression{
    public Expression left;
    public Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
