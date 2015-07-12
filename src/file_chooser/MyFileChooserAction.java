package file_chooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import panel.MasterPanel;

public class MyFileChooserAction implements ActionListener{
	private String filePath;
	private String extension;
	
	private MasterPanel panel;
	
	public MyFileChooserAction(String filePath,String extension,MasterPanel panel) {
		// TODO Auto-generated constructor stub
		this.filePath = filePath;
		this.extension = extension;
		this.panel = panel;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser filechooser = new JFileChooser(filePath);
		FileFilter filter = new FileNameExtensionFilter("", extension);
		filechooser.addChoosableFileFilter(filter);
	    filechooser.setMultiSelectionEnabled(true);

	    int selected = filechooser.showOpenDialog(filechooser);
	    if (selected == JFileChooser.APPROVE_OPTION){
	     
	      panel.setFiles( filechooser.getSelectedFiles());
	      panel.endSetFiles();
	      //System.out.println(files.length);
	    }
	}

}
