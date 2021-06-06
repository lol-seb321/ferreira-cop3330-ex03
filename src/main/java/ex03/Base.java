package ex03;

/*
Exercise 3 - Printing Quotes

Quotation marks are often used to denote the start and end of a string. But sometimes we need to print out the quotation marks themselves by using escape characters.
Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output.

Example Output

What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."

Constraints

Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
If your language supports string interpolation or string substitution, don’t use it for this exercise. Use string concatenation instead.
 */

import java.util.Scanner;

public class Base {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Base myBase = new Base();
        String quote = myBase.inputString();
        String author = myBase.inputAuthor(quote);
        myBase.printOutput(quote, author);
    }

    private void printOutput(String quote, String author) {
        System.out.print(author);
        System.out.print(" says, ");
        System.out.print("\"");
        System.out.print(quote);
        System.out.println("\"");
    }

    private String inputAuthor(String quote) {
        System.out.print("Who said it? ");
        String author = input.nextLine();
        return author;
    }

    private String inputString() {
        System.out.print("What is the quote?  ");
        String quote = input.nextLine();
        return quote;
    }

}
