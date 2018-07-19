package moiveManager;

/**
 * A rating object, this class have rating variable for a film
 * @author Luo Zeting ID 16938158
 */
public class Rating {
	private int rating;
	
	/**
	 * the constructor of the rating clss
	 * @param rating of the movie
	 */
	Rating(int rating)
	{
		this.setRating(rating);
	}
	
	/**
	 * this getMethod will allow us access the private variable
	 * @return the rating of the movie
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * this setMethod will allow us write into the private variable
	 * @param rating of the movie
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	/**
	 * this method will override the original toString method and output the rating as
	 * a String 
	 * @return the rating of the movie (e.g 1)
	 */
	@Override
	public String toString()
	{
		return  Integer.toString(this.getRating());
	}

}
