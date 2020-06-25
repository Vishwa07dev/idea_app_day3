package com.upgrad.idea_app.service.serviceimpl;

import com.upgrad.idea_app.dao.IdeaDAO;
import com.upgrad.idea_app.dto.IdeaDTO;
import com.upgrad.idea_app.entities.IdeaEntity;
import com.upgrad.idea_app.service.IdeaService;
import com.upgrad.idea_app.util.POJOConverter;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Idea service implementation to facilitate the CRUD operations on the idea resource
 */
@Service
public class IdeaServiceImpl implements IdeaService {

  @Autowired
  private IdeaDAO ideaDAO;

  @Override
  public void saveIdea(IdeaDTO ideaDTO) {
    ideaDAO.save(POJOConverter.convertDTOToEntity(ideaDTO));
  }

  @Override
  public void updateIdea(IdeaDTO ideaDTO) {
    ideaDAO.update(POJOConverter.convertDTOToEntity(ideaDTO));
  }

  @Override
  public List<IdeaDTO> getAllIdea() {
    return ideaDAO.findAll()
        .stream()
        .map(ideaEntity -> POJOConverter.convertEntityToDTO(ideaEntity))
        .collect(Collectors.toList());
  }

  @Override
  public IdeaDTO getIdea(long id) {
    return POJOConverter.convertEntityToDTO(ideaDAO.find(id));
  }

  @Override
  public void deleteIdea(long id) {
    ideaDAO.delete(id);
  }
}
