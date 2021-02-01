package employeemanagement;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.DefaultListModel;

public class Control {

	static UapCSE ers = new UapCSE();
	static EFrame frame = new EFrame();
	static HomePage frame1 = new HomePage();
	static EmployeeTypeFrame frame2 = new EmployeeTypeFrame();
	static SalariedFrame frame3 = new SalariedFrame();
	static CFrame frame4 = new CFrame();
	static HFrame frame5 = new HFrame();
	static GetSalaryFrame frame6 = new GetSalaryFrame();
	static InSalFrame frame7 = new InSalFrame();
	static DisplayFrame frame8 = new DisplayFrame();
	static DefaultListModel<String>employee=new DefaultListModel<String>();
	static String fileName="Employee Details.txt";
	
	
	public static void main(String[] args) {
		frame.setVisible(true);

		
		ObjectInputStream ois = null;
		try {	
			ois = new ObjectInputStream (new FileInputStream (fileName));
			ers= (UapCSE)ois.readObject();	
		}
		catch(Exception e) {
		ers= new UapCSE();
		}
		
		
		finally {
			try {
				ois.close(); //close file
				
			}
			catch (Exception o) {
				System.out.println(o); //null pointer exception
			}
		}
	}

}



