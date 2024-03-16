package fr.pajonti.sejuapi.enums.tft;

import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;

import java.lang.reflect.Type;

@JsonAdapter(QueueID.Serializer.class)
public enum QueueID {

    NORMAL_NORMAL_TFT(1090L),
    RANKED_RANKED_TFT(1100L),
    TUTORIAL_TUTORIAL_TFT(1110L),
    HYPERROLL_RANKED_TFT_TURBO(1130L),
    DOUBLEUP_RANKED_TFT_DOUBLE_UP(1160L),
    FORTUNESFAVOR_NORMAL_TFT(1170L),
    SOULBRAWL_SF_TFT(1180L),
    CHONCCSTREASURE_LNY23_TFT(1190L);

    public final Long type;

    QueueID(Long type) {
        this.type = type;
    }

    /**
     * Returns the enum textValue
     * @return Enum textValue
     */
    public Long getValue(){
        return type;
    }

    /**
     * Returns the Enum object based on the passed value, or null if no enum is found
     * @param value Value to check enum against
     * @return Enum object based on the passed value, or null if no enum is found
     */
    public static QueueID getEnum(Long value){
        for (QueueID p : values()) {
            if (p.type.equals(value)) {
                return p;
            }
        }
        return null;
    }

    static class Serializer implements JsonSerializer<QueueID>, JsonDeserializer<QueueID> {

        @Override
        public QueueID deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return QueueID.getEnum(jsonElement.getAsLong());
        }

        @Override
        public JsonElement serialize(QueueID queueID, Type type, JsonSerializationContext jsonSerializationContext) {
            return jsonSerializationContext.serialize(queueID.type);
        }
    }
}
