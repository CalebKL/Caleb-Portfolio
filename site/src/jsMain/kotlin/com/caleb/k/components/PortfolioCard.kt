package com.caleb.k.components


import androidx.compose.runtime.Composable
import com.caleb.k.models.Portfolio
import com.caleb.k.models.Theme
import com.caleb.k.styles.PortfolioSectionStyle
import com.caleb.k.utils.Constants.FONT_FAMILY
import com.caleb.k.utils.Constants.WEBSITE
import com.caleb.k.utils.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color.Companion.argb
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun PortfolioCard(
    modifier: Modifier = Modifier,
    portfolio: Portfolio,
    link: String = WEBSITE
) {
    Link(
        modifier = PortfolioSectionStyle.toModifier()
            .textDecorationLine(TextDecorationLine.None),
        path = link,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        Column(
            modifier = modifier
                .id("columnParent")
                .width(Width.MaxContent)
        ) {
            Box(
                modifier = Modifier
                    .id("boxParent")
                    .fillMaxWidth()
                    .maxWidth(300.px)
                    .margin(bottom = 20.px)
            ) {
                Image(
                    modifier = Modifier
                        .size(300.px)
                        .objectFit(ObjectFit.Cover),
                    src = portfolio.image,
                    description = "Portfolio Image"
                )
                Box(
                    modifier = Modifier
                        .id("greenOverlay")
                        .fillMaxHeight()
                        .backgroundColor(argb(a = 0.5f, r = 0, g = 167, b = 142)),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .id("linkIcon")
                            .size(32.px),
                        src = Res.Icon.link,
                        description = "Link Icon"
                    )
                }
            }
            P(
                attrs = Modifier
                    .id("portfolioTitle")
                    .fillMaxWidth()
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Bold)
                    .toAttrs()
            ) {
                Text(portfolio.title)
            }
            P(
                attrs = Modifier
                    .id("portfolioDesc")
                    .fillMaxWidth()
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(14.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .opacity(50.percent)
                    .toAttrs()
            ) {
                Text(portfolio.description)
            }
        }
    }
}