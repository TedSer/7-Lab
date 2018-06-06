package lviv.iot.ua;

public class HistoricalMovie {
    private int cost;
    private int weight;
    private BrandType brandType;
    private String name;
    private String month;

    public HistoricalMovie(final String name, final String month,
                           final int cost, final int weight, final BrandType brandType) {
        setMonth(month);
        setName(name);
        setBrandType(brandType);
        setCost(cost);
        setWeight(weight);
    }


    public HistoricalMovie() {

    }


    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setMonth(final String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }


    public BrandType getBrandType() {
        return brandType;
    }

    public void setBrandType(final BrandType brandType) {
        this.brandType = brandType;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(final int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }


    public String getHeaders() {
        return "cost,\n" +
                " weight,\n" +
                " brandType,\n" +
                " name,\n" +
                " month";
    }

    private static final String COMMA_DELIMITER = ",";


    public String toCSV() {
        StringBuilder string = new StringBuilder();
        string.append(String.valueOf(this.getCost()));
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getWeight()));
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getBrandType()));
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getName()));
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getMonth()));
        return string.toString();
    }


}

