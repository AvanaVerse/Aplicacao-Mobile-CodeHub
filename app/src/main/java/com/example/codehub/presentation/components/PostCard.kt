package com.example.codehub.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.codehub.R
import com.example.codehub.presentation.theme.MyApplicationTheme

@Composable
fun PostCard(modifier: Modifier = Modifier) {
	Surface(
		modifier = modifier.fillMaxWidth(),
		shape = RoundedCornerShape(22.dp),
		color = Color.White,
		border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE1E5ED)),
		shadowElevation = 1.dp
	) {
		Column(modifier = Modifier.padding(20.dp)) {
			Row(verticalAlignment = Alignment.CenterVertically) {
				UserAvatar(initials = "LC", size = 42.dp)
				Spacer(modifier = Modifier.width(12.dp))
				Column {
					Text(
						text = stringResource(R.string.user_name),
						color = Color(0xFF252A38),
						fontSize = 16.sp,
						fontWeight = FontWeight.SemiBold
					)
					Text(
						text = stringResource(R.string.publication_preview_status),
						color = Color(0xFF737B8F),
						fontSize = 14.sp
					)
				}
			}

			Box(
				modifier = Modifier
					.fillMaxWidth()
					.padding(top = 14.dp, bottom = 12.dp)
					.height(1.dp)
					.background(Color(0xFFE1E5ED))
			)

			Text(
				text = stringResource(R.string.publication_preview_title),
				color = Color(0xFF252A38),
				fontSize = 20.sp,
				lineHeight = 27.sp,
				fontWeight = FontWeight.Bold
			)
			Text(
				text = stringResource(R.string.publication_preview_body_first),
				modifier = Modifier.padding(top = 10.dp),
				color = Color(0xFF697286),
				fontSize = 16.sp,
				lineHeight = 25.sp
			)
			Text(
				text = stringResource(R.string.publication_preview_body_second),
				modifier = Modifier.padding(top = 24.dp),
				color = Color(0xFF697286),
				fontSize = 16.sp,
				lineHeight = 25.sp
			)
		}
	}
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F6FA, widthDp = 390)
@Composable
fun PostCardPreview() {
	MyApplicationTheme {
		PostCard(modifier = Modifier.padding(12.dp))
	}
}