package com.preciado.utilities.console;

import java.util.Scanner;

public class ConsoleManager {
    public static ConsoleManager instance = null;
    private Scanner scanner;

    private ConsoleManager(){
        scanner = new Scanner(System.in);

    }

    public static ConsoleManager getInstance(){
        if(instance == null){
            instance = new ConsoleManager();
        }
        return instance;
    }
    public String getInput_inLn(String message){
        System.out.print(message);
        return scanner.next();
    }
    public String getInput_nxtLn(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
    public void printLine(String output){
        System.out.println(output);
    }
}
