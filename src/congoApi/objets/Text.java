package congoApi.objets;

import congoApi.constant.Constant;
import congoApi.fileio.FileIO;
import congoApi.gson.GsonInstance;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;



/**
 *  @author Joel Elunda
 */
public class Text {

    private int id;
    private String text;
    private String textTranslated;
    private Date date;

    public Text() {}

    public Text(int id, String text, String textTranslated, Date date) {
        this.id = id;
        this.text = text;
        this.textTranslated = textTranslated;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return id == text1.id &&
                Objects.equals(text, text1.text) &&
                Objects.equals(textTranslated, text1.textTranslated) &&
                Objects.equals(date, text1.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, textTranslated, date);
    }


    @Override
    public String toString() {
        return "Text{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", textTranslated='" + textTranslated + '\'' +
                ", date=" + date +
                '}';
    }



    public static Text[] get() throws IOException {
        String content = FileIO.read(Constant.TEXTS.toString());
        Text[] texts = GsonInstance.getGson().fromJson(content, Text[].class);
        return texts = (texts == null) ? new Text[0] : texts;
    }


    public static Text get(Text text) throws IOException {
        ArrayList<Text> texts = new ArrayList<Text>(Arrays.asList(get()));
        if(texts.contains(text)) {
            int index = texts.indexOf(text);
            return texts.get(index);
        }
        return null;
    }


    public static boolean add(Text text) throws  IOException {
        ArrayList<Text> texts = new ArrayList<Text>(Arrays.asList(get()));
        texts.add(text);
        String json = GsonInstance.getGson().toJson(texts);
        return FileIO.write(Constant.TEXTS.toString(), json);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextTranslated() {
        return textTranslated;
    }

    public void setTextTranslated(String textTranslated) {
        this.textTranslated = textTranslated;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
