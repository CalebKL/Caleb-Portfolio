package com.caleb.k.models

import com.caleb.k.utils.Res


enum class Portfolio(
    val image: String,
    val title: String,
    val description: String,
    val link :String
) {
    One(
        image = Res.Image.harryporter,
        title = "HarryPorterAndroid",
        description = "Harry Porter Android App",
        link = "https://github.com/Mzazi25/HarryPotterAndroid"
    ),
    Two(
        image = Res.Image.diary,
        title = "DiaryAndroid",
        description = "Diary Android App",
        link ="https://github.com/Mzazi25/DiaryAndroid"
    ),
    Three(
        image = Res.Image.chillmax,
        title = "ChillMax",
        description = "TMDB Movie App",
        link = "https://github.com/Mzazi25/ChillMax"
    ),
    Four(
        image = Res.Image.ricky,
        title = "RickAndMorty",
        description = "Rick & Morty Android App",
        link = "https://github.com/Mzazi25/RiccAndMorty"
    ),
    Five(
        image = Res.Image.landing,
        title = "My Portfolio",
        description = "Landing Page",
        link = "https://github.com/Mzazi25/LandingPortfolio"
    )
}