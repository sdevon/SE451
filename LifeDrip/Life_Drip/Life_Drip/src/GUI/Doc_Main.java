package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Doc_Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doc_Main frame = new Doc_Main();
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
	public Doc_Main() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Life Drip");
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
		label.setBounds(172, 11, 169, 59);
		contentPane.add(label);
		
		JLabel lblDoctorLogin = new JLabel("Doctor Login:");
		lblDoctorLogin.setFont(new Font("Arial", Font.BOLD, 20));
		lblDoctorLogin.setBounds(51, 81, 155, 39);
		contentPane.add(lblDoctorLogin);
		
		JButton btnGenerateReport = new JButton("Generate Report");
		btnGenerateReport.setBounds(186, 281, 125, 39);
		contentPane.add(btnGenerateReport);
		
		JButton btnUpdateReport = new JButton("Update Report");
		btnUpdateReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdateReport.setBounds(186, 181, 125, 39);
		contentPane.add(btnUpdateReport);
		
		JButton btnViewReport = new JButton("View Report");
		btnViewReport.setBounds(186, 231, 125, 39);
		contentPane.add(btnViewReport);
		
		JButton button_2 = new JButton("Exit");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_2.setBounds(420, 319, 104, 31);
		contentPane.add(button_2);
		
		JButton btnCheckPatient = new JButton("Check Patient");
		btnCheckPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCheckPatient.setBounds(186, 131, 125, 39);
		contentPane.add(btnCheckPatient);
	}

}
