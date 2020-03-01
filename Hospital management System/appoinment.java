package hms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import org.omg.PortableInterceptor.ACTIVE;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;

public class appoinment  {

	private JFrame frame;
	private JTextField t1;
	JComboBox day,month,year,cb1;
	private JLabel l4;
	private JLabel l3;
	private JTextField t2;
	JButton b1;

	public appoinment()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setSize(1366, 730);
	    frame.setVisible(true);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);
	    
	    JLabel l1 = new JLabel("Department");
	    l1.setFont(new Font("Tahoma", Font.BOLD, 25));
	    l1.setBounds(85, 143, 195, 57);
	    frame.getContentPane().add(l1);
		
	    
	    String Select[]={"Select","Cardiology","Dental/Oral Medicine","Medicine","Skin","Surgery","Urology"};
	    JComboBox cb1 = new JComboBox(Select);
	    cb1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    cb1.setBounds(342, 153, 225, 47);
	    cb1.setEditable(true);	
	    frame.getContentPane().add(cb1);
	    
	    JLabel l2 = new JLabel("Doctor Name");
	    l2.setFont(new Font("Tahoma", Font.BOLD, 25));
	    l2.setBounds(85, 253, 195, 63);
	    frame.getContentPane().add(l2);
	    
	    t1 = new JTextField();
	    t1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    t1.setBounds(340, 269, 227, 47);
	    frame.getContentPane().add(t1);
	    t1.setColumns(10);
	    
	    
	    String[] daylist={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","131"};
		day = new JComboBox(daylist);
		day.setBounds(859, 269, 55, 25);
		day.setEditable(false);
		frame.getContentPane().add(day);
		
		String[] monthlist={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		month = new JComboBox(monthlist);
		month.setBounds(935, 269, 55, 25);
		month.setEditable(false);
		frame.getContentPane().add(month);	
		
		String[] yearlist=new String[100];
		for(int i=1985;i<=2050;i++)
		{
			yearlist[i-1985]=Integer.toString(i);
		}
		year = new JComboBox(yearlist);
		year.setBounds(1011, 269, 55, 25);
		year.setEditable(false);
		frame.getContentPane().add(year);
		
		l4 = new JLabel("Date");
		l4.setFont(new Font("Tahoma", Font.BOLD, 25));
		l4.setBounds(730, 268, 75, 32);
		frame.getContentPane().add(l4);
		
		l3 = new JLabel("Time");
		l3.setFont(new Font("Tahoma", Font.BOLD, 25));
		l3.setBounds(85, 387, 68, 25);
		frame.getContentPane().add(l3);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t2.setBounds(347, 384, 171, 42);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		b1 = new JButton("Save");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dept=(String) cb1.getSelectedItem();
				String name=t1.getText();
				String time=t2.getText();
				
				
				String date;
				date =(day.getSelectedItem() + "-" + month.getSelectedItem() + "-" + year.getSelectedItem());
				
				 try{
					 	Class.forName("oracle.jdbc.driver.OracleDriver");
					    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
					   	PreparedStatement ps=con.prepareStatement("insert into appoinment values(?,?,?,?)");
						ps.setString(1, dept);				
						ps.setString(2, name);
						ps.setString(3, date);
						ps.setString(4, time);
						ps.executeUpdate();
						con.close();
						JOptionPane.showMessageDialog(frame, "detais add successfull");
						frame.dispose();
						new recportal();
				 }	
				 catch(Exception e1)
				 {
					 e1.printStackTrace();
					 JOptionPane.showMessageDialog(frame, "Please fill the correct entry");
				 }	
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 20));
		b1.setBounds(907, 494, 128, 47);
		frame.getContentPane().add(b1);
		
		JButton backbtn = new JButton("Back");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				frame.dispose();
				new recportal();
			}
		});
		backbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		backbtn.setBounds(1045, 494, 112, 47);
		frame.getContentPane().add(backbtn);
	}
	public static void main(String[] args) 
	{
		appoinment window= new appoinment();
		window.frame.setVisible(true);
	}
}