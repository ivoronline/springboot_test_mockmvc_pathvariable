package com.ivoronline.springboot_test_mockmvc_pathvariable.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class MyControllerTest {

  @Autowired MockMvc      mockMvc;
  @Autowired MyController myController;

  @Test
  void hello() throws Exception {

    //CREATE REQUEST
    MockHttpServletRequestBuilder request = get("/Hello/John/20");

    //PERFORM REQUEST
    mockMvc.perform(request).andExpect(status().isOk());

  }

}


