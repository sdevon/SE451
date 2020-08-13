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

public class Update_Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_Main frame = new Update_Main();
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
	public Update_Main() {
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
		
		JLabel lblUpdateData = new JLabel("Update Data:");
		lblUpdateData.setFont(new Font("Arial", Font.BOLD, 20));
		lblUpdateData.setBounds(52, 81, 180, 39);
		contentPane.add(lblUpdateData);
		
		JButton btnUpdateDoctor = new JButton("Update Doctor");
		btnUpdateDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_Doc ww = new Update_Doc();
				ww.setVisible(true);
			}
		});
		btnUpdateDoctor.setBounds(193, 117, 139, 39);
		contentPane.add(btnUpdateDoctor);
		
		JButton btnUpdatePatient = new JButton("Update Patient");
		btnUpdatePatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_patient qq = new Update_patient();
				qq.setVisible(true);
			}
		});
		btnUpdatePatient.setBounds(193, 183, 139, 39);
		contentPane.add(btnUpdatePatient);
		
		JButton btnUpdateRegistrar = new JButton("Update Registrar");
		btnUpdateRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_Reg qq = new Update_Reg();
				qq.setVisible(true);
			}
		});
		btnUpdateRegistrar.setBounds(193, 254, 139, 39);
		contentPane.add(btnUpdateRegistrar);
		
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
