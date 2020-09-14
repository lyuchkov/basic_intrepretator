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
        Object result= null;
        interpreter.next();
        String trim = code.trim();
        if(trim.startsWith("\"")){
            String quotedStr = trim.substring(1, trim.length()-1);
            if(trim.endsWith(";"))
                System.out.print(quotedStr);
            else
                System.out.println(quotedStr);
            return;
        }
        try {
            result = Expression.eval(interpreter.getVars(), code);
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }

    }


}
