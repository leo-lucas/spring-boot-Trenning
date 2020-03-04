package com.leolucas.training.Info;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * InfoApplication
 */
@RestController
public class InfoApplication {

  @GetMapping("/")
  public String initOK() {
    return "Is running";
  }

  @GetMapping("/sum")
  public Double sum(@RequestParam Double val1, @RequestParam Double val2) {
    return val1 + val2;
  }

}