package com.caleb.k.styles

import com.caleb.k.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

val PortfolioSectionStyle by ComponentStyle {
    cssRule(" > #columnParent > #boxParent > #greenOverlay") {
        Modifier
            .width(0.px)
            .transition(CSSTransition(property = "width", duration = 500.ms))
    }

    cssRule(":hover > #columnParent > #boxParent > #greenOverlay") {
        Modifier.width(300.px)
    }

    cssRule(" > #columnParent > #boxParent > #greenOverlay > #linkIcon") {
        Modifier.visibility(Visibility.Hidden)
    }

    cssRule(":hover > #columnParent > #boxParent > #greenOverlay > #linkIcon") {
        Modifier.visibility(Visibility.Visible)
    }

    cssRule(" > #columnParent > #portfolioTitle") {
        Modifier
            .color(Theme.Secondary.rgb)
            .translateX(0.percent)
            .transition(
                CSSTransition(property = "color", duration = 200.ms),
                CSSTransition(property = "translate", duration = 200.ms)
            )
    }

    cssRule(":hover > #columnParent > #portfolioTitle") {
        Modifier
            .color(Theme.Primary.rgb)
            .translateX(5.percent)
    }

    cssRule(" > #columnParent > #portfolioDesc") {
        Modifier
            .translateX(0.percent)
            .transition(CSSTransition(property = "translate", duration = 200.ms))
    }

    cssRule(":hover > #columnParent > #portfolioDesc") {
        Modifier.translateX(5.percent)
    }
}

val PortfolioArrowIconStyle by ComponentStyle {
    base {
        Modifier
            .color(Theme.Gray.rgb)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    hover {
        Modifier.color(Theme.Primary.rgb)
    }
}