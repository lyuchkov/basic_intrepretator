package ru.lyuchkov.intrerpretator.operators;

import ru.lyuchkov.intrerpretator.Interpreter;

abstract public class Operator {
    String code;

    public Operator(String code) {
        this.code = code;
    }

    abstract public void exec(Interpreter interpreter);

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + code;
    }
}
