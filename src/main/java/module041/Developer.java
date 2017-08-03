package module041;
import java.io.Serializable;

/**
 * Created by IGOR.LAZNIUK on 20.07.2017.
 */
public class Developer implements Serializable{
    private int id;


    public Developer(int id) {
        this.id = id;
    }

   @Override
   public String toString() {
       return "Developer{" + "id=" + id + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Developer developer = (Developer) o;

        return id == developer.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
