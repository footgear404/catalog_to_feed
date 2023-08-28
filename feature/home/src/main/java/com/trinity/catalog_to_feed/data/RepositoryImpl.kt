package com.trinity.catalog_to_feed.data

import com.trinity.catalog_to_feed.domain.repository.Repository

class RepositoryImpl: Repository {
    override fun doSomething(): Int {
        return 10
    }
}