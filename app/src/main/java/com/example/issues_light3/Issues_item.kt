package com.example.issues_light3

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
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.issues_light3.ui.theme.Issues_light3Theme
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp // Import for text size in sp



@Composable
fun IssueItem(modifier: Modifier = Modifier) {
    Row (
        Modifier.fillMaxWidth()
            .padding(top = 8.dp)
            .padding(horizontal = 8.dp)
            .background(
                color = Color.White,
                shape = RoundedCornerShape(12.dp)

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
                    text = "Bump werkzeug from",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis

                )
                Spacer(modifier = Modifier.width(30.dp))
                Text(
                    text = "Open",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    ),

                )
            }

            Spacer(Modifier.height(8.dp))
            Text(
                text = "NONE",
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
            )
            Spacer(Modifier.height(8.dp))
            Row {
                Text(
                    text = "Created at:",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )

                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    text = "2023-10-25, 18:52 PM",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Light
                    )
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
    Issues_light3Theme {
        IssueItem()
    }
}