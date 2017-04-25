/*The AirBusSeatMap is the seat map for a AirBus airplane. The AirBus seat map is different from the Boeing seat map. This class extends
 * the SeatMap class inheriting all its methods and instance variables. 
 * @author Bailee Devey*/
public class AirBusSeatMap extends SeatMap{
	
	/*The AirBus seat map is set up below. This seat map has a set number of rows and columns of 12 and 9 respectively. */
	public AirBusSeatMap(){
		this.setRow(12);
		this.setColumn(9);
		this.setFirstClassRows(6);
		this.setSeats(12, 9);
		this.intialiseSeatMap();
	}
	
	/*The intialise seat map method is overridden in this class from the class that it extends (SeatMap). This is because the Seat Map
	 * is different on a AirBus compared to a Boeing airplane. The intialise seat map method initializes the seat map to the correct 
	 * rows and columns.  This method searches a 2D array to find certain columns which equate to a certain Seat Type.*/
	@Override
	public void intialiseSeatMap() {
		for(int i = 0; i<this.getRow(); i++){
			for(int j = 0; j<this.getColumn();j++){
				this.seats[i][j] = new Seat();
				if(j == this.getColumn() - 1 || j==0){
					this.seats[i][j].setaSeatType(SEATTYPE.WINDOW);
					this.seats[i][j].setReserved(false);
					this.seats[i][j].setaSeat(i+1, (char)(j+65));
					if(i >= this.getFirstClassRows()){
						this.seats[i][j].setFirstClass(false);
					}else{
						this.seats[i][j].setFirstClass(true);
					}
				}else if(j== this.getColumn() / 2||j==1||j==this.getColumn()-2){
					this.seats[i][j].setaSeatType(SEATTYPE.MIDDLE);
					this.seats[i][j].setReserved(false);
					this.seats[i][j].setaSeat(i+1, (char)(j+65));
					if(i >= this.getFirstClassRows()){
						this.seats[i][j].setFirstClass(false);
					}else{
						this.seats[i][j].setFirstClass(true);
					}
				}else{
					this.seats[i][j].setaSeatType(SEATTYPE.AISLE);
					this.seats[i][j].setReserved(false);
					this.seats[i][j].setaSeat(i+1, (char)(j+65));
					if(i >= this.getFirstClassRows()){
						this.seats[i][j].setFirstClass(false);
					}else{
						this.seats[i][j].setFirstClass(true);
					}
				}
			}
		}
		
	}
	
}
