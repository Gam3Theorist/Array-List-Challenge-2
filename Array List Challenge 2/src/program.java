
public class program
	{

	private	String title;
	private String genre;
	private int numberOfSeasonsAired;

	public program(String t, String g, int n)
	{
		title=t;
		genre=g;
		numberOfSeasonsAired=n;
	}

	public String getTitle()
		{
			return title;
		}

	public void setTitle(String title)
		{
			this.title = title;
		}

	public String getGenre()
		{
			return genre;
		}

	public void setGenre(String genre)
		{
			this.genre = genre;
		}

	public int getNumberOfSeasonsAired()
		{
			return numberOfSeasonsAired;
		}

	public void setNumberOfSeasonsAired(int numberOfSeasonsAired)
		{
			this.numberOfSeasonsAired = numberOfSeasonsAired;
		}
	
	}
