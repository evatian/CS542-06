package com.database.group6.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class StudentInterface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInterface frame = new StudentInterface();
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
	public StudentInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentSchedule = new JLabel("STUDENT SCHEDULE");
		lblStudentSchedule.setBounds(188, 6, 159, 16);
		contentPane.add(lblStudentSchedule);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBounds(23, 258, 103, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DROP");
		btnNewButton_1.setBounds(151, 258, 92, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CLASS SEARCH");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchClassInterface m=new SearchClassInterface();
				m.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(253, 258, 124, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("EXIT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(389, 258, 103, 29);
		contentPane.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 34, 479, 200);
		contentPane.add(scrollPane);
	}
}
