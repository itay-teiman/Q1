package org.example;

import java.util.Scanner;

// קלט: מספר שלם
// פלט: האם המספר זוגי או לא
public class Main {
    public static void main(String[] args) {
        int num;
        System.out.println("type a number");
        Scanner myObj=new Scanner( System.in);

        num= myObj.nextInt();

        if(num%2==0){
            System.out.println("zoge");
        }else
        {
            System.out.println("not zoge");
        }
    }
}