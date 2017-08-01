package module041;


import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by IGOR.LAZNIUK on 20.07.2017.
 */
public class DeveloperController {

    DeveloperDAO developerDAO = new DeveloperDAO();



     ArrayList<Developer> arrayList = new ArrayList<Developer>();





    public void add(Developer developer) throws IOException, ClassNotFoundException {
//        arrayList =developerDAO.read();
        arrayList.add(developer);
        developerDAO.write(arrayList);


    }

    public void edit(Developer oldDeveloper, Developer newDeveloper) throws IOException, ClassNotFoundException {
       delete(oldDeveloper);
       add(newDeveloper);
    }

    public ArrayList<Developer> view() throws IOException, ClassNotFoundException {

        return developerDAO.read();
    }


    public void delete(Developer developer) throws IOException, ClassNotFoundException {
        arrayList =developerDAO.read();
        arrayList.remove(developer);
        developerDAO.write(arrayList);

    }


}


