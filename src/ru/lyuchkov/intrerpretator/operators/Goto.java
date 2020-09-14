package ru.lyuchkov.intrerpretator.operators;

import ru.lyuchkov.intrerpretator.Interpreter;

public class Goto extends Operator {
    public Goto(String code) {
        super(code);
    }

    @Override
    public void exec(Interpreter interpreter) {
        interpreter.goTo(Integer.parseInt(code));
    }
}
