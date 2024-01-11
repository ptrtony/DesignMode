package com.zjq.javadesignmode.ui.interpreter;

import java.util.HashMap;

/**
 * 抽象类表达式，通过HashMap键值对，可以获取到变量的值
 *
 */
public abstract class Expression {
    //解释公式和数值，Key就是公式（表达式），参数[a,b,c],value就是具体值
    //
    public abstract int interpreter(HashMap<String, Integer> var);
}
