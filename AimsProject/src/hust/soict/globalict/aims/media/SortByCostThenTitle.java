package hust.soict.globalict.aims.media;
import java.util.Comparator;
public class SortByCostThenTitle implements Comparator<Media> {
    public SortByCostThenTitle() {
		// TODO Auto-generated constructor stub
    }
	public int compare(Media m1, Media m2) {
		if(m1.cost >= m2.cost)
			return -1;
		else 
			return 1;
	}
}