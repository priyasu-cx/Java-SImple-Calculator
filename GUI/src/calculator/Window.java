package calculator;

import javax.swing.*;
import java.awt.*;

public class Window {
	private JFrame frame;
	public static JTextField textField;
	public static JButton btnOn, btnDel, btnOpen, btnClose, btnModulo, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7,
			btn8, btn9, btnPlus, btnMinus, btnTimes, btnZero, btnPoint, btnDivide, btnEquals;

	public Window() {
		initialize();
	}
	
	private Click click = new Click();

	private void initialize() {

		frame = new JFrame("Priyasu's Calculator");
		frame.setSize(319, 466);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(new ImageIcon(getClass().getResource("/images/logo.jpg")).getImage());
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
			if ("Windows".equals(info.getName())) {
				try {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					e.printStackTrace();
				}
			}
		}

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(0, 0, 303, 407);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(83, 21, 212, 43);
		panel.add(textField);
		textField.setColumns(10);

		btnOn = new JButton("CLR");
		btnOn.addActionListener(click);
		btnOn.setBounds(10, 21, 63, 43);
		panel.add(btnOn);

		btnDel = new JButton("DEL");
		btnDel.addActionListener(click);
		btnDel.setBounds(10, 91, 63, 43);
		panel.add(btnDel);

		btnOpen = new JButton("");
		btnOpen.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnOpen.setBounds(83, 91, 63, 43);
		panel.add(btnOpen);

		btnClose = new JButton("");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClose.setBounds(159, 91, 63, 43);
		panel.add(btnClose);

		btnModulo = new JButton("%");
		btnModulo.addActionListener(click);
		btnModulo.setBounds(232, 91, 63, 43);
		panel.add(btnModulo);

		btn9 = new JButton("9");
		btn9.addActionListener(click);
		btn9.setBounds(10, 158, 63, 43);
		panel.add(btn9);

		btn8 = new JButton("8");
		btn8.addActionListener(click);
		btn8.setBounds(83, 158, 63, 43);
		panel.add(btn8);

		btn7 = new JButton("7");
		btn7.addActionListener(click);
		btn7.setBounds(159, 158, 63, 43);
		panel.add(btn7);

		btnPlus = new JButton("+");
		btnPlus.addActionListener(click);
		btnPlus.setBounds(232, 158, 63, 43);
		panel.add(btnPlus);

		btn6 = new JButton("6");
		btn6.addActionListener(click);
		btn6.setBounds(10, 223, 63, 43);
		panel.add(btn6);

		btn5 = new JButton("5");
		btn5.addActionListener(click);
		btn5.setBounds(83, 223, 63, 43);
		panel.add(btn5);

		btn4 = new JButton("4");
		btn4.addActionListener(click);
		btn4.setBounds(159, 223, 63, 43);
		panel.add(btn4);

		btnMinus = new JButton("-");
		btnMinus.addActionListener(click);
		btnMinus.setBounds(232, 223, 63, 43);
		panel.add(btnMinus);

		btn3 = new JButton("3");
		btn3.addActionListener(click);
		btn3.setBounds(10, 285, 63, 43);
		panel.add(btn3);

		btn2 = new JButton("2");
		btn2.addActionListener(click);
		btn2.setBounds(83, 285, 63, 43);
		panel.add(btn2);

		btn1 = new JButton("1");
		btn1.addActionListener(click);
		btn1.setBounds(159, 285, 63, 43);
		panel.add(btn1);

		btnTimes = new JButton("X");
		btnTimes.addActionListener(click);
		btnTimes.setBounds(232, 285, 63, 43);
		panel.add(btnTimes);

		btnZero = new JButton("0");
		btnZero.addActionListener(click);
		btnZero.setBounds(10, 353, 63, 43);
		panel.add(btnZero);

		btnPoint = new JButton(".");
		btnPoint.addActionListener(click);
		btnPoint.setBounds(83, 353, 63, 43);
		panel.add(btnPoint);

		btnDivide = new JButton("\u00F7");
		btnDivide.addActionListener(click);
		btnDivide.setBounds(232, 353, 63, 43);
		panel.add(btnDivide);

		btnEquals = new JButton("=");
		btnEquals.addActionListener(click);
		btnEquals.setBounds(159, 353, 63, 43);
		panel.add(btnEquals);
		
		JLabel lblNewLabel = new JLabel("Made with ❤️ by Priyasu Guin");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 404, 283, 23);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		Window wind = new Window();

	}
}