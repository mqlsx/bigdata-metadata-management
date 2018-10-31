package com.yize.scalaMetadataManagement.controller

import com.yize.scalaMetadataManagement.domain.MetaTable
import com.yize.scalaMetadataManagement.service.MetaTableService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._
import com.yize.scalametadatamanagement.utils.ResultVOUtil

@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService: MetaTableService) {

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
  @ResponseBody
  def save(@ModelAttribute metaTable: MetaTable): Unit = {
    metaTableService.save(metaTable);
    ResultVOUtil.success()
  }

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  @ResponseBody
  def query() = {
    ResultVOUtil.success(metaTableService.query())
  }
}
