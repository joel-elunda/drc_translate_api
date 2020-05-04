package congoApi.gson;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


/**
 *  @author Joel Elunda
 */
public class GsonInstance {


    private static Gson gson = null;

    public GsonInstance() {}

    /**
     * @return Gson
     */
    public static Gson getGson() {
        if (gson == null) {
            gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
        }

        return gson;
    }
}
