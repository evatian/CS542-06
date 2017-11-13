package com.database.group6.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class TeacherInterface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherInterface frame = new TeacherInterface();
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
	public TeacherInterface() {
		setTitle("Professor Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 26, 456, 161);
		contentPane.add(scrollPane);
		
		JButton btnModifyClass = new JButton("Modify Course");
		btnModifyClass.setBounds(16, 231, 117, 29);
		contentPane.add(btnModifyClass);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setBounds(196, 231, 117, 29);
		contentPane.add(btnSave);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(363, 231, 117, 29);
		contentPane.add(btnBack);
	}

}
