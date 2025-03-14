package io.github.thisisthepy.pycomposeui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@JvmName("SimpleIcon")
@Composable
fun IconWrapper(
    icon: ImageVector,
    contentDescription: String,
    modifier: Modifier,
    color: Long
) {
    Icons.Default.Favorite
    Icon(icon, contentDescription, modifier, Color(color))
}


val FavoriteIcon
    @JvmName("FavoriteIcon")
    get() = Icons.Default.Favorite


val AddIcon
    @JvmName("AddIcon")
    get() = Icons.Default.Add


val KeyboardArrowDownIcon
    @JvmName("KeyboardArrowDownIcon")
    get() = Icons.Default.KeyboardArrowDown


val KeyboardArrowUpIcon
    @JvmName("KeyboardArrowUpIcon")
    get() = Icons.Default.KeyboardArrowUp


val PlayArrowIcon
    @JvmName("PlayArrowIcon")
    get() = Icons.Default.PlayArrow


val DeleteIcon
    @JvmName("DeleteIcon")
    get() = Icons.Default.Delete



@JvmName("SimpleTextWidget")
@Composable
fun SimpleTextWidget(
    text: String,
    color: Long,
    fontSize: Float
) {
    Text(text, Modifier, Color(color), fontSize.sp)
}


@JvmName("SimpleSpacer")
@Composable
fun SimpleSpacer(
    start: Float, top: Float, end: Float, bottom: Float
) {
    Spacer(Modifier.padding(start.dp, top.dp, end.dp, bottom.dp))
}


@JvmName("TextWidget")
@Composable
fun TextWidget(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current
) {
    Text(text, modifier, color, fontSize, fontStyle, fontWeight, fontFamily, letterSpacing, textDecoration, textAlign,
        lineHeight, overflow, softWrap, maxLines, minLines, onTextLayout, style)
}


@JvmName("AnnotatedStringTextWidget")
@Composable
fun AnnotatedStringTextWidget(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    inlineContent: Map<String, InlineTextContent> = mapOf(),
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current
) {
    Text(text, modifier, color, fontSize, fontStyle, fontWeight, fontFamily, letterSpacing, textDecoration, textAlign,
        lineHeight, overflow, softWrap, maxLines, minLines, inlineContent, onTextLayout, style)
}
