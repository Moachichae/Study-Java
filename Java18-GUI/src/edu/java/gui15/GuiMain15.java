package edu.java.gui15;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

public class GuiMain15 {

	private JFrame frame;
	int count = 100;
	private JProgressBar progressBar;
	private JDialog dialog;
	private Timer timer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain15 window = new GuiMain15();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiMain15() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(12, 0, 410, 20);
		progressBar.setValue(count);
		frame.getContentPane().add(progressBar);
		
		JButton btnNewButton = new JButton("½ÃÀÛ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startTimer();
			}
		});
		btnNewButton.setBounds(162, 116, 97, 23);
		frame.getContentPane().add(btnNewButton);
		dialog = new MyDialog();
		dialog.setVisible(false);
		
	}
	
	private void startTimer() {
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				if (count > 0) {
					count--;
					progressBar.setValue(count);					
				} else {
					dialog.setVisible(true);
					timer.cancel();
				}
			}
		};
		timer = new Timer();
		timer.schedule(timerTask, 1, 1000);
	}
}








