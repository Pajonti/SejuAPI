package fr.pajonti.sejuapi.enums.league;

public enum TeamRole {

    CAPTAIN("CAPTAIN"),
    MEMBER("MEMBER");

    public final String textValue;

    TeamRole(String textValue) {
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
    public static TeamRole getEnum(String value){
        for (TeamRole p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
