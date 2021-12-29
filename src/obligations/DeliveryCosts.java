package obligations;


public class DeliveryCosts extends CommonObligations{
    private String  payer;
    private double cost;
    public DeliveryCosts(String  payer, double cost) {
        this.name = "DeliveryCosts";
        this.owner = "common";
        this.type = "non-financial";
        this.percentOfRisk = 2.0;
        this.payer = payer;
        this.cost = cost;
    }

    public String getObligations(){
        return payer +" зобов'язаний покрити вартість перевезення.";
    }

}
