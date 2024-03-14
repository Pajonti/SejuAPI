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
 * MatchV5PerkStatsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T18:28:23.553111400+01:00[Europe/Paris]", comments = "Generator version: 7.4.0")
public class MatchV5PerkStatsDto {
  public static final String SERIALIZED_NAME_DEFENSE = "defense";
  @SerializedName(SERIALIZED_NAME_DEFENSE)
  private Integer defense;

  public static final String SERIALIZED_NAME_FLEX = "flex";
  @SerializedName(SERIALIZED_NAME_FLEX)
  private Integer flex;

  public static final String SERIALIZED_NAME_OFFENSE = "offense";
  @SerializedName(SERIALIZED_NAME_OFFENSE)
  private Integer offense;

  public MatchV5PerkStatsDto() {
  }

  public MatchV5PerkStatsDto defense(Integer defense) {
    this.defense = defense;
    return this;
  }

   /**
   * Get defense
   * @return defense
  **/
  @javax.annotation.Nonnull
  public Integer getDefense() {
    return defense;
  }

  public void setDefense(Integer defense) {
    this.defense = defense;
  }


  public MatchV5PerkStatsDto flex(Integer flex) {
    this.flex = flex;
    return this;
  }

   /**
   * Get flex
   * @return flex
  **/
  @javax.annotation.Nonnull
  public Integer getFlex() {
    return flex;
  }

  public void setFlex(Integer flex) {
    this.flex = flex;
  }


  public MatchV5PerkStatsDto offense(Integer offense) {
    this.offense = offense;
    return this;
  }

   /**
   * Get offense
   * @return offense
  **/
  @javax.annotation.Nonnull
  public Integer getOffense() {
    return offense;
  }

  public void setOffense(Integer offense) {
    this.offense = offense;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchV5PerkStatsDto matchV5PerkStatsDto = (MatchV5PerkStatsDto) o;
    return Objects.equals(this.defense, matchV5PerkStatsDto.defense) &&
        Objects.equals(this.flex, matchV5PerkStatsDto.flex) &&
        Objects.equals(this.offense, matchV5PerkStatsDto.offense);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defense, flex, offense);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchV5PerkStatsDto {\n");
    sb.append("    defense: ").append(toIndentedString(defense)).append("\n");
    sb.append("    flex: ").append(toIndentedString(flex)).append("\n");
    sb.append("    offense: ").append(toIndentedString(offense)).append("\n");
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
    openapiFields.add("defense");
    openapiFields.add("flex");
    openapiFields.add("offense");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("defense");
    openapiRequiredFields.add("flex");
    openapiRequiredFields.add("offense");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MatchV5PerkStatsDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MatchV5PerkStatsDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MatchV5PerkStatsDto is not found in the empty JSON string", MatchV5PerkStatsDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MatchV5PerkStatsDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MatchV5PerkStatsDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MatchV5PerkStatsDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MatchV5PerkStatsDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MatchV5PerkStatsDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MatchV5PerkStatsDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MatchV5PerkStatsDto.class));

       return (TypeAdapter<T>) new TypeAdapter<MatchV5PerkStatsDto>() {
           @Override
           public void write(JsonWriter out, MatchV5PerkStatsDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MatchV5PerkStatsDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MatchV5PerkStatsDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MatchV5PerkStatsDto
  * @throws IOException if the JSON string is invalid with respect to MatchV5PerkStatsDto
  */
  public static MatchV5PerkStatsDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MatchV5PerkStatsDto.class);
  }

 /**
  * Convert an instance of MatchV5PerkStatsDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

