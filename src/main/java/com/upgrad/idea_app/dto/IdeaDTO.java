package com.upgrad.idea_app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;


/**
 * Idea  DTO which will be transferred over network
 */
public class IdeaDTO {
  /**
   * unique identifier of the each idea
   */
  @JsonProperty("id") //This is being used to map the DTO Pojo with json keys
  private long id ;

  /**
   * name of the idea
   */
  @JsonProperty("idea_name")
  private String ideaName ;

  /**
   * name of the author
   */
  @JsonProperty("author_name")
  private String authorName ;

  /**
   * description of the idea
   */
  @JsonProperty("idea_description")
  private String ideaDescription ;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getIdeaName() {
    return ideaName;
  }

  public void setIdeaName(String ideaName) {
    this.ideaName = ideaName;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public String getIdeaDescription() {
    return ideaDescription;
  }

  public void setIdeaDescription(String ideaDescription) {
    this.ideaDescription = ideaDescription;
  }

  @Override
  public String toString() {
    return "IdeaDTO{" + "id=" + id + ", ideaName='" + ideaName + '\'' + ", authorName='" + authorName + '\''
        + ", ideaDescription='" + ideaDescription + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdeaDTO ideaDTO = (IdeaDTO) o;
    return id == ideaDTO.id && Objects.equals(ideaName, ideaDTO.ideaName) && Objects.equals(authorName,
        ideaDTO.authorName) && Objects.equals(ideaDescription, ideaDTO.ideaDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ideaName, authorName, ideaDescription);
  }
}
