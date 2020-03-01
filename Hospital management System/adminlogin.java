package hms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.eclipse.wb.swing.FocusTraversalOnArray;

public class adminlogin implements ActionListener{
	JFrame frame;
	JTextField uname;
	JPasswordField password;
	JLabel l_uname,l_upass;
	JButton b1,b2,b3;
	JSeparator sap1,sap2;
	private JLabel lblAdminLogin;
	private JLabel label;

	public  adminlogin() {
	
    	frame = new JFrame();
    	frame.getContentPane().setBackground(new Color(255, 255, 204));
		//frame.setBounds(350, 150, 600, 500);
	    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(1366, 730);
	    frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel ul1 = new JLabel("User Name");
		ul1.setFont(new Font("Tahoma", Font.BOLD, 30));
		ul1.setBounds(567, 247, 232, 42);
		frame.getContentPane().add(ul1);
		
		JLabel ul2 = new JLabel("Password");
		ul2.setFont(new Font("Tahoma", Font.BOLD, 30));
		ul2.setBounds(567, 377, 232, 42);
		frame.getContentPane().add(ul2);
		
		uname = new JTextField();
		uname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		uname.setBounds(881, 245, 310, 47);
		frame.getContentPane().add(uname);
		uname.setColumns(10);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 20));
		password.setEchoChar('*');
		password.setBounds(881, 375, 310, 47);
		frame.getContentPane().add(password);
		
		b1 = new JButton("Login");
		b1.setFont(new Font("Tahoma", Font.BOLD, 25));
		b1.setBounds(598, 529, 140, 44);
		frame.getContentPane().add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("Reset");
		b2.setFont(new Font("Tahoma", Font.BOLD, 25));
		b2.setBounds(826, 529, 140, 44);
		frame.getContentPane().add(b2);
		b2.addActionListener(this);
		
		b3 = new JButton("Home");
		b3.setFont(new Font("Tahoma", Font.BOLD, 25));
		b3.setBounds(1063, 529, 140, 44);
		frame.getContentPane().add(b3);
		b3.addActionListener(this);
		
		sap1= new JSeparator();
		sap1.setBounds(567, 488, 640, 2);
		frame.getContentPane().add(sap1);
		
		l_uname = new JLabel("");
		l_uname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				l_uname.setText("Username is Empty");
			}
		});
		l_uname.setBounds(881, 306, 200, 26);
		frame.getContentPane().add(l_uname);
		
		l_upass = new JLabel("");
		l_upass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				l_upass.setText("Password is Empty");
			}
		});
		l_upass.setBounds(881, 433, 200, 26);
		frame.getContentPane().add(l_upass);
		
		lblAdminLogin = new JLabel("ADMIN LOGIN");
		lblAdminLogin.setForeground(new Color(65, 105, 225));
		lblAdminLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		lblAdminLogin.setBounds(418, 11, 600, 145);
		frame.getContentPane().add(lblAdminLogin);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(adminlogin.class.getResource("/hms/images/login.jpg")));
		label.setBounds(191, 230, 232, 299);
		frame.getContentPane().add(label);
		
	}
		public static void main(String[] args) 
		{
			adminlogin window = new adminlogin();
			window.frame.setVisible(true);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub	
		if(e.getSource()==b1){
		String s1=uname.getText();
		String s2=password.getText();
		if(s1.equals("admin")&& s2.equals("admin"))
		{
			frame.dispose();
			new adminportal();
			}
			else
			{
				JOptionPane.showMessageDialog(frame, "incorrect username or passwprd");
			}				}
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
				
		if(e.getSource()==b2)
		{
			uname.setText(null);
			password.setText(null);
		}
		if(e.getSource()==b3)
		{
			frame.dispose();
			new frontpag();
		}
	}
}