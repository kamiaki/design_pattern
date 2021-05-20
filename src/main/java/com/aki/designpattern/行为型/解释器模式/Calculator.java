package com.aki.designpattern.行为型.解释器模式;

import com.aki.designpattern.行为型.解释器模式.Expression.AdditionExpression;
import com.aki.designpattern.行为型.解释器模式.Expression.Expression;
import com.aki.designpattern.行为型.解释器模式.Expression.NumExpression;
import com.aki.designpattern.行为型.解释器模式.Expression.SubtractionExpression;

import java.util.Stack;

public class Calculator {
    private Stack<Expression> stack = new Stack<>();
    private String expression;

    public Calculator(String expression){
        this.expression = expression;
    }

    public int calculate(){
        Expression exp1,exp2;

        String[] elements = expression.split(" ");
        for (int i = 0;i<elements.length;i++){
            switch (elements[i].charAt(0)){
                case '+':
                    exp1 = stack.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    stack.push(new AdditionExpression(exp1,exp2));
                    break;
                case '-':
                    exp1 = stack.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    stack.push(new SubtractionExpression(exp1,exp2));
                    break;
                default:
                    stack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }

        return stack.pop().interpret();
    }
}
