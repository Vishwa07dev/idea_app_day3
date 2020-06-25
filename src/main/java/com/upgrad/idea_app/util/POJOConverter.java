package com.upgrad.idea_app.util;

import com.upgrad.idea_app.dto.IdeaDTO;
import com.upgrad.idea_app.entities.IdeaEntity;


/**
 * Utility class with static methods to convert one form into another
 */
public class POJOConverter {

  private POJOConverter() {
  }

  public static IdeaDTO convertEntityToDTO(IdeaEntity ideaEntity){

    IdeaDTO ideaDTO = new IdeaDTO();

    ideaDTO.setId(ideaEntity.getId());
    ideaDTO.setAuthorName(ideaEntity.getAuthorName());
    ideaDTO.setIdeaDescription(ideaEntity.getIdeaDescription());
    ideaDTO.setIdeaName(ideaEntity.getIdeaDescription());

    return ideaDTO ;
  }

  public static IdeaEntity convertDTOToEntity(IdeaDTO ideaDTO){

    IdeaEntity ideaEntity = new IdeaEntity();

    ideaEntity.setId(ideaDTO.getId());
    ideaEntity.setAuthorName(ideaDTO.getAuthorName());
    ideaEntity.setIdeaDescription(ideaDTO.getIdeaDescription());
    ideaEntity.setIdeaName(ideaDTO.getIdeaDescription());

    return ideaEntity ;
  }
}
