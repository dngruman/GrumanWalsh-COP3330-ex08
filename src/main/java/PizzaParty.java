/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Deirdre Gruman-Walsh
 */

import java.util.Scanner;
public class PizzaParty {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        int people, pizza, slices, total, PerPerson, remainder;


        System.out.print("How many people?");
        people = user_input.nextInt();
        System.out.print("How many pizzas do you have?");
        pizza= user_input.nextInt();
        System.out.print("How many slices per pizza?");
        slices=user_input.nextInt();

        total= pizza*slices;
        PerPerson = total/people;
        remainder= total%people;


        System.out.println(""+people+" people with "+pizza+" pizzas ("+total+" slices)");
        System.out.println("Each person gets "+PerPerson+" pieces of pizza");
        System.out.println("There are "+remainder+" leftover pieces");
    }
}
