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

public class Add_Reg extends JFrame {

	private JPanel contentPane;
	private JTextField tf_id;
	private JTextField tf_fstn;
	private JTextField tf_secn;
	private JTextField tf_phno;
	private JTextField tf_pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Reg frame = new Add_Reg();
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
	public Add_Reg() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel label = new JLabel("Life Drip");
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
		label.setBounds(269, 11, 169, 59);
		panel.add(label);
		
		JLabel lblAddRegistrar = new JLabel("Add Registrar:");
		lblAddRegistrar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblAddRegistrar.setBounds(10, 29, 212, 39);
		panel.add(lblAddRegistrar);
		
		JLabel label_2 = new JLabel("Status:");
		label_2.setFont(new Font("Arial", Font.BOLD, 20));
		label_2.setBounds(52, 67, 473, 39);
		panel.add(label_2);
		
		JLabel lblRegistrarId = new JLabel("Registrar ID:");
		lblRegistrarId.setFont(new Font("Arial", Font.BOLD, 14));
		lblRegistrarId.setBounds(11, 112, 96, 29);
		panel.add(lblRegistrarId);
		
		tf_id = new JTextField();
		tf_id.setColumns(10);
		tf_id.setBounds(117, 117, 224, 20);
		panel.add(tf_id);
		
		JLabel label_4 = new JLabel("F_Name:");
		label_4.setFont(new Font("Arial", Font.BOLD, 14));
		label_4.setBounds(11, 152, 84, 29);
		panel.add(label_4);
		
		tf_fstn = new JTextField();
		tf_fstn.setColumns(10);
		tf_fstn.setBounds(117, 157, 224, 20);
		panel.add(tf_fstn);
		
		JButton button = new JButton("Exit");
		button.setBounds(398, 327, 117, 23);
		panel.add(button);
		
		JLabel label_5 = new JLabel("L_Name:");
		label_5.setFont(new Font("Arial", Font.BOLD, 14));
		label_5.setBounds(10, 192, 84, 29);
		panel.add(label_5);
		
		tf_secn = new JTextField();
		tf_secn.setColumns(10);
		tf_secn.setBounds(117, 197, 224, 20);
		panel.add(tf_secn);
		
		JLabel label_6 = new JLabel("Phone #:");
		label_6.setFont(new Font("Arial", Font.BOLD, 14));
		label_6.setBounds(10, 232, 84, 29);
		panel.add(label_6);
		
		tf_phno = new JTextField();
		tf_phno.setColumns(10);
		tf_phno.setBounds(117, 237, 224, 20);
		panel.add(tf_phno);
		
		JLabel label_7 = new JLabel("Password:");
		label_7.setFont(new Font("Arial", Font.BOLD, 14));
		label_7.setBounds(10, 272, 84, 29);
		panel.add(label_7);
		
		tf_pass = new JTextField();
		tf_pass.setColumns(10);
		tf_pass.setBounds(117, 277, 224, 20);
		panel.add(tf_pass);
		
		JButton button_1 = new JButton("Add");
		button_1.setBounds(398, 196, 117, 39);
		panel.add(button_1);
	}

}
