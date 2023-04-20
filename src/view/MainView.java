package view;

import java.util.Scanner;

public class MainView {
    private String beker(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }

}

