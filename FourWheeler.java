public class FourWheeler extends Vehicle {
    protected byte seatCapacity;

    public FourWheeler(
        String brandName, 
        String fuelType, 
        byte mileage, 
        String colour, 
        byte seatCapacity,
        String vehicleId 
    )
    {
	this.brandName = brandName;
	this.fuelType = fuelType;
	this.mileage = mileage;
	this.colour = colour;
	this.seatCapacity = seatCapacity;
	this.vehicleId = vehicleId;
    }

    public byte getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(byte noOfStroke) {
	this.seatCapacity = seatCapacity;
    }
    // changed
}
