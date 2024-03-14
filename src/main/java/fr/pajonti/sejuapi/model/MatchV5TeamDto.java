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
import fr.pajonti.sejuapi.model.MatchV5BanDto;
import fr.pajonti.sejuapi.model.MatchV5ObjectivesDto;
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
 * MatchV5TeamDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T18:28:23.553111400+01:00[Europe/Paris]", comments = "Generator version: 7.4.0")
public class MatchV5TeamDto {
  public static final String SERIALIZED_NAME_BANS = "bans";
  @SerializedName(SERIALIZED_NAME_BANS)
  private List<MatchV5BanDto> bans = new ArrayList<>();

  public static final String SERIALIZED_NAME_OBJECTIVES = "objectives";
  @SerializedName(SERIALIZED_NAME_OBJECTIVES)
  private MatchV5ObjectivesDto objectives;

  public static final String SERIALIZED_NAME_TEAM_ID = "teamId";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  private Integer teamId;

  public static final String SERIALIZED_NAME_WIN = "win";
  @SerializedName(SERIALIZED_NAME_WIN)
  private Boolean win;

  public MatchV5TeamDto() {
  }

  public MatchV5TeamDto bans(List<MatchV5BanDto> bans) {
    this.bans = bans;
    return this;
  }

  public MatchV5TeamDto addBansItem(MatchV5BanDto bansItem) {
    if (this.bans == null) {
      this.bans = new ArrayList<>();
    }
    this.bans.add(bansItem);
    return this;
  }

   /**
   * Get bans
   * @return bans
  **/
  @javax.annotation.Nonnull
  public List<MatchV5BanDto> getBans() {
    return bans;
  }

  public void setBans(List<MatchV5BanDto> bans) {
    this.bans = bans;
  }


  public MatchV5TeamDto objectives(MatchV5ObjectivesDto objectives) {
    this.objectives = objectives;
    return this;
  }

   /**
   * Get objectives
   * @return objectives
  **/
  @javax.annotation.Nonnull
  public MatchV5ObjectivesDto getObjectives() {
    return objectives;
  }

  public void setObjectives(MatchV5ObjectivesDto objectives) {
    this.objectives = objectives;
  }


  public MatchV5TeamDto teamId(Integer teamId) {
    this.teamId = teamId;
    return this;
  }

   /**
   * Get teamId
   * @return teamId
  **/
  @javax.annotation.Nonnull
  public Integer getTeamId() {
    return teamId;
  }

  public void setTeamId(Integer teamId) {
    this.teamId = teamId;
  }


  public MatchV5TeamDto win(Boolean win) {
    this.win = win;
    return this;
  }

   /**
   * Get win
   * @return win
  **/
  @javax.annotation.Nonnull
  public Boolean getWin() {
    return win;
  }

  public void setWin(Boolean win) {
    this.win = win;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchV5TeamDto matchV5TeamDto = (MatchV5TeamDto) o;
    return Objects.equals(this.bans, matchV5TeamDto.bans) &&
        Objects.equals(this.objectives, matchV5TeamDto.objectives) &&
        Objects.equals(this.teamId, matchV5TeamDto.teamId) &&
        Objects.equals(this.win, matchV5TeamDto.win);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bans, objectives, teamId, win);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchV5TeamDto {\n");
    sb.append("    bans: ").append(toIndentedString(bans)).append("\n");
    sb.append("    objectives: ").append(toIndentedString(objectives)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    win: ").append(toIndentedString(win)).append("\n");
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
    openapiFields.add("bans");
    openapiFields.add("objectives");
    openapiFields.add("teamId");
    openapiFields.add("win");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bans");
    openapiRequiredFields.add("objectives");
    openapiRequiredFields.add("teamId");
    openapiRequiredFields.add("win");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MatchV5TeamDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MatchV5TeamDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MatchV5TeamDto is not found in the empty JSON string", MatchV5TeamDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MatchV5TeamDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MatchV5TeamDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MatchV5TeamDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("bans").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bans` to be an array in the JSON string but got `%s`", jsonObj.get("bans").toString()));
      }

      JsonArray jsonArraybans = jsonObj.getAsJsonArray("bans");
      // validate the required field `bans` (array)
      for (int i = 0; i < jsonArraybans.size(); i++) {
        MatchV5BanDto.validateJsonElement(jsonArraybans.get(i));
      };
      // validate the required field `objectives`
      MatchV5ObjectivesDto.validateJsonElement(jsonObj.get("objectives"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MatchV5TeamDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MatchV5TeamDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MatchV5TeamDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MatchV5TeamDto.class));

       return (TypeAdapter<T>) new TypeAdapter<MatchV5TeamDto>() {
           @Override
           public void write(JsonWriter out, MatchV5TeamDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MatchV5TeamDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MatchV5TeamDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MatchV5TeamDto
  * @throws IOException if the JSON string is invalid with respect to MatchV5TeamDto
  */
  public static MatchV5TeamDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MatchV5TeamDto.class);
  }

 /**
  * Convert an instance of MatchV5TeamDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

