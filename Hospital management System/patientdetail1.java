package hms;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class patientdetail1 implements ActionListener{

	private JFrame frame;
	JButton b1,b3,b4,b5,b6;
	JLabel l1;
	public patientdetail1() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.getContentPane().setLayout(null);
		//frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setSize(1366, 730);
	    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
				

		b1 = new JButton("Add Patient");
		b1.setFont(new Font("Tahoma", Font.ITALIC, 40));
		b1.setBounds(413, 162, 536, 71);
		b1.addActionListener(this);
		frame.getContentPane().add(b1);
		
		b3 = new JButton("Update Patient");
		b3.setFont(new Font("Tahoma", Font.ITALIC, 40));
		b3.setBounds(413, 260, 536, 71);
		frame.getContentPane().add(b3);
		b3.addActionListener(this);
		
		b4 = new JButton("Search Patient");
		b4.setFont(new Font("Tahoma", Font.ITALIC, 40));
		b4.setBounds(413, 362, 536, 71);
		frame.getContentPane().add(b4);
		b4.addActionListener(this);
		
		b5 = new JButton("View Patient");
		b5.setFont(new Font("Tahoma", Font.ITALIC, 40));
		b5.setBounds(413, 476, 536, 71);
		frame.getContentPane().add(b5);
		b5.addActionListener(this);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.text);
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 1364, 132);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		l1 = new JLabel("Patient Details");
		l1.setBounds(495, 25, 453, 82);
		l1.setFont(new Font("Tahoma", Font.BOLD, 55));
		l1.setForeground(SystemColor.text);
		panel.add(l1);
		
		b6=new JButton("Back");
		b6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b6.setBounds(1143, 600, 120, 45);
		frame.getContentPane().add(b6);
		b6.addActionListener(this);
		}
	public static void main(String[] args) {
		patientdetail1 window = new patientdetail1();
		window.frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1){
			frame.dispose();
			new aadpatient1();
		}
		if(e.getSource()==b3){
			frame.dispose();
			new updatepatient1();
		}
		if(e.getSource()==b4){
			frame.dispose();
			new searchpatient1();
		}
		if(e.getSource()==b5){
			frame.dispose();
			frame.dispose();
			new jtablepatient1();
		}
		if(e.getSource()==b6)
		{
			frame.dispose();
			new recportal();
		}
	}
}
