package hust.soict.globalict.aims.media;
import java.util.Comparator;

public class SortByTitleThenCost implements Comparator<Media> {
    public SortByTitleThenCost() {
		// TODO Auto-generated constructor stub
	}

	public int compareTitle(String s1, String s2) {
		if(s1.compareTo(s2) > 0)
			return 1;
		else 
			return -1;
		
	}
	public int compare(Media m1, Media m2) {
		if(compareTitle(m1.title, m2.title) == 1) 
			return 1;
		else 
			return -1;
	}
}