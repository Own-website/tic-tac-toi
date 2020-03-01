package hms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class searchrescp implements ActionListener {

	private JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	private JTextField tid,tfname,tsname,tage,taddress,tcity,tph,tjdate, tldate,tuname,tqualification;
	private JPasswordField tupassword;
	JButton bsearch,back,blogout;
	JRadioButton r1,r2;
	JComboBox cb1;
	ButtonGroup gen=new ButtonGroup();
	
public searchrescp() 
	{
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		//frame.setBounds(100, 100, 450, 300);
		frame.setSize(1366, 730);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		l1 = new JLabel("Search Resceptionist");
		l1.setForeground(SystemColor.textHighlight);
		l1.setBackground(SystemColor.text);
		l1.setFont(new Font("Tahoma", Font.BOLD, 30));
		l1.setBounds(82, 0, 338, 85);
		frame.getContentPane().add(l1);
		
		back = new JButton("Back");
		back.setBackground(SystemColor.textHighlight);
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Tahoma", Font.BOLD, 17));
		back.setBounds(1138, 33, 89, 35);
		frame.getContentPane().add(back);
		back.addActionListener(this);
		
		blogout = new JButton("Logout");
		blogout.setBackground(SystemColor.textHighlight);
		blogout.setForeground(SystemColor.text);
		blogout.setFont(new Font("Tahoma", Font.BOLD, 17));
		blogout.setBounds(1229, 33, 111, 35);
		frame.getContentPane().add(blogout);
		blogout.addActionListener(this);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 86, 1350, 2);
		frame.getContentPane().add(separator);
		
		l2 = new JLabel("Resceptionist ID");
		l2.setForeground(SystemColor.textHighlight);
		l2.setFont(new Font("Tahoma", Font.BOLD, 22));
		l2.setBounds(39, 96, 184, 40);
		frame.getContentPane().add(l2);
		
		tid = new JTextField();
		tid.setFont(new Font("Dialog", Font.BOLD, 15));
		tid.setBounds(249, 96, 187, 40);
		frame.getContentPane().add(tid);
		tid.setColumns(10);
		
		l3 = new JLabel("First Name");
		l3.setForeground(SystemColor.textHighlight);
		l3.setFont(new Font("Tahoma", Font.BOLD, 20));
		l3.setBounds(65, 162, 138, 25);
		frame.getContentPane().add(l3);
		
		tfname = new JTextField();
		tfname.setFont(new Font("Dialog", Font.BOLD, 15));
		tfname.setBounds(235, 159, 148, 28);
		frame.getContentPane().add(tfname);
		tfname.setColumns(10);
		
		l4 = new JLabel("Second name");
		l4.setForeground(SystemColor.textHighlight);
		l4.setFont(new Font("Tahoma", Font.BOLD, 20));
		l4.setBounds(503, 154, 166, 41);
		frame.getContentPane().add(l4);
		
		tsname = new JTextField();
		tsname.setFont(new Font("Dialog", Font.BOLD, 15));
		tsname.setBounds(703, 159, 166, 28);
		frame.getContentPane().add(tsname);
		tsname.setColumns(10);
		
		l5 = new JLabel("Age");
		l5.setForeground(SystemColor.textHighlight);
		l5.setFont(new Font("Tahoma", Font.BOLD, 20));
		l5.setBounds(65, 216, 108, 30);
		frame.getContentPane().add(l5);
		
		tage = new JTextField();
		tage.setFont(new Font("Dialog", Font.BOLD, 15));
		tage.setBounds(233, 216, 150, 28);
		frame.getContentPane().add(tage);
		tage.setColumns(10);
		
		l6 = new JLabel("Qualification");
		l6.setForeground(SystemColor.textHighlight);
		l6.setFont(new Font("Tahoma", Font.BOLD, 20));
		l6.setBounds(503, 214, 166, 44);
		frame.getContentPane().add(l6);
		
		l7 = new JLabel("Gender");
		l7.setForeground(SystemColor.textHighlight);
		l7.setFont(new Font("Tahoma", Font.BOLD, 20));
		l7.setBounds(65, 273, 138, 28);
		frame.getContentPane().add(l7);
		
		r1 = new JRadioButton("Male");
		r1.setForeground(SystemColor.textHighlight);
		r1.setFont(new Font("Tahoma", Font.BOLD, 17));
		r1.setBackground(SystemColor.inactiveCaptionBorder);
		r1.setBounds(220, 269, 76, 23);
		frame.getContentPane().add(r1);
		
		r2 = new JRadioButton("Female");
		r2.setForeground(SystemColor.textHighlight);
		r2.setFont(new Font("Tahoma", Font.BOLD, 17));
		r2.setBackground(SystemColor.inactiveCaptionBorder);
		r2.setBounds(310, 270, 92, 23);
		frame.getContentPane().add(r2);
		
		gen.add(r1);
		gen.add(r2);
		
		l8 = new JLabel("Address");
		l8.setForeground(SystemColor.textHighlight);
		l8.setFont(new Font("Tahoma", Font.BOLD, 20));
		l8.setBounds(65, 330, 118, 28);
		frame.getContentPane().add(l8);
		
		taddress = new JTextField();
		taddress.setFont(new Font("Dialog", Font.BOLD, 15));
		taddress.setBounds(233, 327, 645, 31);
		frame.getContentPane().add(taddress);
		taddress.setColumns(10);
		
		l9 = new JLabel("City");
		l9.setForeground(SystemColor.textHighlight);
		l9.setFont(new Font("Tahoma", Font.BOLD, 20));
		l9.setBounds(65, 391, 118, 35);
		frame.getContentPane().add(l9);
		
		tcity = new JTextField();
		tcity.setFont(new Font("Dialog", Font.BOLD, 15));
		tcity.setBounds(233, 391, 187, 35);
		frame.getContentPane().add(tcity);
		tcity.setColumns(10);
		
		l10 = new JLabel("Phone No");
		l10.setForeground(SystemColor.textHighlight);
		l10.setFont(new Font("Tahoma", Font.BOLD, 20));
		l10.setBounds(503, 391, 148, 35);
		frame.getContentPane().add(l10);
		
		tph = new JTextField();
		tph.setFont(new Font("Dialog", Font.BOLD, 15));
		tph.setBounds(703, 388, 166, 35);
		frame.getContentPane().add(tph);
		tph.setColumns(10);
		
		l11 = new JLabel("Maritial Status");
		l11.setForeground(SystemColor.textHighlight);
		l11.setFont(new Font("Tahoma", Font.BOLD, 20));
		l11.setBounds(65, 488, 158, 35);
		frame.getContentPane().add(l11);

		String select[]={"select","Single","Married"};
		cb1 = new JComboBox(select);
		cb1.setFont(new Font("Tahoma", Font.BOLD, 15));
		cb1.setBounds(272, 495, 145, 28);
		frame.getContentPane().add(cb1);
		
		l12 = new JLabel("Joining Date");
		l12.setForeground(SystemColor.textHighlight);
		l12.setFont(new Font("Tahoma", Font.BOLD, 20));
		l12.setBounds(65, 588, 158, 41);
		frame.getContentPane().add(l12);
		
		tjdate = new JTextField();
		tjdate.setFont(new Font("Dialog", Font.BOLD, 15));
		tjdate.setBounds(233, 595, 187, 35);
		frame.getContentPane().add(tjdate);
		tjdate.setColumns(10);
		
		l13 = new JLabel("Leaving Date");
		l13.setForeground(SystemColor.textHighlight);
		l13.setFont(new Font("Tahoma", Font.BOLD, 20));
		l13.setBounds(496, 588, 155, 42);
		frame.getContentPane().add(l13);
		
		tldate = new JTextField();
		tldate.setFont(new Font("Dialog", Font.BOLD, 15));
		tldate.setBounds(703, 595, 166, 35);
		frame.getContentPane().add(tldate);
		tldate.setColumns(10);
		
		l14 = new JLabel("User Name");
		l14.setForeground(SystemColor.textHighlight);
		l14.setFont(new Font("Tahoma", Font.BOLD, 20));
		l14.setBounds(954, 529, 148, 39);
		frame.getContentPane().add(l14);
		
		tuname = new JTextField();
		tuname.setFont(new Font("Dialog", Font.BOLD, 15));
		tuname.setBounds(1138, 533, 180, 35);
		frame.getContentPane().add(tuname);
		tuname.setColumns(10);
		
		l15 = new JLabel("Password");
		l15.setForeground(SystemColor.textHighlight);
		l15.setFont(new Font("Tahoma", Font.BOLD, 20));
		l15.setBounds(954, 592, 127, 33);
		frame.getContentPane().add(l15);
		
		tqualification = new JTextField();
		tqualification.setFont(new Font("Dialog", Font.BOLD, 15));
		tqualification.setBounds(705, 216, 193, 30);
		frame.getContentPane().add(tqualification);
		tqualification.setColumns(10);
		
		bsearch = new JButton("SEARCH");
		bsearch.setForeground(SystemColor.textHighlight);
		bsearch.setFont(new Font("Tahoma", Font.BOLD, 20));
		bsearch.setBounds(1152, 113, 148, 40);
		frame.getContentPane().add(bsearch);
		bsearch.addActionListener(this);
		
		tupassword = new JPasswordField();
		tupassword.setFont(new Font("Dialog", Font.BOLD, 15));
		tupassword.setBounds(1138, 588, 180, 35);
		frame.getContentPane().add(tupassword);
		
		}
	public static void main(String[] args) {
		searchrescp window = new searchrescp();
		window.frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==back){
			frame.dispose();
			new rescpedetail();
			}
			
			if(e.getSource()==blogout){
				int YesorNo=JOptionPane.showConfirmDialog(null, "Do you really want to log out","logout", JOptionPane.YES_NO_OPTION);
				if(YesorNo==0)
				{
				frame.dispose();
				new frontpag();
				}
			}
			
		if(e.getSource()==bsearch)
		{
		String a1=tid.getText();
		int count=0;
		try{
			Connection cn=Dao.mycon();
			int b1=Integer.parseInt(a1);
			PreparedStatement st=cn.prepareStatement("select * from rescption where id="+b1+"");
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				//get the data from the database and set to with index number
				
			String i1=rs.getString(1);
			String i2=rs.getString(2);
			String i3=rs.getString(3);
			String i4=rs.getString(4);
			String i5=rs.getString(5);
			String i6=rs.getString(6);
			String i7=rs.getString(7);
			String i8=rs.getString(8);
			String i9=rs.getString(9);
			String i10=rs.getString(10);
			String i11=rs.getString(11);
			String i12=rs.getString(12);
			String i13=rs.getString(13);
			String i14=rs.getString(14);
			
			//show the text into text field
			tid.setText(i1);
			tfname.setText(i2);
			tsname.setText(i3);
			tage.setText(i4);
			tqualification.setText(i5);
			//for gender
			if(i6.equals("male")){
				r1.setSelected(true);
				r2.setSelected(false);
			}
			if(i6.equals("female")){
				r1.setSelected(false);
				r2.setSelected(true);
			}
			taddress.setText(i7);
			tcity.setText(i8);
			tph.setText(i9);
			//for combobox
			if(i10.equals("Single"))
			{
				cb1.setSelectedIndex(1);
			}
			if(i10.equals("Married"))
			{
				cb1.setSelectedIndex(2);
			}
			tjdate.setText(i11);
			tldate.setText(i12);
			tuname.setText(i13);
			tupassword.setText(i14);
			
			count=count+1;
			
			}
			if(count==1)
			{
				JOptionPane.showMessageDialog(null, "Search successful");
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "This ID is not available");
			}
		}
		catch(Exception e1){
			System.out.println(e1);
		}
			
		}
	}
}
