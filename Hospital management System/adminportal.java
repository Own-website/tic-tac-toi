package hms;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
public class adminportal extends JFrame implements ActionListener 
{
	private JFrame frame;
	JPanel p1,p2;
	JLabel l1,l2,l3;
	JButton b1,b2,b3,btnlgout;
	public adminportal() 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBackground(Color.LIGHT_GRAY);
		//frame.setBounds(100, 100, 450, 300);
		frame.setSize(1366, 730);
	    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		p1 = new JPanel();
		p1.setBackground(SystemColor.textHighlight);
		p1.setBounds(0, 0, 1377, 119);
		frame.getContentPane().add(p1);
		p1.setLayout(null);
		
		l1 = new JLabel("Admin Portal");
		l1.setBounds(509, 11, 404, 86);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setForeground(SystemColor.window);
		l1.setFont(new Font("Tahoma", Font.BOLD, 55));
		p1.add(l1);
		
		l2 = new JLabel("Welcome to");
		l2.setFont(new Font("Tahoma", Font.BOLD, 45));
		l2.setBounds(54, 308, 277, 104);
		frame.getContentPane().add(l2);
		
		l3 = new JLabel("Admin Portal");
		l3.setFont(new Font("Tahoma", Font.BOLD, 45));
		l3.setBounds(64, 370, 307, 155);
		frame.getContentPane().add(l3);
		
		b1 = new JButton("Patient Details");
		b1.setFont(new Font("Tahoma", Font.BOLD, 20));
		b1.setBounds(466, 485, 220, 56);
		frame.getContentPane().add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("Receptionist");
		b2.setFont(new Font("Tahoma", Font.BOLD, 20));
		b2.setBounds(798, 485, 176, 56);
		frame.getContentPane().add(b2);
		b2.addActionListener(this);
		
		b3 = new JButton("Doctor Details");
		b3.setFont(new Font("Tahoma", Font.BOLD, 20));
		b3.setBounds(1099, 485, 185, 56);
		frame.getContentPane().add(b3);
		b3.addActionListener(this);
		
		JLabel lbicon2 = new JLabel("");
		lbicon2.setIcon(new ImageIcon(adminportal.class.getResource("/hms/images/receptionist.png")));
		lbicon2.setBounds(810, 318, 164, 164);
		frame.getContentPane().add(lbicon2);
		
		JLabel lbicon3 = new JLabel("");
		lbicon3.setIcon(new ImageIcon(adminportal.class.getResource("/hms/images/dr-details.png")));
		lbicon3.setBounds(1124, 325, 142, 134);
		frame.getContentPane().add(lbicon3);
		
		JLabel lbicon1 = new JLabel("");
		lbicon1.setIcon(new ImageIcon(adminportal.class.getResource("/hms/images/ppdetails.png")));
		lbicon1.setBounds(490, 318, 155, 141);
		frame.getContentPane().add(lbicon1);
		
		btnlgout = new JButton("Logout");
		btnlgout.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnlgout.setBounds(1212, 130, 115, 44);
		frame.getContentPane().add(btnlgout);
		btnlgout.addActionListener(this);
	}
	
	public static void main(String[] args) 
	{
		adminportal window = new adminportal();
		window.frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1){
			frame.dispose();
			new patientdetail();
		}
		if(e.getSource()==b2){
			frame.dispose();
			new rescpedetail();
		}
		if(e.getSource()==b3){
			frame.dispose();
			new drdetail();
		}
		if(e.getSource()==btnlgout){
			frame.dispose();
			new frontpag();
		}
	}	
}