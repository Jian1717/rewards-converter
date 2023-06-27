public class RewardValue {
    private double cashValue;

    private int milesValue;
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    }
    public RewardValue(int milesValue){
        this.milesValue=milesValue;
    }
    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        return milesValue;
    }
    public int convertCashToMiles(){
        return (int)(cashValue/0.0035);
    }
    public double convertMilesToCash(){
        return milesValue*0.0035;
    }
}
