package com.rafflypohan.myfirstcomposeapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.rafflypohan.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

@Composable
fun Conversation(messages: List<Message>){
    LazyColumn{
        items(messages){ message ->
            MessageCard(msg = message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation(){
    MyFirstComposeAppTheme {
        Conversation(SampleData.conversationSample)
    }
}