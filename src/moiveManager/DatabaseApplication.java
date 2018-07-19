package moiveManager;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
/**
 * this is the database application class this class is extend JFrame and as the control
 * of the MVC
 * @author Luo Zeting ID 16938158
 */
public class DatabaseApplication extends JFrame {

	private  FilmList model = new FilmList();
	private FilmListPanel view;

	DatabaseApplication(String title) {
		super(title);
		this.view = new FilmListPanel(model);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane();
		this.add(view);
		this.setSize(1600, 900);
				
		try
		{
			this.model.eventHandleInput(this.model,this.view);
			this.view.update();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("No database found!");
		}
		
		
		this.view.getAddButton().addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				eventHandleAddButton();
			}
		});

		this.view.getRemoveButton().addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				eventHandleListRemoveButton();
			}
		});

		this.view.getFilmList().addListSelectionListener(new ListSelectionListener() 
		{
			@Override
			public void valueChanged(ListSelectionEvent e) {
				eventHandleListUpdate();
			}
		});
		this.view.getSearchList().addListSelectionListener(new ListSelectionListener() 
		{
			@Override
			public void valueChanged(ListSelectionEvent e) {
				eventHandleListUpdate();
			}
		});
	
		this.view.getOutPutButton().addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					eventHandleOutputButton();
				} catch (IOException NoAbleToWrite) {
					System.out.println("File Unable To Write");
				}
			}
		});
		this.view.getSearchButton().addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						eventHandleSearchButton();
					}
				});
		
		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				model.eventHandleOutputButton(model);
			}
		});

	}

	/**
	 * this is the main method use to call the database application
	 */
	public static void main(String[] args) 
	{

		JFrame app = new DatabaseApplication("Film Database");
		app.setVisible(true);
	}

	/** 
	 * this method will be called when user click remove button
	 * @author Luo Zeting ID 16938158
	 */
	private void eventHandleListRemoveButton() 
	{
		this.model.eventHandleListRemoveButton(this.model,this.view);
	}

	/**
	 * this method will be called when user click add button
	 * @author Luo Zeting ID 16938158
	 */
	private void eventHandleAddButton() 
	{
		this.model.eventHandleAddButton(this.model,this.view);
	}
	/**
	 * the method will be called when user selected in JList
	 * @author Luo Zeting ID 16938158
	 */
	private void eventHandleListUpdate() 
	{
		this.model.eventHandleListUpdate(this.model,this.view);
	}

	/**
	 * this method will be called when user click save button
	 * @author Luo Zeting ID 16938158
	 */
	private void eventHandleOutputButton() throws IOException 
	{
		this.model.eventHandleOutputButton(this.model);
	}
		
	/**
	 * 
	 * this method will be called when user click search button
	 * @author Luo Zeting ID 16938158
	 */
	private void eventHandleSearchButton()
	{
		this.model.eventHandleSearchButton(this.model,this.view);
	}
}
