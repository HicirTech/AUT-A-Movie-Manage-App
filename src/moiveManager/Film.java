package moiveManager;


/**
 * this class is the Film object class it has attributes for a Film object and a rating 
 * object for each Film object;
 * @author Luo Zeting ID 16938158
 */
public class Film {

	private Genre genre;
	private String title;
	private String releaseYear;
	private String director;
	private Rating rating; 
	private String castList;
	
	Film()
	{
		this.setGenre(Genre.Unknown);
		this.setTitle("");
		this.rating= new Rating(0);
		this.setReleaseYear("0000");
		this.castList="NotSet";
		this.setDirector("NotSet");
	}
	
	/**
	 * this methos will allow us access to the private variable
	 * @return cast list of Film
	 * @author Luo Zeting ID 16938158
	 */
	public String getCastList()
	{
		return this.castList;
	}
	
	/**
	 * this methos will allow us access to the private variable
	 * @return rating of Film
	 * @author Luo Zeting ID 16938158
	 */
	public int getRating() {
		return rating.getRating();
	}

	/**
	 * this methos will allow us write into the private variable
	 * @param rating of the Film
	 * @author Luo Zeting ID 16938158
	 */
	public void setRating(int rating) {
		this.rating.setRating(rating);
	}
	
	/**
	 * this methos will allow us access to the private variable
	 * @return genre of Film
	 * @author Luo Zeting ID 16938158
	 */
	public Genre getGenre() {
		return genre;
	}

	/**
	 * this methos will allow us write into the private variable
	 * @param genre of the film
	 * @author Luo Zeting ID 16938158
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	/**
	 * this methos will allow us access to the private variable
	 * @return title of Film
	 * @author Luo Zeting ID 16938158
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * this methos will allow us write into the private variable
	 * @param title of the film
	 * @author Luo Zeting ID 16938158
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * this methos will allow us access to the private variable
	 * @return release year of Film
	 * @author Luo Zeting ID 16938158
	 */
	public String getReleaseYear() {
		return releaseYear;
	}

	/**
	 * this methos will allow us write into the private variable
	 * @param releaseYear of the film
	 * @author Luo Zeting ID 16938158
	 */
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	/**
	 * this methos will allow us access to the private variable
	 * @return director of Film
	 * @author Luo Zeting ID 16938158
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * this methos will allow us write into the private variable
	 * @param director of the film
	 * @author Luo Zeting ID 16938158
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * this methos will allow us write into the private variable
	 * @param castList of the film
	 * @author Luo Zeting ID 16938158
	 */
	public void setCastList(String castList) {
		this.castList= castList;
	}
	
	/**
	 * this method will override original toString method, it will output the title of the
	 * film
	 * @author Luo Zeting ID 16938158
	 */
	@Override
	public String toString()
	{
		return this.getTitle();
	}
	
}
