package javaAssignment;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.util.Arrays;


public class Stage2 {

	private JFrame frame;
	private JTextField JTextField_r1Sc1;
	private JTextField JTextField_r1Sc2;
	private JTextField JTextField_r1Sc3;
	private JTextField JTextField_r1Sc4;
	private JTextField JTextField_r1Sc5;
	private JTextField JTextField_r1Sc6;
	private JTextField JTextField_r1Sc7;
	private JTextField JTextField_r2Sc1;
	private JTextField JTextField_r2Sc2;
	private JTextField JTextField_r2Sc3;
	private JTextField JTextField_r2Sc4;
	private JTextField JTextField_r2Sc5;
	private JTextField JTextField_r2Sc6;
	private JTextField JTextField_r2Sc7;
	private JTextField JTextField_AthNameTxt;
	private JTextField JTextField_BestSc;
	private JTextField JTextField_R1Total;
	private JTextField JTextField_R2Total;
	//Create Arrays
	public double[] daRun1 = new double[7];
	public double[] daRun2 = new double[7];
	public double r1Avg = 0;
	public double r2Avg = 0;
	public double r1AvgFin = 0;
	public double r2AvgFin = 0;
	public double JTextField_r1Sc1Text = 0;
	public double JTextField_r1Sc2Text = 0;
	public double JTextField_r1Sc3Text = 0;
	public double JTextField_r1Sc4Text = 0;
	

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stage2 window = new Stage2();
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
	public Stage2() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		frame = new JFrame("Snowboarding 2018 Threadbo");
		frame.setBounds(100, 100, 508, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel JLabel_H1 = new JLabel("     Snowboard Scoring System U3096421");
		JLabel_H1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JLabel_H1.setBounds(54, 11, 410, 31);
		frame.getContentPane().add(JLabel_H1);
		
		JLabel JLabel_H2 = new JLabel("Winter Olympics 2018 Thredbo");
		JLabel_H2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		JLabel_H2.setBounds(134, 47, 244, 20);
		frame.getContentPane().add(JLabel_H2);
		
		JLabel JLabel_H3 = new JLabel("Enter Athletes Score");
		JLabel_H3.setFont(new Font("Tahoma", Font.ITALIC, 13));
		JLabel_H3.setBounds(76, 78, 134, 14);
		frame.getContentPane().add(JLabel_H3);
		
		JLabel JLabel_J1 = new JLabel("Judge 1");
		JLabel_J1.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel_J1.setBounds(10, 127, 60, 14);
		frame.getContentPane().add(JLabel_J1);
		
		JLabel JLabel_J2 = new JLabel("Judge 2");
		JLabel_J2.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel_J2.setBounds(10, 152, 60, 14);
		frame.getContentPane().add(JLabel_J2);
		
		JLabel JLabel_J3 = new JLabel("Judge 3");
		JLabel_J3.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel_J3.setBounds(10, 177, 60, 14);
		frame.getContentPane().add(JLabel_J3);
		
		JLabel JLabel_J4 = new JLabel("Judge 4");
		JLabel_J4.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel_J4.setBounds(10, 203, 60, 14);
		frame.getContentPane().add(JLabel_J4);
		
		JLabel JLabel_J5 = new JLabel("Judge 5");
		JLabel_J5.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel_J5.setBounds(10, 228, 60, 14);
		frame.getContentPane().add(JLabel_J5);
		
		JLabel JLabel_J6 = new JLabel("Judge 6");
		JLabel_J6.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel_J6.setBounds(10, 253, 60, 14);
		frame.getContentPane().add(JLabel_J6);
		
		JLabel JLabel_J7 = new JLabel("Judge 7");
		JLabel_J7.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel_J7.setBounds(10, 279, 60, 14);
		frame.getContentPane().add(JLabel_J7);
		
		JLabel JLabel_Rn1 = new JLabel("Run 1");
		JLabel_Rn1.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel_Rn1.setBounds(80, 103, 44, 14);
		frame.getContentPane().add(JLabel_Rn1);
		
		JLabel JLabel_Rn2 = new JLabel("Run 2");
		JLabel_Rn2.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel_Rn2.setBounds(147, 103, 44, 14);
		frame.getContentPane().add(JLabel_Rn2);
		
		JLabel JLabel_AthName = new JLabel("Athetes Name:");
		JLabel_AthName.setFont(new Font("Tahoma", Font.ITALIC, 13));
		JLabel_AthName.setBounds(258, 127, 93, 14);
		frame.getContentPane().add(JLabel_AthName);
		
		JLabel JLabel_BSrc = new JLabel("Best Score:");
		JLabel_BSrc.setFont(new Font("Tahoma", Font.ITALIC, 13));
		JLabel_BSrc.setBounds(258, 156, 93, 14);
		frame.getContentPane().add(JLabel_BSrc);
		
		JLabel JLabel_Total = new JLabel("Total");
		JLabel_Total.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel_Total.setBounds(10, 317, 60, 14);
		frame.getContentPane().add(JLabel_Total);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 304, 200, 2);
		frame.getContentPane().add(separator);
		
		JTextField_r1Sc1 = new JTextField();
		JTextField_r1Sc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = JTextField_r1Sc1.getText();
				JTextField_r1Sc1Text = Double.parseDouble(text);
							
			}
		});
		JTextField_r1Sc1.setBounds(76, 125, 50, 20);
		frame.getContentPane().add(JTextField_r1Sc1);
		JTextField_r1Sc1.setColumns(10);
		
		JTextField_r1Sc2 = new JTextField();
		JTextField_r1Sc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = JTextField_r1Sc2.getText();
				daRun1[2] = Double.parseDouble(text);
				
			}
		});
		JTextField_r1Sc2.setColumns(10);
		JTextField_r1Sc2.setBounds(76, 150, 50, 20);
		frame.getContentPane().add(JTextField_r1Sc2);
		
		JTextField_r1Sc3 = new JTextField();
		JTextField_r1Sc3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = JTextField_r1Sc3.getText();
				daRun1[3] = Double.parseDouble(text);
				
			}
		});
		JTextField_r1Sc3.setColumns(10);
		JTextField_r1Sc3.setBounds(76, 175, 50, 20);
		frame.getContentPane().add(JTextField_r1Sc3);
		
		JTextField_r1Sc4 = new JTextField();
		JTextField_r1Sc4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = JTextField_r1Sc4.getText();
				daRun1[4] = Double.parseDouble(text);
				
			}
		});
		JTextField_r1Sc4.setColumns(10);
		JTextField_r1Sc4.setBounds(76, 201, 50, 20);
		frame.getContentPane().add(JTextField_r1Sc4);
		
		JTextField_r1Sc5 = new JTextField();
		JTextField_r1Sc5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = JTextField_r1Sc5.getText();
				daRun1[5] = Double.parseDouble(text);
				
			}
		});
		JTextField_r1Sc5.setColumns(10);
		JTextField_r1Sc5.setBounds(76, 226, 50, 20);
		frame.getContentPane().add(JTextField_r1Sc5);
		
		JTextField_r1Sc6 = new JTextField();
		JTextField_r1Sc6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = JTextField_r1Sc6.getText();
				daRun1[6] = Double.parseDouble(text);
				
			}
		});
		JTextField_r1Sc6.setColumns(10);
		JTextField_r1Sc6.setBounds(76, 251, 50, 20);
		frame.getContentPane().add(JTextField_r1Sc6);
		
		JTextField_r1Sc7 = new JTextField();
		JTextField_r1Sc7.setColumns(10);
		JTextField_r1Sc7.setBounds(76, 277, 50, 20);
		frame.getContentPane().add(JTextField_r1Sc7);
		
		JTextField_r2Sc1 = new JTextField();
		JTextField_r2Sc1.setColumns(10);
		JTextField_r2Sc1.setBounds(141, 125, 50, 20);
		frame.getContentPane().add(JTextField_r2Sc1);
		
		JTextField_r2Sc2 = new JTextField();
		JTextField_r2Sc2.setColumns(10);
		JTextField_r2Sc2.setBounds(141, 150, 50, 20);
		frame.getContentPane().add(JTextField_r2Sc2);
		
		JTextField_r2Sc3 = new JTextField();
		JTextField_r2Sc3.setColumns(10);
		JTextField_r2Sc3.setBounds(141, 175, 50, 20);
		frame.getContentPane().add(JTextField_r2Sc3);
		
		JTextField_r2Sc4 = new JTextField();
		JTextField_r2Sc4.setColumns(10);
		JTextField_r2Sc4.setBounds(141, 201, 50, 20);
		frame.getContentPane().add(JTextField_r2Sc4);
		
		JTextField_r2Sc5 = new JTextField();
		JTextField_r2Sc5.setColumns(10);
		JTextField_r2Sc5.setBounds(141, 226, 50, 20);
		frame.getContentPane().add(JTextField_r2Sc5);
		
		JTextField_r2Sc6 = new JTextField();
		JTextField_r2Sc6.setColumns(10);
		JTextField_r2Sc6.setBounds(141, 251, 50, 20);
		frame.getContentPane().add(JTextField_r2Sc6);
		
		JTextField_r2Sc7 = new JTextField();
		JTextField_r2Sc7.setColumns(10);
		JTextField_r2Sc7.setBounds(141, 277, 50, 20);
		frame.getContentPane().add(JTextField_r2Sc7);
		
		JTextField_AthNameTxt = new JTextField();
		JTextField_AthNameTxt.setText("Name");
		JTextField_AthNameTxt.setBounds(361, 125, 103, 20);
		frame.getContentPane().add(JTextField_AthNameTxt);
		JTextField_AthNameTxt.setColumns(10);
		
		//Calculates Scores
		JButton jButton_Calc = new JButton("Calculate");
		jButton_Calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				daRun1[3] = JTextField_r1Sc1Text;
				System.out.println(daRun1[3]);	
				
				//Sort Arrays and remove first (lowest) and last (highest)
				Arrays.sort(daRun1);
				Arrays.sort(daRun2);
				daRun1[0] = 0;
				daRun1[6] = 0;
				daRun2[0] = 0;
				daRun2[6] = 0;
				
				// Find the sum 
				
				
				
				
				
				for (int count3=0;count3 < daRun1.length;count3++) {
					r1Avg += daRun1[count3];
					
				}
				for (int count4=0;count4 < daRun2.length;count4++) {
					r2Avg += daRun2[count4];
					
				 }
				
				
				
				
				// Find the average
				r1Avg = r1Avg / 5 ;
				r2Avg = r2Avg / 5 ;
				
				String r1AvgFin = String.valueOf(r1Avg);

				JTextField_R1Total.setText(r1AvgFin);
				
			}
		});
		jButton_Calc.setFont(new Font("Tahoma", Font.BOLD, 12));
		jButton_Calc.setBounds(262, 330, 89, 23);
		frame.getContentPane().add(jButton_Calc);
		
		// Exits the application
		JButton jButtonQuit = new JButton("Quit");
		jButtonQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
				
		});
		
		jButtonQuit.setFont(new Font("Tahoma", Font.BOLD, 12));
		jButtonQuit.setBounds(376, 330, 89, 23);
		frame.getContentPane().add(jButtonQuit);
		
		JTextField_BestSc = new JTextField();
		JTextField_BestSc.setText("Name");
		JTextField_BestSc.setColumns(10);
		JTextField_BestSc.setBounds(361, 150, 103, 20);
		frame.getContentPane().add(JTextField_BestSc);
		
		JTextField_R1Total = new JTextField();
		JTextField_R1Total.setColumns(10);
		JTextField_R1Total.setBounds(76, 315, 50, 20);
		frame.getContentPane().add(JTextField_R1Total);
		
		JTextField_R2Total = new JTextField();
		JTextField_R2Total.setColumns(10);
		JTextField_R2Total.setBounds(141, 315, 50, 20);
		frame.getContentPane().add(JTextField_R2Total);
		
		
	}
}
