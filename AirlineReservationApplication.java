
/*The AirlineReservationApplication is the application to reserve a seat on any flight. This class is the main
 * class to which all other classes interact with in order to produce the correct output. .
 * @author Bailee Devey*/
import java.util.Scanner;

public class AirlineReservationApplication {
	static Scanner keyboard = new Scanner(System.in);
	public FlightInformation[] flight;


	public void bookFlight(FlightInformation[] flight){
		boolean book = true;
		while (book){
			System.out.println("Please choose the flight you want to book.\n");
			for (int i = 0; i < flight.length; i++){
				if (flight[i] != null){
					System.out.println((i+1) + ". "+flight[i]);
				} else {
					System.out.println("Airline not available yet.");
				}
			}
			int bookingOption = keyboard.nextInt();
			System.out.println("Your chosen flight is number: "+flight[bookingOption-1].getFlightNum() );
			System.out.println("The current seating map is: ");
			System.out.println(flight[bookingOption - 1].getaSeatMap());
			System.out.println("Please choose the airplane company you want to travel with:\n1.SimpleJet\n2.RynoAir");
			int company = keyboard.nextInt();
			System.out.println("Please choose the class you want to book:\n1.First Class\n2.Economy Class");
			int classOption = keyboard.nextInt();
			System.out.println("Please choose what type of seat you want:\n1.Aisle\n2.Middle\n3.Window");
			int seatOption = keyboard.nextInt();

			Seat s = new Seat();
			if (company == 1) {
				Airline air1 = new SimpleJet();
				if (classOption == 1) {
					if (seatOption == 1) {
						s = air1.reserveFirstClass(flight[bookingOption - 1], SEATTYPE.AISLE);
						if (s != null) {
							System.out.println("The SimpleJet flight you booked is:  "
									+ flight[bookingOption - 1].getFlightNum() + " and the seat you booked is: "
									+ SEATTYPE.AISLE);
							System.out.println(s.seatDescription());
							System.out.println(flight[bookingOption - 1].getaSeatMap());
							book = bookAgain(book);
						} else {
							System.out.println("There is no seat available. ");
							book = bookAgain(book);
						}
					} else if (seatOption == 2) {
						s = air1.reserveFirstClass(flight[bookingOption - 1], SEATTYPE.MIDDLE);
						if (s != null) {
							System.out.println("The SimpleJet flight you booked is: "
									+ flight[bookingOption - 1].getFlightNum() + " and the seat you booked is: "
									+ SEATTYPE.MIDDLE);
							System.out.println(s.seatDescription());
							System.out.println(flight[bookingOption - 1].getaSeatMap());
							book = bookAgain(book);
						} else {
							System.out.println("There is no seat available. Please book again");
							book = bookAgain(book);
						}
					} else if (seatOption == 3) {
						s = air1.reserveFirstClass(flight[bookingOption - 1], SEATTYPE.WINDOW);
						if (s != null) {
							System.out.println("The SimpleJet flight you booked is: "
									+ flight[bookingOption - 1].getFlightNum() + " and the seat you booked is: "
									+ SEATTYPE.WINDOW);
							System.out.println(s.seatDescription());
							System.out.println(flight[bookingOption - 1].getaSeatMap());
							book = bookAgain(book);
						} else {
							System.out.println("There is no seat available. Please book again");
							book = bookAgain(book);
						}
					}

				} else if (classOption == 2) {
					if (seatOption == 1) {
						s = air1.reserveEconomy(flight[bookingOption - 1], SEATTYPE.AISLE);
						if (s != null) {
							System.out.println("The SimpleJet flight you booked is: "
									+ flight[bookingOption - 1].getFlightNum() + " and the seat you booked is: "
									+ SEATTYPE.AISLE);
							System.out.println(s.seatDescription());
							System.out.println(flight[bookingOption - 1].getaSeatMap());
							book = bookAgain(book);
						} else {
							System.out.println("There is no seat available. Please book again");
							book = bookAgain(book);
						}
					} else if (seatOption == 2) {
						s = air1.reserveEconomy(flight[bookingOption - 1], SEATTYPE.MIDDLE);
						if (s != null) {
							System.out.println("The SimpleJet flight you booked is: "
									+ flight[bookingOption - 1].getFlightNum() + " and the seat you booked is: "
									+ SEATTYPE.MIDDLE);
							System.out.println(s.seatDescription());
							System.out.println(flight[bookingOption - 1].getaSeatMap());
							book = bookAgain(book);
						} else {
							System.out.println("There is no seat available. Please book again");
							book = bookAgain(book);
						}
					} else if (seatOption == 3) {
						s = air1.reserveEconomy(flight[bookingOption - 1], SEATTYPE.WINDOW);
						if (s != null) {
							System.out.println("The SimpleJet flight you booked is: "
									+ flight[bookingOption - 1].getFlightNum() + " and the seat you booked is: "
									+ SEATTYPE.WINDOW);
							System.out.println(s.seatDescription());
							System.out.println(flight[bookingOption - 1].getaSeatMap());
							book = bookAgain(book);
						} else {
							System.out.println("There is no seat available. Please book again");
							book = bookAgain(book);
						}
					}
				}
			} else if (company == 2) {
				Airline air2 = new RynoAir();
				if (classOption == 1) {
					if (seatOption == 1) {
						s = air2.reserveFirstClass(flight[bookingOption - 1], SEATTYPE.AISLE);
						if (s != null) {
							System.out.println("The RynoAir flight you booked is: "
									+ flight[bookingOption - 1].getFlightNum() + " and the seat you booked is: "
									+ SEATTYPE.AISLE);
							System.out.println(s.seatDescription());
							System.out.println(flight[bookingOption - 1].getaSeatMap());
							book = bookAgain(book);
						} else {
							System.out.println("There is no seat available. Please book again");
							book = bookAgain(book);
						}
					} else if (seatOption == 2) {
						s = air2.reserveFirstClass(flight[bookingOption - 1], SEATTYPE.MIDDLE);
						if (s != null) {
							System.out.println("The RynoAir flight you booked is: "
									+ flight[bookingOption - 1].getFlightNum() + " and the seat you booked is: "
									+ SEATTYPE.MIDDLE);
							System.out.println(s.seatDescription());
							System.out.println(flight[bookingOption - 1].getaSeatMap());
							book = bookAgain(book);
						} else {
							System.out.println("There is no seat available. Please book again");
							book = bookAgain(book);
						}
					} else if (seatOption == 3) {
						s = air2.reserveFirstClass(flight[bookingOption - 1], SEATTYPE.WINDOW);
						if (s != null) {
							System.out.println("The RynoAir flight you booked is: "
									+ flight[bookingOption - 1].getFlightNum() + " and the seat you booked is: "
									+ SEATTYPE.WINDOW);
							System.out.println(s.seatDescription());
							System.out.println(flight[bookingOption - 1].getaSeatMap());
							book = bookAgain(book);
						} else {
							System.out.println("There is no seat available. Please book again");
							book = bookAgain(book);
						}
					}

				} else if (classOption == 2) {
					if (seatOption == 1) {
						s = air2.reserveEconomy(flight[bookingOption - 1], SEATTYPE.AISLE);
						if (s != null) {
							System.out.println("The RynoAir flight you booked is: "
									+ flight[bookingOption - 1].getFlightNum() + " and the seat you booked is: "
									+ SEATTYPE.AISLE);
							System.out.println(s.seatDescription());
							System.out.println(flight[bookingOption - 1].getaSeatMap());
							book = bookAgain(book);
						} else {
							System.out.println("There is no seat available. Please book again");
							book = bookAgain(book);
						}
					} else if (seatOption == 2) {
						s = air2.reserveEconomy(flight[bookingOption - 1], SEATTYPE.MIDDLE);
						if (s != null) {
							System.out.println("The RynoAir flight you booked is: "
									+ flight[bookingOption - 1].getFlightNum() + " and the seat you booked is: "
									+ SEATTYPE.MIDDLE);
							System.out.println(s.seatDescription());
							System.out.println(flight[bookingOption - 1].getaSeatMap());
							book = bookAgain(book);
						} else {
							System.out.println("There is no seat available. Please book again");
							book = bookAgain(book);
						}
					} else if (seatOption == 3) {
						s = air2.reserveEconomy(flight[bookingOption - 1], SEATTYPE.WINDOW);
						if (s != null) {
							System.out.println("The RynoAir flight you booked is: "
									+ flight[bookingOption - 1].getFlightNum() + " and the seat you booked is: "
									+ SEATTYPE.WINDOW);
							System.out.println(s.seatDescription());
							System.out.println(flight[bookingOption - 1].getaSeatMap());
							book = bookAgain(book);
						} else {
							System.out.println("There is no seat available. Please book again");
							book = bookAgain(book);
						}
					}
				}
			}
		}
	}

	public boolean bookAgain(boolean book) {
		keyboard.nextLine();
		System.out.println("Do you want to book another ticket?(yes/no)");
		String bookagain = keyboard.nextLine();
		if (bookagain.equalsIgnoreCase("yes"))
			return true;
		else
			return false;
	}

	public FlightInformation[] numOfFlights(){
		System.out.println("How many different flights do you want to input?");
		int num = keyboard.nextInt();
		this.flight = new FlightInformation[num];
		return flight;
	}

	public FlightInformation[] flightInput(FlightInformation[] flight) {
		boolean repeat = true;
		int i = 0;
		int j = flight.length;
		keyboard.nextLine();
		while (repeat) {
			System.out.println("Please input the flight details: ");

			System.out.println("Where are you flying from? ");
			String startCity = keyboard.nextLine();

			System.out.println("Where are you flying to? ");
			String destCity = keyboard.nextLine();

			System.out.println("What is your depature time? ");
			String departTime = keyboard.nextLine();

			System.out.println("What is your flight number? ");
			String flightNum = keyboard.nextLine();
			boolean repeat2 = true;
			while (repeat2) {
				System.out.println("Please choose what kind of airplane you are flying on: \n 1.Boeing\n 2.AirBus");
				int airplane = keyboard.nextInt();
				if (airplane == 1) {
					flight[i] = setBoeingFlight(startCity, destCity, departTime, flightNum);
					repeat2 = false;
				} else if (airplane == 2) {
					flight[i] = setAirBus(startCity, destCity, departTime, flightNum);
					repeat2 = false;
				} else {
					System.out.println("You need to choose either 1 or 2.");
				}
			}
			
			if (j - 1 > i) {
				System.out.println("\nDo you want to enter another flight info(Yes/No)?");
				keyboard.nextLine();
				String info = keyboard.nextLine();
				if (info.equalsIgnoreCase("yes")) {
					i++;
				} else {
					repeat = false;
				}
			} else {
				repeat = false;
			}
		}
		return flight;
	}
	
	public void start() {
		bookFlight(flightInput(numOfFlights()));
	}
	
	public FlightInformation setBoeingFlight(String startCity, String destCity, String departTime, String flightNum) {
		SeatMap map = new BoeingSeatMap();
		FlightInformation f = new FlightInformation(startCity, destCity, departTime, flightNum, map);
		System.out.println(f + "Boeing Flight\n");
		return f;
	}
	
	public FlightInformation setAirBus(String startCity, String destCity, String departTime, String flightNum) {
		SeatMap map2 = new AirBusSeatMap();
		FlightInformation f2 = new FlightInformation(startCity, destCity, departTime, flightNum, map2);
		System.out.println(f2 + "Air Bus Flight\n");
		return f2;
	}
}
