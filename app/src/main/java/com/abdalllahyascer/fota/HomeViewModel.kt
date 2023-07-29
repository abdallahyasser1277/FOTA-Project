package com.abdalllahyascer.fota

import androidx.lifecycle.ViewModel

class HomeViewModel :ViewModel() {

     var items = listOf(
         MenuItem(
             id = "home",
             title = "Home",
             contentDescription = "Go to home screen",
             iconId = R.drawable.home
         ),MenuItem(
             id = "login",
             title = "Login",
             contentDescription = "About Us",
             iconId = R.drawable.login
         ),
         MenuItem(
             id = "settings",
             title = "Settings",
             contentDescription = "Go to settings screen",
             iconId = R.drawable.setting
         ),MenuItem(
             id = "about",
             title = "About Us",
             contentDescription = "About Us",
             iconId = R.drawable.about_us
         ),
         MenuItem(
             id = "contacts",
             title = "Contact Us",
             contentDescription = "About Us",
             iconId = R.drawable.contact_us
         ),
         MenuItem(
             id = "help",
             title = "Help",
             contentDescription = "Get help",
             iconId = R.drawable.help
         ),
     )
}