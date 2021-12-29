package obligations;

public class ProvisionOfGoods  extends SellerObligations{

    public ProvisionOfGoods() {
        this.name = "Provision of goods";
        this.owner = "seller";
        this.type = "non-financial";
        this.percentOfRisk = 5.0;
    }

    public String getObligations(){
        return "Продавець зобов'язаний надати предмет купівлі-продажу покупцю.";
    }

}
