//Java Programme to display the top performing salesMan
//LOGIC:
//  Create an employee class, instantiate objects(salesmen),
//  give a sales attribute, Iterate through employees array,
//  compare the attribute and choose top seller.

//Creating a class Employee
class Employee{
    //Attributes
	public String name;
	public double salesAmount;
	
    //Constructor
	Employee(String name,double salesAmount){
		this.name = name;
		this.salesAmount = salesAmount;		
	}

    //Static method
	public static Employee TopSeller(Employee[] employees) {
		Employee topSeller = new Employee(null, 0);
        //Iteration
		for(Employee e : employees){
			if(e.salesAmount > topSeller.salesAmount){                  //=>comparing and choosing maximum salesamount
				topSeller = e;                                          //=>assiging current max as topseller
			}
		}
		return topSeller;                                               //returning topseller
	}
}

//Main Class
public class TopSeller {
	public static void main(String args[]) {
        //Object instantiation and assignment
		Employee[] employees = new Employee[4];		
		employees[0] = new Employee("Alice",5000.0);
		employees[1] = new Employee("Bob",7500.0);
		employees[2] = new Employee("Charlie",3000.0);
		employees[3] = new Employee("Diana",9000.0);
		
		Employee topSeller = Employee.TopSeller(employees);                                             //=>Function call
		if(topSeller.name == null) System.out.println("Empty Array of Objects");
		else System.out.println("Top Seller : " + topSeller.name + " with $" + topSeller.salesAmount);
		
		//Empty Array
		Employee[] employees1 = new Employee[0];
		Employee topSeller1 = Employee.TopSeller(employees1);

		if(topSeller1.name == null) System.out.println("Empty Array of Objects");                       //=>Function call
		else System.out.println("Top Seller : " + topSeller.name + " with $" + topSeller.salesAmount);
	}
}
