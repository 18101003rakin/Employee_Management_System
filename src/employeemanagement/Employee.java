package employeemanagement;
import java.io.Serializable;

public class Employee implements Serializable {

		public String name;
		public String id ;
		public String designation;
		
		public Employee(String name, String id, String designation) {
			this.name = name;
			this.id = id;
			this.designation = designation;
		}
		
	    public void increaseSalary(double amt)
	    {
	    	
	    }
	    
	   public  double getSalary()
	   {
		   return 0;
	   }
	   
	   public void display()
		{
			System.out.println("Name: "+name+ "\n Id :"+id+ "\n Desig: "+designation);
		}
	}



