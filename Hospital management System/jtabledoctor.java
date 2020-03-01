package hms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class jtabledoctor {

	private JFrame frame;
	private JTable table;
	public jtabledoctor() {
		frame = new JFrame();
		frame.setSize(1366, 730);
	    //frame.setBounds(100, 100, 806, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(22, 62, 1318, 565);
		frame.getContentPane().add(scrollPane);
		

		JLabel l1 = new JLabel("Doctor Details");
		l1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		l1.setBounds(34, 11, 353, 53);
		frame.getContentPane().add(l1);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				frame.dispose();
				new drdetail();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(1190, 638, 134, 42);
		frame.getContentPane().add(btnBack);
	
		
		try
    	{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
    PreparedStatement ps=con.prepareStatement("select * from doctor");
    ResultSet rs=ps.executeQuery();
	table.setModel(DbUtils.resultSetToTableModel(rs));
	}
		catch(Exception e){
		System.out.println(e);
		}

	}
	public static void main(String[] args) 
	{
		jtabledoctor window = new jtabledoctor();
		window.frame.setVisible(true);
	}
	
}
