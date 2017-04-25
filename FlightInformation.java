/*This is the FlightInformation class which stores all the information about a flight. 
 * The information is stored in the instance variables outlined below.
 * @author Bailee Devey*/
public class FlightInformation {
	private String startCity;
	private String destCity;
	private String departTime;
	private String flightNum;
	private SeatMap aSeatMap;
	
	public FlightInformation(String start, String dest, String depart, String num, SeatMap map) {
		this.setStartCity(start);
		this.setDestCity(dest);
		this.setDepartTime(depart);
		this.setFlightNum(num);
		this.setaSeatMap(map);
	}

	public FlightInformation() {
		this.setStartCity("UNKNOWN");
		this.setDestCity("UNKNOWN");
		this.setDepartTime("UNKNOWN");
		this.setFlightNum("UNKNOWN");
		this.setaSeatMap(aSeatMap);
	}
	
	/*Below is the get and set methods for all the instance variables in the class.*/
	public SeatMap getaSeatMap() {
		return aSeatMap;
	}
	public void setaSeatMap(SeatMap aSeatMap) {
		this.aSeatMap = aSeatMap;
	}
	public String getStartCity() {
		return startCity;
	}
	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}
	public String getDestCity() {
		return destCity;
	}
	public void setDestCity(String destCity) {
		this.destCity = destCity;
	}
	public String getDepartTime() {
		return departTime;
	}
	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}
	public String getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}
	
	/*Below is a toString method which prints out a string representation of the flight information when the class is called upon to be outputted.*/
	public String toString(){
		return "Start City: "+this.getStartCity()+"\nDestination: "+this.getDestCity()+"\nDeparting at: "+this.getDepartTime()+".\nYour Flight number is: "+this.getFlightNum()+"\n";
				
	}
}
