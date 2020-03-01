package hms;
import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
public class frontpag  implements ActionListener{
	JFrame frame;
	JPanel p1;
	JLabel hms,l1,icon1,icon2,icon3;
	JButton b1,b2,b3,btnexit;
	private JLabel img;

		public frontpag() 
		{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 153));
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setSize(1366, 730);
	    frame.setVisible(true);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		p1= new JPanel();
		p1.setBackground(new Color(220, 20, 60));
		p1.setBounds(0, 0, 1366, 146);
		frame.getContentPane().add(p1);
		p1.setLayout(null);
		
		img = new JLabel("");
		img.setIcon(new ImageIcon(frontpag.class.getResource("/hms/images/hms.png")));
		img.setBounds(157, 5, 151, 135);
		p1.add(img);

		hms = new JLabel("Hospital Managment System");
		hms.setBounds(338, 30, 748, 61);
		hms.setHorizontalAlignment(SwingConstants.LEFT);
		hms.setForeground(new Color(255, 255, 204));
		hms.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
		p1.add(hms);

		b1 = new JButton("Admin");		
		b1.setBackground(new Color(51, 204, 204));
		b1.setFont(new Font("Dialog", Font.BOLD, 20));
		b1.setBounds(289, 496, 187, 43);
		//frame.getContentPane().add(b1);
		frame.getContentPane().add(b1);
		b1.addActionListener(this);

		b2 = new JButton("Receptionist");
		b2.setBackground(new Color(102, 204, 204));
		b2.setFont(new Font("Dialog", Font.BOLD, 20));
		b2.setBounds(596, 496, 181, 43);
		frame.getContentPane().add(b2);
		b2.addActionListener(this);

		b3 = new JButton("Doctor");
		b3.setBackground(new Color(102, 204, 204));
		b3.setFont(new Font("Dialog", Font.BOLD, 20));
		b3.setBounds(890, 496, 187, 43);
		frame.getContentPane().add(b3);
		b3.addActionListener(this);

		btnexit = new JButton("Exit");	
		btnexit.setForeground(new Color(192, 192, 192));
		btnexit.setBackground(new Color(255, 0, 0));
		btnexit.setFont(new Font("Dialog", Font.BOLD, 20));
		btnexit.setBounds(1173, 626, 120, 48);
		frame.getContentPane().add(btnexit);
		btnexit.addActionListener(this);

		l1 = new JLabel("Login As..");
		l1.setFont(new Font("Tahoma", Font.BOLD, 40));
		l1.setBounds(32, 174, 267, 106);
		frame.getContentPane().add(l1);

		icon1= new JLabel("");
		icon1.setIcon(new ImageIcon(frontpag.class.getResource("/hms/images/businessman.png")));
		icon1.setBounds(338, 337, 128, 146);
		frame.getContentPane().add(icon1);

		icon2 = new JLabel("");
		icon2.setIcon(new ImageIcon(frontpag.class.getResource("/hms/images/check-in-desk.png")));
		icon2.setBounds(631, 349, 118, 122);
		frame.getContentPane().add(icon2);

		icon3= new JLabel("");
		icon3.setIcon(new ImageIcon(frontpag.class.getResource("/hms/images/medical-doctor.png")));
		icon3.setBounds(923, 365, 138, 106);
		frame.getContentPane().add(icon3);
	}
	@Override
	public void actionPerformed(ActionEvent e1) 
	{
		if(e1.getSource()==b1)
		{
			frame.dispose();
			new adminlogin();
		}
		if(e1.getSource()==b2)
		{
			frame.dispose();
			new receptionistlogine();
		}
		if(e1.getSource()==b3)
		{
			frame.dispose();
			new doctorlogin();
		}
		if(e1.getSource()==btnexit)
		{
			System.exit(0);
		}
	}  
	public static void main(String[] args) 
	{
		frontpag window =new frontpag();
		window.frame.setVisible(true);
	}	
}