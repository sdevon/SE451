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

public class Add_Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Main frame = new Add_Main();
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
	public Add_Main() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Life Drip");
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
		label.setBounds(181, 11, 169, 59);
		contentPane.add(label);
		
		JLabel lblAddData = new JLabel("Add Data:");
		lblAddData.setFont(new Font("Arial", Font.BOLD, 20));
		lblAddData.setBounds(39, 81, 180, 39);
		contentPane.add(lblAddData);
		
		JButton btnAddDoctor = new JButton("Add Doctor");
		btnAddDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Doc xx = new Add_Doc();
				xx.setVisible(true);
			}
		});
		btnAddDoctor.setBounds(181, 122, 125, 39);
		contentPane.add(btnAddDoctor);
		
		JButton btnAddPatient = new JButton("Add Patient");
		btnAddPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Patient cc = new Add_Patient();
				cc.setVisible(true);
			}
		});
		btnAddPatient.setBounds(181, 188, 125, 39);
		contentPane.add(btnAddPatient);
		
		JButton btnAddRegistrar = new JButton("Add Registrar");
		btnAddRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Reg qq =new Add_Reg();
				qq.setVisible(true);
			}
		});
		btnAddRegistrar.setBounds(181, 259, 125, 39);
		contentPane.add(btnAddRegistrar);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setBounds(430, 319, 104, 31);
		contentPane.add(button);
		
		JLabel lblRegistrarLogin = new JLabel("Registrar Login");
		lblRegistrarLogin.setFont(new Font("Arial", Font.PLAIN, 13));
		lblRegistrarLogin.setBounds(10, 30, 94, 39);
		contentPane.add(lblRegistrarLogin);
	}

}
