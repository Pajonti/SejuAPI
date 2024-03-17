package fr.pajonti.sejuapi.enums.tft;

import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;

import java.lang.reflect.Type;

@JsonAdapter(TFTTraitStyle.Serializer.class)
public enum TFTTraitStyle {

    NONE(0),
    BRONZE(1),
    SILVER(2),
    GOLD(3),
    PRISMATIC(4);

    public final Integer styleCode;

    TFTTraitStyle(Integer styleCode) {
        this.styleCode = styleCode;
    }

    /**
     * Returns the enum textValue
     * @return Enum textValue
     */
    public Integer getValue(){
        return styleCode;
    }

    /**
     * Returns the Enum object based on the passed value, or null if no enum is found
     * @param value Value to check enum against
     * @return Enum object based on the passed value, or null if no enum is found
     */
    public static TFTTraitStyle getEnum(Integer value){
        for (TFTTraitStyle p : values()) {
            if (p.styleCode.equals(value)) {
                return p;
            }
        }
        return null;
    }

    static class Serializer implements JsonSerializer<TFTTraitStyle>, JsonDeserializer<TFTTraitStyle> {
        @Override
        public TFTTraitStyle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return TFTTraitStyle.getEnum(jsonElement.getAsInt());
        }

        @Override
        public JsonElement serialize(TFTTraitStyle queueID, Type type, JsonSerializationContext jsonSerializationContext) {
            return jsonSerializationContext.serialize(queueID.styleCode);
        }
    }
}
