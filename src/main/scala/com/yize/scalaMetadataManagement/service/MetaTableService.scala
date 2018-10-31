package com.yize.scalaMetadataManagement.service

import com.yize.scalaMetadataManagement.domain.MetaTable
import com.yize.scalaMetadataManagement.repository.MetaTableRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MetaTableService @Autowired() (metaTableRepository: MetaTableRepository) {

  @Transactional
  def save(metaTable: MetaTable): Unit = {
    metaTableRepository.save(metaTable)
  }

  def query() = {
    metaTableRepository.findAll()
  }
}
