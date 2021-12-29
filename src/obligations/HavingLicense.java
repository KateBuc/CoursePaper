package obligations;

public class HavingLicense extends CommonObligations{
    public HavingLicense() {
        this.name = "Having a license";
        this.owner = "common";
        this.type = "non-financial";
        this.percentOfRisk = 4.0;
    }
    public String getObligations(){
        return "Покупець та продавець зобов'язані мати дійсну ліцензію на володіння предметом продажу-купівлі.";
    }
   }
