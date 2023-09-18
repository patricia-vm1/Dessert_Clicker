package com.example.dessertclicker.ui

import androidx.lifecycle.ViewModel
import com.example.dessertclicker.data.DessertClickerUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class DessertClickerViewModel: ViewModel() {
    private val _dessertClickerUiState = MutableStateFlow(DessertClickerUiState())
    val uiState: StateFlow<DessertClickerUiState> = _dessertClickerUiState.asStateFlow()


    }



