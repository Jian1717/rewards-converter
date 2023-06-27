public class RewardValue {
    private double cashValue;
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    }
    public RewardValue(int milesValue){
        this.cashValue=milesValue*0.0035;
    }
    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        return cashValue/0.0035;
    }
    public int convertCashToMiles(){
        return (int)(cashValue/0.0035);
    }
}
