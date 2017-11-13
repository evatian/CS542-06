package com.database.group6.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdministraterInterface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministraterInterface frame = new AdministraterInterface();
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
	public AdministraterInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdministratorManagement = new JLabel("Administrator Management");
		lblAdministratorManagement.setBounds(156, 6, 241, 16);
		contentPane.add(lblAdministratorManagement);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 32, 467, 213);
		contentPane.add(scrollPane);
		
		JButton btnAddClass = new JButton("ADD COURSE");
		btnAddClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddClass.setBounds(77, 257, 117, 29);
		contentPane.add(btnAddClass);
		
		JButton btnDropCourse = new JButton("DROP COURSE");
		btnDropCourse.setBounds(264, 257, 117, 29);
		contentPane.add(btnDropCourse);
	}

}
