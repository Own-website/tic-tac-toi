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

public class rescpedetail implements ActionListener {

	private JFrame frame;
	JButton b1,b2,b3,b4,b5,b6;

	public rescpedetail() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.getContentPane().setLayout(null);
		//frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setSize(1366, 730);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
				

		b1 = new JButton("Add Receptionist");
		b1.setFont(new Font("Tahoma", Font.ITALIC, 40));
		b1.setBounds(453, 146, 425, 71);
		frame.getContentPane().add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("Delete Receptionist");
		b2.setFont(new Font("Tahoma", Font.ITALIC, 40));
		b2.setBounds(453, 244, 425, 73);
		frame.getContentPane().add(b2);
		b2.addActionListener(this);
		
		b3 = new JButton("Update Receptionist");
		b3.setFont(new Font("Tahoma", Font.ITALIC, 40));
		b3.setBounds(453, 346, 425, 71);
		frame.getContentPane().add(b3);
		b3.addActionListener(this);
		
		b4 = new JButton("Search Receptionist");
		b4.setFont(new Font("Tahoma", Font.ITALIC, 40));
		b4.setBounds(453, 454, 425, 71);
		frame.getContentPane().add(b4);
		b4.addActionListener(this);
		
		b5 = new JButton("View Receptionist");
		b5.setFont(new Font("Tahoma", Font.ITALIC, 40));
		b5.setBounds(453, 558, 425, 71);
		frame.getContentPane().add(b5);
		b5.addActionListener(this);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.text);
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 1364, 120);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel l1 = new JLabel("Receptionist Details");
		l1.setBounds(417, 11, 578, 78);
		l1.setFont(new Font("Tahoma", Font.BOLD, 55));
		l1.setForeground(SystemColor.text);
		panel.add(l1);
		
		b6 = new JButton("Back");
		b6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b6.setBounds(1151, 639, 120, 45);
		frame.getContentPane().add(b6);
		b6.addActionListener(this);
			}
	public static void main(String[] args) {
		rescpedetail window = new rescpedetail();
		window.frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1){
			frame.dispose();
			new addreceptionist();
		}
		if(e.getSource()==b2){
			frame.dispose();
			new deleterescp();
		}
		if(e.getSource()==b3){
			frame.dispose();
			new updaterescp();
		}
		if(e.getSource()==b4){
			frame.dispose();
			new searchrescp();
		}
		if(e.getSource()==b5){
			frame.dispose();
			new jtablerescp();
		}
		if(e.getSource()==b6){
			frame.dispose();
			new adminportal();
		}
	}
}
