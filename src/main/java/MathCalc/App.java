/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */
package MathCalc;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println( "What is the first number?" );
        //Input
        String num1  =  myObj.nextLine();
        System.out.println( "What is the second number?" );
        //Input
        String num2  =  myObj.nextLine();
        //Convert to int
        int newNum1 = Integer.parseInt(num1);
        int newNum2 = Integer.parseInt(num2);
        //Does arithmetic
        int add = newNum1 + newNum2;
        int sub = newNum1 - newNum2;
        int multiply = newNum1 * newNum2;
        int divide = newNum1 / newNum2;
        String print = String.format("%s + %s = %d\n%s - %s = %d\n%s * %s = %d\n%s / %s = %d",
                num1,num2,add,num1,num2,sub,num1,num2,multiply,num1,num2,divide);
        //Output
        System.out.println(print);

    }
}
