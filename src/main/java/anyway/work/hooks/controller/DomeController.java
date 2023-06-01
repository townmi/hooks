package anyway.work.hooks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DomeController {


  @GetMapping({"", "/"})
  public String demo() {
    return "demo";
  }
}
