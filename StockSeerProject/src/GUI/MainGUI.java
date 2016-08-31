package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainGUI extends JFrame {

	private JPanel contentPane;
	private JButton f_btnLookUp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
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
	public MainGUI() {
		initComponents();
		createEvents();

	}

	/**
	 * initialize components
	 */
	private void initComponents() {
		setMinimumSize(new Dimension(600, 400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		f_btnLookUp = new JButton("Look up");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addComponent(f_btnLookUp).addContainerGap(673, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addComponent(f_btnLookUp).addContainerGap(539, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);

	}

	/**
	 * create events
	 */
	private void createEvents() {

		/**
		 * launch symbol lookup window
		 */
		f_btnLookUp.addActionListener(new ActionListener() {
			// FIXME windows dependency
			public void actionPerformed(ActionEvent e) {
				System.out.println("Look Up button pressed");
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							// MainGUI frame = new MainGUI();
							// frame.setVisible(true);
							SymbolLookup symbolLookupFrame = new SymbolLookup();
							symbolLookupFrame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});

			}
		});
	}
}
