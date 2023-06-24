package hust.soict.globalict.aims.media;
import java.util.Comparator;
import hust.soict.globalict.aims.disc.*;

public abstract class Media {
    private int id;
    String title;
    private String category;
    protected float cost;
    private static int nbItems = 0;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new SortByTitleThenCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new SortByCostThenTitle();
    public Media() {
        this.id = 0;
        this.title = "";
        this.category = "";
        this.cost = 0.0f;
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public void incItem() {
        nbItems++;
    }
    public int getNbItem() {
        return nbItems;
    }
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nbItems;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Media other = (Media) obj;

        return title.equals(other.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }  
    public void display() {
        if (this instanceof Book) {
            System.out.println("Play is not available for \"Book\" items");
        }
        if (this instanceof DigitalVideoDisc) {
            DigitalVideoDisc obj = (DigitalVideoDisc) this;
            obj.play();
        }
        if (this instanceof CompactDisc) {
            CompactDisc obj = (CompactDisc) this;
            obj.play();
        }
    }
    public boolean isMatch(int id)
    {
        return getId() == id;
    }

    public boolean isMatch(String title)
    {
        return getTitle() == title;
    }
    }
