package com.dicoding.picodiploma.mycamera.data.di

import com.dicoding.picodiploma.mycamera.data.UploadRepository
import com.dicoding.picodiploma.mycamera.data.api.ApiConfig

object Injection {
    fun providedRepository(): UploadRepository {
        val apiService = ApiConfig.getApiService()
        return UploadRepository.getInstance(apiService)
    }
}