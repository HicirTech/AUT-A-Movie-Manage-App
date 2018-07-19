package moiveManager;

import java.util.*;
/**
 * this is the searchEngine class, this class is a blue print for build a search engine
 * which able to search by condition of the user input.
 * @author Luo Zeting ID 16938158
 */
public class searchEngine {

	private ArrayList<Film> films;
	private boolean titleIsEmtpy, 
					yearIsEmtpy, 
					directorIsEmtpy, 
					castIsEmtpy, 
					genreIsEmtpy, 
					ratingIsEmtpy;
	private String title, 
					yearL, 
					yearR, 
					director, 
					cast;
	private int rating;
	private Genre genre;

	/**
	 * this is the constructor of the searchEngine, this will set up the condition for 
	 * search
	 * @param FilmList need to be searched
	 * @param titleIsEmtpy check title input is empty
	 * @param yearIsEmtpy check year input is empty
	 * @param directorIsEmtpy check director input is empty
	 * @param castIsEmtpy check cast input in empty
	 * @param genreIsEmtpy check genre input is empty
	 * @param ratingIsEmtpy check rating input is empty
	 * @author Luo Zeting ID 16938158
	 */
	searchEngine(ArrayList<Film> FilmList,
			boolean titleIsEmtpy,
			boolean yearIsEmtpy,
			boolean directorIsEmtpy,
			boolean castIsEmtpy,
			boolean genreIsEmtpy,
			boolean ratingIsEmtpy) 
	{
		this.films = FilmList;
		this.titleIsEmtpy= titleIsEmtpy;
		this.yearIsEmtpy=yearIsEmtpy;
		this.directorIsEmtpy=directorIsEmtpy;
		this.castIsEmtpy=castIsEmtpy;
		this.genreIsEmtpy=genreIsEmtpy;
		this.ratingIsEmtpy=ratingIsEmtpy;
	}

	/**
	 * this getMethod will allow us access the private variable
	 * @return the Films array List
	 * @author Luo Zeting ID 16938158
	 */
	public ArrayList<Film> getFilms() {
		return films;
	}


	public void setFilms(ArrayList<Film> films) {
		this.films = films;
	}

	/**
	 * this getMethod will allow us access the private variable
	 * @return the the title JTextField is emtpy or not
	 * @author Luo Zeting ID 16938158
	 */
	public boolean isTitleIsEmtpy() {
		return titleIsEmtpy;
	}

	/**
	 * this setMethod will allow us write into the private variable
	 * @param titleIsEmtpy title is empty or not
	 * @author Luo Zeting ID 16938158
	 */
	public void setTitleIsEmtpy(boolean titleIsEmtpy) {
		this.titleIsEmtpy = titleIsEmtpy;
	}

	/**
	 * this getMethod will allow us access the private variable
	 * @return the year JTextField is emtpy or not
	 * @author Luo Zeting ID 16938158
	 */
	public boolean isYearIsEmtpy() {
		return yearIsEmtpy;
	}

	/**
	 * this setMethod will allow us write into the private variable
	 * @param yearIsEmtpy year is emtpy or not
	 * @author Luo Zeting ID 16938158
	 */
	public void setYearIsEmtpy(boolean yearIsEmtpy) {
		this.yearIsEmtpy = yearIsEmtpy;
	}

	/**
	 * this getMethod will allow us access the private variable
	 * @return the director is emtpy or not
	 * @author Luo Zeting ID 16938158
	 */
	public boolean isDirectorIsEmtpy() {
		return directorIsEmtpy;
	}

	/**
	 * this setMethod will allow us write into the private variable
	 * @param directorIsEmtpy director is empty or not
	 * @author Luo Zeting ID 16938158
	 */
	public void setDirectorIsEmtpy(boolean directorIsEmtpy) {
		this.directorIsEmtpy = directorIsEmtpy;
	}

	/**
	 * this getMethod will allow us access the private variable
	 * @return the cast is Emtpy or not
	 * @author Luo Zeting ID 16938158
	 */
	public boolean isCastIsEmtpy() {
		return castIsEmtpy;
	}

	/**
	 * this setMethod will allow us write into the private variable
	 * @param castIsEmtpy cast is empty or not
	 * @author Luo Zeting ID 16938158
	 */
	public void setCastIsEmtpy(boolean castIsEmtpy) {
		this.castIsEmtpy = castIsEmtpy;
	}

	/**
	 * this getMethod will allow us access the private variable
	 * @return the genre is emtpy or not
	 * @author Luo Zeting ID 16938158
	 */
	public boolean isGenreIsEmtpy() {
		return genreIsEmtpy;
	}

	/**
	 * this setMethod will allow us write into the private variable
	 * @param genreIsEmtpy the genre is empty or not
	 * @author Luo Zeting ID 16938158
	 */
	public void setGenreIsEmtpy(boolean genreIsEmtpy) {
		this.genreIsEmtpy = genreIsEmtpy;
	}

	/**
	 * this getMethod will allow us access the private variable
	 * @return the rating is null or not
	 * @author Luo Zeting ID 16938158
	 */
	public boolean isRatingIsEmtpy() {
		return ratingIsEmtpy;
	}

	/**
	 * this setMethod will allow us write into the private variable
	 * @param ratingIsEmtpy rating is null or not
	 * @author Luo Zeting ID 16938158
	 */
	public void setRatingIsEmtpy(boolean ratingIsEmtpy) {
		this.ratingIsEmtpy = ratingIsEmtpy;
	}

	/**
	 * this getMethod will allow us access the private variable
	 * @return the title used for search
	 * @author Luo Zeting ID 16938158
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * this setMethod will allow us write into the private variable
	 * @param title used for search
	 * @author Luo Zeting ID 16938158
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * this getMethod will allow us access the private variable
	 * @return the year left side used for search
	 * @author Luo Zeting ID 16938158
	 */
	public String getyearL() {
		return yearL;
	}

	/**
	 * this setMethod will allow us write into the private variable
	 * @param yearL yaer of begin
	 * @author Luo Zeting
	 */
	public void setyearL(String yearL) {
		this.yearL = yearL;
	}

	/**
	 * this getMethod will allow us access the private variable
	 * @return the year right side used for search
	 * @author Luo Zeting ID 16938158
	 */
	public String getyearR() {
		return yearR;
	}

	/**
	 * this setMethod will allow us write into the private variable
	 * @param yearR year of end
	 * @author Luo Zeting
	 */
	public void setyearR(String yearR) {
		this.yearR = yearR;
	}

	/**
	 * this getMethod will allow us access the private variable
	 * @return the director used for search
	 * @author Luo Zeting ID 16938158
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * this setMethod will allow us write into the private variable
	 * @param director used to search
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * this getMethod will allow us access the private variable
	 * @return the cast used for search 
	 * @author Luo Zeting ID 16938158
	 */
	public String getCast() {
		return cast;
	}

	/**
	 * this setMethod will allow us write into the private variable
	 * @param cast used for search 
	 * @author Luo Zeting ID 16938158
	 */
	public void setCast(String cast) {
		this.cast = cast;
	}

	/**
	 * this getMethod will allow us access the private variable
	 * @return the rating used for search
	 * @author Luo Zeting ID 16938158
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * this setMethod will allow us write into the private variable
	 * @param rating used to search
	 * @author Luo Zeting ID 16938158
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * this getMethod will allow us access the private variable
	 * @return the genre used for search
	 * @author Luo Zeting ID 16938158
	 */
	public Genre getGenre() {
		return genre;
	}

	/**
	 * this setMethod will allow us write into the private variable
	 * @param genre used for search
	 * @author Luo Zeting ID 16938158
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	
	/**
	 * this is search function to search the array list, this method will search all 
	 * possible way, to find a result ArrayList, and return this result ArrayList
	 * @param title used for search
	 * @param yearL start year used for search
	 * @param yearR end year used for search
	 * @param director used for search
	 * @param cast used for search
	 * @param genre used for search
	 * @param rating used for search
	 * @return a ArrayList content all the Films which are meet the requirements
	 */
	public ArrayList<Film> searchFilms(String title,String yearL,String yearR,String director, String cast ,Genre genre,int rating)
	{
		ArrayList<Film> result = new ArrayList<Film>();
		
		if(titleIsEmtpy)//-------------------------------------------------------------L1 A
		{
			this.setTitle(title);
			for(int i =0;i!=this.films.size();i++)
			{
				if(this.films.get(i).getTitle().toLowerCase().contains(title.toLowerCase()))
				{
					result.add(this.films.get(i));
				}
			}

			if(yearIsEmtpy)//-------------------------------------------------------------L2 A
			{
				ArrayList<Film> yearTemp = new ArrayList<Film>();
				this.setyearL(yearL);		
				this.setyearR(yearR);
				for(int i =0; i!=result.size();i++)
				{
					for (int year =Integer.valueOf(this.yearL);year<=Integer.valueOf(this.yearR);year++)
					{
						if(Integer.valueOf(result.get(i).getReleaseYear())==year)
						{
							yearTemp.add(result.get(i));
						}
					}
				}
				result.clear();
				result.addAll(yearTemp);
				if(directorIsEmtpy)//---------------------------------------------------L3 A
				{
					ArrayList<Film> directorTemp = new ArrayList<Film>();
					this.setDirector(director);
					for(int i=0;i!=result.size();i++)
					{
						if(result.get(i).getDirector().toLowerCase().contains(director.toLowerCase()))
						{
							directorTemp.add(result.get(i));
						}
					}
					result.clear();
					result.addAll(directorTemp);
					if(castIsEmtpy)//------------------------------------------------------------------L4 A
					{
						ArrayList<Film> castTemp = new ArrayList<Film>();
						this.setCast(cast);
						for(int i=0;i!=result.size();i++)
						{
							if(result.get(i).getCastList().toLowerCase().contains(cast.toLowerCase()))
							{
								castTemp.add(result.get(i));
							}
						}
						result.clear();
						result.addAll(castTemp);
						if(genreIsEmtpy)//----------------------------------------L5 A
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
					else//------------------------------------------------------------------L4 B
					{
						if(genreIsEmtpy)//----------------------------------------L5 A2
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);	
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B2
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
				}
				else//---------------------------------------------------L3 B
				{
					if(castIsEmtpy)//------------------------------------------------------------------L4 A2
					{
						ArrayList<Film> castTemp = new ArrayList<Film>();
						this.setCast(cast);
						for(int i=0;i!=result.size();i++)
						{
							if(result.get(i).getCastList().toLowerCase().contains(cast.toLowerCase()))
							{
								castTemp.add(result.get(i));
							}
						}
						result.clear();
						result.addAll(castTemp);
						if(genreIsEmtpy)//----------------------------------------L5 A3
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);	
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B3
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
					else//------------------------------------------------------------------L4 B2
					{
						if(genreIsEmtpy)//----------------------------------------L5 A4
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);	
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B4
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
				}
			}
			else//-------------------------------------------------------------L2 B
			{
				if(directorIsEmtpy)//---------------------------------------------------L3 A2
				{
					ArrayList<Film> directorTemp = new ArrayList<Film>();
					this.setDirector(director);
					for(int i=0;i!=result.size();i++)
					{
						if(result.get(i).getDirector().toLowerCase().contains(director.toLowerCase()))
						{
							directorTemp.add(result.get(i));
						}
					}
					result.clear();
					result.addAll(directorTemp);
					if(castIsEmtpy)//------------------------------------------------------------------L4 3
					{
						ArrayList<Film> castTemp = new ArrayList<Film>();
						this.setCast(cast);
						for(int i=0;i!=result.size();i++)
						{
							if(result.get(i).getCastList().toLowerCase().contains(cast.toLowerCase()))
							{
								castTemp.add(result.get(i));
							}
						}
						result.clear();
						result.addAll(castTemp);
						if(genreIsEmtpy)//----------------------------------------L5 A5
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);	
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B5
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
					else//------------------------------------------------------------------L4 B3
					{
						if(genreIsEmtpy)//----------------------------------------L5 A6
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);	
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B6
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
				}
				else//---------------------------------------------------L3 B2
				{
					if(castIsEmtpy)//------------------------------------------------------------------L4 A4
					{
						ArrayList<Film> castTemp = new ArrayList<Film>();
						this.setCast(cast);
						for(int i=0;i!=result.size();i++)
						{
							if(result.get(i).getCastList().toLowerCase().contains(cast.toLowerCase()))
							{
								castTemp.add(result.get(i));
							}
						}
						result.clear();
						result.addAll(castTemp);
						if(genreIsEmtpy)//----------------------------------------L5 A7
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);	
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B7
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
					else//------------------------------------------------------------------L4 B4
					{
						if(genreIsEmtpy)//----------------------------------------L5 A8
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);	
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B8
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
					
				}
			}
					
			
		}
		else//-------------------------------------------------------------L1 B
		{
			if(yearIsEmtpy)//-------------------------------------------------------------L2 A2
			{
				result.addAll(this.films);
				ArrayList<Film> yearTemp = new ArrayList<Film>();
				this.setyearL(yearL);		
				this.setyearR(yearR);
				for(int i =0; i!=result.size();i++)
				{
					for (int year =Integer.valueOf(this.yearL);year<=Integer.valueOf(this.yearR);year++)
					{
						if(Integer.valueOf(result.get(i).getReleaseYear())==year)
						{
							yearTemp.add(result.get(i));
						}
					}
				}
				result.clear();
				result.addAll(yearTemp);
				if(directorIsEmtpy)//---------------------------------------------------L3 A3
				{
					ArrayList<Film> directorTemp = new ArrayList<Film>();
					this.setDirector(director);
					for(int i=0;i!=result.size();i++)
					{
						if(result.get(i).getDirector().toLowerCase().contains(director.toLowerCase()))
						{
							directorTemp.add(result.get(i));
						}
					}
					result.clear();
					result.addAll(directorTemp);
					if(castIsEmtpy)//------------------------------------------------------------------L4 A5
					{
						ArrayList<Film> castTemp = new ArrayList<Film>();
						this.setCast(cast);
						for(int i=0;i!=result.size();i++)
						{
							if(result.get(i).getCastList().toLowerCase().contains(cast.toLowerCase()))
							{
								castTemp.add(result.get(i));
							}
						}
						result.clear();
						result.addAll(castTemp);
						if(genreIsEmtpy)//----------------------------------------L5 A9
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B9
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
					else//------------------------------------------------------------------L4 B5
					{
						if(genreIsEmtpy)//----------------------------------------L5 A10
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);	
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B10
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
				}
				else//---------------------------------------------------L3 B3
				{
					if(castIsEmtpy)//------------------------------------------------------------------L4 A6
					{
						ArrayList<Film> castTemp = new ArrayList<Film>();
						this.setCast(cast);
						for(int i=0;i!=result.size();i++)
						{
							if(result.get(i).getCastList().toLowerCase().contains(cast.toLowerCase()))
							{
								castTemp.add(result.get(i));
							}
						}
						result.clear();
						result.addAll(castTemp);
						if(genreIsEmtpy)//----------------------------------------L5 A11
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);	
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B11
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
					else//------------------------------------------------------------------L4 B6
					{
						if(genreIsEmtpy)//----------------------------------------L5 A12
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);	
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B12
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
				}
			}
			else//-------------------------------------------------------------L2 B2
			{
				if(directorIsEmtpy)//---------------------------------------------------L3 A4
				{
					result.addAll(this.films);
					ArrayList<Film> directorTemp = new ArrayList<Film>();
					this.setDirector(director);
					for(int i=0;i!=result.size();i++)
					{
						if(result.get(i).getDirector().toLowerCase().contains(director.toLowerCase()))
						{
							directorTemp.add(result.get(i));
						}
					}
					result.clear();
					result.addAll(directorTemp);
					if(castIsEmtpy)//------------------------------------------------------------------L4 A7
					{
						ArrayList<Film> castTemp = new ArrayList<Film>();
						this.setCast(cast);
						for(int i=0;i!=result.size();i++)
						{
							if(result.get(i).getCastList().toLowerCase().contains(cast.toLowerCase()))
							{
								castTemp.add(result.get(i));
							}
						}
						result.clear();
						result.addAll(castTemp);
						if(genreIsEmtpy)//----------------------------------------L5 A13
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);	
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B13
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
					else//------------------------------------------------------------------L4 B7
					{
						if(genreIsEmtpy)//----------------------------------------L5 A14
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);	
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B14
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
				}
				else//---------------------------------------------------L3 B4
				{
					if(castIsEmtpy)//------------------------------------------------------------------L4 A8
					{
						result.addAll(this.films);
						ArrayList<Film> castTemp = new ArrayList<Film>();
						this.setCast(cast);
						for(int i=0;i!=result.size();i++)
						{
							if(result.get(i).getCastList().toLowerCase().contains(cast.toLowerCase()))
							{
								castTemp.add(result.get(i));
							}
						}
						result.clear();
						result.addAll(castTemp);
						if(genreIsEmtpy)//----------------------------------------L5 A15
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);	
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B15
						{
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
					else//------------------------------------------------------------------L4 B8
					{
						if(genreIsEmtpy)//----------------------------------------L5 A16
						{
							ArrayList<Film> genreTemp = new ArrayList<Film>();
							result.addAll(this.films);
							this.setGenre(genre);
							for (int i = 0; i != result.size(); i++) 
							{
								if(result.get(i).getGenre().toString().equals(genre.toString())&&genre.toString()!="")
								{
									genreTemp.add(result.get(i));
								}
							}
							result.clear();
							result.addAll(genreTemp);	
							if(ratingIsEmtpy)//----------------------L6 A
							{
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
						else//----------------------------------------L5 B16
						{
							
							if(ratingIsEmtpy)//----------------------L6 A
							{
								result.addAll(this.films);
								ArrayList<Film> ratingTemp = new ArrayList<Film>();
								this.setRating(rating);
								for(int i=0; i!=result.size();i++)
								{
									if(result.get(i).getRating()==rating)
									{
										ratingTemp.add(result.get(i));
									}
								}
								result.clear();
								result.addAll(ratingTemp);
							}
							else//----------------------------L6 B
							{
								
							}
						}
					}
				}
			}
		}		
		return result;
	}
}