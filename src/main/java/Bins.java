
public class Bins {
    private int[] bin;
    private int minBin, maxBin;
    public Bins(int min, int max){
        minBin=min;
        maxBin=max;
        bin=new int[max-min];
    }
    public void incrementBin(int number){
        bin[number-minBin]++;
    }
    public int getBin(int number){
        return bin[number-minBin];
    }
}
