package com.trinity.catalog_to_feed.presentation

import androidx.lifecycle.ViewModel
import com.trinity.catalog_to_feed.domain.use_case.UseCase

class HomeViewModel(
    private val useCase: UseCase
): ViewModel() {

    fun doSomething(): Int {
        return useCase()
    }
}