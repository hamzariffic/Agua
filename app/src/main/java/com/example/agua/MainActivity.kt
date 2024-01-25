package com.example.agua

import androidx.activity.ComponentActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.automirrored.sharp.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.agua.Network.APIInstance
import com.example.agua.Network.APIInt.Companion.getData
import com.example.agua.ui.theme.AguaTheme


class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class) 
    @Composable
    fun MainScreen() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Cyan)
        ) {
            TopAppBar(
                title = {
                    Text(text = "AquaInnovate")
                },
                navigationIcon = {
                    IconButton(onClick = { /* TODO: Open drawer */ }) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                    }
                },
                actions = {
                    // First button: Gamification (Tasks)
                    IconButton(onClick = { /* TODO: Handle gamification button click */ }) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.List, contentDescription = "Tasks")
                    }

                    // Second button: Sustainability points
                    IconButton(onClick = { /* TODO: Handle Sustainability Points button click */ }) {
                        Icon(
                            imageVector = Icons.Filled.Place,
                            contentDescription = "Sustainability points"
                        )
                    }

                    //Third button to handle settings
                    IconButton(onClick = { /* TODO: Handle Settings button click */ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight/* Choose your icon */,
                            contentDescription = "Settings"
                        )
                    }

//                  User Profile
                    IconButton(onClick = { /*TODO: Navigate to User Profile*/ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Sharp.ArrowForward,
                            contentDescription = "User Profile"
                        )
                    }

//                  About Us
                    IconButton(onClick = { /*TODO: Navigate to the About Us Page*/ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.List,
                            contentDescription = "About Us"
                        )
                    }
                }
            )

            //Main screen content
            Spacer(
                modifier = Modifier
                    .height(56.dp)
                    .fillMaxSize()
            )
            // Card view covering roughly 1/3 of the screen
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp)  // Adjust height as needed for roughly 1/3 of screen
                    .padding(9.dp)
            ) {
//       Videos for aquatic animals
                APIInstance.api
            }
        }

        // LazyColumn for sustainability blogs
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            // Items for blogs will be added here using items()
//            item(key = null, )
        }

    }


@Preview
@Composable
    fun MainScreenPreview() {
        AguaTheme {
            run {
                MainScreen()
            }
        }
}}
