package com.example.codehub.presentation.components.navigation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronLeft
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codehub.R
import com.example.codehub.presentation.theme.BorderGray
import com.example.codehub.presentation.theme.DarkNavy
import com.example.codehub.presentation.theme.RedOrange

@Composable
fun Pagination(
    currentPage: Int,
    totalPages: Int,
    onPreviousPage: () -> Unit,
    onNextPage: () -> Unit,
    modifier: Modifier = Modifier
) {
    val previousEnabled = currentPage > 1
    val nextEnabled = currentPage < totalPages

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        OutlinedIconButton(
            onClick = onPreviousPage,
            enabled = previousEnabled,
            modifier = Modifier.size(36.dp),
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(
                width = 1.dp,
                color = BorderGray
            ),
            colors = IconButtonDefaults.outlinedIconButtonColors(
                containerColor = Color.White,
                contentColor = DarkNavy,
                disabledContainerColor = Color.White,
                disabledContentColor = DarkNavy.copy(alpha = 0.38f)
            )
        ) {
            Icon(
                imageVector = Icons.Default.ChevronLeft,
                contentDescription = stringResource(
                    id = R.string.previous_page
                )
            )
        }

        Surface(
            color = RedOrange,
            shape = RoundedCornerShape(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(36.dp)
                    .padding(horizontal = 12.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = stringResource(
                        id = R.string.pagination_page,
                        currentPage,
                        totalPages
                    ),
                    color = Color.White,
                    style = MaterialTheme.typography.labelMedium
                )
            }
        }

        OutlinedIconButton(
            onClick = onNextPage,
            enabled = nextEnabled,
            modifier = Modifier.size(36.dp),
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(
                width = 1.dp,
                color = BorderGray
            ),
            colors = IconButtonDefaults.outlinedIconButtonColors(
                containerColor = Color.White,
                contentColor = DarkNavy,
                disabledContainerColor = Color.White,
                disabledContentColor = DarkNavy.copy(alpha = 0.38f)
            )
        ) {
            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = stringResource(
                    id = R.string.next_page
                )
            )
        }
    }
}

@Preview(
    name = "Pagination",
    showBackground = true,
    backgroundColor = 0xFFF5F6FA
)
@Composable
private fun PaginationPreview() {
    var currentPage by remember {
        mutableIntStateOf(1)
    }

    Pagination(
        currentPage = currentPage,
        totalPages = 5,
        onPreviousPage = {
            if (currentPage > 1) {
                currentPage--
            }
        },
        onNextPage = {
            if (currentPage < 5) {
                currentPage++
            }
        },
        modifier = Modifier.padding(16.dp)
    )
}