/*This is the Seat class which stores all the details about any one seat. 
 * These details are stored in the instance variables outlined below.
 * @author Bailee Devey*/
public class Seat {
	private boolean reserved;
	private boolean firstClass;
	private SeatPosition aSeat;
	private SEATTYPE aSeatType;

	public Seat(){
		this.setReserved(false);
		this.setFirstClass(false);
		this.setaSeat(1, 'A');
		this.setaSeatType(SEATTYPE.AISLE);
	}
	
	public Seat(boolean reserved, boolean first, int r, char c, SEATTYPE s){
		this.setReserved(reserved);
		this.setFirstClass(first);
		this.setaSeat(r, c);
		this.setaSeatType(s);
	}
	
	/*Below are the get and set methods for all the instance variables in the class.*/
	public boolean getReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	public boolean getFirstClass() {
		return firstClass;
	}

	public void setFirstClass(boolean firstClass) {
		this.firstClass = firstClass;
	}

	public SeatPosition getaSeat() {
		return aSeat;
	}

	public void setaSeat(int row , char column) {
		this.aSeat = new SeatPosition(row, column);
	}

	public SEATTYPE getaSeatType() {
		return aSeatType;
	}

	public void setaSeatType(SEATTYPE aSeatType) {
		this.aSeatType = aSeatType;
	}
	
	/*Below is a toString method which prints out if a class is reserved or not and if it is first class or not.*/
	public String toString(){
		String theSeat = "";
		
		if (this.getaSeatType() == SEATTYPE.AISLE) {
			if (getFirstClass() == true) {
				if (getReserved() == true) {
					theSeat += " A[X] ";
				} else {
					theSeat += " A[ ] ";
				}
			} else {
				if (getReserved() == true) {
					theSeat += " a[X] ";
				} else {
					theSeat += " a[ ] ";
				}
			}
		} else if (this.getaSeatType() == SEATTYPE.MIDDLE) {
			if (getFirstClass() == true) {
				if (getReserved() == true) {
					theSeat += " M[X] ";
				} else {
					theSeat += " M[ ] ";
				}
			} else {
				if (getReserved() == true) {
					theSeat += " m[X] ";
				} else {
					theSeat += " m[ ] ";
				}
			}

		} else if (this.getaSeatType() == SEATTYPE.WINDOW) {
			if (getFirstClass() == true) {
				if (getReserved() == true) {
					theSeat += " W[X] ";
				} else {
					theSeat += " W[ ] ";
				}
			} else {
				if (getReserved() == true) {
					theSeat += " w[X] ";
				} else {
					theSeat += " w[ ] ";
				}
			}

		}
		return theSeat;
	}
	
	/*Below is a method, seatDescription which prints out a string representation of the of a seat
	 *when the method is called upon to be outputted.
	 *@return description*/
	public String seatDescription(){
		String description;
		if(firstClass = true){
			description = "First class "+getaSeatType()+" is reserved";
		}else{
			description = "Economy class "+getaSeatType()+" is reserved";
		}
		return description;
	}
}
