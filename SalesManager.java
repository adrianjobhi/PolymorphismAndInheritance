import java.util.HashMap;

public class SalesManager extends SalesRep {

	private HashMap<Integer, SalesRep> salesTeam;
	
	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
		
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
		this.salesTeam = new HashMap<>();
	}//constructor
	
	//getters y setters
	public HashMap<Integer, SalesRep> getSalesTeam() {
		return salesTeam;
	}

	public void setSalesTeam(HashMap<Integer, SalesRep> salesTeam) {
		this.salesTeam = salesTeam;
	}
	
	//Métodos
	public void addSalesRep(Integer registration, SalesRep rep) {
		this.salesTeam.put(registration, rep);
	}
	
	public double calculateComission(){ // 0.03 * all sales made by team
		 double totalSales = 0;
		 
		 for(SalesRep rep : salesTeam.values()) {
			 totalSales += rep.getSalesMade();
		 }
		 return (totalSales = 0.03 * totalSales);
	}//calculateComission

	@Override
	public String toString() {
		return "SalesManager [salesTeam=" + salesTeam + " toString()=" + super.toString() + "]" ;
	}
	
	
}
