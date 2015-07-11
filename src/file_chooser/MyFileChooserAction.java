package file_chooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;

public class MyFileChooserAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JFileChooser filechooser = new JFileChooser();
	    filechooser.setMultiSelectionEnabled(true);

	    int selected = filechooser.showOpenDialog(filechooser);
	    if (selected == JFileChooser.APPROVE_OPTION){
	      File[] files = filechooser.getSelectedFiles();
	      System.out.println(files.length);
	    }
	    
	  
		
	}

}
