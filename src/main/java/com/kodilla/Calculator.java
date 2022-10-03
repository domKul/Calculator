package com.kodilla;

public class Calculator {

public int plusMethod(int a, int b){
    return a + b;
}
public int minusMethod(int a, int b){
    return a - b;
}

public static void main(String args []){
    Calculator calculator = new Calculator();
    int result = calculator.plusMethod(5, 8);
    System.out.println(result);
}
}
