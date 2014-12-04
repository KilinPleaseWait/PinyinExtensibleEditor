package us.loadingpleasewait.pee;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class GUI extends JFrame{

	private static final long serialVersionUID = 63895785266111154L;
	
	private JTextArea input;
    private JTextArea output;
    private JPanel jPanel;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;

	/**
	 * Just a default constructor
	 */
	public GUI() {
        
    }
	
	/**
	 * @param gc
	 */
	public GUI(GraphicsConfiguration gc) {
		super(gc);
	}

	/**
	 * @param title
	 * @param gc
	 */
	public GUI(String title, GraphicsConfiguration gc) {
		super(title, gc);
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public GUI(String title) throws HeadlessException {
		super(title);
	}

	public void initComponents() {

        jPanel = new JPanel();
        jScrollPane1 = new JScrollPane();
        output = new JTextArea();
        jScrollPane2 = new JScrollPane();
        input = new JTextArea();

        setTitle("Pinyin Extensible Editor");
		setSize(800, 500);
		setVisible(true);
		setResizable(false); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		output.setColumns(20);
		output.setEditable(false);
        jScrollPane1.setViewportView(output);

        input.setColumns(20);
        jScrollPane2.setViewportView(input);

        GroupLayout jPanelLayout = new GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(jPanelLayout.createParallelGroup(Alignment.LEADING)
                .addComponent(jScrollPane2))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanelLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanelLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    ))
        );
        
        

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
            .addComponent(jPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
            .addComponent(jPanel)
        );
        
        input.setLineWrap(true);
        output.setLineWrap(true);
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        pack();
    }

	/**
	 * @return the input
	 */
	protected JTextArea getInput() {
		return input;
	}

	/**
	 * @param input the input to set
	 */
	protected void setInput(JTextArea input) {
		this.input = input;
	}

	/**
	 * @return the output
	 */
	protected JTextArea getOutput() {
		return output;
	}

	/**
	 * @param output the output to set
	 */
	protected void setOutput(JTextArea output) {
		this.output = output;
	}

	/**
	 * @return the jPanel
	 */
	protected JPanel getjPanel() {
		return jPanel;
	}

	/**
	 * @param jPanel the jPanel to set
	 */
	protected void setjPanel(JPanel jPanel) {
		this.jPanel = jPanel;
	}

	/**
	 * @return the jScrollPane1
	 */
	protected JScrollPane getjScrollPane1() {
		return jScrollPane1;
	}

	/**
	 * @param jScrollPane1 the jScrollPane1 to set
	 */
	protected void setjScrollPane1(JScrollPane jScrollPane1) {
		this.jScrollPane1 = jScrollPane1;
	}

	/**
	 * @return the jScrollPane2
	 */
	protected JScrollPane getjScrollPane2() {
		return jScrollPane2;
	}

	/**
	 * @param jScrollPane2 the jScrollPane2 to set
	 */
	protected void setjScrollPane2(JScrollPane jScrollPane2) {
		this.jScrollPane2 = jScrollPane2;
	}
}
