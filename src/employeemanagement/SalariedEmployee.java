package employeemanagement;

public class SalariedEmployee extends Employee {
   public double  monthlySalary;
   
   public  SalariedEmployee(String name, String id, String designation,double monthlySalary)
  {
		super(name,id,designation);
		this.monthlySalary=monthlySalary;
  }

@Override
public void increaseSalary(double amt) 
{
	
	monthlySalary=monthlySalary+amt;
}

@Override
public double getSalary() 
{
	
	return monthlySalary ;
}

@Override
public void display() {
	
	System.out.println(" Name: " + name + "\n Id: " + id + "\n Designation: " + designation);
}

@Override
public String toString() {
	return " Name: "+ name + " Id: " + id + " Designation: " + designation;
}
}
