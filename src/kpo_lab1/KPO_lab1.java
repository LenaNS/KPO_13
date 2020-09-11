package kpo_lab1;

import java.util.Scanner;

public class KPO_lab1 {

    static String password = "KPO_lab1";

    public static void main(String[] args) {
        String inputStr = inputPassword();
        passwordCheck(inputStr);
    }
//Ввод строки 
    public static String inputPassword() {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        return str;
    }
//Проверка на совподение введённой строки со строкой-образцом
    public static void passwordCheck(String str) {
        if (str.equals(password)) {
            System.out.println("Пароль введён верно");
        } else {
            System.out.println("Пароль введён неверно");
        }
    }
}
