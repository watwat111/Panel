package panel;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import file_chooser.MyFileChooserAction;

public class ResultFrame extends JFrame {
	private String filePath;
	private String extension;
	private MyFileChooserAction fileChooser;

	public ResultFrame(String filePath,String extension,MasterPanel panel) {
		this.filePath = filePath;
		this.extension = extension;
		MyFileChooserAction fileChooser = new MyFileChooserAction(filePath,extension,panel);
		
		JMenuBar bar = new JMenuBar();

		JMenu menuFile = new JMenu("File");
		JMenuItem load = new JMenuItem("ì«Ç›çûÇ›");
		
		menuFile.add(load);
		
		load.addActionListener(fileChooser);

		bar.add(menuFile);

		setJMenuBar(bar);
		
		add(panel);
		

	}
	

	
	
}
