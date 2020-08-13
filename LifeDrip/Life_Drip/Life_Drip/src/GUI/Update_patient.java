package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Update_patient extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_patient frame = new Update_patient();
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
	public Update_patient() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 550, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 534, 386);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Life Drip");
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
		label.setBounds(269, 11, 169, 59);
		panel.add(label);
		
		JLabel lblUpdatePatient = new JLabel("Update Patient:");
		lblUpdatePatient.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblUpdatePatient.setBounds(10, 29, 212, 39);
		panel.add(lblUpdatePatient);
		
		JLabel label_2 = new JLabel("Status:");
		label_2.setFont(new Font("Arial", Font.BOLD, 20));
		label_2.setBounds(52, 67, 473, 39);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Patient ID:");
		label_3.setFont(new Font("Arial", Font.BOLD, 14));
		label_3.setBounds(11, 112, 84, 29);
		panel.add(label_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(124, 117, 224, 20);
		panel.add(textField);
		
		JLabel label_4 = new JLabel("F_Name:");
		label_4.setFont(new Font("Arial", Font.BOLD, 14));
		label_4.setBounds(11, 152, 84, 29);
		panel.add(label_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(124, 157, 224, 20);
		panel.add(textField_1);
		
		JButton button = new JButton("Exit");
		button.setBounds(398, 327, 117, 23);
		panel.add(button);
		
		JLabel label_5 = new JLabel("L_Name:");
		label_5.setFont(new Font("Arial", Font.BOLD, 14));
		label_5.setBounds(10, 192, 84, 29);
		panel.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(124, 197, 224, 20);
		panel.add(textField_2);
		
		JLabel label_6 = new JLabel("Phone #:");
		label_6.setFont(new Font("Arial", Font.BOLD, 14));
		label_6.setBounds(10, 232, 84, 29);
		panel.add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(124, 237, 224, 20);
		panel.add(textField_3);
		
		JLabel label_7 = new JLabel("Password:");
		label_7.setFont(new Font("Arial", Font.BOLD, 14));
		label_7.setBounds(10, 272, 84, 29);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Blood Group:");
		label_8.setFont(new Font("Arial", Font.BOLD, 14));
		label_8.setBounds(10, 312, 104, 29);
		panel.add(label_8);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(124, 277, 224, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(124, 317, 224, 20);
		panel.add(textField_5);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(398, 196, 117, 39);
		panel.add(btnUpdate);
		
		JLabel label_9 = new JLabel("Comments:");
		label_9.setFont(new Font("Arial", Font.BOLD, 14));
		label_9.setBounds(10, 346, 84, 29);
		panel.add(label_9);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(124, 351, 224, 20);
		panel.add(textField_6);
		
		JButton btnUpdate_1 = new JButton("Search");
		btnUpdate_1.setBounds(358, 116, 117, 23);
		panel.add(btnUpdate_1);
	}

}
