/*This is the SeatPosition class which stores all the a position of a seat. 
 * The position of a seat is stored in the instance variables outlined below.
 * @author Bailee Devey*/
public class SeatPosition {
	private int row;
	private char column;
	
	/*This is a constructor for the SeatPosition class. 
	 * @param row, column*/
	public SeatPosition(int row, char column){
		this.setRow(row);
		this.setColumn(column);
	}
	
	public SeatPosition(){
		this.setRow(1);
		this.setColumn('A');
	}
	
	/*Below is the get and set methods for all the instance variables in the class.*/
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}
	
	public String toString(){
		return "" + this.getRow() + this.getColumn() + "";
	}
}
