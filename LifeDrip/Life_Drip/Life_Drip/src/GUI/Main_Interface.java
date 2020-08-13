package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_Interface extends JFrame {

	private JPanel contentPane;
	private JPasswordField tf_pass;
	private JTextField tf_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Interface frame = new Main_Interface();
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
	public Main_Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLifeDrip = new JLabel("Life Drip");
		lblLifeDrip.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
		lblLifeDrip.setBounds(175, 11, 169, 59);
		contentPane.add(lblLifeDrip);
		
		tf_pass = new JPasswordField();
		tf_pass.setBounds(212, 171, 290, 40);
		contentPane.add(tf_pass);
		
		tf_id = new JTextField();
		tf_id.setBounds(212, 105, 290, 40);
		contentPane.add(tf_id);
		tf_id.setColumns(10);
		
		JLabel lblUserId = new JLabel("User ID:");
		lblUserId.setFont(new Font("Arial", Font.BOLD, 20));
		lblUserId.setBounds(47, 103, 155, 39);
		contentPane.add(lblUserId);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 20));
		lblPassword.setBounds(47, 169, 155, 39);
		contentPane.add(lblPassword);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(223, 323, 104, 31);
		contentPane.add(btnExit);
		
		JButton btn_doc = new JButton("Doctor");
		btn_doc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// put check condition
				Doc_Main cc = new Doc_Main();
				cc.setVisible(true);
			}
		});
		btn_doc.setBounds(107, 272, 89, 40);
		contentPane.add(btn_doc);
		
		JLabel lblLoginAs = new JLabel("Login As:");
		lblLoginAs.setFont(new Font("Arial", Font.BOLD, 20));
		lblLoginAs.setBounds(97, 222, 155, 39);
		contentPane.add(lblLoginAs);
		
		JButton btn_pat = new JButton("Patient");
		btn_pat.setBounds(227, 272, 89, 40);
		contentPane.add(btn_pat);
		
		JButton btn_reg = new JButton("Registrar");
		btn_reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// put check condition
				Reg_Main nn = new Reg_Main();
				nn.setVisible(true);
			}
		});
		btn_reg.setBounds(359, 272, 89, 40);
		contentPane.add(btn_reg);
	}
}
