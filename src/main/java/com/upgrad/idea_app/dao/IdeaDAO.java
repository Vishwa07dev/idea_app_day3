package com.upgrad.idea_app.dao;

import com.upgrad.idea_app.entities.IdeaEntity;
import java.util.List;


/**
 * DAO contracts for the Idea entity
 */
public interface IdeaDAO {
  /**
   *
   * @param idea
   */
  public void save(IdeaEntity idea);

  /**
   *
   * @param id
   */
  public IdeaEntity find(long id);

  /**
   *
   * @return
   */
  public List<IdeaEntity> findAll();

  /**
   *
   * @param idea
   */
  public void update(IdeaEntity idea);

  /**
   *
   * @param id
   */
  public void delete(long id);
}
