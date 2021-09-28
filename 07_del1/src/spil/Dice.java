package spil;

public class Dice {

    private final int MAX = 6; //maksimalt antal øjne

    private int faceValue; //nuværende antal øjne
    private int faceValue2;

    public Dice() //Constructor: sætter det begyndende antal øjne
    {
        faceValue = 1;
        faceValue2 = 1;
    }

    public int roll() //kaster terningen og retunerer resultatet
    {
      faceValue = (int)(Math.random() * MAX) + 1;
        faceValue2 = (int)(Math.random() * MAX) + 1;

      return faceValue + faceValue2;

    }

public void setFaceValue (int value) //Mutator
{
    faceValue = value;
    faceValue2 = value;
}

public int getFaceValue() //Accessor
{
    return faceValue + faceValue2;
}

public  String toString() //retunerer en String repræsentation af terningen
{
    String result = Integer.toString(faceValue + faceValue2);

    return result;
}

} 
