/*
 * Influx API Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client.domain;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.influxdb.client.domain.ViewProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * PkgChart
 */

public class PkgChart {
  public static final String SERIALIZED_NAME_X_POS = "xPos";
  @SerializedName(SERIALIZED_NAME_X_POS)
  private Integer xPos;

  public static final String SERIALIZED_NAME_Y_POS = "yPos";
  @SerializedName(SERIALIZED_NAME_Y_POS)
  private Integer yPos;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  @JsonAdapter(PkgChartPropertiesAdapter.class)
  private ViewProperties properties = null;

  public PkgChart xPos(Integer xPos) {
    this.xPos = xPos;
    return this;
  }

   /**
   * Get xPos
   * @return xPos
  **/
  @ApiModelProperty(value = "")
  public Integer getXPos() {
    return xPos;
  }

  public void setXPos(Integer xPos) {
    this.xPos = xPos;
  }

  public PkgChart yPos(Integer yPos) {
    this.yPos = yPos;
    return this;
  }

   /**
   * Get yPos
   * @return yPos
  **/
  @ApiModelProperty(value = "")
  public Integer getYPos() {
    return yPos;
  }

  public void setYPos(Integer yPos) {
    this.yPos = yPos;
  }

  public PkgChart height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PkgChart width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public PkgChart properties(ViewProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public ViewProperties getProperties() {
    return properties;
  }

  public void setProperties(ViewProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PkgChart pkgChart = (PkgChart) o;
    return Objects.equals(this.xPos, pkgChart.xPos) &&
        Objects.equals(this.yPos, pkgChart.yPos) &&
        Objects.equals(this.height, pkgChart.height) &&
        Objects.equals(this.width, pkgChart.width) &&
        Objects.equals(this.properties, pkgChart.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xPos, yPos, height, width, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PkgChart {\n");
    sb.append("    xPos: ").append(toIndentedString(xPos)).append("\n");
    sb.append("    yPos: ").append(toIndentedString(yPos)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public class PkgChartPropertiesAdapter implements JsonDeserializer<Object>, JsonSerializer<Object> {

    public PkgChartPropertiesAdapter() {
    }

    @Override
    public Object deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {

      List<String> discriminator = Arrays.asList("timeFormat", "type", "shape");

      JsonObject jsonObject = json.getAsJsonObject();

      String[] types = discriminator.stream().map(jsonObject::get).filter(Objects::nonNull).map(JsonElement::getAsString).toArray(String[]::new);

      return deserialize(types, jsonObject, context);
    }

    @Override
    public JsonElement serialize(Object object, Type typeOfSrc, JsonSerializationContext context) {

      return context.serialize(object);
    }

    private Object deserialize(final String[] types, final JsonElement json, final JsonDeserializationContext context) {

      if (Arrays.equals(new String[]{ "LinePlusSingleStatProperties", "line-plus-single-stat", "chronograf-v2" }, types)) {
        return context.deserialize(json, LinePlusSingleStatProperties.class);
      }
      if (Arrays.equals(new String[]{ "XYViewProperties", "xy", "chronograf-v2" }, types)) {
        return context.deserialize(json, XYViewProperties.class);
      }
      if (Arrays.equals(new String[]{ "single-stat", "chronograf-v2" }, types)) {
        return context.deserialize(json, SingleStatViewProperties.class);
      }
      if (Arrays.equals(new String[]{ "histogram", "chronograf-v2" }, types)) {
        return context.deserialize(json, HistogramViewProperties.class);
      }
      if (Arrays.equals(new String[]{ "gauge", "chronograf-v2" }, types)) {
        return context.deserialize(json, GaugeViewProperties.class);
      }
      if (Arrays.equals(new String[]{ "table", "chronograf-v2" }, types)) {
        return context.deserialize(json, TableViewProperties.class);
      }
      if (Arrays.equals(new String[]{ "markdown", "chronograf-v2" }, types)) {
        return context.deserialize(json, MarkdownViewProperties.class);
      }
      if (Arrays.equals(new String[]{ "check", "chronograf-v2" }, types)) {
        return context.deserialize(json, CheckViewProperties.class);
      }
      if (Arrays.equals(new String[]{ "ScatterViewProperties", "scatter", "chronograf-v2" }, types)) {
        return context.deserialize(json, ScatterViewProperties.class);
      }
      if (Arrays.equals(new String[]{ "HeatmapViewProperties", "heatmap", "chronograf-v2" }, types)) {
        return context.deserialize(json, HeatmapViewProperties.class);
      }

      return context.deserialize(json, Object.class);
    }
  }
}

