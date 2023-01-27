package u5pp;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        InputHelper me = new InputHelper(myScanner);
        System.out.println(me.getChessLocation("enter location"));


    }
}