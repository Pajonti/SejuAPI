package fr.pajonti.sejuapi.enums.league;

public enum Role {

    CAPTAIN("CAPTAIN"),
    MEMBER("MEMBER");

    public final String textValue;

    Role(String textValue) {
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
    public static Role getEnum(String value){
        for (Role p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
