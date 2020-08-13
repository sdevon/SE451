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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Generate_Appointment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Generate_Appointment frame = new Generate_Appointment();
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
	public Generate_Appointment() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Life Drip");
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
		label.setBounds(268, 11, 169, 59);
		contentPane.add(label);
		
		JLabel lblGenerateAppointment = new JLabel("Generate Appointment:");
		lblGenerateAppointment.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblGenerateAppointment.setBounds(9, 29, 212, 39);
		contentPane.add(lblGenerateAppointment);
		
		JLabel lblPatientId = new JLabel("Patient ID:");
		lblPatientId.setFont(new Font("Arial", Font.BOLD, 14));
		lblPatientId.setBounds(10, 112, 84, 29);
		contentPane.add(lblPatientId);
		
		textField = new JTextField();
		textField.setBounds(92, 117, 224, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDoctorId = new JLabel("Doctor ID:");
		lblDoctorId.setFont(new Font("Arial", Font.BOLD, 14));
		lblDoctorId.setBounds(10, 152, 84, 29);
		contentPane.add(lblDoctorId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 157, 224, 20);
		contentPane.add(textField_1);
		
		JButton btnSearchPatient = new JButton("Search Patient");
		btnSearchPatient.setBounds(347, 116, 117, 23);
		contentPane.add(btnSearchPatient);
		
		JButton btnSearchDoctor = new JButton("Search Doctor");
		btnSearchDoctor.setBounds(347, 156, 117, 23);
		contentPane.add(btnSearchDoctor);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Arial", Font.BOLD, 20));
		lblStatus.setBounds(51, 67, 473, 39);
		contentPane.add(lblStatus);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Arial", Font.BOLD, 14));
		lblTime.setBounds(9, 213, 84, 29);
		contentPane.add(lblTime);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(92, 218, 43, 20);
		contentPane.add(textField_2);
		
		JLabel label_1 = new JLabel(":");
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		label_1.setBounds(137, 213, 43, 29);
		contentPane.add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(145, 218, 43, 20);
		contentPane.add(textField_3);
		
		JLabel lblHh = new JLabel("HH");
		lblHh.setFont(new Font("Arial", Font.BOLD, 14));
		lblHh.setBounds(102, 188, 27, 29);
		contentPane.add(lblHh);
		
		JLabel lblMm = new JLabel("MM");
		lblMm.setFont(new Font("Arial", Font.BOLD, 14));
		lblMm.setBounds(153, 188, 27, 29);
		contentPane.add(lblMm);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Arial", Font.BOLD, 14));
		lblDate.setBounds(9, 261, 84, 29);
		contentPane.add(lblDate);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(92, 266, 224, 20);
		contentPane.add(textField_4);
		
		JLabel lblTheAppointNumber = new JLabel("The appoint number will generated in java and will shown in the joption pain and stored in the data base");
		lblTheAppointNumber.setBounds(9, 277, 505, 39);
		contentPane.add(lblTheAppointNumber);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGenerate.setBounds(347, 217, 117, 49);
		contentPane.add(btnGenerate);
		
		JButton btnDelete = new JButton("Exit");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnDelete.setBounds(397, 327, 117, 23);
		contentPane.add(btnDelete);
	}

}
