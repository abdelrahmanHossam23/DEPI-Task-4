package com.example.issues_light3.ui.navigation

sealed class Screens (val route: String){
    data object IssueListScreen: Screens("issue_list")
    data object IssueDetailsScreen: Screens("issue_details/{issue_id}"){
        fun passIssueType(issue_type : String): String{
            return "issue_details/$issue_type"
        }
    }
}