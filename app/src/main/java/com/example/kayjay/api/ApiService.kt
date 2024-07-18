package com.example.kayjay.api

import com.example.kayjay.models.Product
import com.example.kayjay.utils.Constants
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.PRODUCTS_PATH)
    suspend fun getProducts(): List<Product>
}