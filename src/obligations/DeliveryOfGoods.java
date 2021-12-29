package obligations;

public class DeliveryOfGoods extends SellerObligations{
    public DeliveryOfGoods(){
        this.name = "Delivery of goods";
        this.owner = "seller";
        this.type = "non-financial";
        this.percentOfRisk = 13.0;

    }
    public String getObligations(){return "Продавець зобов'язаний забезпечити доставку.";}

}
