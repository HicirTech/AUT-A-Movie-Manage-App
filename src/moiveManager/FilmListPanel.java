package moiveManager;


import java.awt.*;
import javax.swing.*;

/**
 * this class is view of MVC, it is the GUI object
 * @author Luo Zeting ID 16938158
 */
public class FilmListPanel extends JPanel {	

	private FilmList model;
	private JList filmList;
	private JScrollPane searchBar;
	private JLabel resultLabel;
	private JLabel movieList;
	private JList searchList;
	private JLabel addTitle;
	private JTextField addTitleField;
	private JLabel addYear;
	private JTextField addYearField;
	private JLabel addRating;
	private JComboBox<Integer> addRatingBox;
	private JLabel addDirector;
	private JTextField addDirectorField;
	private JLabel addCast;
	private JTextField addCastField;
	private JLabel addGenreList;
	private JComboBox<Genre> addGenreListBox;
	private JLabel searchTitle;
	private JTextField searchTitleField;
	private JLabel searchYear;
	private JTextField searchYearFieldLeft;
	private JLabel toConnector;
	private JTextField searchYearFieldRight;
	private JLabel searchRating;
	private JComboBox<Integer> searchRatingBox;
	private JLabel searchDirector;
	private JTextField searchDirectorField;
	private JLabel searchCast;
	private JTextField searchCastField;
	private JLabel searchGenreList;
	private JComboBox<Genre> searchGenreListBox;
	private JButton addButton;
	private JButton removeButton;
	private JButton searchButton;
	private JLabel displayTitle;
	private JLabel displayYear;
	private JLabel displayCast;
	private JLabel displayGenre;
	private JLabel displayDirector;
	private JLabel displayRating;
	private JPanel listing;
	private JPanel adding ;
	private JPanel searching;
	private JPanel display;
	private JScrollPane listBar;
	private JButton outPutButton;

	
	
	FilmListPanel(FilmList model)
	{
		this.model=model;
		this.setLayout(null);
		this.setSize(1600,900);
		this.setVisible(true);
		
		this.adding = new JPanel();
		this.adding.setSize(450,775);
		this.adding.setLocation(650,25);
		this.adding.setLayout(null);
		
		this.searching = new JPanel();
		this.searching.setSize(450,775);
		this.searching.setLocation(1100,25);
		this.searching.setLayout(null);
		
		this.display = new JPanel();
		this.display.setSize(600,375);
		this.display.setLocation(25,425);
		this.display.setLayout(null);
		
		this.listing = new JPanel();
		this.listing.setSize(600, 400);
		this.listing.setLocation(25,25);
		this.listing.setLayout(null);

		this.displayTitle= new JLabel("Title:");
		this.displayTitle.setLocation(25,45);
		this.displayTitle.setSize(550, 35);
		this.displayTitle.setVisible(true);
		this.displayTitle.setFont(new Font("Times",Font.BOLD,30));
		this.display.add(displayTitle);
		
		this.displayDirector= new JLabel("Director:");
		this.displayDirector.setLocation(25,75);
		this.displayDirector.setSize(550, 35);
		this.displayDirector.setVisible(true);
		this.displayDirector.setFont(new Font("Times",Font.BOLD,30));
		this.display.add(displayDirector);

		this.displayCast= new JLabel("Cast:");
		this.displayCast.setLocation(25,105);
		this.displayCast.setSize(550, 35);
		this.displayCast.setVisible(true);
		this.displayCast.setFont(new Font("Times",Font.BOLD,30));
		this.display.add(displayCast);
		
		this.displayGenre= new JLabel("Genre:");
		this.displayGenre.setLocation(25,135);
		this.displayGenre.setSize(550, 35);
		this.displayGenre.setVisible(true);
		this.displayGenre.setFont(new Font("Times",Font.BOLD,30));
		this.display.add(displayGenre);
		
		this.displayYear= new JLabel("Year:");
		this.displayYear.setLocation(25,165);
		this.displayYear.setSize(550, 35);
		this.displayYear.setVisible(true);
		this.displayYear.setFont(new Font("Times",Font.BOLD,30));
		this.display.add(displayYear);
				
		this.displayRating= new JLabel("Rate:");
		this.displayRating.setLocation(25,195);
		this.displayRating.setSize(550, 35);
		this.displayRating.setVisible(true);
		this.displayRating.setFont(new Font("Times",Font.BOLD,30));
		this.display.add(displayRating);
			
		this.outPutButton= new JButton("Save Database");
		this.outPutButton.setLocation(25,315);
		this.outPutButton.setSize(550, 45);
		this.outPutButton.setVisible(true);
		this.outPutButton.setFont(new Font("Times",Font.BOLD,30));
		this.display.add(outPutButton);
		
		this.movieList=new JLabel("Your database:");
		this.movieList.setSize(263, 30);
		this.movieList.setLocation(25,45);
		this.movieList.setVisible(true);
		this.movieList.setFont(new Font("Times",Font.BOLD,25));
		this.listing.add(movieList);
		
		this.filmList = new JList<Film>();
		this.filmList.setListData(this.model.getFilmItems().toArray());
		this.filmList.setFont(new Font("Times",Font.BOLD,30));
		this.filmList.setBorder(BorderFactory.createLineBorder(Color.black));
		this.listBar= new JScrollPane(this.filmList,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.listBar.setSize(263, 315);
		this.listBar.setLocation(25,75);
		this.listing.add(listBar);
		
		this.resultLabel=new JLabel("Search Result:");
		this.resultLabel.setSize(263, 30);
		this.resultLabel.setLocation(300,45);
		this.resultLabel.setVisible(true);
		this.resultLabel.setFont(new Font("Times",Font.BOLD,25));
		this.listing.add(resultLabel);
		
		this.searchList = new JList<Film>();
		this.searchList.setListData(this.model.getCurrentList().toArray());
		this.searchList.setFont(new Font("Times",Font.BOLD,30));
		this.searchList.setBorder(BorderFactory.createLineBorder(Color.black));
		this.searchBar= new JScrollPane(this.searchList,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.searchBar.setSize(262, 315);
		this.searchBar.setLocation(300,75);
		this.listing.add(searchBar);
		
		
		this.addTitle= new JLabel("Movie Title");
		this.addTitle.setSize(200, 50);
		this.addTitle.setVisible(true);
		this.addTitle.setLocation(25, 35);
		this.addTitle.setFont(new Font("Times",Font.BOLD,30));
		this.adding.add(addTitle);
		
		this.addTitleField=new JTextField();
		this.addTitleField.setSize(400, 50);
		this.addTitleField.setVisible(true);
		this.addTitleField.setLocation(25,85);
		this.addTitleField.setFont(new Font("Times",Font.BOLD,30));
		this.adding.add(addTitleField);
		
		this.addYear= new JLabel("Year");
		this.addYear.setSize(200, 50);
		this.addYear.setVisible(true);
		this.addYear.setLocation(25, 135);
		this.addYear.setFont(new Font("Times",Font.BOLD,30));
		this.adding.add(addYear);
		
		this.addYearField=new JTextField();
		this.addYearField.setSize(400, 50);
		this.addYearField.setVisible(true);
		this.addYearField.setLocation(25,185);
		this.addYearField.setFont(new Font("Times",Font.BOLD,30));
		this.adding.add(addYearField);
		
		this.addDirector= new JLabel("Director");
		this.addDirector.setSize(200, 50);
		this.addDirector.setVisible(true);
		this.addDirector.setLocation(25, 235);
		this.addDirector.setFont(new Font("Times",Font.BOLD,30));
		this.adding.add(addDirector);
		
		this.addDirectorField=new JTextField();
		this.addDirectorField.setSize(400, 50);
		this.addDirectorField.setVisible(true);
		this.addDirectorField.setLocation(25,285);
		this.addDirectorField.setFont(new Font("Times",Font.BOLD,30));
		this.adding.add(addDirectorField);
		
		this.addCast= new JLabel("Cast");
		this.addCast.setSize(200, 50);
		this.addCast.setVisible(true);
		this.addCast.setLocation(25, 335);
		this.addCast.setFont(new Font("Times",Font.BOLD,30));
		this.adding.add(addCast);
		
		this.addCastField=new JTextField();
		this.addCastField.setSize(400, 50);
		this.addCastField.setVisible(true);
		this.addCastField.setLocation(25,385);
		this.addCastField.setFont(new Font("Times",Font.BOLD,30));
		this.adding.add(addCastField);
		
		this.addRating= new JLabel("Rating");
		this.addRating.setSize(200, 50);
		this.addRating.setVisible(true);
		this.addRating.setLocation(25, 535);
		this.addRating.setFont(new Font("Times",Font.BOLD,30));
		this.adding.add(addRating);
		
		this.addRatingBox=new JComboBox<Integer>();
		this.addRatingBox.setSize(400, 50);
		this.addRatingBox.addItem(1);
		this.addRatingBox.addItem(2);
		this.addRatingBox.addItem(3);
		this.addRatingBox.addItem(4);
		this.addRatingBox.addItem(5);
		this.addRatingBox.setVisible(true);
		this.addRatingBox.setLocation(25,585);
		this.addRatingBox.setFont(new Font("Times",Font.BOLD,30));
		this.adding.add(addRatingBox);
				
		this.addGenreList= new JLabel("Genre");
		this.addGenreList.setSize(200, 50);
		this.addGenreList.setVisible(true);
		this.addGenreList.setLocation(25, 435);
		this.addGenreList.setFont(new Font("Times",Font.BOLD,30));
		this.adding.add(addGenreList);
		
		this.addGenreListBox=new JComboBox<Genre>();
		this.addGenreListBox.setModel(new DefaultComboBoxModel<Genre>(Genre.values()));
		this.addGenreListBox.setSize(400, 50);
		this.addGenreListBox.setVisible(true);
		this.addGenreListBox.setLocation(25,485);
		this.addGenreListBox.setFont(new Font("Times",Font.BOLD,30));
		this.adding.add(addGenreListBox);
				
		this.searchTitle= new JLabel("Movie Title");
		this.searchTitle.setSize(200, 50);
		this.searchTitle.setVisible(true);
		this.searchTitle.setLocation(25, 35);
		this.searchTitle.setFont(new Font("Times",Font.BOLD,30));
		this.searching.add(searchTitle);
		
		this.searchTitleField=new JTextField();
		this.searchTitleField.setSize(400, 50);
		this.searchTitleField.setVisible(true);
		this.searchTitleField.setLocation(25,85);
		this.searchTitleField.setFont(new Font("Times",Font.BOLD,30));
		this.searching.add(searchTitleField);
		
		this.searchYear= new JLabel("Year");
		this.searchYear.setSize(200, 50);
		this.searchYear.setVisible(true);
		this.searchYear.setLocation(25, 135);
		this.searchYear.setFont(new Font("Times",Font.BOLD,30));
		this.searching.add(searchYear);
		
		this.searchYearFieldLeft=new JTextField();
		this.searchYearFieldLeft.setSize(175, 50);
		this.searchYearFieldLeft.setVisible(true);
		this.searchYearFieldLeft.setLocation(25,185);
		this.searchYearFieldLeft.setFont(new Font("Times",Font.BOLD,30));
		this.searching.add(searchYearFieldLeft);
		
		this.searchYearFieldRight=new JTextField();
		this.searchYearFieldRight.setSize(175, 50);
		this.searchYearFieldRight.setVisible(true);
		this.searchYearFieldRight.setLocation(250,185);
		this.searchYearFieldRight.setFont(new Font("Times",Font.BOLD,30));
		this.searching.add(searchYearFieldRight);
		
		
		this.toConnector= new JLabel("to");
		this.toConnector.setSize(50, 25);
		this.toConnector.setVisible(true);
		this.toConnector.setLocation(210, 195);
		this.toConnector.setFont(new Font("Times",Font.BOLD,30));
		this.searching.add(toConnector);
		
		
		this.searchDirector= new JLabel("Director");
		this.searchDirector.setSize(200, 50);
		this.searchDirector.setVisible(true);
		this.searchDirector.setLocation(25, 235);
		this.searchDirector.setFont(new Font("Times",Font.BOLD,30));
		this.searching.add(searchDirector);
		
		this.searchDirectorField=new JTextField();
		this.searchDirectorField.setSize(400, 50);
		this.searchDirectorField.setVisible(true);
		this.searchDirectorField.setLocation(25,285);
		this.searchDirectorField.setFont(new Font("Times",Font.BOLD,30));
		this.searching.add(searchDirectorField);
		
		this.searchCast= new JLabel("Cast");
		this.searchCast.setSize(200, 50);
		this.searchCast.setVisible(true);
		this.searchCast.setLocation(25, 335);
		this.searchCast.setFont(new Font("Times",Font.BOLD,30));
		this.searching.add(searchCast);
		
		this.searchCastField=new JTextField();
		this.searchCastField.setSize(400, 50);
		this.searchCastField.setVisible(true);
		this.searchCastField.setLocation(25,385);
		this.searchCastField.setFont(new Font("Times",Font.BOLD,30));
		this.searching.add(searchCastField);
		
		this.searchGenreList= new JLabel("Genre");
		this.searchGenreList.setSize(200, 50);
		this.searchGenreList.setVisible(true);
		this.searchGenreList.setLocation(25, 435);
		this.searchGenreList.setFont(new Font("Times",Font.BOLD,30));
		this.searching.add(searchGenreList);
		
		this.searchGenreListBox=new JComboBox<Genre>();
		this.searchGenreListBox.setModel(new DefaultComboBoxModel<Genre>(Genre.values()));
		this.searchGenreListBox.setSelectedItem(null);
		this.searchGenreListBox.setSize(400, 50);
		this.searchGenreListBox.setVisible(true);
		this.searchGenreListBox.setLocation(25,485);
		this.searchGenreListBox.setFont(new Font("Times",Font.BOLD,30));
		searching.add(searchGenreListBox);
		
		this.searchRating= new JLabel("Rating");
		this.searchRating.setSize(200, 50);
		this.searchRating.setVisible(true);
		this.searchRating.setLocation(25, 535);
		this.searchRating.setFont(new Font("Times",Font.BOLD,30));
		searching.add(searchRating);
		
		this.searchRatingBox=new JComboBox<Integer>();
		this.searchRatingBox.addItem(1);
		this.searchRatingBox.addItem(2);
		this.searchRatingBox.addItem(3);
		this.searchRatingBox.addItem(4);
		this.searchRatingBox.addItem(5);
		this.searchRatingBox.setSelectedItem(null);
		this.searchRatingBox.setSize(400, 50);
		this.searchRatingBox.setVisible(true);
		this.searchRatingBox.setLocation(25,585);
		this.searchRatingBox.setFont(new Font("Times",Font.BOLD,30));
		searching.add(searchRatingBox);
			
		this.addButton = new JButton("Add to database");
		this.addButton.setSize(200, 50);
		this.addButton.setVisible(true);
		this.addButton.setLocation(25, 645);
		this.addButton.setFont(new Font("Times",Font.BOLD,20));
		adding.add(addButton);
		
		this.searchButton = new JButton("Search in database");
		this.searchButton.setSize(240, 50);
		this.searchButton.setVisible(true);
		this.searchButton.setLocation(25, 650);
		this.searchButton.setFont(new Font("Times",Font.BOLD,20));
		searching.add(searchButton);
		
		this.removeButton = new JButton("Remove from database");
		this.removeButton.setSize(280, 50);
		this.removeButton.setVisible(true);
		this.removeButton.setLocation(25, 715);
		this.removeButton.setFont(new Font("Times",Font.BOLD,20));
		this.adding.add(removeButton);
				
		this.adding.setBorder(BorderFactory.createTitledBorder(getBorder() ,"Add and remove movie",  0,  0,new Font("Times",Font.BOLD,30)));
		this.add(adding);
		
		this.searching.setBorder(BorderFactory.createTitledBorder(getBorder() ,"Search movie",  0,  0,new Font("Times",Font.BOLD,30)));
		this.add(searching);
		
		this.display.setBorder(BorderFactory.createTitledBorder(getBorder() ,"Movie Information",  0,  0,new Font("Times",Font.BOLD,30)));
		this.add(display);
	
		this.listing.setBorder(BorderFactory.createTitledBorder(getBorder() ,"Movie Database",  0,  0,new Font("Times",Font.BOLD,30)));
		this.add(listing);
		
		
	}
	
	/**
	 * this method will allow as access the private variable
	 * @return the model used in view 
	 * @author Luo Zeting ID 16938158
	 */
	public FilmList getModel() {
		return model;
	}

	/**
	 * this method will allow as access the private variable
	 * @return the filmList in view
	 * @author Luo Zeting ID 16938158
	 */
	public JList getFilmList() {
		return filmList;
	}

	/**
	 * this method will allow as access the private variable
	 * @return the searchBar in view
	 * @author Luo Zeting ID 16938158
	 */
	public JScrollPane getSearchBar() {
		return searchBar;
	}

	/**
	 * this method will allow as access the private variable
	 * @return result label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getResultLabel() {
		return resultLabel;
	}

	/**
	 * this method will allow as access the private variable
	 * @return movie list lable in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getMovieList() {
		return movieList;
	}

	/**
	 * this method will allow as access the private variable
	 * @return search list in view
	 * @author Luo Zeting ID 16938158
	 */
	public JList getSearchList() {
		return searchList;
	}

	/**
	 * this method will allow as access the private variable
	 * @return add title lable in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getAddTitle() {
		return addTitle;
	}

	/**
	 * this method will allow as access the private variable
	 * @return the add title textField in view
	 * @author Luo Zeting ID 16938158
	 */
	public JTextField getAddTitleField() {
		return addTitleField;
	}

	/**
	 * this method will allow as access the private variable
	 * @return add year Lable in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getAddYear() {
		return addYear;
	}

	/**
	 * this method will allow as access the private variable
	 * @return add year TextField in view
	 * @author Luo Zeting ID 16938158
	 */
	public JTextField getAddYearField() {
		return addYearField;
	}

	/**
	 * this method will allow as access the private variable
	 * @return add rating label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getAddRating() {
		return addRating;
	}

	/**
	 * this method will allow as access the private variable
	 * @return add rating combox in view
	 * @author Luo Zeting ID 16938158
	 */
	public JComboBox<Integer> getAddRatingBox() {
		return addRatingBox;
	}

	/**
	 * this method will allow as access the private variable
	 * @return add director label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getAddDirector() {
		return addDirector;
	}

	/**
	 * this method will allow as access the private variable
	 * @return add director textfield in view
	 * @author Luo Zeting ID 16938158
	 */
	public JTextField getAddDirectorField() {
		return addDirectorField;
	}

	/**
	 * this method will allow as access the private variable
	 * @return add cast label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getAddCast() {
		return addCast;
	}

	/**
	 * this method will allow as access the private variable
	 * @return add cast textfield in view
	 * @author Luo Zeting ID 16938158
	 */
	public JTextField getAddCastField() {
		return addCastField;
	}

	/**
	 * this method will allow as access the private variable
	 * @return add genre label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getAddGenreList() {
		return addGenreList;
	}

	/**
	 * this method will allow as access the private variable
	 * @return add genre box in view
	 * @author Luo Zeting ID 16938158
	 */
	public JComboBox<Genre> getAddGenreListBox() {
		return addGenreListBox;
	}

	/**
	 * this method will allow as access the private variable
	 * @return search title label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getSearchTitle() {
		return searchTitle;
	}

	/**
	 * this method will allow as access the private variable
	 * @return search titel text field in view
	 * @author Luo Zeting ID 16938158
	 */
	public JTextField getSearchTitleField() {
		return searchTitleField;
	}

	/**
	 * this method will allow as access the private variable
	 * @return search year label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getSearchYear() {
		return searchYear;
	}

	/**
	 * this method will allow as access the private variable
	 * @return search year text in the left of view
	 * @author Luo Zeting ID 16938158
	 */
	public JTextField getSearchYearFieldLeft() {
		return searchYearFieldLeft;
	}

	/**
	 * this method will allow as access the private variable
	 * @return to label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getToConnector() {
		return toConnector;
	}

	/**
	 * this method will allow as access the private variable
	 * @return search year Field in the right of view
	 * @author Luo Zeting ID 16938158
	 */
	public JTextField getSearchYearFieldRight() {
		return searchYearFieldRight;
	}

	/**
	 * this method will allow as access the private variable
	 * @return search rating label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getSearchRating() {
		return searchRating;
	}

	/**
	 * this method will allow as access the private variable
	 * @return in view
	 * @author Luo Zeting ID 16938158
	 */
	public JComboBox<Integer> getSearchRatingBox() {
		return searchRatingBox;
	}

	/**
	 * this method will allow as access the private variable
	 * @return search direcotr label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getSearchDirector() {
		return searchDirector;
	}

	/**
	 * this method will allow as access the private variable
	 * @return search director text field in view
	 * @author Luo Zeting ID 16938158
	 */
	public JTextField getSearchDirectorField() {
		return searchDirectorField;
	}

	/**
	 * this method will allow as access the private variable
	 * @return search cast label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getSearchCast() {
		return searchCast;
	}

	/**
	 * this method will allow as access the private variable
	 * @return search cast text field in view
	 * @author Luo Zeting ID 16938158
	 */
	public JTextField getSearchCastField() {
		return searchCastField;
	}

	/**
	 * this method will allow as access the private variable
	 * @return search genre label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getSearchGenreList() {
		return searchGenreList;
	}

	/**
	 * this method will allow as access the private variable
	 * @return search genre list box in view
	 * @author Luo Zeting ID 16938158
	 */
	public JComboBox<Genre> getSearchGenreListBox() {
		return searchGenreListBox;
	}

	/**
	 * this method will allow as access the private variable
	 * @return add button in view
	 * @author Luo Zeting ID 16938158
	 */
	public JButton getAddButton() {
		return addButton;
	}

	/**
	 * this method will allow as access the private variable
	 * @return remove button in view
	 * @author Luo Zeting ID 16938158
	 */
	public JButton getRemoveButton() {
		return removeButton;
	}

	/**
	 * this method will allow as access the private variable
	 * @return search button in view
	 * @author Luo Zeting ID 16938158
	 */
	public JButton getSearchButton() {
		return searchButton;
	}

	/**
	 * this method will allow as access the private variable
	 * @return dispaly title label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getDisplayTitle() {
		return displayTitle;
	}

	/**
	 * this method will allow as access the private variable
	 * @return dispaly year label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getDisplayYear() {
		return displayYear;
	}

	/**
	 * this method will allow as access the private variable
	 * @return dispaly cast label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getDisplayCast() {
		return displayCast;
	}

	/**
	 * this method will allow as access the private variable
	 * @return dispaly genre label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getDisplayGenre() {
		return displayGenre;
	}

	/**
	 * this method will allow as access the private variable
	 * @return display director label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getDisplayDirector() {
		return displayDirector;
	}

	/**
	 * this method will allow as access the private variable
	 * @return rating label in view
	 * @author Luo Zeting ID 16938158
	 */
	public JLabel getDisplayRating() {
		return displayRating;
	}

	/**
	 * this method will allow as access the private variable
	 * @return listing JPanel in view
	 * @author Luo Zeting ID 16938158
	 */
	public JPanel getListing() {
		return listing;
	}

	/**
	 * this method will allow as access the private variable
	 * @return addinhg JPanel in view
	 * @author Luo Zeting ID 16938158
	 */
	public JPanel getAdding() {
		return adding;
	}

	/**
	 * this method will allow as access the private variable
	 * @return searching JPanel in view
	 * @author Luo Zeting ID 16938158
	 */
	public JPanel getSearching() {
		return searching;
	}

	/**
	 * this method will allow as access the private variable
	 * @return dispaly JPanel in view
	 * @author Luo Zeting ID 16938158
	 */
	public JPanel getDisplay() {
		return display;
	}

	/**
	 * this method will allow as access the private variable
	 * @return List bar in view
	 * @author Luo Zeting ID 16938158
	 */
	public JScrollPane getListBar() {
		return listBar;
	}
	/**
	 * this method will allow as access the private variable
	 * @return save button in view
	 * @author Luo Zeting ID 16938158
	 */
	public JButton getOutPutButton() {
		return outPutButton;
	}


	/**
	 * this methd will update filmList and searchList
	 * @author Luo Zeting ID 16938158
	 */
	public void update()
	{
		this.filmList.setListData(this.model.getFilmItems().toArray());	
		this.searchList.setListData(this.model.getCurrentList().toArray());
	}
}
