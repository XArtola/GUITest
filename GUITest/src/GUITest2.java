import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class GUITest2 extends JFrame {

	private JPanel contentPane;
	private JTextField show;
	private String aux = "";

	private void showInDisplay(String symbol) {
		
		if (symbol.matches("[srmd]") && aux.matches(""))
			show.setText("ERROR");
		
		else if (symbol.matches("[srmd]") && !aux.matches(""))
			show.setText("ERROR");

		else if (show.getText().matches("")) {

			show.setText(symbol);

		}
		

		else
			show.setText(show.getText() + symbol);

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUITest2 frame = new GUITest2();
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
	public GUITest2() {
		setTitle("Graphic User Interface");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 268);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton button = new JButton("+");
		button.setForeground(Color.RED);
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				showInDisplay("s");
			}
		});
		button.setBounds(10, 153, 89, 23);
		contentPane.add(button);

		JButton button_1 = new JButton("-");
		button_1.setBackground(Color.YELLOW);
		button_1.setBounds(109, 153, 89, 23);
		contentPane.add(button_1);
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				showInDisplay("r");
				
			}
		});

		JButton button_2 = new JButton("*");
		button_2.setBackground(Color.CYAN);
		button_2.setBounds(109, 187, 89, 23);
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				showInDisplay("m");
				
			}
		});

		JButton button_3 = new JButton("/");
		button_3.setForeground(Color.MAGENTA);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				showInDisplay("d");
				
			}
		});
		button_3.setBounds(10, 187, 89, 23);
		contentPane.add(button_3);

		JButton button_4 = new JButton("9");
		button_4.setBounds(441, 82, 89, 23);
		contentPane.add(button_4);
		button_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			showInDisplay("9");
			}
		});

		JButton button_5 = new JButton("8");
		button_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			showInDisplay("8");
			}
		});
		button_5.setBounds(341, 82, 89, 23);
		contentPane.add(button_5);

		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				showInDisplay("7");
				
			}
		});
		button_6.setBounds(242, 82, 89, 23);
		contentPane.add(button_6);

		JButton button_7 = new JButton("4");
		button_7.setBounds(242, 122, 89, 23);
		contentPane.add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				showInDisplay("4");
				
			}
		});
		

		JButton button_8 = new JButton("5");
		button_8.setBounds(341, 122, 89, 23);
		contentPane.add(button_8);
		
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				showInDisplay("5");
				
			}
		});

		JButton button_9 = new JButton("6");
		button_9.setBounds(441, 122, 89, 23);
		contentPane.add(button_9);
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				showInDisplay("6");
				
			}
		});

		JButton button_10 = new JButton("1");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				showInDisplay("1");
			}
		});
		button_10.setBounds(242, 163, 89, 23);
		contentPane.add(button_10);

		JButton button_11 = new JButton("2");
		button_11.setBounds(341, 163, 89, 23);
		contentPane.add(button_11);
		
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				showInDisplay("2");
			}
		});
		
		

		JButton button_12 = new JButton("3");
		button_12.setBounds(441, 163, 89, 23);
		contentPane.add(button_12);
		
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				showInDisplay("3");
			}
		});

		JButton button_13 = new JButton("=");
		button_13.setBounds(441, 197, 89, 23);
		contentPane.add(button_13);
		
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				showInDisplay("=");
			}
		});

		JButton button_14 = new JButton("0");
		button_14.setBounds(341, 197, 89, 23);
		contentPane.add(button_14);
		
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				showInDisplay("0");
			}
		});

		show = new JTextField();
		show.setBounds(10, 11, 520, 60);
		contentPane.add(show);
		show.setColumns(10);
	}
}
