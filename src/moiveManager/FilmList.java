package moiveManager;

import java.util.*;
import java.io.*;

/**
 * FilmList class is the model of MVC, it has all the method used for the databased 
 * application, also have the two arrayList and a searhEngine
 * @author Luo Zeting ID 168938158
 */
public class FilmList {
	private ArrayList<Film> filmItems;
	private searchEngine searchEngine;
	private ArrayList<Film> currentList;
	
	/**
	 * The constructor of the FilmList, this will initialize filmItems and currentList
	 * @author Luo Zeting ID 168938158
	 */
	FilmList()
	{
		this.filmItems = new ArrayList<Film>();
		this.currentList=new ArrayList<Film>();
	}
	/**
	 * this method will allow us add Film object to the filmItems, the film object will
	 * be add to the index 0 of the array
	 * @param film we want to add into the ArrayList
	 * @author Luo Zeting ID 168938158
	 */
	public void addFilm(Film film)
	{
		this.filmItems.add(0,film);
	}
	
	/**
	 * this method will allow us add Films object to the filmItems
	 * @param films want to add to filmItems
	 * @author Luo Zeting ID 168938158
	 */
	public void addFilms(ArrayList<Film> films)
	{
		this.filmItems.addAll(films);
	}
	
	/**
	 * this method will allow us remove Film from the filmItems
	 * @param index of the movie wanted to remove
	 * @author Luo Zeting ID 168938158
	 */
	public void removeFilmtItem(int index)
	{
		this.filmItems.remove(index);
	}
	
	/**
	 * this method will allow us to access to the currentList
	 * @return currentList(the ArrayList keep update itself, used for display search
	 * result
	 * @author Luo Zeting ID 168938158
	 */
	public ArrayList<Film> getCurrentList() {
		return currentList;
	}
	
	/**
	 * this method will allow us set up the currentList
	 * @param currentList is a ArrayList which have all the search result
	 * @author Luo Zeting ID 168938158
	 */
	public void setCurrentList(ArrayList<Film> currentList) {
		this.currentList = currentList;
	}
	
	/**
	 * this method will allow us to access to the private variable filmItems
	 * @return the filmItems
	 * @author Luo Zeting ID 168938158
	 */
	public ArrayList<Film> getFilmItems()
	{
		return this.filmItems;
	}
	
	/**
	 * this method will initialize a searchEngine object
	 * @param titleIsEmtpy check title input is empty or not
	 * @param yearIsEmtpy check year input is empty or not
	 * @param directorIsEmtpy check director input is empty or not
	 * @param castIsEmtpy check cast input is empty or not
	 * @param genreIsEmtpy check genre input is empty or not
	 * @param ratingIsEmtpy check rating input is empty or not
	 * @author Luo Zeting ID 168938158
	 */
	public void searchEngine(boolean titleIsEmtpy, 
							boolean yearIsEmtpy, 
							boolean directorIsEmtpy, 
							boolean castIsEmtpy, 
							boolean genreIsEmtpy, 
							boolean ratingIsEmtpy)
	{
		searchEngine = new searchEngine(this.filmItems,
										titleIsEmtpy,
										yearIsEmtpy,
										directorIsEmtpy,
										castIsEmtpy,
										genreIsEmtpy,
										ratingIsEmtpy);
	}
	
	/**
	 * this method will allow us to access to the private variable getSearchEngine
	 * @return the searchEngine object
	 * @author Luo Zeting ID 168938158
	 */
	public searchEngine getSearchEngine() {
		return searchEngine;
	}
	
	/**
	 * this method is used hendle JList update for the view, when used select different
	 * index in JList this method will be called, this method will update displayed movie
	 * information
	 * @param model of the databaseApplication
	 * @param view of the databaseApplication
	 * @author Luo Zeting ID 168938158
	 */
	public void eventHandleListUpdate(FilmList model,FilmListPanel view)
	{
		if(!view.getFilmList().isSelectionEmpty())
		{
			if (view.getFilmList().getSelectedIndex() != -1) 
			{
				view.getDisplayTitle().setText("Title: " + getFilmItems().get(view.getFilmList().getSelectedIndex()).getTitle());
				view.getDisplayCast().setText(	"Cast: " + model.getFilmItems().get(view.getFilmList().getSelectedIndex()).getCastList());
				view.getDisplayDirector().setText("Director: "	+ model.getFilmItems().get(view.getFilmList().getSelectedIndex()).getDirector());
				view.getDisplayRating().setText("Rate: " + model.getFilmItems().get(view.getFilmList().getSelectedIndex()).getRating());
				view.getDisplayGenre().setText("Genre: " +model.getFilmItems().get(view.getFilmList().getSelectedIndex()).getGenre());
				view.getDisplayYear().setText("Year: "	+model.getFilmItems().get(view.getFilmList().getSelectedIndex()).getReleaseYear());
			}
		}
		else if (!view.getSearchList().isSelectionEmpty())
		{
			if (view.getSearchList().getSelectedIndex() != -1) 
			{
				view.getDisplayTitle().setText("Title: " + model.getCurrentList().get(view.getSearchList().getSelectedIndex()).getTitle());
				view.getDisplayCast().setText(	"Cast: " + model.getCurrentList().get(view.getSearchList().getSelectedIndex()).getCastList());
				view.getDisplayDirector().setText("Director: "	+ model.getCurrentList().get(view.getSearchList().getSelectedIndex()).getDirector());
				view.getDisplayRating().setText("Rate: " + model.getCurrentList().get(view.getSearchList().getSelectedIndex()).getRating());
				view.getDisplayGenre().setText("Genre: " +model.getCurrentList().get(view.getSearchList().getSelectedIndex()).getGenre());
				view.getDisplayYear().setText("Year: "	+model.getCurrentList().get(view.getSearchList().getSelectedIndex()).getReleaseYear());
			}
		}
		
	}
	
	/**
	 * this will handle the output(Save) Button in the GUI be clicked, when user click the
	 * save button this method will be call and output a txt file call MovieDatabase.txt, 
	 * this method will have IOException when it not able to write the file, when this
	 * happen in the console will show "An IO error occurred"
	 * @param model used in the databaseApplication
	 * @author Luo Zeting ID 16938158
	 */
	public void eventHandleOutputButton(FilmList model)
	{
		try {
			PrintWriter out = new PrintWriter(new FileWriter("MovieDatabase.txt"));
			for (int i = 0; i <= model.getFilmItems().size(); i++) 
			{
				if (i != model.getFilmItems().size()) 
				{
					out.println("[Moive"+i+"]");
					out.println("[Title]");
					out.println(model.getFilmItems().get(i).getTitle());
					out.println("[Director]");
					out.println(model.getFilmItems().get(i).getDirector());
					out.println("[Release Year]");
					out.println(model.getFilmItems().get(i).getReleaseYear());
					out.println("[Rating]");
					out.println(model.getFilmItems().get(i).getRating());
					out.println("[Genre]");
					out.println(model.getFilmItems().get(i).getGenre());
					out.println("[Cast]");
					out.println(model.getFilmItems().get(i).getCastList());
					out.println("");
				} 
				else 
				{
					out.println("END!");
				}
			}
			out.close();
		} 
		catch (IOException unableToWrite) 
		{
			System.err.println("An IO error occurred");
		}
		
	}
	/**
	 * this will input data from the database call MovieDatabase.txt, if the
	 *  fileReader load to the button will show NoSuchElementException
	 * this exception will be used for break the read process, also FileNotFoundException
	 *  will show when the FileReader can not found the MovieDatabase.txt, if this
	 * exception happened, console will display "NO database" 
	 * @param model used in the databaseApplication
	 * @param view used in the databaseApplication
	 * @return a updated model for use
	 */
	public FilmList eventHandleInput(FilmList model,FilmListPanel view) 
	{
		try {

			String check = "";
			Scanner input = new Scanner(new FileReader("MovieDatabase.txt"));
			do 	
			{
				try 
				{
					if (check != "END!") 
					{
						Film tempFilm = new Film();
						input.nextLine();
						input.nextLine();
						tempFilm.setTitle(input.nextLine());
						input.nextLine();
						tempFilm.setDirector(input.nextLine());
						input.nextLine();
						tempFilm.setReleaseYear(input.nextLine());
						input.nextLine();
						tempFilm.setRating(Integer.valueOf(input.nextLine().charAt(0)) - 48);
						input.nextLine();
						tempFilm.setGenre(Genre.valueOf(input.nextLine()));
						input.nextLine();
						check = input.nextLine().trim();
						tempFilm.setCastList(check);
						model.addFilm(tempFilm);
						tempFilm = null;// clean for next input
						input.nextLine();
			
				} 
			}
			catch (NoSuchElementException e) 
			{
				input.close();
				break;
			}
			}while (true);
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("NO database");
		}
		view.update();
		return model;
	}
	
	/**
	 * this medthod will handle the seach button in GUI be click, when user click 
	 * the search button this method will be called, this method will create a new 
	 * searchEngine and input data for it, then it will update the search result JList
	 * @param model used in the databaseApplication
	 * @param view used in the databaseApplication
	 * @author Luo Zeting ID 16938158
	 */
	public void eventHandleSearchButton(FilmList model,FilmListPanel view) 
	{
		Genre tempGenre = null;
		int tempRating = 0;
		
		model.searchEngine((!view.getSearchTitleField().getText().trim().isEmpty()&&
							(view.getSearchTitleField().getText().trim()!="")),
							(!view.getSearchYearFieldLeft().getText().trim().isEmpty()&&
							(view.getSearchYearFieldLeft().getText().trim()!="")&&
							!(view.getSearchYearFieldRight().getText().trim().isEmpty())&&
							(view.getSearchYearFieldRight().getText().trim()!="")),
							 (!view.getSearchDirectorField().getText().trim().isEmpty()&&
							(view.getSearchDirectorField().getText().trim()!="")), 
							 (!view.getSearchCastField().getText().trim().isEmpty()&&
							(view.getSearchCastField().getText().trim()!="")), 
							 (view.getSearchGenreListBox().getSelectedItem()!=null),
							 (view.getSearchRatingBox().getSelectedItem()!=null));
	
		try
		{
			tempGenre = Genre.valueOf(view.getSearchGenreListBox().getSelectedItem().toString());
		}
		catch(NullPointerException e)
		{
			System.out.println("No genre input, catched!");
		}
		
		try
		{
			tempRating = Integer.valueOf(view.getSearchRatingBox().getSelectedItem().toString());
		}
		catch(NullPointerException e)
		{
			System.out.println("No rating input,catched!");
		}
				
		model.setCurrentList(model.getSearchEngine().searchFilms(
				view.getSearchTitleField().getText().trim(),
				view.getSearchYearFieldLeft().getText().trim(), 
				view.getSearchYearFieldRight().getText().trim(), 
				view.getSearchDirectorField().getText().trim(),
				view.getSearchCastField().getText().trim(),
				tempGenre,tempRating));
	
		view.update();
	}
	
	/**
	 * this medthod will handle the remove button in GUI be clicked, when user click 
	 * remove button this method will be called, this method will see which index
	 * selected in the GUI and use that index to remove the Film from the model
	 * when JList not select getSelectedIndex() will return -1, then IndexOutOfBoundsException
	 * will happen console will show JList not selected
	 * @param model used in the databaseApplication
	 * @param view used in the databaseApplication
	 * @author Luo Zeting ID 16938158
	 */
	public void eventHandleListRemoveButton(FilmList model,FilmListPanel view)
	{
		
		try
		{
			model.removeFilmtItem(view.getFilmList().getSelectedIndex());
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("JList not selected");
		}
		view.update();
	}
	
	/**
	 * this method will handle the add button in GUI, whenuser click the add button this 
	 * method will be calle, this method will add get all the information user input
	 * in GUI and put those information to a tempFilm object and add this object to 
	 * the database in model(FilmItem)
	 * @param model used in the databaseApplication
	 * @param view used in the databaseApplication
	 * @author Luo Zeting ID 16938158
	 */
	public void eventHandleAddButton(FilmList model,FilmListPanel view)
	{
		Film tempFilm = new Film();
		if (!view.getAddTitleField().getText().trim().isEmpty()) 
		{
			tempFilm.setTitle(view.getAddTitleField().getText());
			view.getAddTitleField().setText("");
		}
		
		if (!view.getAddYearField().getText().trim().isEmpty()) 
		{
			tempFilm.setReleaseYear(view.getAddYearField().getText());
			view.getAddYearField().setText("");
		}
		
		if (!view.getAddCastField().getText().trim().isEmpty()) 
		{
			tempFilm.setCastList(view.getAddCastField().getText());
			view.getAddCastField().setText("");
		}
		
		if (!view.getAddDirectorField().getText().trim().isEmpty()) 
		{
			tempFilm.setDirector(view.getAddDirectorField().getText());
			view.getAddDirectorField().setText("");
		}
		
		tempFilm.setRating(Integer.valueOf(view.getAddRatingBox().getSelectedItem().toString()));
		tempFilm.setGenre(Genre.valueOf(view.getAddGenreListBox().getSelectedItem().toString()));
		
		if(!tempFilm.getTitle().isEmpty())
			{
			model.addFilm(tempFilm);
			}
		view.update();
	}

}