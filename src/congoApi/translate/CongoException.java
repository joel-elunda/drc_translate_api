package congoApi.translate;

/**
 *  @author Joel Elunda
 */
public class CongoException extends Exception {

    private static final long serial = 1L;

    public CongoException(String error, String description) {
        super(error + " : " + description);
    }
}
