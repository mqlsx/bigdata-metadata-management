package com.yize.scalaMetadataManagement.repository

import com.yize.scalaMetadataManagement.domain.MetaTable
import org.springframework.data.repository.CrudRepository

trait MetaTableRepository extends CrudRepository[MetaTable, Integer] {

}
