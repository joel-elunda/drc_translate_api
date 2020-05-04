package congoApi.translate;

/**
 *  @author Joel Elunda
 */
public class CongoAPI {

    public CongoLanguage getTextLanguage(String text) throws CongoException {
        return CongoLanguage.Lingala;
    }

    public CongoResponse getCongoResponse(String text, CongoLanguage source, CongoLanguage target) throws CongoException {

        return new CongoResponse();
    }

    public CongoResponse getCongoResponse(String text, CongoLanguage target) throws CongoException {
        return new CongoResponse();
    }
}
