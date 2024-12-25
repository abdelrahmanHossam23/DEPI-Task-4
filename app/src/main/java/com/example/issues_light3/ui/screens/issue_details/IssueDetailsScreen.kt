package com.example.issues_light3.ui.screens.issue_details


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun IssueDetailsScreen(issueType: String?) {
    Text(text = "Issue Type: ${issueType ?: "Unknown"}")
}
