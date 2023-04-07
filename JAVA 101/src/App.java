import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter name");
        String Name ;
        Name = input.nextLine();
        System.out.println("HEllo :"+ Name +"!");
         

        System.out.println("please Surname name");
        String Surname ;
        Surname = input.nextLine();
        System.out.println("Your Surname :"+ Surname +"!");

        System.out.println("please enter current year");
        double current_year = input.nextDouble();

        System.out.println("please enter birth year");
        double birth_year = input.nextDouble();


        double age = current_year - birth_year ;

        System.out.println("Your Age , Name & Surname IS :"+ age + Name + Surname );
    }
}
