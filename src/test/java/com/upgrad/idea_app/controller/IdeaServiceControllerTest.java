package com.upgrad.idea_app.controller;

import com.upgrad.idea_app.AbstractIdeaTest;
import com.upgrad.idea_app.dto.IdeaDTO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static junit.framework.TestCase.*;


/**
 * Test class for the IdeaService
 */
public class IdeaServiceControllerTest extends AbstractIdeaTest {

  @Override
  @Before
  public void setUp() {
    super.setUp();
  }

  @Test
  public void createIdea() throws Exception {
    String uri = "/ideas";
    IdeaDTO idea = new IdeaDTO();
    idea.setIdeaName("New idea");
    idea.setId(125);
    idea.setAuthorName("Vishwa Mohan");
    idea.setIdeaDescription("Idea description");
    String inputJson = super.mapToJson(idea);
    MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
        .contentType(MediaType.APPLICATION_JSON_VALUE)
        .content(inputJson)).andReturn();

    int status = mvcResult.getResponse().getStatus();
    assertEquals(201, status);
    String content = mvcResult.getResponse().getContentAsString();
    assertEquals(content, inputJson);
  }


  @Test
  public void getIdeaList() throws Exception {
    System.out.println("Inside the test method");
    String uri = "/ideas";
    MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
        .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

    int status = mvcResult.getResponse().getStatus();
    assertEquals(200, status);
    String content = mvcResult.getResponse().getContentAsString();
    IdeaDTO[] idealist = super.mapFromJson(content, IdeaDTO[].class);
    System.out.println(idealist.length);
    assertTrue(idealist.length > 0);
  }

  @Test
  public void updateIdea() throws Exception {
    String uri = "/ideas/125";
    IdeaDTO idea = new IdeaDTO();
    idea.setIdeaName("New name");
    String inputJson = super.mapToJson(idea);
    MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri)
        .contentType(MediaType.APPLICATION_JSON_VALUE)
        .content(inputJson)).andReturn();

    int status = mvcResult.getResponse().getStatus();
    assertEquals(200, status);
    String content = mvcResult.getResponse().getContentAsString();
    assertEquals(content, inputJson);
  }

  @Test
  public void deleteProduct() throws Exception {
    String uri = "/ideas/125";
    MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
    int status = mvcResult.getResponse().getStatus();
    assertEquals(200, status);
    String content = mvcResult.getResponse().getContentAsString();
    assertEquals(content, "");
  }

}
