package com.upgrad.idea_app.service;

import com.upgrad.idea_app.dto.IdeaDTO;
import java.util.List;


/**
 * Contract for the service layer
 */
public interface IdeaService {

     public void saveIdea(IdeaDTO ideaDTO);

     public void updateIdea(IdeaDTO ideaDTO);

     public List<IdeaDTO> getAllIdea();

     public IdeaDTO getIdea(long id);

     public void deleteIdea(long id);
}
