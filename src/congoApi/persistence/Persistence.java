package congoApi.persistence;

import congoApi.fileio.FileIO;
import congoApi.gson.GsonInstance;
import java.io.IOException;

import java.io.File;


/**
 *  @author Joel Elunda
 */
public class Persistence {

    private static File file = null;


    /**
     * @param path
     * @return
     */
    public static boolean create(String path) {

        file = new File(path);

        if(file.exists()) {
            new IOException("File exist !").printStackTrace();
            return false;
        } else {
            try {
                boolean isCreated = file.createNewFile();
                if(isCreated) {
                    String json = GsonInstance.getGson().toJson(path);
                    FileIO.write(path, json);
                }
                return isCreated;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    /**
     * @param path
     * @return
     */
    public static boolean delete(String path) {
        file = new File(path);
        if(file.exists()) {
            return file.delete();
        } else {
            return false;
        }
    }

    /**
     * @param path
     * @param update
     * @return
     */
    public static boolean update(String path, String update) {
        file = new File(path);
        File upgrade = new File(update);

        if(file.exists()) {
            return file.renameTo(upgrade);
        } else {
            return false;
        }
    }


}
