package oop.example;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner getNoun = new Scanner(System.in);
        Scanner getVerb = new Scanner(System.in);
        Scanner getAdjective = new Scanner(System.in);
        Scanner getAdverb = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = getNoun.nextLine();

        System.out.print("Enter a verb: ");
        String verb = getVerb.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = getAdjective.nextLine();

        System.out.print("Enter and adverb: ");
        String adverb = getAdverb.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);

    }
}

