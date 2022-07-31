package calculator;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.SwingConstants;

public class Click implements ActionListener {
	public Window wind;
	public volatile String[] value = new String[100];
	private int num = 0;

	public void actionPerformed(ActionEvent e) {

		if (Processing.isAlign(num)) {
			Window.textField.setHorizontalAlignment(SwingConstants.LEFT);
			Window.textField.setText(null);
			num = 1;
		}

		if (e.getSource() == Window.btnZero) {
			Window.textField.setText(Window.textField.getText() + "0");
		} else if (e.getSource() == Window.btn1) {
			Window.textField.setText(Window.textField.getText() + "1");
		} else if (e.getSource() == Window.btn2) {
			Window.textField.setText(Window.textField.getText() + "2");
		} else if (e.getSource() == Window.btn3) {
			Window.textField.setText(Window.textField.getText() + "3");
		} else if (e.getSource() == Window.btn4) {
			Window.textField.setText(Window.textField.getText() + "4");
		} else if (e.getSource() == Window.btn5) {
			Window.textField.setText(Window.textField.getText() + "5");
		} else if (e.getSource() == Window.btn6) {
			Window.textField.setText(Window.textField.getText() + "6");
		} else if (e.getSource() == Window.btn7) {
			Window.textField.setText(Window.textField.getText() + "7");
		} else if (e.getSource() == Window.btn8) {
			Window.textField.setText(Window.textField.getText() + "8");
		} else if (e.getSource() == Window.btn9) {
			Window.textField.setText(Window.textField.getText() + "9");
		} else if (e.getSource() == Window.btnTimes) {
			Window.textField.setText(Window.textField.getText() + "X");
		} else if (e.getSource() == Window.btnMinus) {
			Window.textField.setText(Window.textField.getText() + "-");
		} else if (e.getSource() == Window.btnPlus) {
			Window.textField.setText(Window.textField.getText() + "+");
		} else if (e.getSource() == Window.btnDivide) {
			Window.textField.setText(Window.textField.getText() + "÷");
		} else if (e.getSource() == Window.btnPoint) {
			Window.textField.setText(Window.textField.getText() + ".");
		} else if (e.getSource() == Window.btnDel) {

			String string = Window.textField.getText();
			String[] strArray = string.split("");
			ArrayList<String> list = new ArrayList<String>();
			for (String s : strArray) {
				list.add(s);
			}
			int length = list.size() - 1;
			list.remove(length);

			String result = "";
			for (String s : list) {
				result += s;
			}
			Window.textField.setText(result);

		} else if (e.getSource() == Window.btnEquals) {
			Processing pros = new Processing();
			num = 0;
			Window.textField.setHorizontalAlignment(SwingConstants.RIGHT);
			pros.main(Window.textField.getText());

		} else if (e.getSource() == Window.btnModulo) {
			Window.textField.setText(Window.textField.getText() + "%");
		} else if (e.getSource() == Window.btnOn) {
			Window.textField.setText("");
		}

	}

}
