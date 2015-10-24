package gui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

	private JLabel introLabel, inputLabel1, inputLabel2, inputLabel3;
	private JLabel paramsLabel, paramsInputLabel1, paramsInputLabel2, paramsInputLabel3;
	private JTextField paramsTextField1, paramsTextField2, paramsTextField3;
	private JTextField textField1, textField2, textField3;
	private JButton button1;
	private JTextArea textArea1;

	public MainFrame(int width, int height) {
		// initialize components
		init();
		// set window object size
		setUpWindow("Recommender System", width, height);
	}
	
	public void setUpWindow(String title, int width, int height) {
		setSize(width, height);
		setTitle(title);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void init() {
		// create container to hold GUI in window
		Container pane = this.getContentPane();
		pane.setLayout(null);

		//Starting position
		int startX = 110;
		int startY = 30;
		int width = 120;
		int height = 20;

		// intro label
		introLabel = new JLabel();
		introLabel.setBounds(10, 10, 500, height);
		introLabel.setText("Recommender System: SVD");

		// label 1
		inputLabel1 = new JLabel("User Id:");
		inputLabel1.setBounds(10, startY, width-height, height);
		textField1 = new JTextField();
		textField1.setBounds(startX, startY, width, height);

		// label 2
		inputLabel2 = new JLabel("Item Id:");
		inputLabel2.setBounds(10, startY * 2, width-height, height);
		textField2 = new JTextField();
		textField2.setBounds(startX, startY * 2, width, height);

		// label 3
		inputLabel3 = new JLabel("Top N:");
		inputLabel3.setBounds(10, startY * 3, width-height, height);
		textField3 = new JTextField();
		textField3.setBounds(startX, startY * 3, width, height);
		
		// Parameters
		paramsLabel = new JLabel();
		paramsLabel.setBounds(10, startY * 4, 500, height);
		paramsLabel.setText("Parameters");

		// params 1
		paramsInputLabel1 = new JLabel("Feature Size:");
		paramsInputLabel1.setBounds(10, startY * 5, width-height, height);
		paramsTextField1 = new JTextField();
		paramsTextField1.setBounds(startX, startY * 5, width, height);

		// params 2
		paramsInputLabel2 = new JLabel("Iterations:");
		paramsInputLabel2.setBounds(10, startY * 6, width-height, height);
		paramsTextField2 = new JTextField();
		paramsTextField2.setBounds(startX, startY * 6, width, height);

		// params 3
		paramsInputLabel3 = new JLabel("Regularization:");
		paramsInputLabel3.setBounds(10, startY * 7, width-height, height);
		paramsTextField3 = new JTextField();
		paramsTextField3.setBounds(startX, startY * 7, width, height);

		// generate button
		button1 = new JButton("Recommend");
		button1.setBounds(10, startY * 8, width, height);

		// add listener to button
		button1.addActionListener(this);

		// text area output (with formatted font)
		textArea1 = new JTextArea("My Recommendations!");
		textArea1.setFont(new Font("monospaced", Font.PLAIN, 12));
		textArea1.setBounds(250, 20, 500, 400);

		// add all components to the pane
		pane.add(introLabel);
		pane.add(inputLabel1);
		pane.add(inputLabel2);
		pane.add(inputLabel3);
		pane.add(textField1);
		pane.add(textField2);
		pane.add(textField3);
		pane.add(paramsLabel);
		pane.add(paramsInputLabel1);
		pane.add(paramsInputLabel2);
		pane.add(paramsInputLabel3);
		pane.add(paramsTextField1);
		pane.add(paramsTextField2);
		pane.add(paramsTextField3);
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