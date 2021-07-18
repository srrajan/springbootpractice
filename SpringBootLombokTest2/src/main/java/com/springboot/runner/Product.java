package com.springboot.runner;

import org.springframework.lang.NonNull;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
@Data
public class Product {
@NonNull
private Integer id;
@NonNull
private String pname;

}
