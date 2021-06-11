package com.yun;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huah
 * @since 2021年06月10日
 */

@RestController
@RequestMapping("/Hello")
public class Controller {
  @RequestMapping("/World")
  public String helloWorld(String s){
    System.out.println("传入的值为："+s);
    return "传入的值为："+s;
  }

  @RequestMapping("/World2")
  public Map<String,Object> helloWorld2(String s){
    Map<String,Object> resultMap = new HashMap<>();
    System.out.println("传入的值为："+s);
    resultMap.put("msg",s);
    resultMap.put("status","200");
    resultMap.put("message","成功");
    return resultMap;
  }
}
