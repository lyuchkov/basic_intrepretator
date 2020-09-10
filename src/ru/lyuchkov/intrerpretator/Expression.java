package ru.lyuchkov.intrerpretator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Map;

public class Expression {
    public static Object eval(Map<String, Double> vars, String code) throws ScriptException {
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine engine = sem.getEngineByName("JavaScript");
        for(String str: vars.keySet()){
            code= code.replace(str, vars.get(str).toString());
        }
        return engine.eval(code);
    }
}
