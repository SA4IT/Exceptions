package ru.msc.mirea.kvbo0121.korenev.work18;

public class Exception1 {
    public void exceptionDemo1() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
}
