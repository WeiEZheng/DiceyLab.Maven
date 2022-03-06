
public class Dice {
    private int numberOfDie;
    public Dice (int numberOfDice){
        this.numberOfDie=numberOfDice;
    }
    public int tossAndSum(){
        int sum=0;
        for (int i=0;i<numberOfDie;i++){
            sum+= Math.floor(Math.random()*6+1);
        }
        return sum;
    }
}
