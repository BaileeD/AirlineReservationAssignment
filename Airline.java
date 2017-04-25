/*This is the airline class. This class is an abstract class which has two classes
 * extending from it; RynoAir and SimpleJet.  
 * @author Bailee Devey*/
public abstract class Airline {
	/*These are abstract methods which get implemented differently by the two concrete
	 * classes which extend it.
	 * @param aFlight, aSeat*/
	abstract Seat reserveFirstClass(FlightInformation aFlight, SEATTYPE aSeat);
	abstract Seat reserveEconomy(FlightInformation aFlight, SEATTYPE aSeat);
	
	private String airlineName;
	
	public Airline() {
		this.setAirlineName("UNKNOWN");
	}
	
	public Airline(String name){
		this.setAirlineName(name);
	}
	
	/*The get and set methods for the airline name are outlined below.*/
	public String getAirlineName() {
		return airlineName;
	}
	
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	
	public String toString(){
		return "This is " + this.getAirlineName();
	}

	

}