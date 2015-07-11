package panel;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import file_chooser.MyFileChooserAction;

public class ResultFrame extends JFrame {

	public ResultFrame() {
		JMenuBar bar = new JMenuBar();

		JMenu menuFile = new JMenu("File");
		JMenuItem load = new JMenuItem("ì«Ç›çûÇ›");
		
		menuFile.add(load);
		
		load.addActionListener(new MyFileChooserAction());

		bar.add(menuFile);

		setJMenuBar(bar);

	}
	
	
}
