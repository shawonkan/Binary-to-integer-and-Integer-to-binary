package com.company;

import java.util.Scanner;

public class BinarytoInteger {
    public void BinaryTointeger(){


     int scanner= new Scanner(System.in).nextInt();

     int integer= Integer.parseInt(String.valueOf(scanner),2);

     System.out.println(integer);


    }
}
