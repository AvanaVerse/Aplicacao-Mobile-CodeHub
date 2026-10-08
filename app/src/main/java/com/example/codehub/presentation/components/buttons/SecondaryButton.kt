package com.example.codehub.presentation.components.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codehub.presentation.theme.BorderGray
import com.example.codehub.presentation.theme.DarkNavy

// TODO: revisar a cor de fundo do SecondaryButton no estado enabled.
@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(
            width = 1.dp,
            color = BorderGray
        ),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.White,
            contentColor = DarkNavy,
            disabledContainerColor = Color.White
                   )
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge
        )
    }
}

@Preview(
    name = "Secondary Button - Enabled",
    showBackground = true,
    backgroundColor = 0xFFFFFFFF,
    widthDp = 360
)
@Composable
private fun SecondaryButtonPreview() {
    SecondaryButton(
        text = "Secondary Button",
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )
}

@Preview(
    name = "Secondary Button - Disabled",
    showBackground = true,
    backgroundColor = 0xFFFFFFFF,
    widthDp = 360
)
@Composable
private fun DisabledSecondaryButtonPreview() {
    SecondaryButton(
        text = "Secondary Button",
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        enabled = false
    )
}