package fileio;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileIO {

    private File file = null;
    private FileReader fileReader = null;
    private FileWriter fileWriter = null;
    private StringBuilder stringBuilder = new StringBuilder();

    /**
     * @param path
     * @return String content of path file
     * @throws IOException
     */
    public String read(String path) throws IOException {
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
    public boolean write(String path, String content) throws IOException {
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
