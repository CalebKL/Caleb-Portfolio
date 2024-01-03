package com.caleb.k.sections


import androidx.compose.runtime.Composable
import com.caleb.k.components.PortfolioCard
import com.caleb.k.components.SectionTitle
import com.caleb.k.models.Portfolio
import com.caleb.k.models.Section
import com.caleb.k.styles.PortfolioArrowIconStyle
import com.caleb.k.utils.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowLeft
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowRight
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun PortfolioSection() {
    Box(
        modifier = Modifier
            .id(Section.Portfolio.id)
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 50.px),
        contentAlignment = Alignment.Center
    ) {
        PortfolioContent()
    }
}

@Composable
fun PortfolioContent() {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(
            modifier = Modifier
                .fillMaxWidth()
                .margin(bottom = 25.px),
            section = Section.Portfolio
        )
        PortfolioCards(breakpoint = breakpoint)
        PortfolioNavigation()
    }
}

@Composable
fun PortfolioCards(breakpoint: Breakpoint) {
    Row(
        modifier = Modifier
            .id("scrollableContainer")
            .fillMaxWidth()
            .margin(bottom = 25.px)
            .maxWidth(
                if (breakpoint > Breakpoint.MD) 950.px
                else if (breakpoint > Breakpoint.SM) 625.px
                else 300.px
            )
            .overflow(Overflow.Hidden)
            .scrollBehavior(ScrollBehavior.Smooth)
    ) {
        Portfolio.entries.forEach { portfolio ->
            PortfolioCard(
                modifier = Modifier.margin(
                    right = if (portfolio != Portfolio.Five) 25.px else 0.px
                ),
                portfolio = portfolio,
                link = portfolio.link
            )
        }
    }
}

@Composable
fun PortfolioNavigation() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        FaArrowLeft(
            modifier = PortfolioArrowIconStyle.toModifier()
                .margin(right = 40.px)
                .cursor(Cursor.Pointer)
                .onClick {
                    document.getElementById("scrollableContainer")
                        ?.scrollBy(x = (-325.0), y = 0.0)
                },
            size = IconSize.LG
        )
        FaArrowRight(
            modifier = PortfolioArrowIconStyle.toModifier()
                .cursor(Cursor.Pointer)
                .onClick {
                    document.getElementById("scrollableContainer")
                        ?.scrollBy(x = 325.0, y = 0.0)
                },
            size = IconSize.LG
        )
    }
}