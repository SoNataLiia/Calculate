package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtxtDisplay;
	
	double EnterNum1;
	double EnterNum2;
	double Result;
	String Operate;
	
	private final java.text.DecimalFormat df =
		    new java.text.DecimalFormat("0.##########",
		        java.text.DecimalFormatSymbols.getInstance(java.util.Locale.US));
	private void displayResult(double r) {
	    if (Double.isFinite(r) && r == Math.rint(r)) {
	        jtxtDisplay.setText(String.valueOf((long) r)); // numero entero
	    } else {
	        jtxtDisplay.setText(df.format(r)); 
	    }
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		jtxtDisplay = new JTextField();
		jtxtDisplay.setBackground(new Color(255, 250, 250));
		jtxtDisplay.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtDisplay.setColumns(10);
		//jtxtDisplay.setEditable(false); // prohibición - teclado en pantalla
		//da permiso a teclado, exapto letras
		/*jtxtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!Character.isDigit(c) && c != '.') {
		            e.consume(); 
		        }
		    }
		});*/
		
		
		JButton btnNewButton = new JButton("+/-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double pm = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
				
				pm = pm * (-1);
				jtxtDisplay.setText(String.valueOf(pm));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtDisplay.setText("");
				//String Fn, Sn;
				
				//Fn = String.valueOf(EnterNum1);
				//Sn = String.valueOf(EnterNum2);
				//Fn = "";
				//Sn = "";

				
			}
		});
		btnCE.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtDisplay.setText("");
				EnterNum1 = 0;
				EnterNum2 = 0;
				Result = 0;
				Operate = null;
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btnNewButton_3 = new JButton("\uF0E7"); //Escribimos para la flecha y tambíen cambiamos el fondo a Wingdings
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bs = null;
				if(jtxtDisplay.getText().length() > 0) {
					StringBuilder stB = new StringBuilder(jtxtDisplay.getText());
					stB.deleteCharAt(jtxtDisplay.getText().length() -1);
					bs = stB.toString();
					jtxtDisplay.setText(bs);
				}
			}
		});
		btnNewButton_3.setFont(new Font("Wingdings", Font.BOLD, 24));
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// mostrar en pantalla
				String digit = jtxtDisplay.getText()+btn7.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText()+btn8.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText()+btn9.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btnNewButton_4 = new JButton("+");
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EnterNum1 = Double.parseDouble(jtxtDisplay.getText().isEmpty() ?"0": jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate = "+";
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText()+btn4.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText()+btn5.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText()+btn6.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btnNewButton_5 = new JButton("-");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1 = Double.parseDouble(jtxtDisplay.getText().isEmpty() ?"0": jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate = "-";
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText()+btn3.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText()+btn2.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText()+btn1.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btnNewButton_6 = new JButton("*");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1 = Double.parseDouble(jtxtDisplay.getText().isEmpty() ?"0": jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate = "*";
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText()+btn0.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btnNewButton_1_4 = new JButton(".");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!jtxtDisplay.getText().contains(".")) {
					jtxtDisplay.setText(jtxtDisplay.getText()+btnNewButton_1_4.getText());
				}
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btnNewButton_2_4 = new JButton("=");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Operate == null || jtxtDisplay.getText().isEmpty()) return;

				
			EnterNum2 = Double.parseDouble(jtxtDisplay.getText());
			
			if ("+".equals(Operate)) {
				Result = EnterNum1 + EnterNum2;
				displayResult(Result);
			}
			else if ("-".equals(Operate)) {
				Result = EnterNum1 - EnterNum2;
				displayResult(Result);
			}
			else if ("*".equals(Operate)) {
				Result = EnterNum1 * EnterNum2;
				displayResult(Result);
			}
			else if ( "/".equals(Operate)) {
				if(EnterNum2 == 0) {
					jtxtDisplay.setText("Error");
				}else {
					Result = EnterNum1 / EnterNum2;
					displayResult(Result);
				}
				
			}
			Operate = null;   
			EnterNum1 = Result; 

			}
			
		});
		btnNewButton_2_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btnNewButton_7 = new JButton("/");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1 = Double.parseDouble(jtxtDisplay.getText().isEmpty() ?"0": jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate = "/";
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.setLayout(new MigLayout("", "[79px][23px][79px][20px][79px][27px][79px]", "[69px][69px][69px][69px][69px][69px]"));
		contentPane.add(jtxtDisplay, "cell 0 0 7 1,grow");
		contentPane.add(btnNewButton, "cell 6 1,grow");
		contentPane.add(btnCE, "cell 2 1,grow");
		contentPane.add(btnC, "cell 4 1,grow");
		contentPane.add(btnNewButton_3, "cell 0 1,grow");
		contentPane.add(btn7, "cell 0 2,grow");
		contentPane.add(btn8, "cell 2 2,grow");
		contentPane.add(btn9, "cell 4 2,grow");
		contentPane.add(btnNewButton_4, "cell 6 2,grow");
		contentPane.add(btn4, "cell 0 3,grow");
		contentPane.add(btn5, "cell 2 3,grow");
		contentPane.add(btn6, "cell 4 3,grow");
		contentPane.add(btnNewButton_5, "cell 6 3,grow");
		contentPane.add(btn3, "cell 4 4,grow");
		contentPane.add(btn2, "cell 2 4,grow");
		contentPane.add(btn1, "cell 0 4,grow");
		contentPane.add(btnNewButton_6, "cell 6 4,grow");
		contentPane.add(btn0, "cell 0 5,grow");
		contentPane.add(btnNewButton_1_4, "cell 2 5,grow");
		contentPane.add(btnNewButton_2_4, "cell 4 5,grow");
		contentPane.add(btnNewButton_7, "cell 6 5,grow");
		getRootPane().setDefaultButton(btnNewButton_2_4);
		
		jtxtDisplay.addActionListener(e -> btnNewButton_2_4.doClick());

		
		jtxtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
		  @Override public void keyTyped(java.awt.event.KeyEvent e) {
		    char c = e.getKeyChar();
		    if (Character.isDigit(c)) { jtxtDisplay.setText(jtxtDisplay.getText()+c); e.consume(); return; }
		    if (c=='.' && !jtxtDisplay.getText().contains(".")) { jtxtDisplay.setText(jtxtDisplay.getText()+'.'); e.consume(); return; }

		    switch (c) {
		    case '+': btnNewButton_4.doClick(); e.consume(); return;
		    case '-': btnNewButton_5.doClick(); e.consume(); return;
		    case '*': btnNewButton_6.doClick(); e.consume(); return;
		    case '/': btnNewButton_7.doClick(); e.consume(); return;
		  }

		    if (c=='\n') {                               
		      btnNewButton_2_4.doClick();
		      e.consume(); return;
		    }
		    e.consume(); 
		    
		  }
		  @Override
		  public void keyPressed(java.awt.event.KeyEvent e) {
		      if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
		          btnNewButton_2_4.doClick();  //press "="
		          e.consume();
		      }
		  }

		});
		
		

	}
	
	
}
