package lviv.iot.ua;

public class Microphone extends HistoricalMovie {
    private String sensivity;
    private int distanceOfAction;
    public Microphone(String sensivity, int distanceOfAction,final String name, final String month,
                      final int cost, final int weight, final BrandType brandType){
        super(name,  month,  cost,  weight, brandType);
        this.distanceOfAction = distanceOfAction;
        this.sensivity = sensivity;

    }

    public int getDistanceOfAction() {
        return distanceOfAction;
    }

    public void setDistanceOfAction(int distanceOfAction) {
        this.distanceOfAction = distanceOfAction;
    }

    public String getSensivity() {
        return sensivity;
    }

    public void setSensivity(String sensivity) {
        this.sensivity = sensivity;
    }


    public int getCost() {
        return super.getCost();
    }


    public void setCost(int cost) {
        super.setCost(cost);
    }

    @Override
    public String toString() {
        return "Staff = " + " Microphone" + ", Brand = " + getBrandType() + ", Sensivity = " + getSensivity() + ", DistanceOgAction = " +
                getDistanceOfAction() + ", Cost = " + getCost() + ", Weight = " + getWeight() ;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "sensivity, distanceOfAction";
    }

    private static final String COMMA_DELIMITER = ",";


    @Override
    public String toCSV() {
        StringBuilder string = new StringBuilder();
        string.append(super.toCSV());
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getSensivity()));
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getDistanceOfAction()));
        return string.toString();
    }
}
