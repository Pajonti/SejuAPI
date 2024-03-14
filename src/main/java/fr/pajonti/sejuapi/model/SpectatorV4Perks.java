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
 * SpectatorV4Perks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T18:28:23.553111400+01:00[Europe/Paris]", comments = "Generator version: 7.4.0")
public class SpectatorV4Perks {
  public static final String SERIALIZED_NAME_PERK_IDS = "perkIds";
  @SerializedName(SERIALIZED_NAME_PERK_IDS)
  private List<Long> perkIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_PERK_STYLE = "perkStyle";
  @SerializedName(SERIALIZED_NAME_PERK_STYLE)
  private Long perkStyle;

  public static final String SERIALIZED_NAME_PERK_SUB_STYLE = "perkSubStyle";
  @SerializedName(SERIALIZED_NAME_PERK_SUB_STYLE)
  private Long perkSubStyle;

  public SpectatorV4Perks() {
  }

  public SpectatorV4Perks perkIds(List<Long> perkIds) {
    this.perkIds = perkIds;
    return this;
  }

  public SpectatorV4Perks addPerkIdsItem(Long perkIdsItem) {
    if (this.perkIds == null) {
      this.perkIds = new ArrayList<>();
    }
    this.perkIds.add(perkIdsItem);
    return this;
  }

   /**
   * IDs of the perks/runes assigned.
   * @return perkIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getPerkIds() {
    return perkIds;
  }

  public void setPerkIds(List<Long> perkIds) {
    this.perkIds = perkIds;
  }


  public SpectatorV4Perks perkStyle(Long perkStyle) {
    this.perkStyle = perkStyle;
    return this;
  }

   /**
   * Primary runes path
   * @return perkStyle
  **/
  @javax.annotation.Nonnull
  public Long getPerkStyle() {
    return perkStyle;
  }

  public void setPerkStyle(Long perkStyle) {
    this.perkStyle = perkStyle;
  }


  public SpectatorV4Perks perkSubStyle(Long perkSubStyle) {
    this.perkSubStyle = perkSubStyle;
    return this;
  }

   /**
   * Secondary runes path
   * @return perkSubStyle
  **/
  @javax.annotation.Nonnull
  public Long getPerkSubStyle() {
    return perkSubStyle;
  }

  public void setPerkSubStyle(Long perkSubStyle) {
    this.perkSubStyle = perkSubStyle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpectatorV4Perks spectatorV4Perks = (SpectatorV4Perks) o;
    return Objects.equals(this.perkIds, spectatorV4Perks.perkIds) &&
        Objects.equals(this.perkStyle, spectatorV4Perks.perkStyle) &&
        Objects.equals(this.perkSubStyle, spectatorV4Perks.perkSubStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perkIds, perkStyle, perkSubStyle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpectatorV4Perks {\n");
    sb.append("    perkIds: ").append(toIndentedString(perkIds)).append("\n");
    sb.append("    perkStyle: ").append(toIndentedString(perkStyle)).append("\n");
    sb.append("    perkSubStyle: ").append(toIndentedString(perkSubStyle)).append("\n");
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
    openapiFields.add("perkIds");
    openapiFields.add("perkStyle");
    openapiFields.add("perkSubStyle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("perkIds");
    openapiRequiredFields.add("perkStyle");
    openapiRequiredFields.add("perkSubStyle");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SpectatorV4Perks
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SpectatorV4Perks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpectatorV4Perks is not found in the empty JSON string", SpectatorV4Perks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SpectatorV4Perks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SpectatorV4Perks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SpectatorV4Perks.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("perkIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("perkIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `perkIds` to be an array in the JSON string but got `%s`", jsonObj.get("perkIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpectatorV4Perks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpectatorV4Perks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpectatorV4Perks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpectatorV4Perks.class));

       return (TypeAdapter<T>) new TypeAdapter<SpectatorV4Perks>() {
           @Override
           public void write(JsonWriter out, SpectatorV4Perks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SpectatorV4Perks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SpectatorV4Perks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpectatorV4Perks
  * @throws IOException if the JSON string is invalid with respect to SpectatorV4Perks
  */
  public static SpectatorV4Perks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpectatorV4Perks.class);
  }

 /**
  * Convert an instance of SpectatorV4Perks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

