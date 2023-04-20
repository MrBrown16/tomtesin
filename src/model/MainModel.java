package model;

import java.util.Scanner;

public class MainModel {
    public boolean checkInput(String input){
        if( input.matches("[0-9.,]+")) {
         return true;
        }else{
         return false;
        }
     }
     private String beker(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
    
}
