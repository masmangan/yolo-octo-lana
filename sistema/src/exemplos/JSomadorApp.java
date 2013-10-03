package exemplos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;
import java.awt.event.InputEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JSomadorApp {

	private JFrame frame;
	private JTextField textFieldP1;
	private JTextField textFieldP2;
	private JTextField textFieldResultado;
	private final Action actionSomar = new SwingAction();
private Somador somador;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSomadorApp window = new JSomadorApp();
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
	public JSomadorApp() {
		somador = new Somador();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenu mnCalcular = new JMenu("Calcular");
		menuBar.add(mnCalcular);
		
		JMenuItem mntmSomar = new JMenuItem("New menu item");
		mntmSomar.setAction(actionSomar);
		mnCalcular.add(mntmSomar);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		frame.getContentPane().setLayout(
				new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		JLabel lblP1 = new JLabel("P1");
		frame.getContentPane().add(lblP1, "2, 2, right, default");

		textFieldP1 = new JTextField();
		frame.getContentPane().add(textFieldP1, "4, 2");
		textFieldP1.setColumns(10);

		JLabel lblP2 = new JLabel("P2");
		frame.getContentPane().add(lblP2, "2, 4, right, default");

		textFieldP2 = new JTextField();
		frame.getContentPane().add(textFieldP2, "4, 4, fill, default");
		textFieldP2.setColumns(10);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setAction(actionSomar);
		frame.getContentPane().add(btnNewButton, "4, 6");

		JLabel lblResultado = new JLabel("P1+P2");
		frame.getContentPane().add(lblResultado, "2, 8, right, default");

		textFieldResultado = new JTextField();
		textFieldResultado.setEditable(false);
		frame.getContentPane().add(textFieldResultado, "4, 8, fill, default");
		textFieldResultado.setColumns(10);
	}

	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public SwingAction() {
			putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
			putValue(MNEMONIC_KEY, KeyEvent.VK_S);
			putValue(NAME, "Somar");
			putValue(SHORT_DESCRIPTION, "Somar dois n\u00FAmeros");
		}

		public void actionPerformed(ActionEvent e) {
			try {
				somador.setP1(Integer.parseInt(textFieldP1.getText()));
				somador.setP2(Integer.parseInt(textFieldP2.getText()));
				textFieldResultado.setText(String.format("%d", somador.getSoma()));
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(frame,
						"Verifique seus dados de entrada!");
			}
		}
	}
}
