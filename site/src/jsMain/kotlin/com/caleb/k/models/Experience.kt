package com.caleb.k.models

import com.caleb.k.utils.Constants.GREENSTAND_OVERVIEW
import com.caleb.k.utils.Constants.POCKET_CAST_OVERVIEW
import com.caleb.k.utils.Constants.STAX_OVERVIEW
import com.caleb.k.utils.Constants.UPWORK_DESC


enum class Experience(
    val number: String,
    val jobPosition: String,
    val description: String,
    val company: String,
    val from: String,
    val to: String
) {
    First(
        number = "01",
        jobPosition = "Open Source Developer- Volunteer",
        description = POCKET_CAST_OVERVIEW,
        company = "Pocketcast",
        from = "February 2022",
        to = "NOW",
    ),
    Second(
        number = "02",
        jobPosition = "Android Developer (Remote)",
        description = GREENSTAND_OVERVIEW,
        company = "Greenstand",
        from = "November 2022",
        to = "November 2023",
    ),
    Third(
        number = "03",
        jobPosition = "Open Source Developer- Volunteer",
        description = STAX_OVERVIEW,
        company = "Stax",
        from = "March 2020",
        to = "August 2020",
    ),
    Fourth(
        number = "04",
        jobPosition = "Freelancer Android Developer",
        description = UPWORK_DESC,
        company = "Upwork",
        from = "June 2021",
        to = "October 2022",
    ),

}