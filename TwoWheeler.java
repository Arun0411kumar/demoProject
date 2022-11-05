public class TwoWheeler extends Vehicle {
    protected byte noOfStroke;
    protected String twoWheelerType;

    public TwoWheeler(
        String brandName, 
        String fuelType, 
        byte mileage, 
        String colour, 
        byte noOfStroke, 
        String twoWheelerType,
        String vehicleId
    )
    {
	this.brandName = brandName;
	this.fuelType = fuelType;
	this.mileage = mileage;  
	this.colour = colour;
	this.noOfStroke = noOfStroke;
	this.twoWheelerType = twoWheelerType; 
        this.vehicleId = vehicleId;   
    }

    public byte getNoOfStroke() {
        return noOfStroke;
    }

    public void setNoOfStroke(byte noOfStroke) {
	this.noOfStroke = noOfStroke;
    }

    public String getTwoWheelerType() {
        return twoWheelerType;
    }

    public void setTwoWheelerType(String twoWheelerType) {
	this.twoWheelerType = twoWheelerType;
    }
    // changed 2	ok
	
}
