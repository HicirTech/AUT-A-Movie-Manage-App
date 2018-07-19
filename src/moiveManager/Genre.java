package moiveManager;


/**
 * this is all the genre of movies
 * @author Luo Zeting ID 16938158
 */
public enum Genre {
	Action,Adventure,Comedy,Crime,Drama,Fantasy,Historical,Horror,Magical,Mystery,Paranoid
	,Philosophical,Political,Romance,Saga,Satire,Science,Speculative,Thriller,Urban,Western,Unknown;
	
	/**
	 * this method will override the original toString method, it will output the name
	 * of the enum
	 * e.g: Action
	 */
	@Override
	public String toString()
	{
		return this.name();
	}
}
