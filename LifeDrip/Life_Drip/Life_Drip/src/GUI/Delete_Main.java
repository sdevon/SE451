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

public class Delete_Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete_Main frame = new Delete_Main();
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
	public Delete_Main() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Life Drip");
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
		label.setBounds(193, 11, 169, 59);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Registrar Login");
		label_1.setFont(new Font("Arial", Font.PLAIN, 13));
		label_1.setBounds(27, 43, 94, 39);
		contentPane.add(label_1);
		
		JLabel lblDeleteData = new JLabel("Delete Data:");
		lblDeleteData.setFont(new Font("Arial", Font.BOLD, 20));
		lblDeleteData.setBounds(52, 81, 180, 39);
		contentPane.add(lblDeleteData);
		
		JButton btnDeleteDoctor = new JButton("Delete Doctor");
		btnDeleteDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete_Doc cc = new Delete_Doc();
				cc.setVisible(true);
			}
		});
		btnDeleteDoctor.setBounds(193, 117, 141, 39);
		contentPane.add(btnDeleteDoctor);
		
		JButton btnDeletePatient = new JButton("Delete Patient");
		btnDeletePatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete_Patient qq = new Delete_Patient();
				qq.setVisible(true);
			}
		});
		btnDeletePatient.setBounds(193, 183, 141, 39);
		contentPane.add(btnDeletePatient);
		
		JButton btnDeleteRegistrar = new JButton("Delete Registrar");
		btnDeleteRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete_Reg ww = new Delete_Reg();
				ww.setVisible(true);
			}
		});
		btnDeleteRegistrar.setBounds(193, 254, 141, 39);
		contentPane.add(btnDeleteRegistrar);
		
		JButton button_3 = new JButton("Exit");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_3.setBounds(420, 319, 104, 31);
		contentPane.add(button_3);
	}

}
