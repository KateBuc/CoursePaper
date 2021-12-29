package obligations;

public class Obligations {
    protected Double percentOfRisk;
    protected String name;
    protected String owner;
    protected String type;


    public String getObligations(){return "";}
    public Double getPercentOfRisk(){return percentOfRisk;}
    public boolean getType(){
        if (type == "non-financial")
            return false;
        else
            return true;
    }
}
