package spil;

public class Dice {

    private final int MAX = 6; //maksimalt antal øjne

    private int faceValue; //nuværende antal øjne


    public Dice() //Constructor: sætter det begyndende antal øjne
    {
        faceValue = 1;

    }

    public int roll() //kaster terningen og retunerer resultatet
    {
      faceValue = (int)(Math.random() * MAX) + 1;


      return faceValue;

    }

public void setFaceValue (int value) //Mutator
{
    faceValue = value;

}

public int getFaceValue() //Accessor
{
    return faceValue;
}

public  String toString() //retunerer en String repræsentation af terningen
{
    String result = Integer.toString(faceValue);

    return result;
}

} 
