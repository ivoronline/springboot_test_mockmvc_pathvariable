package com.ivoronline.springboot_test_mockmvc_pathvariable.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @GetMapping("/Hello/{FirstName}/{age}")
  public String hello(
    @PathVariable("FirstName") String name, //IF NAMES ARE DIFFERENT
    @PathVariable              String age   //IF NAMES ARE THE SAME
  ) {
    return name + " is " + age + " years old";
  }

}
