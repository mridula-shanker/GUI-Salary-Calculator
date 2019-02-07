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
		
		JTextField hRate = new JTextField();
		hRate.setBounds(125,30,250,30);
		myFrame.add(hRate);
		
		JLabel weekString = new JLabel("Hours/Week: ");
		weekString.setBounds(40,90,250,30);
		myFrame.add(weekString);
		
		JTextField hourIn = new JTextField();
		hourIn.setBounds(125,90,250,30);
		myFrame.add(hourIn);
	
		final JLabel dispText = new JLabel();
		dispText.setBounds(275,160,500,30);
		myFrame.add(dispText);
		
		//JCheckBox try = new JCheckBox("Try This");
		//try.setBounds(40,140,15,15);
		//myFrame.add(try);
		
		JButton command = new JButton("Calculate");
		command.setBounds(40,165,200,30);
		/**
		command.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
				        if(try.isSelected()) 
				        {//checkbox has been selected
				        	int totalHours = Integer.parseInt(hourIn.getText());
				        	int rate = 40;
				        	int annualSalary = totalHours * rate;
				        	dispName.setText("Annual Salary", annualSalary);
				        			
				        } 
				        else 
				        {//checkbox has been deselected
				        	int totalHours = Integer.parseInt(hourIn.getText());
				        	int rate = Integer.parseInt(hRate.getText());
				        	int annualSalary = totalHours * rate;	
				        	dispName.setText("Annual Salary", annualSalary);
				        };				
					}
				});
				**/
		myFrame.add(command);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

}
