package com.upgrad.idea_app.dao.daoimpl;

import com.upgrad.idea_app.dao.IdeaDAO;
import com.upgrad.idea_app.entities.IdeaEntity;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;


/**
 * This DAO implementation will store the data in memory
 */
@Repository
public class IdeaInmemoryDAOImpl implements IdeaDAO {

  private static final Map<Long, IdeaEntity> IDEA_STORE = new ConcurrentHashMap<>();

  @Override
  public void save(IdeaEntity idea) {
    IDEA_STORE.put(idea.getId(), idea);
  }

  @Override
  public IdeaEntity find(long id) {
    return IDEA_STORE.get(id);
  }

  @Override
  public List<IdeaEntity> findAll() {
    return IDEA_STORE.values().stream().collect(Collectors.toList());
  }

  @Override
  public void update(IdeaEntity idea) {
    IDEA_STORE.put(idea.getId(), idea);
  }

  @Override
  public void delete(long id) {
    IDEA_STORE.remove(id);
  }
}
