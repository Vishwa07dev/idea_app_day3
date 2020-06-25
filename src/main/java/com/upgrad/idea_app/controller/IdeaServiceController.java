package com.upgrad.idea_app.controller;

import com.upgrad.idea_app.dto.IdeaDTO;
import com.upgrad.idea_app.service.IdeaService;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


/**
 * This will be starting point of the Idea service end points
 */
@RestController
@RequestMapping("/ideas")
public class IdeaServiceController {

  @Autowired
  private IdeaService ideaService;

  /**
   * Creates a new resource
   * @param ideaDTO
   * @return
   */
  @PostMapping
  // We could have also applied the post mapping -   @PostMapping(value="/ideas")
  public ResponseEntity<Object> createIdea(@RequestBody IdeaDTO ideaDTO) {
    ideaService.saveIdea(ideaDTO);
    return new ResponseEntity<>(ideaDTO, HttpStatus.CREATED);
  }

  /**
   * get a all the created ideas
   * @return
   */
  @GetMapping
  public ResponseEntity<Object> getAllIdea() {
    return new ResponseEntity<>(ideaService.getAllIdea(), HttpStatus.OK);
  }

  /**
   * get the idea based on the idea id
   * @param id
   * @return
   */
  @GetMapping("/{id}")
  public ResponseEntity<Object> getIdea(@PathVariable("id") Long id) {
    return new ResponseEntity<>(ideaService.getIdea(id), HttpStatus.CREATED);
  }

  /**
   * update the idea
   * @param id
   * @param ideaDTO
   * @return
   */
  @PutMapping("/{id}")
  public ResponseEntity<Object> updateIdea(@PathVariable("id") Long id, @RequestBody IdeaDTO ideaDTO) {
    ideaService.saveIdea(ideaDTO);
    return new ResponseEntity<>(ideaDTO, HttpStatus.OK);
  }

  /**
   * delete the idea
   * @param id
   * @return
   */
  @DeleteMapping("/{id}")
  public ResponseEntity<Object> deleteIdea(@PathVariable("id") Long id) {
    ideaService.deleteIdea(id);
    return new ResponseEntity<>(null, HttpStatus.OK);
  }
}
