package com.ViktorRazumovsky.Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainWindow {

	private JFrame frmCalculator;
	public JTextField textField;
	public Calculator MyCalc;
	public JButton btnMem;
	public JButton btnMemClear;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					MainWindow window = new MainWindow();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		MyCalc=new Calculator();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		frmCalculator.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		frmCalculator.setTitle("Calculator");
		frmCalculator.setResizable(false);
		frmCalculator.setBounds(100, 100, 300, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		textField.setEditable(false);
		frmCalculator.getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		frmCalculator.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 5, 0, 0));
		
		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('7');
				setText();
			}
		});
		btn7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('8');
				setText();
			}
		});
		btn8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('9');
				setText();
			}
		});
		btn9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btn9);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('/');
				setText();
			}
		});
		btnDivision.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btnDivision);
		
		JButton btnClear = new JButton("C");
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('c');
				setText();
			}
		});
		btnClear.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btnClear);
		
		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('4');
				setText();
			}
		});
		btn4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('5');
				setText();
			}
		});
		btn5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('6');
				setText();
			}
		});
		btn6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btn6);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('*');
				setText();
			}
		});
		btnMultiplication.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btnMultiplication);
		
		JButton btnBack = new JButton("back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('b');
				setText();
			}
		});
		btnBack.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btnBack);
		
		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('1');
				setText();
			}
		});
		btn1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('2');
				setText();
			}
		});
		btn2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('3');
				setText();
			}
		});
		btn3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btn3);
		
		JButton btnSubtraction = new JButton("-");
		btnSubtraction.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('-');
				setText();
			}
		});
		btnSubtraction.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btnSubtraction);
		
		btnMem = new JButton("M");
		btnMem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('m');
				setText();
			}
		});
		btnMem.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		btnMem.setEnabled(false);
		panel.add(btnMem);
		
		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('0');
				setText();
			}
		});
		btn0.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btn0);
		
		JButton btnZnak = new JButton("+-");
		btnZnak.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('z');
				setText();
			}
		});
		btnZnak.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btnZnak);
		
		JButton btnResult = new JButton("=");
		btnResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('=');
				setText();
			}
		});
		btnResult.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btnResult);
		
		JButton btnSummary = new JButton("+");
		btnSummary.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('+');
				setText();
			}
		});
		btnSummary.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		panel.add(btnSummary);
		
		btnMemClear = new JButton("MC");
		btnMemClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyCalc.add('s');
				setText();
			}
		});
		btnMemClear.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				MyCalc.add(e.getKeyChar());
				setText();
			}
		});
		btnMemClear.setEnabled(false);
		panel.add(btnMemClear);
	}
	
	public void setText() {
		Stat tmp=MyCalc.getStat();
		textField.setText(tmp.str);
		btnMem.setEnabled(tmp.mem);
		btnMemClear.setEnabled(tmp.memC);
		tmp=null;
		
	}

}
