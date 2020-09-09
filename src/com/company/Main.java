package com.company;

import java.util.Scanner;

public class Main {
   private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Угадай число");

        int lvl;
        System.out.println("Введите уровень");
        lvl = scan.nextInt();
        switch (lvl){
            case 1:
                int range = 10;
                int number = (int) (Math.random() * range);//отрезаем дробную часть (int) в районе 10(range)
                lvl_one(range,number);
                break;
            case 2:
                 range = 20;
                 number = (int) (Math.random() * range);//отрезаем дробную часть (int) в районе 10(range)
                lvl_one(range,number);
                break;
            case 3:
                range = 30;
                number = (int) (Math.random() * range);//отрезаем дробную часть (int) в районе 10(range)
                lvl_one(range,number);
                break;
        }


    }
      private static void lvl_one (int range ,int number) {

            while (true) {

                System.out.println("Угадайте число от 0 до " + range);
                int input_number = scan.nextInt();
                if (input_number == number) {
                    System.out.println("Угадали");
                    break;
                }else if(input_number > number){
                    System.out.println("Меньше");
                }else if(input_number < number){
                    System.out.println("Больше");
                }
        }

    }
}
