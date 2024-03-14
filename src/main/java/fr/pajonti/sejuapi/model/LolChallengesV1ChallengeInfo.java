/*
 * Riot API
 *  OpenAPI/Swagger version of the [Riot API](https://developer.riotgames.com/). Automatically generated daily. ## OpenAPI Spec File The following versions of the Riot API spec file are available: - `openapi-3.0.0.json` ([view file](../openapi-3.0.0.json), [ui select](?url=../openapi-3.0.0.json)) - `openapi-3.0.0.min.json` ([view file](../openapi-3.0.0.min.json), [ui select](?url=../openapi-3.0.0.min.json)) - `openapi-3.0.0.yml` ([view file](../openapi-3.0.0.yml), [ui select](?url=../openapi-3.0.0.yml)) - `openapi-3.0.0.min.yml` ([view file](../openapi-3.0.0.min.yml), [ui select](?url=../openapi-3.0.0.min.yml)) - `swaggerspec-2.0.json` ([view file](../swaggerspec-2.0.json), [ui select](?url=../swaggerspec-2.0.json)) - `swaggerspec-2.0.min.json` ([view file](../swaggerspec-2.0.min.json), [ui select](?url=../swaggerspec-2.0.min.json)) - `swaggerspec-2.0.yml` ([view file](../swaggerspec-2.0.yml), [ui select](?url=../swaggerspec-2.0.yml)) - `swaggerspec-2.0.min.yml` ([view file](../swaggerspec-2.0.min.yml), [ui select](?url=../swaggerspec-2.0.min.yml)) ## Other Files - Missing DTOs: [`missing.json`](../missing.json) - Routes Table: [`routesTable.json`](../routesTable.json) - [Enum Files](../enums/) ## Source Code Source code on [GitHub](https://github.com/MingweiSamuel/riotapi-schema). Pull requests welcome! ## Automatically Generated Rebuilt on [Travis CI](https://travis-ci.com/MingweiSamuel/riotapi-schema/builds) daily. *** 
 *
 * The version of the OpenAPI document: 879affafe206ccc5b48127e68c0bd466fcc73c84
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.pajonti.sejuapi.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.pajonti.sejuapi.invoker.JSON;

/**
 * LolChallengesV1ChallengeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T18:28:23.553111400+01:00[Europe/Paris]", comments = "Generator version: 7.4.0")
public class LolChallengesV1ChallengeInfo {
  public static final String SERIALIZED_NAME_CHALLENGE_ID = "challengeId";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_ID)
  private Long challengeId;

  public static final String SERIALIZED_NAME_PERCENTILE = "percentile";
  @SerializedName(SERIALIZED_NAME_PERCENTILE)
  private Double percentile;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private String level;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_ACHIEVED_TIME = "achievedTime";
  @SerializedName(SERIALIZED_NAME_ACHIEVED_TIME)
  private Long achievedTime;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Long position;

  public static final String SERIALIZED_NAME_PLAYERS_IN_LEVEL = "playersInLevel";
  @SerializedName(SERIALIZED_NAME_PLAYERS_IN_LEVEL)
  private Long playersInLevel;

  public LolChallengesV1ChallengeInfo() {
  }

  public LolChallengesV1ChallengeInfo challengeId(Long challengeId) {
    this.challengeId = challengeId;
    return this;
  }

   /**
   * Get challengeId
   * @return challengeId
  **/
  @javax.annotation.Nonnull
  public Long getChallengeId() {
    return challengeId;
  }

  public void setChallengeId(Long challengeId) {
    this.challengeId = challengeId;
  }


  public LolChallengesV1ChallengeInfo percentile(Double percentile) {
    this.percentile = percentile;
    return this;
  }

   /**
   * Get percentile
   * @return percentile
  **/
  @javax.annotation.Nonnull
  public Double getPercentile() {
    return percentile;
  }

  public void setPercentile(Double percentile) {
    this.percentile = percentile;
  }


  public LolChallengesV1ChallengeInfo level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nonnull
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }


  public LolChallengesV1ChallengeInfo value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  public LolChallengesV1ChallengeInfo achievedTime(Long achievedTime) {
    this.achievedTime = achievedTime;
    return this;
  }

   /**
   * Get achievedTime
   * @return achievedTime
  **/
  @javax.annotation.Nullable
  public Long getAchievedTime() {
    return achievedTime;
  }

  public void setAchievedTime(Long achievedTime) {
    this.achievedTime = achievedTime;
  }


  public LolChallengesV1ChallengeInfo position(Long position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  public Long getPosition() {
    return position;
  }

  public void setPosition(Long position) {
    this.position = position;
  }


  public LolChallengesV1ChallengeInfo playersInLevel(Long playersInLevel) {
    this.playersInLevel = playersInLevel;
    return this;
  }

   /**
   * Get playersInLevel
   * @return playersInLevel
  **/
  @javax.annotation.Nullable
  public Long getPlayersInLevel() {
    return playersInLevel;
  }

  public void setPlayersInLevel(Long playersInLevel) {
    this.playersInLevel = playersInLevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LolChallengesV1ChallengeInfo lolChallengesV1ChallengeInfo = (LolChallengesV1ChallengeInfo) o;
    return Objects.equals(this.challengeId, lolChallengesV1ChallengeInfo.challengeId) &&
        Objects.equals(this.percentile, lolChallengesV1ChallengeInfo.percentile) &&
        Objects.equals(this.level, lolChallengesV1ChallengeInfo.level) &&
        Objects.equals(this.value, lolChallengesV1ChallengeInfo.value) &&
        Objects.equals(this.achievedTime, lolChallengesV1ChallengeInfo.achievedTime) &&
        Objects.equals(this.position, lolChallengesV1ChallengeInfo.position) &&
        Objects.equals(this.playersInLevel, lolChallengesV1ChallengeInfo.playersInLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeId, percentile, level, value, achievedTime, position, playersInLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LolChallengesV1ChallengeInfo {\n");
    sb.append("    challengeId: ").append(toIndentedString(challengeId)).append("\n");
    sb.append("    percentile: ").append(toIndentedString(percentile)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    achievedTime: ").append(toIndentedString(achievedTime)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    playersInLevel: ").append(toIndentedString(playersInLevel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("challengeId");
    openapiFields.add("percentile");
    openapiFields.add("level");
    openapiFields.add("value");
    openapiFields.add("achievedTime");
    openapiFields.add("position");
    openapiFields.add("playersInLevel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("challengeId");
    openapiRequiredFields.add("percentile");
    openapiRequiredFields.add("level");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LolChallengesV1ChallengeInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LolChallengesV1ChallengeInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LolChallengesV1ChallengeInfo is not found in the empty JSON string", LolChallengesV1ChallengeInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LolChallengesV1ChallengeInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LolChallengesV1ChallengeInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LolChallengesV1ChallengeInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LolChallengesV1ChallengeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LolChallengesV1ChallengeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LolChallengesV1ChallengeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LolChallengesV1ChallengeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<LolChallengesV1ChallengeInfo>() {
           @Override
           public void write(JsonWriter out, LolChallengesV1ChallengeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LolChallengesV1ChallengeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LolChallengesV1ChallengeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LolChallengesV1ChallengeInfo
  * @throws IOException if the JSON string is invalid with respect to LolChallengesV1ChallengeInfo
  */
  public static LolChallengesV1ChallengeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LolChallengesV1ChallengeInfo.class);
  }

 /**
  * Convert an instance of LolChallengesV1ChallengeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

