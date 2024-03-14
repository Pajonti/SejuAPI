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
import fr.pajonti.sejuapi.model.ClashV1TournamentPhaseDto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * ClashV1TournamentDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T18:28:23.553111400+01:00[Europe/Paris]", comments = "Generator version: 7.4.0")
public class ClashV1TournamentDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_THEME_ID = "themeId";
  @SerializedName(SERIALIZED_NAME_THEME_ID)
  private Integer themeId;

  public static final String SERIALIZED_NAME_NAME_KEY = "nameKey";
  @SerializedName(SERIALIZED_NAME_NAME_KEY)
  private String nameKey;

  public static final String SERIALIZED_NAME_NAME_KEY_SECONDARY = "nameKeySecondary";
  @SerializedName(SERIALIZED_NAME_NAME_KEY_SECONDARY)
  private String nameKeySecondary;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private List<ClashV1TournamentPhaseDto> schedule = new ArrayList<>();

  public ClashV1TournamentDto() {
  }

  public ClashV1TournamentDto id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ClashV1TournamentDto themeId(Integer themeId) {
    this.themeId = themeId;
    return this;
  }

   /**
   * Get themeId
   * @return themeId
  **/
  @javax.annotation.Nonnull
  public Integer getThemeId() {
    return themeId;
  }

  public void setThemeId(Integer themeId) {
    this.themeId = themeId;
  }


  public ClashV1TournamentDto nameKey(String nameKey) {
    this.nameKey = nameKey;
    return this;
  }

   /**
   * Get nameKey
   * @return nameKey
  **/
  @javax.annotation.Nonnull
  public String getNameKey() {
    return nameKey;
  }

  public void setNameKey(String nameKey) {
    this.nameKey = nameKey;
  }


  public ClashV1TournamentDto nameKeySecondary(String nameKeySecondary) {
    this.nameKeySecondary = nameKeySecondary;
    return this;
  }

   /**
   * Get nameKeySecondary
   * @return nameKeySecondary
  **/
  @javax.annotation.Nonnull
  public String getNameKeySecondary() {
    return nameKeySecondary;
  }

  public void setNameKeySecondary(String nameKeySecondary) {
    this.nameKeySecondary = nameKeySecondary;
  }


  public ClashV1TournamentDto schedule(List<ClashV1TournamentPhaseDto> schedule) {
    this.schedule = schedule;
    return this;
  }

  public ClashV1TournamentDto addScheduleItem(ClashV1TournamentPhaseDto scheduleItem) {
    if (this.schedule == null) {
      this.schedule = new ArrayList<>();
    }
    this.schedule.add(scheduleItem);
    return this;
  }

   /**
   * Tournament phase.
   * @return schedule
  **/
  @javax.annotation.Nonnull
  public List<ClashV1TournamentPhaseDto> getSchedule() {
    return schedule;
  }

  public void setSchedule(List<ClashV1TournamentPhaseDto> schedule) {
    this.schedule = schedule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClashV1TournamentDto clashV1TournamentDto = (ClashV1TournamentDto) o;
    return Objects.equals(this.id, clashV1TournamentDto.id) &&
        Objects.equals(this.themeId, clashV1TournamentDto.themeId) &&
        Objects.equals(this.nameKey, clashV1TournamentDto.nameKey) &&
        Objects.equals(this.nameKeySecondary, clashV1TournamentDto.nameKeySecondary) &&
        Objects.equals(this.schedule, clashV1TournamentDto.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, themeId, nameKey, nameKeySecondary, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClashV1TournamentDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    themeId: ").append(toIndentedString(themeId)).append("\n");
    sb.append("    nameKey: ").append(toIndentedString(nameKey)).append("\n");
    sb.append("    nameKeySecondary: ").append(toIndentedString(nameKeySecondary)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("themeId");
    openapiFields.add("nameKey");
    openapiFields.add("nameKeySecondary");
    openapiFields.add("schedule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("themeId");
    openapiRequiredFields.add("nameKey");
    openapiRequiredFields.add("nameKeySecondary");
    openapiRequiredFields.add("schedule");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ClashV1TournamentDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClashV1TournamentDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClashV1TournamentDto is not found in the empty JSON string", ClashV1TournamentDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClashV1TournamentDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClashV1TournamentDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClashV1TournamentDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("nameKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameKey").toString()));
      }
      if (!jsonObj.get("nameKeySecondary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameKeySecondary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameKeySecondary").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("schedule").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schedule` to be an array in the JSON string but got `%s`", jsonObj.get("schedule").toString()));
      }

      JsonArray jsonArrayschedule = jsonObj.getAsJsonArray("schedule");
      // validate the required field `schedule` (array)
      for (int i = 0; i < jsonArrayschedule.size(); i++) {
        ClashV1TournamentPhaseDto.validateJsonElement(jsonArrayschedule.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClashV1TournamentDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClashV1TournamentDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClashV1TournamentDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClashV1TournamentDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ClashV1TournamentDto>() {
           @Override
           public void write(JsonWriter out, ClashV1TournamentDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClashV1TournamentDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClashV1TournamentDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClashV1TournamentDto
  * @throws IOException if the JSON string is invalid with respect to ClashV1TournamentDto
  */
  public static ClashV1TournamentDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClashV1TournamentDto.class);
  }

 /**
  * Convert an instance of ClashV1TournamentDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

