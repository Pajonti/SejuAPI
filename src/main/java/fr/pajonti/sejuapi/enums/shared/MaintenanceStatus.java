package fr.pajonti.sejuapi.enums.shared;

public enum MaintenanceStatus {

    SCHEDULED("scheduled"),
    IN_PROGRESS("in_progress"),
    COMPLETE("complete");

    public final String textValue;

    MaintenanceStatus(String textValue) {
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
    public static MaintenanceStatus getEnum(String value){
        for (MaintenanceStatus p : values()) {
            if (p.textValue.equals(value)) {
                return p;
            }
        }
        return null;
    }
}
