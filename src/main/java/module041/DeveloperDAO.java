package module041;

import java.io.*;
import java.util.ArrayList;


/**
 * Created by IGOR.LAZNIUK on 20.07.2017.
 */
public class DeveloperDAO {
    private static final String DIRECTORY = "D:/bitbucket/src/main/java/module041/Developers";

    public ArrayList<Developer> read() throws IOException, ClassNotFoundException {

        // Создаем объект FileInputStream для доступа к файлу
        FileInputStream fin = new FileInputStream(DIRECTORY);
        // Создаем объект ObjectInputStream для чтения сериализованного объекта
        ObjectInputStream ois = new ObjectInputStream(fin);
        // Восстанавливаем состояние объекта из файла
        ArrayList<Developer> dataBase = (ArrayList<Developer>) ois.readObject();
        fin.close();
        ois.close();

        return dataBase;
    }

    public void write(ArrayList<Developer> arrayList) throws IOException {


        // Создаем объект FileOutputStream для доступа к файлу
        FileOutputStream fos = new FileOutputStream(DIRECTORY);
        // Создаем объект ObjectOutputStream для работы с объектами
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // Записываем объект в файл
        oos.writeObject(arrayList);
        oos.flush();
        fos.close();
        oos.close();


    }
}
