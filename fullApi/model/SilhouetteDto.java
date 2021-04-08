package model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SilhouetteDto
 */

public class SilhouetteDto   {
  @JsonProperty("sectionId")
  private String sectionId = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("state")
  private Integer state = null;

  public SilhouetteDto sectionId(String sectionId) {
    this.sectionId = sectionId;
    return this;
  }

   /**
   * Section unique identifier
   * @return sectionId
  **/
  @ApiModelProperty(value = "Section unique identifier")
  public String getSectionId() {
    return sectionId;
  }

  public void setSectionId(String sectionId) {
    this.sectionId = sectionId;
  }

  public SilhouetteDto url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Assigned viewpoint url for the section
   * @return url
  **/
  @ApiModelProperty(value = "Assigned viewpoint url for the section")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SilhouetteDto state(Integer state) {
    this.state = state;
    return this;
  }

   /**
   * 301 for permanent redirect with exact image URL, 302 for temporary redirect with approximate image URL 303 uknown model for rendering
   * @return state
  **/
  @ApiModelProperty(value = "301 for permanent redirect with exact image URL, 302 for temporary redirect with approximate image URL 303 uknown model for rendering")
  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SilhouetteDto silhouetteDto = (SilhouetteDto) o;
    return Objects.equals(this.sectionId, silhouetteDto.sectionId) &&
        Objects.equals(this.url, silhouetteDto.url) &&
        Objects.equals(this.state, silhouetteDto.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionId, url, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SilhouetteDto {\n");
    
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

