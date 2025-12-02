
public class Main {

	public static void main(String[] args) {
		//Employee
		Employee carlos = new Employee("Carlos", "Gonzalez", 101, 35, 720, 5, 1500, 8); 
		
		System.out.println(carlos);
		System.out.println("Time for retirement: " + carlos.timeToRetirement());
		System.out.println("Vacacion time left: " + carlos.vacationTimeLeft());
		System.out.println("Bonus: " + carlos.calculateBonus());
		
		//SalesRep
		SalesRep ana = new SalesRep("Ana", "Gutierrez", 103, 28, 360, 2, 1200, 3, 15000);
		SalesRep juan = new SalesRep("Juan", "Valdez", 102, 25, 540, 10, 1400, 6, 20000);
		//System.out.println(ana);
		//System.out.println(juan);
		
		System.out.println("Comission Ana: " + ana.calculateComission());
		System.out.println("Comission Juan: " + juan.calculateComission());

		//SalesManager
		SalesManager lorena = new SalesManager("Lorena", "Ibarra", 100, 45, 5400, 20, 25000, 20, 0);
		lorena.addSalesRep(ana.getRegistration(), ana);
		lorena.addSalesRep(juan.getRegistration(), juan);
		
		System.out.println("Comission Juan: " + lorena.calculateComission());
		System.out.println(lorena);
	}//main
}
