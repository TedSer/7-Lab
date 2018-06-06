package lviv.iot.ua;

public class Lamp extends HistoricalMovie {
    private String lamps;
    private int height;

    public Lamp(final String lamps, final int height,
                final String name, final String month,
                final int cost, final int weight, final BrandType brandType) {
        super(name,  month,  cost,  weight, brandType );
        this.lamps = lamps;
        this.height = height;
    }

    @Override
    public int getCost() {
        return super.getCost();
    }

    @Override
    public void setCost(final int cost) {
        super.setCost(cost);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(final int weight) {
        super.setWeight(weight);
    }

    public String getLamps() {
        return lamps;
    }

    public void setLamps(final String lamps) {
        this.lamps = lamps;
    }

    @Override
    public String toString() {
        return "Staff = " + " Lamp" + ", Brand = " + getBrandType()
                + ", Lamps = " + getLamps() + ", Height of stage = "
                + getHeight() + ", Cost = " + getCost() + ", Weight = " + getWeight();
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "lamps, height";
    }

    private static final String COMMA_DELIMITER = ",";


    @Override
    public String toCSV() {
        StringBuilder string = new StringBuilder();
        string.append(super.toCSV());
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getLamps()));
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getHeight()));
        return string.toString();
    }

}
