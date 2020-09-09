package ru.lyuchkov.intrerpretator.operators;

import ru.lyuchkov.intrerpretator.Expression;
import ru.lyuchkov.intrerpretator.Interpreter;

import javax.script.ScriptException;

public class Print extends Operator {
    public Print(String code) {
        super(code);
    }

    @Override
    public void exec(Interpreter interpreter) {
        try {
            Object result = Expression.eval(interpreter.getVars(), code);
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        interpreter.next();
    }


}
