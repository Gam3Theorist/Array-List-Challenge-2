import java.util.ArrayList;

public class programRunner
	{
	static	ArrayList <program> TVShows = new ArrayList<program>();
		public static void main(String[] args)
			{
fillArray();		
printList();

for(int i=0; i< TVShows.size(); i++)
	{
		TVShows.get(i).setNumberOfSeasonsAired(TVShows.get(i).getNumberOfSeasonsAired()+1);
	}
printList();
TVShows.get(0).setTitle("Avatar the Last Airbender");
printList();
			}
		
		
		public static void fillArray()
		{
	TVShows.add(new program("ATLA", "Fantasy", 4));
	TVShows.add(new program("Steven Universe", "Fantasy", 3));
	TVShows.add(new program("Only Murders in the Building", "Comedy", 4));
	TVShows.add(new program("Psych", "Murder Mystery", 8));
	TVShows.add(new program("She-Ra", "Fantasy", 5));
		}
		
		
		public static void printList()
		{
			for(int i=0; i< TVShows.size(); i++)
				{
					System.out.println(TVShows.get(i).getTitle());
					System.out.println(TVShows.get(i).getGenre());
					System.out.println(TVShows.get(i).getNumberOfSeasonsAired());
				}
		}
		
		
		
	}
