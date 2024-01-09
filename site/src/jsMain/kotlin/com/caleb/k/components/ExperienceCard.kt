package com.caleb.k.components


import androidx.compose.runtime.Composable
import com.caleb.k.models.Experience
import com.caleb.k.models.Theme
import com.caleb.k.utils.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ExperienceCard(
    breakpoint: Breakpoint,
    active: Boolean = false,
    experience: Experience,
    animatedMargin: CSSSizeValue<CSSUnit.px>
) {
    SimpleGrid(
        modifier = Modifier
            .fillMaxWidth()
            .maxWidth(
                if (breakpoint >= Breakpoint.MD) 60.percent
                else 90.percent
            ),
        numColumns = numColumns(base = 1, md = 2)
    ) {
        ExperienceDescription(
            active = active,
            bullet1 = experience.bullet1,
            bullet2 = experience.bullet2,
            bullet3 = experience.bullet3,
            bullet4 = experience.bullet4,
            bullet5 = experience.bullet5,
            bullet6 = experience.bullet6,
            bullet7 = experience.bullet7,
            bullet8 = experience.bullet8,
            bullet9 = experience.bullet9,
            bullet10 = experience.bullet10,
        )
        ExperienceDetails(
            breakpoint = breakpoint,
            active = active,
            experience = experience,
            animatedMargin = animatedMargin
        )
    }
}

@Composable
fun ExperienceDescription(
    active: Boolean,
    bullet1:String,
    bullet2: String,
    bullet3: String,
    bullet4: String,
    bullet5: String,
    bullet6: String,
    bullet7: String,
    bullet8: String,
    bullet9: String,
    bullet10: String,
    ) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .margin(topBottom = 14.px)
            .padding(all = 14.px)
            .backgroundColor(if (active) Theme.Primary.rgb else Theme.LighterGray.rgb)
    ) {
        P(
            attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .lineHeight(1.6)
                .fontWeight(FontWeight.Normal)
                .color(if (active) Colors.White else Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(bullet1)
        }
        P(
            attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .lineHeight(1.6)
                .fontWeight(FontWeight.Normal)
                .color(if (active) Colors.White else Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(bullet2)
        }
        P(
            attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .lineHeight(1.6)
                .fontWeight(FontWeight.Normal)
                .color(if (active) Colors.White else Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(bullet3)
        }
        P(
            attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .lineHeight(1.6)
                .fontWeight(FontWeight.Normal)
                .color(if (active) Colors.White else Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(bullet4)
        }
        P(
            attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .lineHeight(1.6)
                .fontWeight(FontWeight.Normal)
                .color(if (active) Colors.White else Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(bullet5)
        }
        P(
            attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .lineHeight(1.6)
                .fontWeight(FontWeight.Normal)
                .color(if (active) Colors.White else Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(bullet6)
        }
        P(
            attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .lineHeight(1.6)
                .fontWeight(FontWeight.Normal)
                .color(if (active) Colors.White else Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(bullet7)
        }
        P(
            attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .lineHeight(1.6)
                .fontWeight(FontWeight.Normal)
                .color(if (active) Colors.White else Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(bullet8)
        }
        P(
            attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .lineHeight(1.6)
                .fontWeight(FontWeight.Normal)
                .color(if (active) Colors.White else Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(bullet9)
        }
        P(
            attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .lineHeight(1.6)
                .fontWeight(FontWeight.Normal)
                .color(if (active) Colors.White else Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(bullet10)
        }

    }
}

@Composable
fun ExperienceDetails(
    breakpoint: Breakpoint,
    active: Boolean,
    experience: Experience,
    animatedMargin: CSSSizeValue<CSSUnit.px>
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .margin(left = if (breakpoint >= Breakpoint.MD) 14.px else 0.px),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (breakpoint >= Breakpoint.MD) {
            ExperienceNumber(active = active, experience = experience)
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .margin(left = if(breakpoint <= Breakpoint.SM) 0.px else animatedMargin)
                .transition(
                    CSSTransition(
                        property = "margin",
                        duration = 500.ms,
                        delay = experience.ordinal * 100.ms
                    )
                )
            ,
            verticalArrangement = Arrangement.Center
        ) {
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(20.px)
                    .fontWeight(FontWeight.Bold)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text(experience.jobPosition)
            }
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(14.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text("${experience.from} - ${experience.to}")
            }
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(14.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Primary.rgb)
                    .toAttrs()
            ) {
                Text(experience.company)
            }
        }
    }
}

@Composable
fun ExperienceNumber(
    active: Boolean,
    experience: Experience
) {
    Box(
        modifier = Modifier
            .margin(right = 14.px)
            .fillMaxHeight(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(3.px)
                .backgroundColor(Theme.Primary.rgb)
        )
        Box(
            modifier = Modifier
                .size(40.px)
                .border(
                    width = 3.px,
                    style = LineStyle.Solid,
                    color = Theme.Primary.rgb
                )
                .backgroundColor(if (active) Theme.Primary.rgb else Colors.White)
                .borderRadius(50.percent),
            contentAlignment = Alignment.Center
        ) {
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(16.px)
                    .fontWeight(FontWeight.Bold)
                    .color(if (active) Colors.White else Theme.Primary.rgb)
                    .toAttrs()
            ) {
                Text(experience.number)
            }
        }
    }
}