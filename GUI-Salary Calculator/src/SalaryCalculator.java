/**
 * Mridula Shanker 
 * Period 6
 * Salary Calculator
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
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
		
		JCheckBox select = new JCheckBox("Full Time");
		select.setBounds(40,140,100,15);
		myFrame.add(select);
		
		JButton command = new JButton("Calculate");
		command.setBounds(40,165,200,30);
		
		command.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
				        if(select.isSelected()) 
				        {//checkbox selected
				        	double totalHours = Double.parseDouble(hRate.getText());
				        	double rate = 40;
				        	double annualSalary = totalHours * rate*52;
				        	dispText.setText("Annual Salary: $" + annualSalary);
				        			
				        } 
				        else 
				        {//checkbox deselected
				        	int totalHours = Integer.parseInt(hRate.getText());
				        	int rate = Integer.parseInt(hourIn.getText());
				        	int annualSalary = totalHours * rate *52;	
				        	dispText.setText("Annual Salary: $ " + annualSalary);
				        };				
					}
				});
				
		myFrame.add(command);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

}