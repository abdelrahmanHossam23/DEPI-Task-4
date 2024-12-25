package com.example.issues_light3.ui.screens.issue_list

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.example.issues_light3.R
import com.example.issues_light3.ui.screens.issue_list.preview.fakeIssueList


@Composable
fun IssueItem(
    githubIssueUiModel: GithubIssueUiModel,
    modifier: Modifier = Modifier,
    onItemClick: () -> Unit
) {
    Row (
        Modifier.fillMaxWidth()
            .padding(top = 8.dp)
            .padding(horizontal = 8.dp)
            .background(
                color = MaterialTheme.colorScheme.onBackground,
                shape = MaterialTheme.shapes.medium

            )
    ){
        Image(
            modifier = Modifier.size(35.dp)
                .padding(start = 8.dp, top = 8.dp)
                .clip(shape = CircleShape),
            painter = painterResource(R.drawable.baseline_radio_button_checked_24),
            contentDescription = null
        )
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Row (
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    modifier = Modifier.weight(1f),
                    text = githubIssueUiModel.name,
                    style = MaterialTheme.typography.titleMedium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis

                )
                Spacer(modifier = Modifier.width(30.dp))
                Text(
                    text = "Open",
                    style = MaterialTheme.typography.labelMedium,

                )
            }

            Spacer(Modifier.height(8.dp))
            Text(
                text = githubIssueUiModel.type,
                style = MaterialTheme.typography.labelLarge
            )
            Spacer(Modifier.height(8.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = "Created at:",
                    style = MaterialTheme.typography.labelLarge,

                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    text = githubIssueUiModel.date,
                    style = MaterialTheme.typography.labelMedium,
                )
            }

        }


    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0x00ff44
)
@Composable
private fun PreviewIssueItem() {

        IssueItem(githubIssueUiModel = fakeIssueList.first(), onItemClick = {})

}

