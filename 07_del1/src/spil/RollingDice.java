package spil;

public class RollingDice {

    //laver to terning objekter og kaster dem
    public static void main (String[] args){

        Dice die1, die2;
     int sum;

     die1 = new Dice();
     die2 = new Dice();

        die1.roll();
        die2.roll();

        System.out.println("Første terning: " + die1 + ", Anden terning: " + die2);

        sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Sum: " + sum);

    }
}
