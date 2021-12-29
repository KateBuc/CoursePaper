package obligations;

public class PaymentForGood extends CustomerObligations{
    private double costOfGood;
    public PaymentForGood(double costOfGood) {
        this.costOfGood = costOfGood;
        this.name = "Payment for good";
        this.owner = "customer";
        this.type = "financial";
        this.percentOfRisk = 10.0;
    }
    public String getObligations(){
        return "Покупець зобов'язаний заплатити фіксовану суму продавцю.";
    }

}
