package com.example.issuedemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @Value("${greeting}")
  private String text;

  @GetMapping("/info")
  public ResponseEntity<String> info() {
    return ResponseEntity.ok(text);
  }
}
