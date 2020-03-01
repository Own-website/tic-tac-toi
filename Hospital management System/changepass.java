package hms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class changepass implements ActionListener{

	private JFrame frame;
	private JTextField tpass,tnpass,trpass;
	JButton submit,reset,cancel;
	public changepass() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(70, 130, 180));
		frame.setSize(1366, 730);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);
	    frame.dispose();
	    
	    JLabel lcp = new JLabel("Change Password");
	    lcp.setForeground(SystemColor.textHighlightText);
	    lcp.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
	    lcp.setBounds(364, 30, 679, 102);
	    frame.getContentPane().add(lcp);
	    
	    JLabel l1 = new JLabel("Old Password");
	    l1.setForeground(SystemColor.text);
	    l1.setFont(new Font("Tahoma", Font.BOLD, 25));
	    l1.setBounds(581, 274, 220, 77);
	    frame.getContentPane().add(l1);
	    
	    JLabel l2 = new JLabel("New Password");
	    l2.setForeground(SystemColor.text);
	    l2.setFont(new Font("Tahoma", Font.BOLD, 25));
	    l2.setBounds(581, 362, 220, 70);
	    frame.getContentPane().add(l2);
	    
	    JLabel l3 = new JLabel("Confirm Password");
	    l3.setForeground(SystemColor.text);
	    l3.setFont(new Font("Tahoma", Font.BOLD, 25));
	    l3.setBounds(581, 461, 259, 60);
	    frame.getContentPane().add(l3);
	    
	    tpass = new JTextField();
	    tpass.setBounds(900, 285, 198, 42);
	    frame.getContentPane().add(tpass);
	    tpass.setColumns(10);
	    
	    tnpass = new JTextField();
	    tnpass.setFont(new Font("Tahoma", Font.ITALIC, 17));
	    tnpass.setBounds(900, 380, 246, 42);
	    frame.getContentPane().add(tnpass);
	    tnpass.setColumns(10);
	    
	    trpass = new JTextField();
	    trpass.setFont(new Font("Tahoma", Font.ITALIC, 17));
	    trpass.setBounds(900, 474, 246, 42);
	    frame.getContentPane().add(trpass);
	    trpass.setColumns(10);
	    
	    reset = new JButton("Reset");
	    reset.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	    reset.setBounds(750, 602, 129, 42);
	    frame.getContentPane().add(reset);
	    
	    submit = new JButton("Submit");
	    submit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	    submit.setBounds(568, 602, 110, 42);
	    frame.getContentPane().add(submit);
	    
	    cancel = new JButton("Cancel");
	    cancel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	    cancel.setBounds(963, 602, 135, 42);
	    frame.getContentPane().add(cancel);
	    
	    JLabel label = new JLabel("");
	    label.setIcon(new ImageIcon(changepass.class.getResource("/hms/images/images.jpg")));
	    label.setBounds(205, 308, 230, 235);
	    frame.getContentPane().add(label);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==submit)
		{
			
		}
		if(e.getSource()==reset)
		{
		tpass.setText(null);
		tnpass.setText(null);
		trpass.setText(null);
			
		}if(e.getSource()==submit)
		{
			frame.dispose();
			//constructor calling
			String a1=tpass.getText();
			try {
				Connection cn=Dao.mycon();
				int b1=Integer.parseInt(a1);
				PreparedStatement st=cn.prepareStatement("");
				ResultSet rs=st.executeQuery();
				while(rs.next())
				{
					//get the data from the database and set to with index number
				String i1=rs.getString(1);
				String i2=rs.getString(2);
				}
			}
			catch(Exception e1){
				e1.printStackTrace();
			}
		}
		
	}
	private void PreparedStatement(String string) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) 
	{
		changepass window = new changepass();
		window.frame.setVisible(true);
	}
	
}
