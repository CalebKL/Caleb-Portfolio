package com.caleb.k.models


enum class Section(
    val id: String,
    val title: String,
    val subtitle: String,
    val path: String
) {
    Home(
        id = "home",
        title = "Home",
        subtitle = "",
        path = "#home"
    ),
    About(
        id = "about",
        title = "About me",
        subtitle = "Why Hire Me?",
        path = "#about"
    ),
    Skills(
        id = "service",
        title = "Skills",
        subtitle = "I'm Good at",
        path = "#service"
    ),
    Experience(
        id = "experience",
        title = "Experience",
        subtitle = "Work Experience",
        path = "#experience"
    ),
    Portfolio(
        id = "portfolio",
        title = "Portfolio",
        subtitle = "My Work",
        path = "#portfolio"
    ),
    Contact(
        id = "contact",
        title = "Contact me",
        subtitle = "Let us Connect",
        path = "#contact"
    ),

}