package com.company;
 import java.util.*;

public class Main {


    public static void main(String[] args) {

            AsciiChars.printNumbers();
            AsciiChars.printLowerCase();
            AsciiChars.printUpperCase();


        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.printf("Hello %s", name);
        System.out.println("\nWould you like to continue to the interactive portion?");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes") || (answer.equalsIgnoreCase("y"))) {
            do {
                int favQBNumber = 0;

                System.out.println("What is the name of your favorite pet?");
                String favPet = scanner.nextLine();

                System.out.println("How old is your favorite pet?");
                int petAge = Integer.parseInt(scanner.nextLine());

                System.out.println("What is your lucky number?");
                int luckyNum = Integer.parseInt(scanner.nextLine());

                System.out.println("Do you have a favorite quarterback? (yes or no)");
                String favQB = scanner.nextLine();

                if (favQB.equalsIgnoreCase("yes") || (favQB.equalsIgnoreCase("y"))) {

                    System.out.println("What is his jersey number?");
                    favQBNumber = Integer.parseInt(scanner.nextLine());
                } else System.out.println("You must be a soccer fan!");

                System.out.println("What is the two-digit model year of your car?");
                int modelYear = Integer.parseInt(scanner.nextLine());

                System.out.println("What is the name of your favorite actor/actress?");
                String favAct = scanner.nextLine();

                System.out.println("Enter a random number between 1 and 50.");

                int randy = Integer.parseInt(scanner.nextLine());
                Random rand = new Random();

                int randomNum = rand.nextInt(65 - 1);

                int magicBall = 0;

                if (favQBNumber == 0) {
                    magicBall = (randomNum * luckyNum);
                    while (magicBall > 75) {
                        magicBall -= 75;
                    }
                } else {
                    magicBall = (favQBNumber * luckyNum);
                    while (magicBall > 75) {
                        magicBall -= 75;
                    }
                }
                int lotNum1 = (modelYear + luckyNum);
                while (lotNum1 > 65) {
                    lotNum1 -= 65;
                }
                int lotNum2 = 42;

                int lotNum3 = (favQBNumber + petAge + luckyNum);
                while (lotNum3 > 65) {
                    lotNum3 -= 65;
                }
                int lotNum4 = favAct.charAt(0);
                while (lotNum4 > 65) {
                    lotNum4 -= 65;
                }
                int lotNum5 = favPet.charAt(2);
                while (lotNum5 > 65) {
                    lotNum5 -= 65;
                }
                System.out.printf("Lottery numbers: %d, %d, %d, %d, %d  Magic ball: %d", lotNum1, lotNum2, lotNum3, lotNum4
                        , lotNum5, magicBall);
                System.out.println("\n Would you like to play again? (y/n)");
                answer = scanner.next();
                if(answer.equals("y")) {
                    answer = "y";
                }else {
                    answer = "n";
                }
            } while(!answer.equals("n"));
        } else {
            System.out.println("Please return later to complete the survey.");
        }
    }
}