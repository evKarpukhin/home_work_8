package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {


    public static boolean isYearHigh(int year){
        return ( year % 4==0 && year % 100 !=0 || year % 400==0 );
    }
    public static void printYearHigh (int year){
        System.out.println(( isYearHigh(year) ) ? year + " - високосный год": year + " - не високосный год");
        }

    public static void printPath(byte osType, int productYear){
        String os = "";
        switch (osType) {
            case 0: os = "iOS";
                break;
            case 1: os = "Android";
                break;
            default:
                System.out.println("Тип ОС не поддерживается!");
                return;
        }
        String osVersion = (productYear < LocalDate.now().getYear() ) ? "облегченную" : "обычную";
        System.out.println("Установите " + osVersion + " версию" + " для " + os);
    }

    public static int printDayDelivery (int deliveryDistance){
        int deliveryDays = 0;

        if ( deliveryDistance <= 20 ) {
            deliveryDays++;
        } else
        if ( deliveryDistance > 20 && deliveryDistance <= 60 ) {
            deliveryDays=+2;
        } else
        if ( deliveryDistance > 60 && deliveryDistance <= 100 ) {
            deliveryDays=+3;
        }  else  {
            deliveryDays=+4;
        }

        return deliveryDays;
    }


    private static void checkDuobleCharInString(String str){
        char[] chArray = str.toCharArray();
        for (int i = 0; i <= chArray.length - 2; i++) {
            if (chArray[i] == chArray[i+1] ){
                System.out.println("ЗаДублирование символа "  +"\""+ chArray[i]  +"\""+ " с индексом " + (i + 1) );
                return;
            }
        }
        System.out.println("ЗаДублирований нет!");
    }

    private static void invertArray (int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            // invert numbers
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
// Task 1
        int year = 2022;
        System.out.println("Task 1");
        printYearHigh(year);
// Task 2
        System.out.println("Task 2");
        byte osType = 1;
        int productYear = 2021;
        printPath(osType, productYear);
// Task 3
        System.out.println("Task 3");
        int  deliveryDistance= 95;
        System.out.println("Для дистанции "+ deliveryDistance +", потребуется " + printDayDelivery(deliveryDistance) + " дня.");
// Task 4
        System.out.println("Task 4");
        String str = "aabccddefgghiijjkk";
        checkDuobleCharInString(str);

// Task 5
        System.out.println("Task 5");
        int[] arr = {3, 2, 1, 6, 5};
        invertArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
