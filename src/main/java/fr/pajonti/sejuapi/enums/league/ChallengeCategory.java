package fr.pajonti.sejuapi.enums.league;

public enum ChallengeCategory {

    VETERANCY("VETERANCY"),
    EXPERTISE("EXPERTISE"),
    IMAGINATION("IMAGINATION"),
    TEAMWORK("TEAMWORK"),
    COLLECTION("COLLECTION");


    public final String textValue;

    ChallengeCategory(String textValue) {
        this.textValue = textValue;
    }

    /**
     * Returns the enum textValue
     * @return Enum textValue
     */
    public String getValue(){
        return textValue;
    }

    /**
     * Returns the Enum object based on the passed value, or null if no enum is found
     * @param value Value to check enum against
     * @return Enum object based on the passed value, or null if no enum is found
     */
    public static ChallengeCategory getEnum(String value){
        for (ChallengeCategory p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
