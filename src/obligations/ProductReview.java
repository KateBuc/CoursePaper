package obligations;

public class ProductReview extends CustomerObligations{
    public ProductReview(){
        this.name = "Product review";
        this.owner = "customer";
        this.type = "non-financial";
        this.percentOfRisk = 3.0;
    }
    public String getObligations(){
        return "Покупець зобов'язаний перевірити товар на наявність ушкоджень при отриманні.";
    }

}
