package hms;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import java.awt.Color;

public class updatepatient implements ActionListener{
	char a[];
	private JFrame frame;
	private JTextField tid,tfname,tsname,tage,taddress,tcity,tph,twardno,tbedno;
	private JLabel ladd,lid,lfname,lsname,lage,lgender,lmstatus,ldob,laddress,lcity,lph,l10,l11,lwardno,lbedno,lptype;
	private JButton blogout,back,search,bupdate;
	private JRadioButton r1,r2;
	private JComboBox cb1,cb2,day,month,year;
	ButtonGroup gen=new ButtonGroup();
	
	public updatepatient() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		//frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1366, 730);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 101, 1360, 2);
		frame.getContentPane().add(separator);
		
		ladd = new JLabel("Update Patient Details");
		ladd.setForeground(SystemColor.textHighlight);
		Font f=new Font("Microsoft Himalaya", Font.BOLD, 61);
		ladd.setFont(f);
		ladd.setBounds(38, 24, 527, 79);
		frame.getContentPane().add(ladd);
		
		blogout = new JButton("Logout");
		blogout.setBackground(SystemColor.textHighlight);
		blogout.setForeground(SystemColor.text);
		blogout.setFont(new Font("Tahoma", Font.BOLD, 20));
		blogout.setBounds(1208, 24, 106, 40);
		frame.getContentPane().add(blogout);
		blogout.addActionListener(this);
		
		back=new JButton("Back");
		back.setBackground(SystemColor.textHighlight);
		back.setForeground(SystemColor.text);
		back.setFont(new Font("Tahoma", Font.BOLD, 20));
		back.setBounds(1108, 24, 99, 40);
		frame.getContentPane().add(back);
		back.addActionListener(this);
		
		search = new JButton("SEARCH");
		search.setBackground(SystemColor.textHighlight);
		search.setForeground(Color.WHITE);
		search.setFont(new Font("Tahoma", Font.BOLD, 16));
		search.setBounds(1108, 140, 106, 40);
		search.addActionListener(this);
		frame.getContentPane().add(search);
		
		
		lid = new JLabel("Patient ID");
		lid.setForeground(SystemColor.textHighlight);
		lid.setFont(new Font("Dialog", Font.BOLD, 20));
		lid.setBounds(180, 113, 157, 26);
		frame.getContentPane().add(lid);
		
		tid = new JTextField();
		tid.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tid.setBounds(347, 114, 158, 32);
		frame.getContentPane().add(tid);
		tid.setColumns(10);
		
		lfname = new JLabel("First name");
		lfname.setForeground(SystemColor.textHighlight);
		lfname.setFont(new Font("Dialog", Font.BOLD, 20));
		lfname.setBounds(180, 151, 158, 40);
		frame.getContentPane().add(lfname);
		
		tfname = new JTextField();
		tfname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tfname.setBounds(347, 158, 158, 34);
		frame.getContentPane().add(tfname);
		tfname.setColumns(10);
		
		lsname = new JLabel("Second Name");
		lsname.setForeground(SystemColor.textHighlight);
		lsname.setFont(new Font("Dialog", Font.BOLD, 20));
		lsname.setBounds(602, 151, 174, 40);
		frame.getContentPane().add(lsname);
		
		tsname = new JTextField();
		tsname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tsname.setBounds(786, 158, 206, 34);
		frame.getContentPane().add(tsname);
		tsname.setColumns(10);
		
		lage = new JLabel("Age");
		lage.setForeground(SystemColor.textHighlight);
		lage.setFont(new Font("Dialog", Font.BOLD, 20));
		lage.setBounds(183, 213, 155, 31);
		frame.getContentPane().add(lage);
		
		tage = new JTextField();
		tage.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tage.setBounds(347, 217, 117, 31);
		frame.getContentPane().add(tage);
		tage.setColumns(10);
		
		lgender = new JLabel("Gender");
		lgender.setForeground(SystemColor.textHighlight);
		lgender.setFont(new Font("Dialog", Font.BOLD, 20));
		lgender.setBounds(612, 212, 117, 32);
		frame.getContentPane().add(lgender);
		
		r1 = new JRadioButton("Male");
		r1.setForeground(SystemColor.textHighlight);
		r1.setFont(new Font("Tahoma", Font.BOLD, 17));
		r1.setBackground(SystemColor.inactiveCaptionBorder);
		r1.setBounds(787, 218, 76, 23);
		frame.getContentPane().add(r1);
		
		r2 = new JRadioButton("Female");
		r2.setForeground(SystemColor.textHighlight);
		r2.setFont(new Font("Tahoma", Font.BOLD, 17));
		r2.setBackground(SystemColor.inactiveCaptionBorder);
		r2.setBounds(875, 218, 92, 23);
		frame.getContentPane().add(r2);
		
		gen.add(r1);
		gen.add(r2);
		
		lmstatus = new JLabel("Maritial Status");
		lmstatus.setForeground(SystemColor.textHighlight);
		lmstatus.setFont(new Font("Dialog", Font.BOLD, 20));
		lmstatus.setBounds(180, 264, 158, 32);
		frame.getContentPane().add(lmstatus);
		
		ldob = new JLabel("DOB");
		ldob.setForeground(SystemColor.textHighlight);
		ldob.setFont(new Font("Dialog", Font.BOLD, 20));
		ldob.setBounds(622, 255, 78, 36);
		frame.getContentPane().add(ldob);
		
		
		laddress = new JLabel("Address");
		laddress.setForeground(SystemColor.textHighlight);
		laddress.setFont(new Font("Dialog", Font.BOLD, 20));
		laddress.setBounds(180, 321, 182, 40);
		frame.getContentPane().add(laddress);
		
		taddress = new JTextField();
		taddress.setFont(new Font("Times New Roman", Font.BOLD, 15));
		taddress.setBounds(347, 324, 494, 43);
		frame.getContentPane().add(taddress);
		taddress.setColumns(10);
		
		lcity = new JLabel("City");
		lcity.setForeground(SystemColor.textHighlight);
		lcity.setFont(new Font("Dialog", Font.BOLD, 20));
		lcity.setBounds(186, 396, 66, 26);
		frame.getContentPane().add(lcity);
		
		tcity = new JTextField();
		tcity.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tcity.setBounds(347, 393, 199, 40);
		frame.getContentPane().add(tcity);
		tcity.setColumns(10);
		
		lph = new JLabel("Phone.NO");
		lph.setForeground(SystemColor.textHighlight);
		lph.setFont(new Font("Dialog", Font.BOLD, 20));
		lph.setBounds(631, 393, 145, 40);
		frame.getContentPane().add(lph);
		
		tph = new JTextField();
		tph.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tph.setBounds(786, 393, 206, 40);
		frame.getContentPane().add(tph);
		tph.setColumns(15);
		
		l11 = new JLabel("(For indor patient only)");
		l11.setForeground(SystemColor.textHighlight);
		l11.setFont(new Font("Dialog", Font.BOLD, 20));
		l11.setBounds(182, 532, 300, 40);
		frame.getContentPane().add(l11);
		
		lwardno = new JLabel("Ward No");
		lwardno.setForeground(SystemColor.textHighlight);
		lwardno.setFont(new Font("Dialog", Font.BOLD, 20));
		lwardno.setBounds(180, 633, 134, 32);
		frame.getContentPane().add(lwardno);
		
		twardno = new JTextField();
		twardno.setFont(new Font("Times New Roman", Font.BOLD, 15));
		twardno.setBounds(347, 637, 119, 32);
		frame.getContentPane().add(twardno);
		twardno.setColumns(10);
		
		lbedno = new JLabel("Bed No");
		lbedno.setForeground(SystemColor.textHighlight);
		lbedno.setFont(new Font("Dialog", Font.BOLD, 20));
		lbedno.setBounds(631, 637, 132, 32);
		frame.getContentPane().add(lbedno);
		
		tbedno = new JTextField();
		tbedno.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tbedno.setBounds(786, 637, 117, 32);
		frame.getContentPane().add(tbedno);
		tbedno.setColumns(10);
		
		lptype = new JLabel("Patient Type");
		lptype.setForeground(SystemColor.textHighlight);
		lptype.setFont(new Font("Dialog", Font.BOLD, 20));
		lptype.setBounds(183, 466, 145, 66);
		frame.getContentPane().add(lptype);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 590, 1350, 2);
		frame.getContentPane().add(separator_1);

		String Select[]={"Select","Single","married"};
		cb1 = new JComboBox(Select);
		cb1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cb1.setBounds(347, 259, 158, 32);
		frame.getContentPane().add(cb1);	
		
		String select[]={"Select","Indoor","Outdoor"};
		cb2 = new JComboBox(select);
		cb2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cb2.setBounds(347, 483, 157, 32);
		frame.getContentPane().add(cb2);
		
		String[] daylist=new String[31];
		for(int i=1;i<=31;i++)
		{
			daylist[i-1]=Integer.toString(i);
		}
		day = new JComboBox(daylist);
		day.setBounds(789, 264, 55, 25);
		day.setEditable(false);
		frame.getContentPane().add(day);
		
		String[] monthlist={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		month = new JComboBox(monthlist);
		month.setBounds(856, 265, 55, 25);
		month.setEditable(false);
		frame.getContentPane().add(month);	
		
		String[] yearlist=new String[100];
		for(int i=1951;i<=2050;i++)
		{
			yearlist[i-1951]=Integer.toString(i);
		}
		year = new JComboBox(yearlist);
		year.setBounds(922, 265, 55, 25);
		year.setEditable(false);
		frame.getContentPane().add(year);
		
		bupdate = new JButton("Update");
		bupdate.setForeground(SystemColor.text);
		bupdate.setBackground(SystemColor.textHighlight);
		bupdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		bupdate.setBounds(1225, 140, 115, 40);
		frame.getContentPane().add(bupdate);
		bupdate.addActionListener(this);
	}
	public static void main(String[] args) {
		updatepatient window = new updatepatient();
		window.frame.setVisible(true);
		
	}
	@Override
		public void actionPerformed(ActionEvent e) {
		//for back button
				if(e.getSource()==back){
					frame.dispose();
					new patientdetail();
					}
					
				//dialog message for logout button
				if(e.getSource()==blogout){
					int YesorNo=JOptionPane.showConfirmDialog(null, "Do you really want to log out","logout", JOptionPane.YES_NO_OPTION);
					if(YesorNo==0)
					{
					frame.dispose();
					new frontpag();
					}
				}

			if(e.getSource()==search)
			{
				String a1=tid.getText();
				try {
					Connection cn=Dao.mycon();
					int b1=Integer.parseInt(a1);
					PreparedStatement st=cn.prepareStatement(a1);
					ResultSet rs=st.executeQuery("select * from addpatient where pid="+b1+"");
					while(rs.next())
					{
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
										
					tid.setText(i1);
					tfname.setText(i2);
					tsname.setText(i3);
					tage.setText(i4);
					if(i6.equals("Single"))
					{
						cb1.setSelectedIndex(1);
						
					}
					if(i6.equals("Married"))
					{
						cb1.setSelectedIndex(2);
					}
					
					if(i5.equals("male"))
					{
						r1.setSelected(true);
						r2.setSelected(false);
					}
					if(i5.equals("female"))
					{
						r2.setSelected(true);
						r1.setSelected(false);
					}
				char a[]=i7.toCharArray();
				char s1=a[0];
				char s2=a[1];
	
					String s3=s1+""+s2;
					day.setSelectedItem(s3);
					
					char s4=a[3];
					char s5=a[4];
					char s6=a[5];
					String s7=s4+""+s5+""+s6;
					month.setSelectedItem(s7);
					
					char s8=a[7];
					char s9=a[8];
					char s10=a[9];
					char s11=a[10];
					String s12=s8+""+s9+""+s10+""+s11;
					year.setSelectedItem(s12);
					
					taddress.setText(i8);
					tcity.setText(i9);
					tph.setText(i10);
					
					if(i11.equals("Indoor"))
					{
						cb2.setSelectedIndex(1);
						
					}
					if(i11.equals("Outdoor"))
					{
						cb2.setSelectedIndex(2);
						
					}
					twardno.setText(i12);
					tbedno.setText(i13);
					
				}
			}
				catch (SQLException e1)
				{
					e1.printStackTrace();
				}
				
			}
			if(e.getSource()==bupdate)
			{
				
				int YesorNo=JOptionPane.showConfirmDialog(null, "Do you really want to update data","update", JOptionPane.YES_NO_OPTION);	
			if(YesorNo==0)
			{
				try {
					String id=tid.getText();
					String fname=tfname.getText();
					String sname=tsname.getText();
					String age=tage.getText();
					String address=taddress.getText();
					String city=tcity.getText();
					String phno=tph.getText();
					String wrdno=twardno.getText();
					String bdno=tbedno.getText();
				//String genn=gen.setSelected(r1, r2);
				long phnoo=Long.parseLong(phno);
				String gen="male";
					if(r2.isSelected())
					{
						gen="female";
					}
					String datedob;
					datedob =(day.getSelectedItem() + "-" + month.getSelectedItem() + "-" + year.getSelectedItem());
					
					String mstatus=(String) cb1.getSelectedItem();
					String ptype=(String) cb2.getSelectedItem();
				
					Connection cn=Dao.mycon();
					PreparedStatement ps=cn.prepareStatement("update addpatient set pid=(?),Fname=(?),Sname=(?),Age=(?),Gender=(?),Mstatus=(?),dob=(?),address=(?),city=(?),phno=(?),ptype=(?),wrdno=(?),bdno=(?)");
					ps.setString(1,id);
					ps.setString(2,fname);
					ps.setString(3,sname);
					ps.setString(4,age);
					ps.setString(5,gen);
					ps.setString(6,mstatus);
					ps.setString(7,datedob);
					ps.setString(8,address);
					ps.setString(9,city);
					ps.setLong(10,phnoo);
					ps.setString(11,ptype);
					ps.setString(12,wrdno);
					ps.setString(13,bdno);
					ps.executeUpdate();
					}
				catch(Exception e1){
					System.out.println(e1);
					}
				frame.dispose();
				new frontpag();
				}
			else{
				JOptionPane.showMessageDialog(bupdate, "Somthing went wrong");
				
				}
			}
		}
}