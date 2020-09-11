package ru.lyuchkov.intrerpretator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Interpreter interpreter = new Interpreter();
        while (true){
            String line = scanner.nextLine();
            interpreter.parse(line);
            System.out.println("Commit for commit");
        }

    }
}
