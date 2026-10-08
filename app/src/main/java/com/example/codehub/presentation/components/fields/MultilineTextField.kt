package com.example.codehub.presentation.components.fields

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codehub.presentation.theme.BorderGray
import com.example.codehub.presentation.theme.DarkNavy

@Composable
fun MultilineTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    placeholder: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            text = label,
            color = DarkNavy,
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(140.dp),
            enabled = enabled,
            singleLine = false,
            minLines = 4,
            maxLines = 8,
            shape = RoundedCornerShape(12.dp),
            textStyle = MaterialTheme.typography.bodyLarge,
            placeholder = {
                Text(
                    text = placeholder,
                    style = MaterialTheme.typography.bodyLarge
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = BorderGray,
                unfocusedBorderColor = BorderGray,
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedTextColor = DarkNavy,
                unfocusedTextColor = DarkNavy,
                focusedPlaceholderColor = DarkNavy.copy(alpha = 0.6f),
                unfocusedPlaceholderColor = DarkNavy.copy(alpha = 0.6f)
            )
        )
    }
}

@Preview(
    name = "Form Text Field",
    showBackground = true,
    backgroundColor = 0xFFFFFFFF,
    widthDp = 404
)
@Composable
private fun MultilineTextFieldPreview() {
    var text by remember {
        mutableStateOf("Quando usar StateFlow no ViewModel?")
    }

    MultilineTextField(
        value = text,
        onValueChange = { text = it },
        label = "Título",
        placeholder = "Digite o título",
        modifier = Modifier.padding(horizontal = 12.dp)
    )
}