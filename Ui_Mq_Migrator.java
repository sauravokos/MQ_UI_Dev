package com.company.example;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ui_Mq_Migrator {
	JFrame f;

	public Ui_Mq_Migrator() {
		// TODO Auto-generated constructor stub
		f = new JFrame("MQ_Migrator");
		JPanel p1 = new JPanel();
		p1.setBackground(Color.white);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.white);
		JPanel p3 = new JPanel();
		p3.setBackground(Color.white);
		JPanel p4 = new JPanel();
		p4.setBackground(Color.white);
		JTabbedPane tp = new JTabbedPane();
		tp.setBounds(20, 20, 540, 550);
		tp.addTab("Unmigrated", p1);
		tp.addTab("MQ", p2);
		tp.addTab("NMQ", p3);
		tp.addTab("Library",p4);
		tp.setEnabledAt(1, false);
		tp.setEnabledAt(2, false);
		tp.setEnabledAt(3, false);
		f.add(tp);
		JButton b1 = new JButton("Migrate");
		b1.setBounds(350, 590, 80, 30);
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tp.setEnabledAt(0, false);
				tp.setEnabledAt(1, true);
				tp.setEnabledAt(2, true);
				tp.setEnabledAt(3, true);
			}
		});
		JButton b2 = new JButton("Chart");
		b2.setBounds(450, 590, 80, 30);
		b2.setEnabled(false);
		f.add(b2);
		f.setSize(600, 700);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ui_Mq_Migrator();
	}

}
