package module041;

import java.util.List;

/**
 * Created by IGOR.LAZNIUK on 08.06.2017.
 */
public interface DeveloperDAO {
    public List<Developer> getAllDevelopers();
    public Developer getDeveloper(int rollNo);
    public void updateDeveloper(Developer developer);
    public void deleteDeveloper(Developer developer);
}
