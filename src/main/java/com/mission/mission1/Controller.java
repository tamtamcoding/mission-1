package com.mission.mission1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller
{
@RequestMapping("/hello")
public String hello()
{
return "Hello worldddddddd";
}
}