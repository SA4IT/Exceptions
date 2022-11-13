package ru.msc.mirea.kvbo0121.korenev.work18;
import java.util.Scanner;

public class Expention2 {
    public void exceptionDemo2() {
        try{
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );

        }
        catch(NumberFormatException e){
            System.out.println("Введено НЕ число!");
        }
        finally {
            System.out.println("Stop run!");
        }
    }
}
