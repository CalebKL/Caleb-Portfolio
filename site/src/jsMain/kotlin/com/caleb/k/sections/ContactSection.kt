package com.caleb.k.sections

import androidx.compose.runtime.*
import com.caleb.k.components.SectionTitle
import com.caleb.k.models.Section
import com.caleb.k.models.Theme
import com.caleb.k.utils.Constants
import com.caleb.k.utils.Constants.SECTION_WIDTH
import com.caleb.k.utils.ObserveViewportEntered
import com.caleb.k.utils.Res
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ContactSection() {
    Box(
        modifier = Modifier
            .id(Section.Contact.id)
            .maxWidth(SECTION_WIDTH.px)
            .padding(top = 100.px, bottom = 50.px),
        contentAlignment = Alignment.Center
    ) {
        ContactContent()
    }
}

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun ContactContent() {
    val breakpoint = rememberBreakpoint()
    val scope = rememberCoroutineScope()
    var animatedRotation by remember { mutableStateOf(0.deg) }

    ObserveViewportEntered(
        sectionId = Section.Contact.id,
        distanceFromTop = 500.0,
        onViewportEntered = {
            animatedRotation = 10.deg
            scope.launch {
                delay(500)
                animatedRotation = 0.deg
            }
        }
    )

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
                .margin(bottom = 25.px)
                .transform { rotate(animatedRotation) }
                .transition(CSSTransition(property = "transform", duration = 500.ms)),
            section = Section.Contact,
            alignment = Alignment.CenterHorizontally
        )
        P(
            attrs = Modifier
                .margin(bottom = 25.px)
                .maxWidth(400.px)
                .fontFamily(Constants.FONT_FAMILY)
                .fontSize(17.px)
                .fontStyle(FontStyle.Oblique)
                .fontWeight(FontWeight.Normal)
                .color(Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text("Feel free to use any platform to send me a message (Twitter, Linkedin or Email). A personalized message is even better and I will get back to you.")
        }
        P(
            attrs = Modifier
                .margin(bottom = 25.px)
                .maxWidth(400.px)
                .fontFamily(Constants.FONT_FAMILY)
                .fontSize(17.px)
                .fontStyle(FontStyle.Oblique)
                .fontWeight(FontWeight.SemiBold)
                .color(Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text("Email: langat.ck95@gmail.com")
        }
        Img(
            attrs = Modifier
                .size(100.px)
                .margin(bottom = 25.px)
                .toAttrs(),
            src = Res.Image.map
        )
        P(
            attrs = Modifier
                .margin(bottom = 25.px)
                .maxWidth(400.px)
                .fontFamily(Constants.FONT_FAMILY)
                .fontSize(17.px)
                .fontStyle(FontStyle.Oblique)
                .fontWeight(FontWeight.SemiBold)
                .color(Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text("Location: Nairobi, Kenya")        }

    }
}