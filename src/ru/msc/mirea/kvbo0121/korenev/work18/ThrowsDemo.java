package ru.msc.mirea.kvbo0121.korenev.work18;
import java.util.Scanner;

public class ThrowsDemo {

//    public void printMessage(String key) {
//        String message = getDetails(key);
//        System.out.println( message );
//    }
//    public String getDetails(String key) {
//        if(key == null) {
//            throw new NullPointerException( "null key in getDetails" );
//        }
//        return "data for " + key;
//    }

    public void getKey() {
        Scanner myScanner = new Scanner( System.in);
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            System.out.println("error");
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}


