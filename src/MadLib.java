import java.util.Scanner;

public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        String Noun;
        String NounPlural;
        String Noun2;
        String Place;
        String Adjective;
        String Noun3;

        System.out.print("Enter a Noun.");
        Noun = read.nextLine();
        System.out.print("Enter a NounPlural");
        NounPlural = read.nextLine();
        System.out.print("Enter a different Noun");
        Noun2 = read.nextLine();
        System.out.print("Enter a PLace");
        Place = read.nextLine();
        System.out.print("Enter a Adjective");
        Adjective = read.nextLine();
        System.out.print("Enter a third Noun");
        Noun3 = read.nextLine();

        System.out.println("Be Glad For Your"+ Noun +" ,and"+NounPlural);
        System.out.println("Because Their Always Be There For Your"+ Noun2);
        System.out.println("Their always found at"+ Place +" With"+ Adjective +" Looks");
        System.out.println("Your"+ Noun +","+ Noun2 + ",and"+ Noun3 + " Will be there to help you.");
    }

}