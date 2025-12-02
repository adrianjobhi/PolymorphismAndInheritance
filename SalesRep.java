
public class SalesRep extends Employee{
	
	private double salesMade;

	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade	= salesMade;
	}// constructor

	//getters y setter
	public double getSalesMade() {
		return salesMade;
	}//getSalesMade
	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}//setSalesMade
	
	//Métodos
	public double calculateComission(){// comission = 0.1 * salesMade
		return (0.01 * salesMade);
	}//calculateComission

	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + ", " + super.toString() + "]" ;
	}
	
	
}
