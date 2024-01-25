package com.example.agua.data

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Create
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.agua.ui.theme.AguaTheme

@ExperimentalMaterial3Api
class UserProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AguaTheme {
                UserProfileScreen()
            }
        }
    }
}

@ExperimentalMaterial3Api
@Composable
fun UserProfileScreen() {
    var userProfile by remember { mutableStateOf(UserProfileData()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TopAppBar(
            title = { Text(text = "User Profile") },
            navigationIcon = {
                IconButton(onClick = { /* Handle back navigation */ }) {
                    Icon(imageVector = Icons.Rounded.Face, contentDescription = "Back")
                }
            },
            actions = {
                // Save button to update user profile
                IconButton(onClick = { /* Handle save action */ }) {
                    Icon(imageVector = Icons.Rounded.Create, contentDescription = "Save")
                }
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Avatar Section
        AvatarSection(userProfile.avatar) {
            // Handle avatar selection
        }

        Spacer(modifier = Modifier.height(16.dp))

        // User Information Section
        UserInformationSection(
            userProfile = userProfile,
            onNameChanged = { newName -> userProfile = userProfile.copy(name = newName) },
            onEmailChanged = { newEmail -> userProfile = userProfile.copy(email = newEmail) },
            onPhoneNumberChanged = { newPhoneNumber -> userProfile = userProfile.copy(phoneNumber = newPhoneNumber) }
        )
    }
}

@Composable
fun AvatarSection(avatar: ImageVector, onAvatarSelected: () -> Unit) {
    var isAvatarSelected by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(MaterialTheme.colorScheme.primary)
            .clickable { onAvatarSelected() }
    ) {
        if (isAvatarSelected) {
            // Load the selected avatar image
            Image(
                painter = rememberVectorPainter(avatar),
                contentDescription = "User Avatar",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                contentScale = ContentScale.Crop
            )
        } else {
            // Show the "Add a Photo" icon
            Icon(
                imageVector = Icons.Rounded.Person,
                contentDescription = "Add a Photo",
                modifier = Modifier
                    .size(48.dp)
                    .align(Alignment.Center)
            )
        }
    }
}

@Composable
fun UserInformationSection(
    userProfile: UserProfileData,
    onNameChanged: (String) -> Unit,
    onEmailChanged: (String) -> Unit,
    onPhoneNumberChanged: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Name Input
        OutlinedTextField(
            value = userProfile.name,
            onValueChange = { onNameChanged(it) },
            label = { Text("Name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        // Email Input
        OutlinedTextField(
            value = userProfile.email,
            onValueChange = { onEmailChanged(it) },
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Email
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        // Phone Number Input
        OutlinedTextField(
            value = userProfile.phoneNumber,
            onValueChange = { onPhoneNumberChanged(it) },
            label = { Text("Phone Number") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Phone
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
    }
}

data class UserProfileData(
    val avatar: ImageVector = Icons.Rounded.AccountCircle,
    val name: String = "",
    val email: String = "",
    val phoneNumber: String = ""
)

@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun UserProfileScreenPreview() {
    AguaTheme {
        UserProfileScreen()
    }
}
