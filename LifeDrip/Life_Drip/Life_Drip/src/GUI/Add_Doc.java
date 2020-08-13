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

public class Add_Doc extends JFrame {

	private JPanel contentPane;
	private JTextField tf_id;
	private JTextField tf_fstn;
	private JTextField tf_secn;
	private JTextField tf_phno;
	private JTextField tf_pass;
	private JTextField tf_spec;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Doc frame = new Add_Doc();
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
	public Add_Doc() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Life Drip");
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
		label.setBounds(269, 11, 169, 59);
		contentPane.add(label);
		
		JLabel lblAddDoctor = new JLabel("Add Doctor:");
		lblAddDoctor.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblAddDoctor.setBounds(10, 29, 212, 39);
		contentPane.add(lblAddDoctor);
		
		JLabel label_2 = new JLabel("Status:");
		label_2.setFont(new Font("Arial", Font.BOLD, 20));
		label_2.setBounds(52, 67, 473, 39);
		contentPane.add(label_2);
		
		JLabel lblDoctorId = new JLabel("Doctor ID:");
		lblDoctorId.setFont(new Font("Arial", Font.BOLD, 14));
		lblDoctorId.setBounds(11, 112, 84, 29);
		contentPane.add(lblDoctorId);
		
		tf_id = new JTextField();
		tf_id.setColumns(10);
		tf_id.setBounds(93, 117, 224, 20);
		contentPane.add(tf_id);
		
		JLabel lblFname = new JLabel("F_Name:");
		lblFname.setFont(new Font("Arial", Font.BOLD, 14));
		lblFname.setBounds(11, 152, 84, 29);
		contentPane.add(lblFname);
		
		tf_fstn = new JTextField();
		tf_fstn.setColumns(10);
		tf_fstn.setBounds(93, 157, 224, 20);
		contentPane.add(tf_fstn);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(398, 327, 117, 23);
		contentPane.add(btnExit);
		
		JLabel lblLname = new JLabel("L_Name:");
		lblLname.setFont(new Font("Arial", Font.BOLD, 14));
		lblLname.setBounds(10, 192, 84, 29);
		contentPane.add(lblLname);
		
		tf_secn = new JTextField();
		tf_secn.setColumns(10);
		tf_secn.setBounds(93, 197, 224, 20);
		contentPane.add(tf_secn);
		
		JLabel lblPhone = new JLabel("Phone #:");
		lblPhone.setFont(new Font("Arial", Font.BOLD, 14));
		lblPhone.setBounds(10, 232, 84, 29);
		contentPane.add(lblPhone);
		
		tf_phno = new JTextField();
		tf_phno.setColumns(10);
		tf_phno.setBounds(93, 237, 224, 20);
		contentPane.add(tf_phno);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 14));
		lblPassword.setBounds(10, 272, 84, 29);
		contentPane.add(lblPassword);
		
		JLabel lblSplization = new JLabel("Speclize:");
		lblSplization.setFont(new Font("Arial", Font.BOLD, 14));
		lblSplization.setBounds(10, 312, 84, 29);
		contentPane.add(lblSplization);
		
		tf_pass = new JTextField();
		tf_pass.setColumns(10);
		tf_pass.setBounds(93, 272, 224, 20);
		contentPane.add(tf_pass);
		
		tf_spec = new JTextField();
		tf_spec.setColumns(10);
		tf_spec.setBounds(93, 312, 224, 20);
		contentPane.add(tf_spec);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setBounds(398, 196, 117, 39);
		contentPane.add(btnAdd);
	}

}
