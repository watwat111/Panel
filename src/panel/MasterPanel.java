package panel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import result.IResult;

public abstract class MasterPanel extends JPanel{
	private File[] files;
	protected IResult[] results;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MasterPanel() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void setFiles(File[] files){
		this.files = files;
		results = new IResult[files.length];
		//System.out.println(files.length);
		fileToResult();
		//System.out.println(results.length);
	}
	
	public void fileToResult(){
		for(int i = 0; i < results.length; i++){
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(files[i]));
				results[i] = (IResult)ois.readObject();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public abstract void endSetFiles();
	
	
	

}
