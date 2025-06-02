import java.util.Scanner;

public class Mad_libs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String adjective1;
        String noun;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Enter an adjective(Description):");
        adjective1 = input.nextLine();

        System.out.print("Enter a noun(animal or person):");
        noun = input.nextLine();

        System.out.print("Enter an adjective(Description):");
        adjective2 = input.nextLine();

        System.out.print("Enter a verb end with -ing:");
        verb = input.nextLine();

        System.out.print("Enter an adjective(Description):");
        adjective3 = input.nextLine();


        System.out.println("\nToday i went to a " + adjective1 + " zoo. ");
        System.out.println("In an exibit i saw a " + noun + ".");
        System.out.println(noun + " was " + adjective2 + " and " + verb + "!");
        System.out.println("I was " + adjective3 + "!");


    }
}
