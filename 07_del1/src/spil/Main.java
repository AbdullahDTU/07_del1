package spil;

public class Main {
    int randomNumber;

    public static void main(String[] args) {









    }
}


//import java.util.Scanner;
public class Lab5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int playerOneScore = 0;
        int playerTwoScore = 0;

        //variables
        int dice1;
        int dice2;


        //Call the welcome method
        welcome();

        //fetch random numbers


    }
    public static void welcome() {
        System.out.println("velkommen til terning spil");{
        }
        while (true) {
            int dice1=(int)(Math.random()*6+1);
            int dice2=(int)(Math.random()*6+1);
            int sum = dice1 + dice2;

            System.out.println("Roll: total = " + sum);

            if (sum==2 || sum==3 || sum==12) {
                System.out.println("Sorry with a " + sum + " You LOSE :(");
                break;
            } else if(sum==7 || sum==11) {
                System.out.println("Woah!!! With a " + sum + " You WIN!!!!!!!");
                break;
            }

            // If you wanted, you could wait here for the user to confirm (e.g. with a key press)
        }

            }
        }
    }}