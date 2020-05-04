package congoApi.translate;

public class CongoConstant {

    public String data = "data/";


    /**
     * @param code The repsonse code of the request
     * @return Response codes of every call end
     */
    public String[] getResponseCode(int code) {
        switch (code) {
            case 401: return new String[] {"Invalid API key", "Please provide a valid API key"};
            case 402: return new String[] {"Blocked API key", "Your API key is blocked"};
            case 404: return new String[] {"Limit Exceeded", "Exceeded the daily limit on the amount of translated text"};
            case 413: return new String[] {"Limit Exceeded", "Exceeded the maximum text size"};
            case 422: return new String[] {"Translate error", "The text cannot be translated"};
            case 501: return new String[] {"Invalid language", "The text cannot be translated"};
            case 502: return new String[] {"Invalid parameter", "Please put a valid input language"};
        }
        return null;
    }
}
