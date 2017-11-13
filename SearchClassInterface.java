package com.database.group6.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class SearchClassInterface extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchClassInterface frame = new SearchClassInterface();
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
	public SearchClassInterface() {
		setTitle("Class Search Part");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCourseId = new JLabel("COURSE ID:");
		lblCourseId.setBounds(25, 17, 99, 16);
		contentPane.add(lblCourseId);
		
		textField = new JTextField();
		textField.setBounds(100, 11, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCourseName = new JLabel("COURSE NAME:");
		lblCourseName.setBounds(234, 17, 126, 16);
		contentPane.add(lblCourseName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(332, 11, 134, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setBounds(464, 12, 94, 29);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 45, 533, 197);
		contentPane.add(scrollPane);
		
		JButton btnAddToThe = new JButton("ADD TO THE SCHEDULE");
		btnAddToThe.setBounds(17, 254, 284, 29);
		contentPane.add(btnAddToThe);
		
		JButton btnExit = new JButton("BACK");
		btnExit.setBounds(372, 254, 186, 29);
		contentPane.add(btnExit);
	}
}
