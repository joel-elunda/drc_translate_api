package gson;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonInstance {


    private static Gson gson = null;

    public GsonInstance() {}

    /**
     * @return Gson
     */
    public Gson getGson() {
        if (gson == null) {
            gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
        }

        return gson;
    }
}
