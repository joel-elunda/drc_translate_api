package congoApi.constant;


/**
 *  @author Joel Elunda
 */
public enum Constant {

    TEXTS("data/texts.json"),

    FR_SW("data/fr_sw.json"),
    FR_LI("data/fr_li.json"),
    FR_TS("data/fr_ts.json"),

    SW_FR("data/sw_fr.json"),
    LI_FR("data/li_fr.json"),
    TS_FR("data/ts_fr.json"),

    EN_SW("data/en_sw.json"),
    EN_LI("data/en_li.json"),
    EN_TS("data/en_ts.json"),

    SW_EN("data/sw_en.json"),
    LI_EN("data/li_en.json"),
    TS_En("data/ts_en.json");

    private String value;

    Constant(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
