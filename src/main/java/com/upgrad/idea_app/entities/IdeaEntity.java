package com.upgrad.idea_app.entities;

import java.util.Objects;

/**
 * Idea entity class.
 * Not providing the detailed annotation is it will be
 * stored in the in-memory database
 */

public class IdeaEntity {

  private long id;
  private String ideaName;
  private String authorName;
  private String ideaDescription;

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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdeaEntity that = (IdeaEntity) o;
    return id == that.id && Objects.equals(ideaName, that.ideaName) && Objects.equals(authorName, that.authorName)
        && Objects.equals(ideaDescription, that.ideaDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ideaName, authorName, ideaDescription);
  }

  @Override
  public String toString() {
    return "IdeaEntity{" + "id=" + id + ", ideaName='" + ideaName + '\'' + ", authorName='" + authorName + '\''
        + ", ideaDescription='" + ideaDescription + '\'' + '}';
  }
}
