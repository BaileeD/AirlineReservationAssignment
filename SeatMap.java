/*This is the SeatMap class which outlines a standard seat map. This seat
 * map is extended by two class; BoeingSeatMap and AirBusSeatMap. These two
 * classes override some methods to set the Seat Map to the appropriate size 
 * for the different planes. The information for this seat map is stored in 
 * the instance variables outlined below.
 * @author Bailee Devey*/
public abstract class SeatMap {
	
	/*Below is a abstract method to intialise a seat map. This method is overridden in the 
	 * two class which extend this class; BoeingSeatMap and AirBusSeatMap.*/
	abstract void intialiseSeatMap();
	
	protected Seat[][] seats;
	private int row;
	private int column;
	private int firstClassRows;
	
	public SeatMap(int r, int c, int row, int column, int firstClassRow) {
		this.setSeats(r, c);
		this.setRow(row);
		this.setColumn(column);
		this.setFirstClassRows(firstClassRow);
	}

	public SeatMap() {
		this.setSeats(0, 0);
		this.setRow(0);
		this.setColumn(0);
		this.setFirstClassRows(0);
	}
	
	/*Below is the get and set methods for all the instance variables in the class.*/
	protected Seat getSeats(int aRow, char aColumn) {
		int col ;
		aRow--;
		col = (int) aColumn-65;
		return seats[aRow][col];
	}
	
	public Seat[][] getSeats() {
		return seats;
	}

	protected void setSeats(int row, int column ) {
		this.seats = new Seat[row][column];
	}
	
	public int getRow() {
		return row;
	}

	protected void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	protected void setColumn(int column) {
		this.column = column;
	}

	public int getFirstClassRows() {
		return firstClassRows;
	}

	protected void setFirstClassRows(int firstClassRows) {
		this.firstClassRows = firstClassRows;
	}
	
	/*This method returns the seat to the left of any seat but only if it is not reserved. If it is reserved
	 * then it will return null
	 * @param aSeat
	 * @return seat[][] or null*/
	public Seat getLeft(Seat aSeat){
		int column = aSeat.getaSeat().getColumn()-66;
		int row = aSeat.getaSeat().getRow()-1;
		if(column < 0)
			return null;
		else
			return seats[row][column];
	}
	
	/*This method returns the seat to the right of any seat but only if it is not reserved. If it is reserved
	 * then it will return null
	 * @param aSeat
	 * @return seat[][] or null*/
	public Seat getRight(Seat aSeat){
		int column = aSeat.getaSeat().getColumn()-64;
		int row = aSeat.getaSeat().getRow()-1;
		if(column > this.getColumn() - 1)
			return null;
		else
			return seats[row][column];
	}
	
	/*This method below queries if a seat is available in economy class. If it is then it will return seat, 
	 * otherwise it will return null.
	 * @param aSeat
	 * @return seats[][] or null*/
	public Seat queryAvailableEconomySeat(SEATTYPE aSeat){
		for(int i = this.getFirstClassRows(); i < seats.length; i++){
			for(int j = 0; j < seats[i].length; j++){
				if(seats[i][j].getReserved() == false && seats[i][j].getaSeatType() == aSeat){
					return seats[i][j];
				}
			}
		}
		return null;
	}
	
	/*This method below queries if a seat is available in f class. If it is then it will return seat, 
	 * otherwise it will return null.
	 * @param aSeat
	 * @return seats[][] or null*/
	public Seat queryAvailableFirstClassSeat(SEATTYPE aSeat){
		for(int i = 0; i < this.getFirstClassRows(); i++){
			for(int j = 0; j < seats[i].length; j++){
				if(seats[i][j].getReserved() == false && seats[i][j].getaSeatType()==aSeat){
					return seats[i][j];
				}
			}
		}
		return null;
		
	}
	
	/*This method will return the last row in the seat map and the method below it will
	 * return the last column in the seat map.
	 * @return row*/
	public int lastRow(){
		return this.getRow();
	}
	public char lastColumn(){
		return (char) (this.getColumn() + 64);
	}
	
	/*Below is a toString method which prints out a string representation of a seat map when the class is called upon to be outputted.*/
	public String toString(){
		String str = "";
		for (int a = 0; a < this.getColumn(); a++) {
			str += "     " + (char) (65 + a);
		}
		str += "\n";
		for (int i = 0; i < this.getRow(); i++) {
			if ((i + 1) < 10) {
				str += " " + (i + 1);
			} else {
				str += (i + 1);
			}
			for (int j = 0; j < this.getColumn(); j++) {

				str += seats[i][j];
			}
			str += "\n";
		}
		return str;
	}
}
