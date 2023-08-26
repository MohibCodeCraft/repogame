import java.util.Random;
import java.util.Scanner;
public class Exercise_Rock_paper_scissor {
    public static void main(String[] args){
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("------------------------WELCOME TO ROCK PAPER SCISSORS GAME--------------------");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------");
        int userSelect;
        do {
            Scanner sn = new Scanner(System.in);
            System.out.println("Enter Your Name ");
            String name = sn.nextLine();
            System.out.println(" Press 1 For Rock Rock 🛣 ");
            System.out.println(" Press 2 For Paper 📃 ");
            System.out.println(" Press 3 For Scissors ✂ ");
            System.out.println(" Press 0 for Stop Playing");
            userSelect = sn.nextInt();
            String userChoose = " ";
            if (userSelect == 1) {
                userChoose = "Rock";

            } else if (userSelect == 2) {

                userChoose = "Paper";
            } else if (userSgitelect == 3) {
                userChoose = "Scissors";
            }
            String computerChoose = " ";
            Random r = new Random();
            int cmSelect = r.nextInt(1, 4);
            if (cmSelect == 1) {
                computerChoose = "Rock";

            } else if (cmSelect == 2) {

                computerChoose = "Paper";
            } else if (cmSelect == 3) {
                computerChoose = "Scissors";
            }
            System.out.println("-------------------------Here is the Result-------------------------");
            if (computerChoose.equals("Rock") && userChoose.equals("Rock")) {
                System.out.println("Match Draw Both Choose Same ");
                System.out.println("Computer Choose " + computerChoose);
                System.out.println("User Choose " + userChoose);
            } else if (computerChoose.equals("Paper") && userChoose.equals("Paper")) {
                System.out.println("Match Draw Both Choose Same ");
                System.out.println("Computer Choose " + computerChoose);
                System.out.println("User Choose " + userChoose);
            } else if (computerChoose.equals("Scissors") && userChoose.equals("Scissors")) {
                System.out.println("Match Draw Both Choose Same ");
                System.out.println("Computer Choose " + computerChoose);
                System.out.println("User Choose " + userChoose);
            } else {
                if (computerChoose.equals("Rock") && userChoose.equals("Paper")) {
                    System.out.println(name + " Win \nPaper Wrap Rock");
                    System.out.println("Computer Choose " + computerChoose);
                    System.out.println(name + " Choose " + userChoose);
                } else if (computerChoose.equals("Paper") && userChoose.equals("Rock")) {
                    System.out.println("Computer Win \nPaper Wrap Rock");
                    System.out.println("Computer Choose " + computerChoose);
                    System.out.println(name + " Choose " + userChoose);
                } else if (computerChoose.equals("Scissors") && userChoose.equals("Rock")) {
                    System.out.println(name + " Win \nRock Smashed Scissors");
                    System.out.println("Computer Choose " + computerChoose);
                    System.out.println(name + " Choose " + userChoose);
                } else if (computerChoose.equals("Rock") && userChoose.equals("Scissors")) {
                    System.out.println("Computer Win \nRock Smashed Scissors ");
                    System.out.println("Computer Choose " + computerChoose);
                    System.out.println(name + " Choose " + userChoose);
                } else if (computerChoose.equals("Paper") && userChoose.equals("Scissors")) {
                    System.out.println(name + " Win  \nScissors Cut Paper");
                    System.out.println("Computer Choose " + computerChoose);
                    System.out.println(name + " Choose " + userChoose);
                } else if (computerChoose.equals("Scissors") && userChoose.equals("Paper")) {
                    System.out.println("Computer Win  \nScissors Cut Paper");
                    System.out.println("Computer Choose " + computerChoose);
                    System.out.println(name + " Choose " + userChoose);
                }
            }

        }while(userSelect != 0);
    }
}