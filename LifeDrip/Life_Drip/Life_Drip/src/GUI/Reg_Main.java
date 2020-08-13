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

public class Reg_Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reg_Main frame = new Reg_Main();
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
	public Reg_Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Life Drip");
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
		label.setBounds(177, 11, 169, 59);
		contentPane.add(label);
		
		JLabel lblRegistrarLogin = new JLabel("Registrar Login:");
		lblRegistrarLogin.setFont(new Font("Arial", Font.BOLD, 20));
		lblRegistrarLogin.setBounds(42, 81, 180, 39);
		contentPane.add(lblRegistrarLogin);
		
		JButton btnGenerateAppointment = new JButton("Generate Appointment");
		btnGenerateAppointment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generate_Appointment cc = new Generate_Appointment();
				cc.setVisible(true);
			}
		});
		btnGenerateAppointment.setBounds(81, 131, 180, 39);
		contentPane.add(btnGenerateAppointment);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Main aa = new Add_Main();
				aa.setVisible(true);
			}
		});
		btnAdd.setBounds(81, 181, 180, 39);
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_Main nn = new Update_Main();
				nn.setVisible(true);
			}
		});
		btnUpdate.setBounds(81, 231, 180, 39);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete_Main cc = new Delete_Main();
				cc.setVisible(true);
			}
		});
		btnDelete.setBounds(81, 281, 180, 39);
		contentPane.add(btnDelete);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setBounds(420, 319, 104, 31);
		contentPane.add(button);
	}

}
