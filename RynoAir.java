/*This class, RynoAir, extends airline. It inherits airlines methods and instance
 * variables. 
 * @author Bailee Devey*/

public class RynoAir extends Airline{
	
	/*This is a default constructor which sets the name of the airline to "RynoAir".*/
	public RynoAir() {
		this.setAirlineName("RynoAir");
	}

	/*Below is the method reserveFirstClass. This method is overridden from the parent class - Airline. The method 
	 *creates a new seat and then it calls upon the SeatMap class to query if the seat type and row is available 
	 *for the current flight. If the seat is available then it reserves that seat for the customer. If it isn't
	 *available then it searches the seat map for any free first class seat and reserves it. If there are no first 
	 *class seats left then it searches for an available middle seat in economy and reserves it, along with the seat 
	 *on the left or the right of that seat. 
	 *@param aFlight, aSeat
	 *@return s*/
	@Override
	Seat reserveFirstClass(FlightInformation aFlight, SEATTYPE aSeat) {
		Seat s = new Seat();
		s = aFlight.getaSeatMap().queryAvailableFirstClassSeat(aSeat);
		if(s!=null){
			s.setReserved(true);
			return s;
		} else {
			for(int i = 1; i < aFlight.getaSeatMap().getFirstClassRows(); i++){
				for(int j = 0; j < aFlight.getaSeatMap().getColumn();j++){
					if(aFlight.getaSeatMap().getSeats(i, (char) (j+65)).getReserved() == false){
						aFlight.getaSeatMap().getSeats(i,(char) (j+65)).setReserved(true);
						s = aFlight.getaSeatMap().getSeats(i,(char) (j+65));
						return s;
					}
				}
			}
		}
		
		Seat s2 = new Seat();
		s2 = aFlight.getaSeatMap().queryAvailableEconomySeat(SEATTYPE.MIDDLE);
		if(s2 != null && aFlight.getaSeatMap().getLeft(s2).getReserved() != true 
				&& aFlight.getaSeatMap().getRight(s2).getReserved() != true){
			s2.setReserved(true);
			aFlight.getaSeatMap().getLeft(s2).setReserved(true);
			aFlight.getaSeatMap().getRight(s2).setReserved(true);
			return s2;
		}else {
			return null;
		}
	}
	
	/*Below is the method reserveEconomy. This method is overridden from the parent class - Airline. The method 
	 *creates a new seat and then it calls upon the SeatMap class to query if the seat type and row is available 
	 *for the current flight. If the seat is available then it reserves that seat for the customer. If it isn't
	 *available then it searches the seat map for any free economy seat and reserves it. If there are no economy
	 *seats available then it can't reserve a seat. 
	 *@param aFlight, aSeat
	 *@return s*/
	@Override
	Seat reserveEconomy(FlightInformation aFlight, SEATTYPE aSeat) {
		Seat s = new Seat();
		s = aFlight.getaSeatMap().queryAvailableEconomySeat(aSeat);
		if(s!=null){
			s.setReserved(true);
			return s;
		} else {
			for(int i = aFlight.getaSeatMap().getFirstClassRows(); i < aFlight.getaSeatMap().lastRow(); i++){
				for(int j = 0; j < aFlight.getaSeatMap().getColumn();j++){
					if(aFlight.getaSeatMap().getSeats(i, (char) (j+65)).getReserved() == false){
						aFlight.getaSeatMap().getSeats(i,(char) (j+65)).setReserved(true);
						return aFlight.getaSeatMap().getSeats(i,(char) (j+65));
					}
				}
			}
			return null;
		}
		
	}

}
