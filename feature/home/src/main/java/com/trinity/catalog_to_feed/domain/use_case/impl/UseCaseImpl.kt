package com.trinity.catalog_to_feed.domain.use_case.impl

import com.trinity.catalog_to_feed.domain.repository.Repository
import com.trinity.catalog_to_feed.domain.use_case.UseCase

class UseCaseImpl(
    private val repository: Repository
): UseCase {

    override operator fun invoke(): Int {
        return repository.doSomething()
    }
}