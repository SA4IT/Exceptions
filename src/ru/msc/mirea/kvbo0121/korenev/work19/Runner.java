package ru.msc.mirea.kvbo0121.korenev.work19;
import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {
        System.out.println();
        Set set = new Set();

        try{
            set.addSet();
        }catch(ZeroInINNException error){
            System.err.println(error);
        }
        System.out.println();
        set.print();
        System.out.println();

        try{
            set.find();
        }catch(NoNameException error1){
            System.err.println(error1);
        }catch (InnException error2){
            System.err.println(error2);
        }

    }
}
