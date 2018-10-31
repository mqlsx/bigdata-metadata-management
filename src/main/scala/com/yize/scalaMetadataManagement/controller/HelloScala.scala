package com.yize.scalaMetadataManagement.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
class HelloScala {

  @RequestMapping(value = Array("/sayHello"), method = Array(RequestMethod.GET))
  def sayHello() = {
    "Hi Scala~"
  }
}
