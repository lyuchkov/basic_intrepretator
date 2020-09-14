package ru.lyuchkov.intrerpretator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {

        BufferedReader fr = new BufferedReader(new FileReader("G:\\code\\java_projects\\basic_intrepretator\\quad.bas"));
        Interpreter interpreter = new Interpreter();
        while (true){
            String line = fr.readLine();
            if(line==null) break;
            interpreter.parse(line);

        }

    }
}
