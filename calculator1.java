package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator1 {

	private JFrame frame;
	double a,b,result;
	String operation, ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator1 window = new calculator1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(100, 100, 437, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextField textField = new TextField();
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Dialog", Font.BOLD, 18));
		textField.setBounds(23, 34, 392, 64);
		frame.getContentPane().add(textField);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.setBackground(Color.RED);
		btnBack.setForeground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					back = str.toString();
					textField.setText(back);
				}
			}
		});
		btnBack.setFont(new Font("wingdings", Font.BOLD, 16));
		btnBack.setBounds(23, 113, 85, 42);
		frame.getContentPane().add(btnBack);
		
		JButton btnClear = new JButton("C");
		btnClear.setForeground(Color.WHITE);
		btnClear.setBackground(Color.RED);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(118, 113, 91, 42);
		frame.getContentPane().add(btnClear);
		
		JButton btn00 = new JButton("00");
		btn00.setForeground(Color.WHITE);
		btn00.setBackground(Color.RED);
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn00.setBounds(219, 113, 98, 42);
		frame.getContentPane().add(btn00);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBackground(Color.RED);
		btnDiv.setForeground(Color.WHITE);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(330, 307, 85, 42);
		frame.getContentPane().add(btnDiv);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.RED);
		btn7.setForeground(Color.WHITE);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(23, 169, 85, 42);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.RED);
		btn8.setForeground(Color.WHITE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(118, 169, 91, 42);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.RED);
		btn9.setForeground(Color.WHITE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(219, 169, 98, 42);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.setBackground(Color.RED);
		btnSub.setForeground(Color.WHITE);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSub.setBounds(330, 169, 85, 42);
		frame.getContentPane().add(btnSub);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.RED);
		btn4.setForeground(Color.WHITE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(23, 237, 85, 42);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.RED);
		btn5.setForeground(Color.WHITE);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(116, 237, 91, 42);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.RED);
		btn6.setForeground(Color.WHITE);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(218, 236, 98, 42);
		frame.getContentPane().add(btn6);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(Color.RED);
		btnPlus.setForeground(Color.WHITE);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "+";
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(330, 113, 85, 42);
		frame.getContentPane().add(btnPlus);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.RED);
		btn1.setForeground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(23, 308, 85, 42);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.RED);
		btn2.setForeground(Color.WHITE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(118, 308, 91, 42);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.RED);
		btn3.setForeground(Color.WHITE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(219, 308, 98, 42);
		frame.getContentPane().add(btn3);
		
		JButton btnMul = new JButton("*");
		btnMul.setBackground(Color.RED);
		btnMul.setForeground(Color.WHITE);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnMul.setBounds(330, 235, 85, 42);
		frame.getContentPane().add(btnMul);
		
		JButton btnZero = new JButton("0");
		btnZero.setBackground(Color.RED);
		btnZero.setForeground(Color.WHITE);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnZero.getText();
				textField.setText(number);
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnZero.setBounds(23, 369, 85, 42);
		frame.getContentPane().add(btnZero);
		
		JButton btnDot = new JButton(".");
		btnDot.setBackground(Color.RED);
		btnDot.setForeground(Color.WHITE);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(118, 369, 91, 42);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(Color.RED);
		btnEqual.setForeground(Color.WHITE);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b = Double.parseDouble(textField.getText());
				if(operation=="+") {
					result = a+b;
					ans = String.format("%.2f",result);
					textField.setText(ans);
				}
				else if(operation=="-") {
					result = a-b;
					ans = String.format("%.2f",result);
					textField.setText(ans);
				}
				else if(operation=="*") {
					result = a*b;
					ans = String.format("%.2f",result);
					textField.setText(ans);
				}
				else if(operation=="/") {
					result = a/b;
					ans = String.format("%.3f",result);
					textField.setText(ans);
				}
				else if(operation=="%") {
					result = a%b;
					ans = String.format("%.5f",result);
					textField.setText(ans);
				}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(219, 369, 98, 42);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPer = new JButton("%");
		btnPer.setBackground(Color.RED);
		btnPer.setForeground(Color.WHITE);
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "%";
			}
		});
		btnPer.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPer.setBounds(330, 369, 85, 42);
		frame.getContentPane().add(btnPer);
	}
}
