package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

	private JLabel introLabel, inputLabel1, inputLabel2, inputLabel3;
	private JTextField textField1, textField2, textField3;
	private JButton button1;
	private JTextArea textArea1;

	public void init() {
		// create container to hold GUI in window
		Container pane = this.getContentPane();
		pane.setLayout(null);

		// intro label
		introLabel = new JLabel();
		introLabel.setBounds(10, 10, 300, 20);
		introLabel.setText("Quick intro to app");

		//1
		inputLabel1 = new JLabel("input1");
		inputLabel1.setBounds(10, 30, 80, 20);
		textField1 = new JTextField();
		textField1.setBounds(70, 30, 100, 20);

		//2
		inputLabel2 = new JLabel("input2");
		inputLabel2.setBounds(10, 60, 80, 20);
		textField2 = new JTextField();
		textField2.setBounds(70, 60, 100, 20);

		// 3
		inputLabel3 = new JLabel("input3");
		inputLabel3.setBounds(10, 90, 80, 20);
		textField3 = new JTextField();
		textField3.setBounds(70, 90, 100, 20);

		// generate button
		button1 = new JButton("button!");
		button1.setBounds(10, 200, 100, 20);

		//add listener to button
		button1.addActionListener(this);

		//text area output (with formatted font)
		textArea1 = new JTextArea("My Text Area!");
		textArea1.setFont(new Font("monospaced", Font.PLAIN, 12));
		textArea1.setBounds(250, 20, 500, 400);

		//add all of the things to the pane
		pane.add(introLabel);
		pane.add(inputLabel1);
		pane.add(inputLabel2);
		pane.add(inputLabel3);
		pane.add(textField1);
		pane.add(textField2);
		pane.add(textField3);
		pane.add(button1);
		pane.add(textArea1);
	}

	//handles actions
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			//parse some data from input
			int temp1 = Integer.parseInt(textField1.getText());
			int temp2 = Integer.parseInt(textField2.getText());

			//basic error catching
		} catch (NumberFormatException ex) {
			System.out.println("Exception: " + ex);
			JOptionPane.showMessageDialog(this, "Please enter a warning message");
		} catch (ArrayIndexOutOfBoundsException ex) {
			//warnings..
		} catch (NegativeArraySizeException ex) {
			//warnings..
		}
	}
}