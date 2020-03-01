package hms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

import org.omg.PortableInterceptor.ACTIVE;

import java.awt.*;

@SuppressWarnings("unused")
public class recportal implements ActionListener{

	JFrame frame,frame1;
	JPanel panel;
	JLabel l1,l2;
	JLabel o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13;
	JButton bprofile,bptdetail,bappoinment,bcp,blogout,B1;
	String a1,s1;
	public recportal() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setSize(1366, 730);
	    //frame.setBounds(350, 150, 600, 400);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		frame1 = new JFrame();
		frame1.getContentPane().setForeground(new Color(0, 0, 0));
		frame1.getContentPane().setBackground(new Color(255, 250, 205));
		frame1.setSize(1366, 730);
		frame1.getContentPane().setLayout(null);
		
		o1= new JLabel("");
		o1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		o1.setBounds(285,99,388, 74);
	    frame1.getContentPane().add(o1);
	    
	    o2= new JLabel("");
	    o2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		o2.setBounds(816,99, 388, 74);
	    frame1.getContentPane().add(o2);
	    
        o3= new JLabel("");
        o3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		o3.setBounds(279, 190, 388, 74);
	    frame1.getContentPane().add(o3);
	    
	    o4= new JLabel("");
	    o4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		o4.setBounds(816, 190, 390, 76);
	    frame1.getContentPane().add(o4);
	    
	    o5= new JLabel("");
	    o5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		o5.setBounds(277, 270, 388, 74);
	    frame1.getContentPane().add(o5);
	    
	    o6= new JLabel("");
	    o6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		o6.setBounds(816, 270, 390, 74);
	    frame1.getContentPane().add(o6);
	    
	    o7= new JLabel("");
	    o7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		o7.setBounds(279, 350, 388, 74);
	    frame1.getContentPane().add(o7);
	    
	    o8= new JLabel("");
	    o8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		o8.setBounds(816, 350, 388, 86);
	    frame1.getContentPane().add(o8);
	    
	    
	    o9= new JLabel("");
	    o9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		o9.setBounds(279, 434, 388, 80);
	    frame1.getContentPane().add(o9);
	    
	    o10= new JLabel("");
	    o10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		o10.setBounds(816, 434, 388, 86);
	    frame1.getContentPane().add(o10);
	    
	    o11= new JLabel("");
	    o11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		o11.setBounds(279, 525, 388, 74);
	    frame1.getContentPane().add(o11);
	    
	    o12= new JLabel("");
	    o12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		o12.setBounds(76, 32, 200, 86);
	    frame1.getContentPane().add(o12);
	    
	    B1 = new JButton("Back");		
		B1.setBackground(new Color(51, 204, 204));
		B1.setFont(new Font("Dialog", Font.BOLD, 20));
		B1.setBounds(1100, 550, 100, 50);
		//frame.getContentPane().add(b1);
		frame1.getContentPane().add(B1);
		B1.addActionListener(this);

	    
		panel = new JPanel();
		panel.setBackground(new Color(51, 204, 255));
		panel.setBorder(null);
		panel.setBounds(-20, 0, 1389, 114);
		frame.getContentPane().add(panel);
		
		l1 = new JLabel("Receptionist Portal");
		l1.setForeground(SystemColor.text);
		l1.setFont(new Font("Tahoma", Font.BOLD, 55));
		panel.add(l1);
		
		bprofile = new JButton("Profile");
		bprofile.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 30));
		bprofile.setBackground(new Color(192, 192, 192));
		bprofile.setForeground(new Color(0, 0, 0));
		bprofile.setBounds(152, 173, 280, 46);
		frame.getContentPane().add(bprofile);
		bprofile.addActionListener(this);
		
		bptdetail = new JButton("Patient Details");
		bptdetail.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 30));
		bptdetail.setBackground(new Color(192, 192, 192));
		bptdetail.setForeground(new Color(0, 0, 0));
		bptdetail.setBounds(152, 262, 280, 47);
		frame.getContentPane().add(bptdetail);
		bptdetail.addActionListener(this);
		
		bappoinment = new JButton("Appointment");
		bappoinment.setForeground(new Color(0, 0, 0));
		bappoinment.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 30));
		bappoinment.setBackground(new Color(192, 192, 192));
		bappoinment.setBounds(152, 361, 280, 47);
		frame.getContentPane().add(bappoinment);
		bappoinment.addActionListener(this);
		
		bcp = new JButton("Change Password");
		bcp.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 30));
		bcp.setBackground(new Color(192, 192, 192));
		bcp.setForeground(new Color(0, 0, 0));
		bcp.setBounds(152, 455, 280, 46);
		frame.getContentPane().add(bcp);
		bcp.addActionListener(this);
		
		blogout = new JButton("Logout");
		blogout.setBackground(SystemColor.textHighlight);
		blogout.setFont(new Font("Tahoma", Font.PLAIN, 20));
		blogout.setBounds(240, 612, 120, 46);
		frame.getContentPane().add(blogout);
		blogout.addActionListener(this);
		
		l2 = new JLabel("");
		//l2.setIcon(new ImageIcon("C:\\workspace\\"));
		l2.setIcon(new ImageIcon(recportal.class.getResource("/hms/images/rescportal.jpg")));
		
		l2.setBounds(577, 183, 612, 423);
		frame.getContentPane().add(l2);
	}
	public static void main(String[] args) 
	{
		recportal window = new recportal();
		window.frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==B1)
		{
			frame1.dispose();
			new recportal();
		}
		if(e.getSource()==blogout)
		{
			int YesorNo=JOptionPane.showConfirmDialog(null, "Do you really want to logout","logout", JOptionPane.YES_NO_OPTION);
			if(YesorNo==0)
			{
			frame.dispose();
			new frontpag();
			}
		}
		if(e.getSource()==bptdetail)
		{
			frame.dispose();
			new patientdetail1();
		}
		if(e.getSource()==bappoinment)
		{
			frame.dispose();
			new appoinment();
		}
		if(e.getSource()==bcp)
		{
			frame.dispose();
			new changepass();
		}
		
		if(e.getSource()==bprofile)
		{
			Connection cn=Dao.mycon();
			try{
				Statement st=cn.createStatement();
				ResultSet rs = st.executeQuery("select upass from save where rowid in(select max(rowid) from save)");
				while(rs.next())
				{
					 a1=rs.getString(1);
				}
				}
				catch(Exception e4)

				{
					System.out.println(e4);
				}
				try
				{
					
					PreparedStatement ps=cn.prepareStatement("select * from rescption where upass=?");
					ps.setString(1,a1);
					ResultSet rs=ps.executeQuery();
					
					while(rs.next())
					{
						String t12=rs.getString(1);
						String t1=rs.getString(2);
						String t2=rs.getString(3);
						String t3=rs.getString(4);
						String t4=rs.getString(5);
						String t5=rs.getString(6);
						String t6=rs.getString(7);
						String t7=rs.getString(8);
						String t8=rs.getString(9);
						String t9=rs.getString(10);
						String t10=rs.getString(11);
						String t11=rs.getString(12);
						
						o1.setText(t1);
						o2.setText(t2);
						o3.setText(t3);
						o4.setText(t4);
						o5.setText(t5);
						o6.setText(t6);
						o7.setText(t7);
						o8.setText(t8);
						o9.setText(t9);
						o10.setText(t10);
						o11.setText(t11);
						o12.setText(t12);
					}
				}
				catch(Exception e3)
				{
					System.out.println(e3);
				}
				frame.dispose();
				frame1.setVisible(true);
		}
	}
}
