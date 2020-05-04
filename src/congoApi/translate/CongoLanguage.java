package congoApi.translate;

/**
 *  @author Joel Elunda
 */
public enum CongoLanguage {

    French("fr"),
    English("en"),
    Swahili("sw"),
    Lingala("li"),
    Tshiluba("ts");

    private String language;

    CongoLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "CongoLanguage{" +
                "language='" + language + '\'' +
                '}';
    }
}
