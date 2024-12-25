package com.example.issues_light3.ui.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.issues_light3.ui.screens.issue_list.IssueItem
import com.example.issues_light3.ui.screens.issue_list.IssueListScreen


@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.IssueListScreen.route
    ) {
        composable(route = Screens.IssueListScreen.route) {
            IssueListScreen(
                onItemClick = {
                    navController.navigate(Screens.IssueDetailsScreen.passIssueType(issue_type = "Error 404"))
                }
            )
        }
        composable(route = Screens.IssueDetailsScreen.route + "/{issue_id}") { navBackStackEntry ->
            val issueType = navBackStackEntry.arguments?.getString("issue_type")
            issueType?.let {
                Text(text = it)
            }
        }
    }
}
