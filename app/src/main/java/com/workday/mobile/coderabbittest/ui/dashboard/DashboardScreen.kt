package com.workday.mobile.coderabbittest.ui.dashboard

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun DashboardScreen(dashboardViewModel: DashboardViewModel) {
    Text(
        text = dashboardViewModel.text.value ?: "",
    )
}
