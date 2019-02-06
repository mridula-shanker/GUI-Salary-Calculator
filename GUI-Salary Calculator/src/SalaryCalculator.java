import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalaryCalculator {

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(400,400,600,300);//X,Y,Width,Height
		myFrame.setLayout(null);
		
		JLabel hourString = new JLabel("Hourly Rate: ");
		hourString.setBounds(40,30,500,30);
		myFrame.add(hourString);
		
		JTextField hourIn = new JTextField();
		hourIn.setBounds(100,30,500,30);
		myFrame.add(hourIn);
		
		JLabel weekString = new JLabel("Hours/Week: ");
		weekString.setBounds(40,90,500,30);
		myFrame.add(weekString);
		
		JTextField weekIn = new JTextField();
		weekIn.setBounds(100,120,500,30);
		myFrame.add(weekIn);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

}
