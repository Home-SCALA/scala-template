package com.sumskoy.habr.template.core.repository

import com.sumskoy.habr.template.core.CoreSchema
import com.sumskoy.habr.template.utils.SquerylEntrypoint._
import org.springframework.stereotype.Repository

@Repository
class UserRepository {

  def findOne(username: String) = inTransaction {
    CoreSchema.users.where(_.username === username).singleOption
  }

}
