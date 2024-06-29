package com.stevdza_san.website

import androidx.compose.runtime.*
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.TextInput
import org.jetbrains.compose.web.dom.Text

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        Button(onClick = {}) {
            Text("JHello")
        }
    }
}