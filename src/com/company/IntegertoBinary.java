package com.company;

import java.util.Scanner;

public class IntegertoBinary {

    public void Integer_to_Binary(){

       Scanner scanner=new Scanner(System.in);
       int inputscaner=scanner.nextInt();

       String binary=Integer.toBinaryString(inputscaner);

       System.out.println(binary);

    }
}
