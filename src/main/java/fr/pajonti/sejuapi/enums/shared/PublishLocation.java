package fr.pajonti.sejuapi.enums.shared;

public enum PublishLocation {

    RIOTCLIENT("xbone"),
    RIOTSTATUS("switch"),
    GAME("ios");

    public final String textValue;

    PublishLocation(String textValue) {
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
    public static PublishLocation getEnum(String value){
        for (PublishLocation p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
