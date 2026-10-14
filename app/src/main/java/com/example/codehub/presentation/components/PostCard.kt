package com.example.codehub.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ChatBubbleOutline
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
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
import com.example.codehub.presentation.components.chips.InfoTag
import com.example.codehub.presentation.theme.MyApplicationTheme

@Composable
fun PostCard(
	modifier: Modifier = Modifier,
	authorName: String? = null,
	metadata: String? = null,
	title: String? = null,
	bodyParagraphs: List<String>? = null,
	tags: List<String> = emptyList(),
	likesLabel: String? = null,
	responsesLabel: String? = null
) {
	val resolvedAuthor = authorName ?: stringResource(R.string.user_name)
	val resolvedMetadata = metadata ?: stringResource(R.string.publication_preview_status)
	val resolvedTitle = title ?: stringResource(R.string.publication_preview_title)
	val resolvedParagraphs = bodyParagraphs ?: listOf(
		stringResource(R.string.publication_preview_body_first),
		stringResource(R.string.publication_preview_body_second)
	)

	Surface(
		modifier = modifier.fillMaxWidth(),
		shape = RoundedCornerShape(18.dp),
		color = Color.White,
		border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE1E5ED)),
		shadowElevation = 1.dp
	) {
		Column(modifier = Modifier.padding(14.dp)) {
			Row(verticalAlignment = Alignment.CenterVertically) {
				UserAvatar(initials = resolvedAuthor.split(" ").mapNotNull { it.firstOrNull()?.toString() }.take(2).joinToString(""), size = 34.dp)
				Spacer(modifier = Modifier.width(9.dp))
				Column {
					Text(
						text = resolvedAuthor,
						color = Color(0xFF252A38),
						fontSize = 13.sp,
						fontWeight = FontWeight.SemiBold
					)
					Text(
						text = resolvedMetadata,
						color = Color(0xFF737B8F),
						fontSize = 11.sp
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
				text = resolvedTitle,
				color = Color(0xFF252A38),
				fontSize = 16.sp,
				lineHeight = 23.sp,
				fontWeight = FontWeight.Bold
			)
			resolvedParagraphs.forEachIndexed { index, paragraph ->
				Text(
					text = paragraph,
					modifier = Modifier.padding(top = if (index == 0) 10.dp else 16.dp),
					color = Color(0xFF252A38),
					fontSize = 13.sp,
					lineHeight = 20.sp
				)
			}

			if (tags.isNotEmpty()) {
				Row(
					modifier = Modifier.padding(top = 10.dp),
					horizontalArrangement = Arrangement.spacedBy(6.dp)
				) {
					tags.forEach { tag -> InfoTag(text = tag) }
				}
			}

			if (likesLabel != null || responsesLabel != null) {
				Row(
					modifier = Modifier.padding(top = 10.dp),
					verticalAlignment = Alignment.CenterVertically,
					horizontalArrangement = Arrangement.spacedBy(16.dp)
				) {
					if (likesLabel != null) {
						Row(verticalAlignment = Alignment.CenterVertically) {
							Icon(
								imageVector = Icons.Outlined.FavoriteBorder,
								contentDescription = null,
								tint = Color(0xFF737B8F),
								modifier = Modifier.size(16.dp)
							)
							Spacer(modifier = Modifier.width(5.dp))
							Text(text = likesLabel, color = Color(0xFF737B8F), fontSize = 11.sp)
						}
					}
					if (responsesLabel != null) {
						Row(verticalAlignment = Alignment.CenterVertically) {
							Icon(
								imageVector = Icons.Outlined.ChatBubbleOutline,
								contentDescription = null,
								tint = Color(0xFF737B8F),
								modifier = Modifier.size(16.dp)
							)
							Spacer(modifier = Modifier.width(5.dp))
							Text(text = responsesLabel, color = Color(0xFF737B8F), fontSize = 11.sp)
						}
					}
				}
			}
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