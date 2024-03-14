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
import fr.pajonti.sejuapi.model.TftStatusV1ContentDto;
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
 * TftStatusV1UpdateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T18:28:23.553111400+01:00[Europe/Paris]", comments = "Generator version: 7.4.0")
public class TftStatusV1UpdateDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_PUBLISH = "publish";
  @SerializedName(SERIALIZED_NAME_PUBLISH)
  private Boolean publish;

  /**
   * Gets or Sets publishLocations
   */
  @JsonAdapter(PublishLocationsEnum.Adapter.class)
  public enum PublishLocationsEnum {
    RIOTCLIENT("riotclient"),
    
    RIOTSTATUS("riotstatus"),
    
    GAME("game");

    private String value;

    PublishLocationsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PublishLocationsEnum fromValue(String value) {
      for (PublishLocationsEnum b : PublishLocationsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PublishLocationsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PublishLocationsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PublishLocationsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PublishLocationsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PublishLocationsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PUBLISH_LOCATIONS = "publish_locations";
  @SerializedName(SERIALIZED_NAME_PUBLISH_LOCATIONS)
  private List<PublishLocationsEnum> publishLocations = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRANSLATIONS = "translations";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS)
  private List<TftStatusV1ContentDto> translations = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public TftStatusV1UpdateDto() {
  }

  public TftStatusV1UpdateDto id(Integer id) {
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


  public TftStatusV1UpdateDto author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nonnull
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public TftStatusV1UpdateDto publish(Boolean publish) {
    this.publish = publish;
    return this;
  }

   /**
   * Get publish
   * @return publish
  **/
  @javax.annotation.Nonnull
  public Boolean getPublish() {
    return publish;
  }

  public void setPublish(Boolean publish) {
    this.publish = publish;
  }


  public TftStatusV1UpdateDto publishLocations(List<PublishLocationsEnum> publishLocations) {
    this.publishLocations = publishLocations;
    return this;
  }

  public TftStatusV1UpdateDto addPublishLocationsItem(PublishLocationsEnum publishLocationsItem) {
    if (this.publishLocations == null) {
      this.publishLocations = new ArrayList<>();
    }
    this.publishLocations.add(publishLocationsItem);
    return this;
  }

   /**
   * (Legal values: riotclient, riotstatus, game)
   * @return publishLocations
  **/
  @javax.annotation.Nonnull
  public List<PublishLocationsEnum> getPublishLocations() {
    return publishLocations;
  }

  public void setPublishLocations(List<PublishLocationsEnum> publishLocations) {
    this.publishLocations = publishLocations;
  }


  public TftStatusV1UpdateDto translations(List<TftStatusV1ContentDto> translations) {
    this.translations = translations;
    return this;
  }

  public TftStatusV1UpdateDto addTranslationsItem(TftStatusV1ContentDto translationsItem) {
    if (this.translations == null) {
      this.translations = new ArrayList<>();
    }
    this.translations.add(translationsItem);
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @javax.annotation.Nonnull
  public List<TftStatusV1ContentDto> getTranslations() {
    return translations;
  }

  public void setTranslations(List<TftStatusV1ContentDto> translations) {
    this.translations = translations;
  }


  public TftStatusV1UpdateDto createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public TftStatusV1UpdateDto updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TftStatusV1UpdateDto tftStatusV1UpdateDto = (TftStatusV1UpdateDto) o;
    return Objects.equals(this.id, tftStatusV1UpdateDto.id) &&
        Objects.equals(this.author, tftStatusV1UpdateDto.author) &&
        Objects.equals(this.publish, tftStatusV1UpdateDto.publish) &&
        Objects.equals(this.publishLocations, tftStatusV1UpdateDto.publishLocations) &&
        Objects.equals(this.translations, tftStatusV1UpdateDto.translations) &&
        Objects.equals(this.createdAt, tftStatusV1UpdateDto.createdAt) &&
        Objects.equals(this.updatedAt, tftStatusV1UpdateDto.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, author, publish, publishLocations, translations, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TftStatusV1UpdateDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    publish: ").append(toIndentedString(publish)).append("\n");
    sb.append("    publishLocations: ").append(toIndentedString(publishLocations)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("author");
    openapiFields.add("publish");
    openapiFields.add("publish_locations");
    openapiFields.add("translations");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("publish");
    openapiRequiredFields.add("publish_locations");
    openapiRequiredFields.add("translations");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TftStatusV1UpdateDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TftStatusV1UpdateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TftStatusV1UpdateDto is not found in the empty JSON string", TftStatusV1UpdateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TftStatusV1UpdateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TftStatusV1UpdateDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TftStatusV1UpdateDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("publish_locations") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("publish_locations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_locations` to be an array in the JSON string but got `%s`", jsonObj.get("publish_locations").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("translations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `translations` to be an array in the JSON string but got `%s`", jsonObj.get("translations").toString()));
      }

      JsonArray jsonArraytranslations = jsonObj.getAsJsonArray("translations");
      // validate the required field `translations` (array)
      for (int i = 0; i < jsonArraytranslations.size(); i++) {
        TftStatusV1ContentDto.validateJsonElement(jsonArraytranslations.get(i));
      };
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TftStatusV1UpdateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TftStatusV1UpdateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TftStatusV1UpdateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TftStatusV1UpdateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<TftStatusV1UpdateDto>() {
           @Override
           public void write(JsonWriter out, TftStatusV1UpdateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TftStatusV1UpdateDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TftStatusV1UpdateDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TftStatusV1UpdateDto
  * @throws IOException if the JSON string is invalid with respect to TftStatusV1UpdateDto
  */
  public static TftStatusV1UpdateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TftStatusV1UpdateDto.class);
  }

 /**
  * Convert an instance of TftStatusV1UpdateDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

