package derivative;

import java.util.HashMap;
import java.util.Map;
import obligations.*;


public class Derivative {
    private static double cost;
    private static Map<Integer, Obligations> obligations;
    private static String custName;
    private String sellerName;
    private String itemName;

    public Derivative(String custName, String sellerName, String itemName, double cost) {
        this.custName = custName;
        this.sellerName = sellerName;
        this.itemName = itemName;
        this.cost = cost;


        obligations = new HashMap<>();
        //Customer obligations
        obligations.put(10,new PaymentForGood(cost));
        obligations.put(3,new ProductReview());
        //Seller obligations
        obligations.put(13,new DeliveryOfGoods());
        obligations.put(5,new ProvisionOfGoods());
        //Common obligations
        obligations.put(2,new DeliveryCosts(custName,cost/10));
        obligations.put(4,new HavingLicense());

    }

    public static double getCost() {
        return cost;
    }

    public static String getCustName() {
        return custName;
    }



    public static Map<Integer,Obligations> getDerMap(){return obligations;}

}


