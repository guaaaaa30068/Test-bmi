import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("身高：");
		lblNewLabel.setBounds(65, 82, 74, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("體重：");
		lblNewLabel_1.setBounds(65, 119, 74, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(114, 77, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(114, 114, 130, 26);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("公分");
		lblNewLabel_2.setBounds(274, 82, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("公斤");
		lblNewLabel_2_1.setBounds(274, 119, 61, 16);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Your bmi");
		lblNewLabel_3.setBounds(75, 168, 251, 16);
		frame.getContentPane().add(lblNewLabel_3);
	
		
		JButton btnNewButton = new JButton("計算BMI");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double h = Double.parseDouble(textField.getText());
				double w = Double.parseDouble(textField_1.getText());
				double bmi = w/Math.pow((h/100), 2);
				
				lblNewLabel_3.setText(Double.toString(bmi));
			}
		});
		btnNewButton.setBounds(127, 210, 187, 26);
		frame.getContentPane().add(btnNewButton);
		
		
}
}
