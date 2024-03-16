package fr.pajonti.sejuapi.enums.shared;

public enum Locale {
    AR_AE("ar_AE"),
    CS_CZ("cs_CZ"),
    DE_DE("de_DE"),
    EL_GR("el_GR"),
    EN_AU("en_AU"),
    EN_GB("en_GB"),
    EN_PH("en_PH"),
    EN_SG("en_SG"),
    EN_US("en_US"),
    ES_AR("es_AR"),
    ES_ES("es_ES"),
    ES_MX("es_MX"),
    FR_FR("fr_FR"),
    HU_HU("hu_HU"),
    ID_ID("id_ID"),
    IT_IT("it_IT"),
    JA_JP("ja_JP"),
    KO_KR("ko_KR"),
    MS_MY("ms_MY"),
    PL_PL("pl_PL"),
    PT_BR("pt_BR"),
    RO_RO("ro_RO"),
    RU_RU("ru_RU"),
    TH_TH("th_TH"),
    TR_TR("tr_TR"),
    VI_VN("vi_VN"),
    ZH_CN("zh_CN"),
    ZH_MY("zh_MY"),
    ZH_TW("zh_TW");


    public final String isoCode;

    Locale(String isoCode) {
        this.isoCode = isoCode;
    }

    /**
     * Returns the enum textValue
     * @return Enum textValue
     */
    public String getValue(){
        return isoCode;
    }

    /**
     * Returns the Enum object based on the passed value, or null if no enum is found
     * @param value Value to check enum against
     * @return Enum object based on the passed value, or null if no enum is found
     */
    public static Locale getEnum(String value){
        for (Locale p : values()) {
            if (p.isoCode.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
