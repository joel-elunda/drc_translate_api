package congoApi.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *  @author Joel Elunda
 */
public class FileIO {

    private static File file = null;
    private static FileReader fileReader = null;
    private static FileWriter fileWriter = null;
    private static StringBuilder stringBuilder = new StringBuilder();

    /**
     * @param path
     * @return String content of path file
     * @throws IOException
     */
    public static String read(String path) throws IOException {
        Scanner scanner = new Scanner(new File(path));

        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
        }

        return stringBuilder.toString();
    }

    /**
     * @param path
     * @param content
     * @return boolean true if content has successfully written
     * @throws IOException
     */
    public static boolean write(String path, String content) throws IOException {
        file = new File(path);

        if(file.exists()) {
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.flush();

            return true;
        } else {
            return false;
        }
    }
}
