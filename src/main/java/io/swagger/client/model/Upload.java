/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Upload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T13:40:40.423-07:00")
public class Upload {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("id_str")
  private String idStr = null;

  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("activity_id")
  private Long activityId = null;

  public Upload id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the upload
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the upload")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Upload idStr(String idStr) {
    this.idStr = idStr;
    return this;
  }

   /**
   * The unique identifier of the upload in string format
   * @return idStr
  **/
  @ApiModelProperty(value = "The unique identifier of the upload in string format")
  public String getIdStr() {
    return idStr;
  }

  public void setIdStr(String idStr) {
    this.idStr = idStr;
  }

  public Upload externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The external identifier of the upload
   * @return externalId
  **/
  @ApiModelProperty(value = "The external identifier of the upload")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public Upload error(String error) {
    this.error = error;
    return this;
  }

   /**
   * The error associated with this upload
   * @return error
  **/
  @ApiModelProperty(value = "The error associated with this upload")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Upload status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of this upload
   * @return status
  **/
  @ApiModelProperty(value = "The status of this upload")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Upload activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * The identifier of the activity this upload resulted into
   * @return activityId
  **/
  @ApiModelProperty(value = "The identifier of the activity this upload resulted into")
  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Upload upload = (Upload) o;
    return Objects.equals(this.id, upload.id) &&
        Objects.equals(this.idStr, upload.idStr) &&
        Objects.equals(this.externalId, upload.externalId) &&
        Objects.equals(this.error, upload.error) &&
        Objects.equals(this.status, upload.status) &&
        Objects.equals(this.activityId, upload.activityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idStr, externalId, error, status, activityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Upload {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idStr: ").append(toIndentedString(idStr)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
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

}

