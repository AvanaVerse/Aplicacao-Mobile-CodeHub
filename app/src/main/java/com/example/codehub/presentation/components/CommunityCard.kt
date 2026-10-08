package com.example.codehub.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ChevronRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.codehub.R
import com.example.codehub.presentation.theme.MyApplicationTheme

@Composable
fun CommunityCard(
	modifier: Modifier = Modifier,
	onOpenConversation: () -> Unit = {}
) {
	Surface(
		modifier = modifier.fillMaxWidth(),
		shape = RoundedCornerShape(16.dp),
		color = Color.White,
		border = BorderStroke(1.dp, Color(0xFFE1E5ED)),
		shadowElevation = 1.dp
	) {
		Column(modifier = Modifier.padding(16.dp)) {
			Row(verticalAlignment = Alignment.CenterVertically) {
				UserAvatar(
					initials = "RA",
					size = 32.dp,
					backgroundColor = Color(0xFFFFE9E3)
				)
				Spacer(modifier = Modifier.width(10.dp))
				Column {
					Text(
						text = stringResource(R.string.community_card_author),
						color = Color(0xFF252A38),
						fontSize = 13.sp,
						fontWeight = FontWeight.SemiBold
					)
					Text(
						text = stringResource(R.string.community_card_meta),
						color = Color(0xFF737B8F),
						fontSize = 11.sp
					)
				}
			}

			Text(
				text = stringResource(R.string.community_card_title),
				modifier = Modifier.padding(top = 12.dp),
				color = Color(0xFF252A38),
				fontSize = 16.sp,
				lineHeight = 22.sp,
				fontWeight = FontWeight.Bold
			)
			Text(
				text = stringResource(R.string.community_card_summary),
				modifier = Modifier.padding(top = 6.dp),
				color = Color(0xFF697286),
				fontSize = 13.sp,
				lineHeight = 20.sp
			)

			Row(
				modifier = Modifier.padding(top = 10.dp),
				horizontalArrangement = Arrangement.spacedBy(6.dp)
			) {
				CommunityTag(text = stringResource(R.string.community_card_tag_language))
				CommunityTag(text = stringResource(R.string.community_card_tag_level))
			}

			Row(
				modifier = Modifier
					.fillMaxWidth()
					.padding(top = 8.dp)
					.clickable(role = Role.Button, onClick = onOpenConversation),
				verticalAlignment = Alignment.CenterVertically
			) {
				Text(
					text = stringResource(R.string.community_card_action),
					color = Color(0xFFDF3211),
					fontSize = 12.sp,
					fontWeight = FontWeight.SemiBold
				)
				Spacer(modifier = Modifier.weight(1f))
				Icon(
					imageVector = Icons.Outlined.ChevronRight,
					contentDescription = null,
					tint = Color(0xFFDF3211),
					modifier = Modifier.size(18.dp)
				)
			}
		}
	}
}

@Composable
private fun CommunityTag(text: String) {
	Text(
		text = text,
		modifier = Modifier
			.background(Color(0xFFF5F6FA), RoundedCornerShape(50))
			.padding(horizontal = 9.dp, vertical = 5.dp),
		color = Color(0xFF697286),
		fontSize = 10.sp
	)
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F6FA, widthDp = 360)
@Composable
fun CommunityCardPreview() {
	MyApplicationTheme {
		CommunityCard(modifier = Modifier.padding(12.dp))
	}
}