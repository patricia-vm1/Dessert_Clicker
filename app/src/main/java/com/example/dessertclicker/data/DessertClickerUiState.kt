package com.example.dessertclicker.data

import androidx.annotation.DrawableRes
import com.example.dessertclicker.data.Datasource.dessertList

class DessertClickerUiState {
    val revenue: Int = 0
    val dessertsSold: Int= 0
    val currentDessertIndex: Int = 0
    var currentDessertPrice: Int = dessertList[currentDessertIndex].price
    @DrawableRes
    val currentDessertImageId: Int = dessertList[currentDessertIndex].imageId

}