import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("Please enter your age here:");
        age = scan.nextInt();
        System.out.println("Please enter your first name here:");
        firstName = scan.next();
        System.out.println("Please enter your favourite food here:");
        favouriteFood = scan.next();
        System.out.println("First name: " + firstName + "\nAge: " + age + "\nFavourite food: " + favouriteFood);




    }

}