package com.example.lib;

import java.util.Scanner;


public class MyClass {

    public static void main ( String[] args ) {

            int year, month, day;
            Scanner scanner = new Scanner(System.in);
            System.out.println("請輸入出生年月日(以空白鍵分開)：");
            year = scanner.nextInt();
            month = scanner.nextInt();
            day = scanner.nextInt();

            System.out.println(year+"/"+month+"/"+day);

        }



}
