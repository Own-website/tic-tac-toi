package tictac;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;
public class Game extends JFrame
{
	private JPanel contentPane;
	JButton btn1 = new JButton("");
	JButton btn2 = new JButton("");
	JButton btn3 = new JButton("");
	JButton btn4 = new JButton("");
	JButton btn5 = new JButton("");
	JButton btn6 = new JButton("");
	JButton btn7 = new JButton("");
	JButton btn8 = new JButton("");
	JButton btn9 = new JButton("");
	private final JButton btnReset = new JButton("Reset");
	private final JLabel mainl1 = new JLabel("Tic Tac Toe");

	private int NumberOfClicked()
	{
		int numberOfClicked = 0;
		
		if (!btn1.isEnabled())
			numberOfClicked ++;
		if (!btn2.isEnabled())
			numberOfClicked ++;
		if (!btn3.isEnabled())
			numberOfClicked ++;
		if (!btn4.isEnabled())
			numberOfClicked ++;
		if (!btn5.isEnabled())
			numberOfClicked ++;
		if (!btn6.isEnabled())
			numberOfClicked ++;
		if (!btn7.isEnabled())
			numberOfClicked ++;
		if (!btn8.isEnabled())
			numberOfClicked ++;
		if (!btn9.isEnabled())
			numberOfClicked ++;		
		return numberOfClicked;
	}
	private boolean checkWinner(String player)
	{
		boolean win=false;;
		
		if (FirstRow(player) == 3 || secondRow(player) == 3 || thirdRow(player) == 3) 
			win = true;	
		else if (firstColumn(player) == 3 || secondColumn(player) == 3 || thirdColumn(player) == 3)
			win = true;
		else if (firstDiagonal(player) == 3 || secondDiagonal(player) == 3)
			win = true;
		return win;
	}
	private int FirstRow(String player)
	{
		int count = 0;
		
		if (btn1.getText().equals(player))		
			count ++;
		
		if (btn2.getText().equals(player))
			count ++;
		
		if (btn3.getText().equals(player))
			count ++;
		
		if (count == 3)
		{
			btn1.setBackground(Color.GREEN);
			btn2.setBackground(Color.GREEN);
			btn3.setBackground(Color.GREEN);
		}
		return count;
	}
	private int secondRow(String player)
	{
		int count = 0;
		
		if (btn4.getText().equals(player))		
			count ++;
		
		if (btn5.getText().equals(player))
			count ++;
		
		if (btn6.getText().equals(player))
			count ++;
		
		if (count == 3)
		{
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
		}
		return count;
	}
	private int thirdRow(String player)
	{
		int count = 0;
		
		if (btn7.getText().equals(player))		
			count ++;
		
		if (btn8.getText().equals(player))
			count ++;
		
		if (btn9.getText().equals(player))
			count ++;	
		if (count == 3)
		{
			btn7.setBackground(Color.GREEN);
			btn8.setBackground(Color.GREEN);
			btn9.setBackground(Color.GREEN);
		}
		return count;
	}
	private int firstColumn(String player)
	{
		int count = 0;
		if (btn1.getText().equals(player))
			count ++;
		if (btn4.getText().equals(player))
			count ++;
		if (btn7.getText().equals(player))
			count ++;
		if (count == 3)
		{
			btn1.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn7.setBackground(Color.GREEN);
		}
		return count;
	}
	private int secondColumn(String player)
	{
		int count = 0;
		if (btn2.getText().equals(player))
			count ++;
		if (btn5.getText().equals(player))
			count ++;
		if (btn8.getText().equals(player))
			count ++;
		if (count == 3)
		{
			btn2.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn8.setBackground(Color.GREEN);
		}
		return count;
	}
	private int thirdColumn(String player)
	{
		int count = 0;
		if (btn3.getText().equals(player))
			count ++;
		if (btn6.getText().equals(player))
			count ++;
		if (btn9.getText().equals(player))
			count ++;
		if (count == 3)
		{
			btn3.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			btn9.setBackground(Color.GREEN);
		}
		return count;
	}	
	private int firstDiagonal(String player)
	{
		int count = 0;
		if (btn1.getText().equals(player))
			count ++;
		if (btn5.getText().equals(player))
			count ++;
		if (btn9.getText().equals(player))
			count ++;
		if (count == 3)
		{
			btn1.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn9.setBackground(Color.GREEN);
		}
		return count;
	}
	private int secondDiagonal(String player)
	{
		int count = 0;
		if (btn3.getText().equals(player))
			count ++;
		if (btn5.getText().equals(player))
			count ++;
		if (btn7.getText().equals(player))
			count ++;
		if (count == 3)
		{
			btn3.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn7.setBackground(Color.GREEN);
		}
		return count;
	}
	private void Reset()
	{
		btn1.setText("");
		btn2.setText("");
		btn3.setText("");
		btn4.setText("");
		btn5.setText("");
		btn6.setText("");
		btn7.setText("");
		btn8.setText("");
		btn9.setText("");
		
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		
		btn1.setBackground(Color.white);
		btn2.setBackground(Color.white);
		btn3.setBackground(Color.white);
		btn4.setBackground(Color.white);
		btn5.setBackground(Color.white);
		btn6.setBackground(Color.white);
		btn7.setBackground(Color.white);
		btn8.setBackground(Color.white);
		btn9.setBackground(Color.white);
	}
	
	public static void main(String[] args)
	{
		Game frame = new Game();
		frame.setVisible(true);
	}
	public Game()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(2, 2, 1317, 704);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(SystemColor.activeCaption);
		btn1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btn1.setForeground(Color.BLACK);
		btn1.setBackground(SystemColor.menu);
		btn2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btn2.setBackground(SystemColor.menu);
		btn3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btn3.setBackground(SystemColor.menu);
		btn4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btn4.setBackground(SystemColor.menu);
		btn5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btn5.setBackground(SystemColor.menu);
		btn6.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btn6.setBackground(SystemColor.menu);
		btn7.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btn7.setBackground(SystemColor.menu);
		btn8.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btn8.setBackground(SystemColor.menu);
		btn9.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btn9.setBackground(SystemColor.menu);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (NumberOfClicked() == 1 || NumberOfClicked() == 3 || NumberOfClicked() == 5 || NumberOfClicked() == 7 || NumberOfClicked() == 9)					
					btn1.setText("O");
				else
					btn1.setText("X");
				
				if (checkWinner(btn1.getText()))
					JOptionPane.showMessageDialog(null, btn1.getText() +  " Winner");
				btn1.setEnabled(false);
			}
		});
		btn1.setBounds(464, 238, 99, 46);
		contentPane.add(btn1);
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (NumberOfClicked() == 1 || NumberOfClicked() == 3 || NumberOfClicked() == 5 || NumberOfClicked() == 7 || NumberOfClicked() == 9)					
					btn2.setText("O");
				else
					btn2.setText("X");
				if (checkWinner(btn2.getText()))
					JOptionPane.showMessageDialog(null, btn2.getText() +  " Winner");
				btn2.setEnabled(false);
			}
		});
		btn2.setBounds(615, 238, 89, 46);
		contentPane.add(btn2);
		
		btn3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) {
				if (NumberOfClicked() == 1 || NumberOfClicked() == 3 || NumberOfClicked() == 5 || NumberOfClicked() == 7 || NumberOfClicked() == 9)					
					btn3.setText("O");
				else
					btn3.setText("X");
				if (checkWinner(btn3.getText()))
					JOptionPane.showMessageDialog(null, btn3.getText() +  " Winner");
				btn3.setEnabled(false);
			}
		});
		btn3.setBounds(767, 238, 89, 46);
		contentPane.add(btn3);
		
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (NumberOfClicked() == 1 || NumberOfClicked() == 3 || NumberOfClicked() == 5 || NumberOfClicked() == 7 || NumberOfClicked() == 9)					
					btn4.setText("O");
				else
					btn4.setText("X");
				
				if (checkWinner(btn4.getText()))
					JOptionPane.showMessageDialog(null, btn4.getText() +  " Winner");
				btn4.setEnabled(false);
			}
		});
		btn4.setBounds(464, 314, 99, 46);
		contentPane.add(btn4);
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (NumberOfClicked() == 1 || NumberOfClicked() == 3 || NumberOfClicked() == 5 || NumberOfClicked() == 7 || NumberOfClicked() == 9)					
					btn5.setText("O");
				else
					btn5.setText("X");
				if (checkWinner(btn5.getText()))
					JOptionPane.showMessageDialog(null, btn5.getText() +  " Winner");
				btn5.setEnabled(false);
			}
		});
		btn5.setBounds(615, 314, 89, 46);
		contentPane.add(btn5);
		
				
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (NumberOfClicked() == 1 || NumberOfClicked() == 3 || NumberOfClicked() == 5 || NumberOfClicked() == 7 || NumberOfClicked() == 9)					
					btn6.setText("O");
				else
					btn6.setText("X");
				if (checkWinner(btn6.getText()))
					JOptionPane.showMessageDialog(null, btn6.getText() +  " Winner");
				btn6.setEnabled(false);
			}
		});
		btn6.setBounds(767, 315, 89, 45);
		contentPane.add(btn6);
		
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (NumberOfClicked() == 1 || NumberOfClicked() == 3 || NumberOfClicked() == 5 || NumberOfClicked() == 7 || NumberOfClicked() == 9)					
					btn7.setText("O");
				else
					btn7.setText("X");
				if (checkWinner(btn7.getText()))
					JOptionPane.showMessageDialog(null, btn7.getText() +  " Winner");
				btn7.setEnabled(false);
			}
		});
		btn7.setBounds(464, 384, 99, 46);
		contentPane.add(btn7);
		
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (NumberOfClicked() == 1 || NumberOfClicked() == 3 || NumberOfClicked() == 5 || NumberOfClicked() == 7 || NumberOfClicked() == 9)					
					btn8.setText("O");
				else
					btn8.setText("X");
				if (checkWinner(btn8.getText()))
					JOptionPane.showMessageDialog(null, btn8.getText() +  " Winner");
				btn8.setEnabled(false);
			}
		});
		btn8.setBounds(615, 384, 89, 46);
		contentPane.add(btn8);
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (NumberOfClicked() == 1 || NumberOfClicked() == 3 || NumberOfClicked() == 5 || NumberOfClicked() == 7 || NumberOfClicked() == 9)					
					btn9.setText("O");
				else
					btn9.setText("X");
				if (checkWinner(btn9.getText()))
					JOptionPane.showMessageDialog(null, btn9.getText() +  " Winner");
				btn9.setEnabled(false);
			}
		});
		btn9.setBounds(767, 384, 89, 46);
		contentPane.add(btn9);
		btnReset.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnReset.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{		
				Reset();
			}
		});
		btnReset.setBounds(543, 501, 217, 46);
		contentPane.add(btnReset);	
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(30, 11, 1230, 112);
		contentPane.add(panel);
		panel.setLayout(null);
		mainl1.setForeground(new Color(0, 0, 0));
		mainl1.setBackground(SystemColor.textText);
		mainl1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		mainl1.setBounds(517, 22, 360, 79);
		
		panel.add(mainl1);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(1128, 585, 106, 46);
		contentPane.add(btnNewButton);
	}
}