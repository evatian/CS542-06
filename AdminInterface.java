package com.database.group6.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

public class AdminInterface extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminInterface frame = new AdminInterface();
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
	public AdminInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Record Keeping System");
		lblNewLabel.setBounds(176, 16, 210, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				StudentInterface jf = new StudentInterface();
				jf.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton.setBounds(152, 282, 122, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblAcount = new JLabel("Account:");
		lblAcount.setBounds(271, 95, 61, 16);
		contentPane.add(lblAcount);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(258, 154, 74, 16);
		contentPane.add(lblPassword);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Student");
		rdbtnNewRadioButton.setBounds(70, 218, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Professor");
		rdbtnNewRadioButton_1.setBounds(245, 218, 141, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Administrator");
		rdbtnNewRadioButton_2.setBounds(422, 218, 141, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(327, 282, 141, 34);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(334, 89, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(334, 148, 134, 28);
		contentPane.add(passwordField);
		
		//JLabel lblNewLabel_1 = new JLabel("New label");
		final JLabel jlHead = new JLabel("");
		jlHead.setIcon(new ImageIcon(AdminInterface.class.getResource("/com/database/group6/view/u303533296Aou4oVnO.jpg")));
		jlHead.setBounds(48, 60, 160, 133);
		contentPane.add(jlHead);
		jlHead.setBounds(48, 52, 163, 141);
		contentPane.add(jlHead);
	}
}
