package com.caleb.k.models

import com.caleb.k.utils.Constants.ANDROID_OVERVIEW
import com.caleb.k.utils.Constants.COMMUNICATION_SKILLS
import com.caleb.k.utils.Constants.EXPERIMENTING_OVERVIEW
import com.caleb.k.utils.Constants.GENERAL_SOFTWARE_SKILLS
import com.caleb.k.utils.Constants.KOTLIN_OVERVIEW
import com.caleb.k.utils.Constants.SOFT_SKILLS
import com.caleb.k.utils.Res


enum class Skills(
    val icon: String ,
    val imageDesc: String,
    val title: String,
    val description: String
) {
    Communication(
        icon = Res.Icon.seo,
        imageDesc = "Android Icon",
        title = "Communication ",
        description = COMMUNICATION_SKILLS
    ),
    SoftSkills(
        icon = Res.Icon.checkmark,
        imageDesc = "Apple Icon",
        title = "Soft Skills",
        description = SOFT_SKILLS
    ),
    SoftwareCore(
        icon = Res.Icon.checkmark,
        imageDesc = "Desktop Icon",
        title = "Software Core",
        description = GENERAL_SOFTWARE_SKILLS
    ),
    Android(
        icon =  Res.Icon.android,
        imageDesc = "Pen Icon",
        title = "Android",
        description = ANDROID_OVERVIEW
    ),
    Kotlin(
        icon = Res.Icon.checkmark,
        imageDesc = "Chart Icon",
        title = "Kotlin",
        description = KOTLIN_OVERVIEW
    ),
    Experimenting(
        icon = Res.Icon.shield,
        imageDesc = "Megaphone Icon",
        title = "Experimenting...",
        description = EXPERIMENTING_OVERVIEW
    )
}