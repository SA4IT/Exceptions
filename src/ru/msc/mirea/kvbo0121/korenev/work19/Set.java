package ru.msc.mirea.kvbo0121.korenev.work19;
import java.util.Scanner;

public class Set {
    int size;// количесвто введённых пользователей
    private String [][] set = new String[10][2];

    public void addSet() throws ZeroInINNException{
        System.out.println("Заполните список фамилий и ИНН (максимльное число пользователей 10)");
        System.out.println("Если вы закончили пополнение списка, то введите 0 в вводе фамилии пользователя!");
        int i =0;
        while (i<10){
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Введите фамилию " + (i+1) + "-го пользователя: ");
            String username = sc.next();
            if(username.equals("0") == true){
                break;
            }
            else{
                this.set[i][0] = username;
            }
            System.out.print("Введите ИИН " + (i+1) + "-го пользователя: ");
            String inn = sc.next();
            if(inn.equals("0") == true){
                throw new ZeroInINNException ("Введён 0 в поле для ИНН!");
            }
            this.set[i][1] = inn;
            i+=1;
        }
        System.out.println();
        this.size = i;
        System.out.println("Количество введённых пользователей = " + i);
    }
    public void print(){
        System.out.println("Данные (Фамилия, ИНН):");
        for (int i =0; i< size; i++){
            System.out.println(set[i][0]+" "+ set[i][1]);
        }
        System.out.println();
    }

    public void find () throws NoNameException, InnException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Для онлайн-заказа введите ваши фамилию и ИНН");
        System.out.print("Ваша фамилия: ");
        String surname = sc.next();
        boolean flag = false;
        int i = 0;
        while(i < size){
            if(set[i][0].equals(surname) == true){
                flag = true;
                System.out.println("Ваша фамилия зарегистрирована в списке!");
                System.out.print("Введите ваш ИНН: ");
                String inn = sc.next();
                if (set[i][1].equals(inn)){
                    System.out.println("Ваш ИНН совпал! Онлайн-заказ выполнен!");
                    break;
                }
                else{
                    throw new InnException("Ваш ИНН не совпал!");
                }
            }
            i++;
        }
        if(flag==false){
            throw new NoNameException("Данный пользователь не зарегистрирован!");
        }
    }
}
