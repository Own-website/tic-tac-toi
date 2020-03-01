package hms;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class drdetail implements ActionListener{
	
	JFrame frame;
	JPanel p1;
	JButton b1,b2,b3,b4,b5,b6;
	public drdetail() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.getContentPane().setLayout(null);
		//frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setSize(1366, 730);
	    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		

		p1 = new JPanel();
		p1.setForeground(SystemColor.text);
		p1.setBackground(SystemColor.textHighlight);
		p1.setBounds(0, 0, 1364, 112);
		frame.getContentPane().add(p1);
		p1.setLayout(null);
		
		JLabel l1 = new JLabel("Doctor Details");
		l1.setBounds(502, 5, 410, 96);
		l1.setFont(new Font("Tahoma", Font.BOLD, 55));
		l1.setForeground(SystemColor.text);
		p1.add(l1);
		
		b1= new JButton("Add Doctor");
		b1.setFont(new Font("Tahoma", Font.ITALIC, 40));
		b1.setBounds(453, 146, 486, 73);
		frame.getContentPane().add(b1);
		b1.addActionListener(this);
		
		b2= new JButton("Delete Doctor");
		b2.setFont(new Font("Tahoma", Font.ITALIC, 40));
		b2.setBounds(453, 244, 486, 80);
		frame.getContentPane().add(b2);
		b2.addActionListener(this);
		
		b3= new JButton("Update Doctor");
		b3.setFont(new Font("Tahoma", Font.ITALIC, 40));
		b3.setBounds(453, 346, 486, 73);
		frame.getContentPane().add(b3);
		b3.addActionListener(this);
		
		b4= new JButton("Search Doctor");
		b4.setFont(new Font("Tahoma", Font.ITALIC, 40));
		b4.setBounds(453, 454, 486, 73);
		frame.getContentPane().add(b4);
		b4.addActionListener(this);
		
		b5 = new JButton("View Doctor");
		b5.setFont(new Font("Tahoma", Font.ITALIC, 40));
		b5.setBounds(453, 558, 486, 65);
		frame.getContentPane().add(b5);
		b5.addActionListener(this);
		
		b6 = new JButton("Back");
		b6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b6.setBounds(1151, 630, 138, 54);
		frame.getContentPane().add(b6);
		b6.addActionListener(this);
		}
	public static void main(String[] args) 
		{
		drdetail window = new drdetail();
		window.frame.setVisible(true);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==b1){
			frame.dispose();
			new addDr();
		}
		if(e.getSource()==b2){
			frame.dispose();
			new deletedr();
		}
		if(e.getSource()==b3){
			frame.dispose();
			new updatedr();
		}
		if(e.getSource()==b4){
			frame.dispose();
			new searchdr();
		}
		if(e.getSource()==b5)
		{
			frame.dispose();
			new jtabledoctor();
		}
		if(e.getSource()==b6)
		{
			frame.dispose();
			new adminportal();
		}
	}
}