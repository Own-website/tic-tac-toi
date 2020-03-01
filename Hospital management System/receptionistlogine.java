package hms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class receptionistlogine implements ActionListener{
	JFrame frame;
	JTextField uname;
	JPasswordField password;
	JLabel l1,l_uname,l_upass;
	JButton b1,b2,b3;
	JSeparator sap1,sap2;
	public static String a1;
	public String a2;
	private JLabel label;

	public  receptionistlogine() 
	{
    	frame = new JFrame();
    	frame.getContentPane().setBackground(new Color(255, 255, 204));
		//frame.setBounds(350, 150, 600, 500);
	    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(1366, 730);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		l1= new JLabel("RECEPTIONIST LOGIN");
		l1.setForeground(new Color(65, 105, 225));
		l1.setFont(new Font("Tahoma", Font.BOLD, 50));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(395, 11, 604, 138);
		frame.getContentPane().add(l1);
		
		JLabel ul1 = new JLabel("User Name");
		ul1.setFont(new Font("Tahoma", Font.BOLD, 30));
		ul1.setBounds(495, 223, 239, 42);
		frame.getContentPane().add(ul1);
		
		JLabel ul2 = new JLabel("Password");
		ul2.setFont(new Font("Tahoma", Font.BOLD, 30));
		ul2.setBounds(495, 340, 239, 42);
		frame.getContentPane().add(ul2);
		
		uname = new JTextField();
		uname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		uname.setBounds(786, 221, 310, 47);
		frame.getContentPane().add(uname);
		uname.setColumns(10);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 20));
		password.setEchoChar('*');
		password.setBounds(786, 338, 310, 47);
		frame.getContentPane().add(password);
		
		b1 = new JButton("Login");
		
		b1.setFont(new Font("Tahoma", Font.BOLD, 25));
		b1.setBounds(540, 522, 140, 44);
		frame.getContentPane().add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("Reset");
		b2.setFont(new Font("Tahoma", Font.BOLD, 25));
		b2.setBounds(738, 522, 140, 44);
		frame.getContentPane().add(b2);
		b2.addActionListener(this);
		
		b3 = new JButton("Home");
		b3.setFont(new Font("Tahoma", Font.BOLD, 25));
		b3.setBounds(956, 522, 140, 44);
		frame.getContentPane().add(b3);
		b3.addActionListener(this);
		
		sap1= new JSeparator();
		sap1.setBounds(484, 478, 631, 2);
		frame.getContentPane().add(sap1);
		
		l_uname = new JLabel("");
		l_uname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				l_uname.setText("Username is Empty");
			}
		});
		l_uname.setBounds(789, 276, 200, 26);
		frame.getContentPane().add(l_uname);
		
		l_upass = new JLabel("");
		l_upass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				l_upass.setText("Password is Empty");
			}
		});
		l_upass.setBounds(786, 397, 200, 26);
		frame.getContentPane().add(l_upass);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(receptionistlogine.class.getResource("/hms/images/rescp.png")));
		label.setBounds(168, 207, 128, 242);
		frame.getContentPane().add(label);
		
	}
		public static void main(String[] args) 
		{
			receptionistlogine window = new receptionistlogine();
			window.frame.setVisible(true);
			
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if(e.getSource()==b1){
			
			if(uname.getText().trim().isEmpty() &&password.getText().trim().isEmpty()){
				l_uname.setText("Username is Empty");
				l_upass.setText("Password is Empty");
			}
			else if(uname.getText().trim().isEmpty()){
				l_uname.setText("Username is Empty");
			
				
			}
			else if(password.getText().trim().isEmpty()){
				l_upass.setText("Password is Empty");
			}
			
		    Connection cn=Dao.mycon();
			a1=uname.getText();
			a2=password.getText();
			try
			{
	     	    PreparedStatement ps=cn.prepareStatement("select * from rescption where uname=? and upass=?");
				ps.setString(1,a1);
				ps.setString(2,a2);
				ResultSet rs=ps.executeQuery();
				int count=0;
				while(rs.next()){
					count=count+1;
				}
				if(count==1){
					try
					{
					PreparedStatement pss=cn.prepareStatement("insert into save values(?,?)");
					pss.setString(1, a1);
					pss.setString(2, a2);
					pss.executeUpdate();
					}
					catch(Exception e2)
					{
						System.out.println(e2);
					}
					frame.dispose();
					new recportal();
				}
				else if(count>1){
					JOptionPane.showMessageDialog(null, "duplicasey username or passwprd");
				}
				else{
					JOptionPane.showMessageDialog(null, "incorrect username or passwprd");
				}
				rs.close();
				ps.close();
			}
			catch(Exception e1){
				JOptionPane.showMessageDialog(null,e1);
			}
		}
		if(e.getSource()==b2)
		{
			uname.setText(null);
			password.setText(null);
		}
		if(e.getSource()==b3){
			frame.dispose();
			new frontpag();
		}
	}
}