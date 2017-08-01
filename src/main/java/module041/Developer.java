package module041;

/**
 * Created by IGOR.LAZNIUK on 20.07.2017.
 */
public class Developer {
    private int id;


    public Developer(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Developer{" + "id=" + id + '\'' + '}';
    }
}
