package com.database.group6.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class AddClassInterface extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;
	private JButton btnReset;
	private JButton btnPublish;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddClassInterface frame = new AddClassInterface();
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
	public AddClassInterface() {
		setTitle("ADD COURSE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCourseId = new JLabel("COURSE NUMBER:");
		lblCourseId.setBounds(62, 22, 113, 16);
		contentPane.add(lblCourseId);
		
		JLabel lblCourseName = new JLabel("COURSE NAME:");
		lblCourseName.setBounds(64, 70, 111, 16);
		contentPane.add(lblCourseName);
		
		JLabel lblNewLabel = new JLabel("COURSE CREDIT:");
		lblNewLabel.setBounds(62, 123, 113, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(267, 16, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(267, 64, 134, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(267, 117, 134, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSchedule = new JLabel("SCHEDULE：");
		lblSchedule.setBounds(73, 176, 102, 16);
		contentPane.add(lblSchedule);
	
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MON: 8:00AM-10:00AM", "MON: 10:00AM-12:00PM", "MON: 1:00PM-3:00PM", "MON: 3:00PM-5:00PM", "MON: 6:00PM-9:00PM", "TUE: 8:00AM-10:00AM", "TUE: 10:00AM-12:00PM", "TUE: 1:00PM-3:00PM", "TUE: 3:00PM-5:00PM", "TUE: 6:00PM-9:00PM", "WED: 8:00AM-10:00AM", "WED: 10:00AM-12:00PM", "WED: 1:00PM-3:00PM", "WED: 3:00PM-5:00PM", "WED: 6:00PM-9:00PM", "THU: 8:00AM-10:00AM", "THU: 10:00AM-12:00PM", "THU: 1:00PM-3:00PM", "THU: 3:00PM-5:00PM", "THU: 6:00PM-9:00PM", "FRI: 8:00AM-10:00AM", "FRI: 10:00AM-12:00PM", "FRI: 1:00PM-3:00PM", "FRI: 3:00PM-5:00PM", "FRI: 6:00PM-9:00PM"}));
		comboBox.setSelectedIndex(-1);
		comboBox.setToolTipText("");
		//comboBox.setSelectedIndex(-2);
		//comboBox.setToolTipText("Mon: 10:00-12:00PM");
		comboBox.setMaximumRowCount(24);
		comboBox.setBounds(267, 172, 199, 27);
		contentPane.add(comboBox);
		//String []array =  {C:\\;D:\\;E:\\;F:\\};
		
		btnReset = new JButton("RESET");
		btnReset.setBounds(35, 231, 117, 29);
		contentPane.add(btnReset);
		
		btnPublish = new JButton("PUBLISH");
		btnPublish.setBounds(209, 231, 117, 29);
		contentPane.add(btnPublish);
		
		btnBack = new JButton("BACK");
		btnBack.setBounds(360, 231, 117, 29);
		contentPane.add(btnBack);
	}
}
