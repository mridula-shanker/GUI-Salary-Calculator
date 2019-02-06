import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalaryCalculator {

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame("Salary Calculator");
		myFrame.setBounds(400,400,600,300);//X,Y,Width,Height
		myFrame.setLayout(null);
		
		JLabel hourString = new JLabel("Hourly Rate: ");
		hourString.setBounds(40,30,250,30);
		myFrame.add(hourString);
		
		JTextField hourIn = new JTextField();
		hourIn.setBounds(125,30,250,30);
		myFrame.add(hourIn);
		
		JLabel weekString = new JLabel("Hours/Week: ");
		weekString.setBounds(40,90,250,30);
		myFrame.add(weekString);
		
		JTextField weekIn = new JTextField();
		weekIn.setBounds(125,90,250,30);
		myFrame.add(weekIn);
		
		//JCheckBox try = new JCheckBox("Try This");
		//try.setBounds(40,140,15,15);
		//myFrame.add(try);
		
		JButton command = new JButton("Calculate");
		command.setBounds(40,165,200,30);
		command.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						
						
					}
				});
		myFrame.add(command);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

}
