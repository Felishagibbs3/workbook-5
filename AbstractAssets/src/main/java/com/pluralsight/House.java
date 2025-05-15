package com.pluralsight;

public class House extends Asset{
    // child class of parent Asset

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;
    // 'super' constructor to initialize the properties of parent class, adding address, condition, squarefoot, and lot size
    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    //providing specific implementation (getValue) on parent class's Asset and Vehicle/House subclass
    public double getValue() {
        double pricePerSquareFoot = switch (condition) {
            case 1 -> 180.0;
            case 2 -> 130.0;
            case 3 -> 90.0;
            case 4 -> 80.0;
            default -> 0;
        };
        // using the price per square foot to determine value by multiplying PPSQFT by SQFT property and adding 25 cents per SQFT of lot size property
        return (pricePerSquareFoot * squareFoot) + (0.25 * lotSize);
    }
}
