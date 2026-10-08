package com.example.codehub.presentation.components.buttons

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codehub.presentation.theme.RedOrange

@Composable
fun BackButton (
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
){
    TextButton(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
        colors = ButtonDefaults.textButtonColors(
            containerColor = Color.White,
            contentColor = RedOrange
        )
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = null
        )

        Spacer(
            modifier = Modifier.width(8.dp)
        )

        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge
        )
    }
}

@Preview(
    name = "Back Button - Enabled",
    showBackground = true,
    backgroundColor = 0xFFFFFFFF
)
@Composable
private fun BackButtonPreview() {
    BackButton(
        onClick = {},
        text = "Back",
        enabled = true
    )
}
