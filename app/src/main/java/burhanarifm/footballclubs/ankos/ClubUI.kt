package burhanarifm.footballclubs.ankos

import android.content.Context
import android.view.Gravity
import android.view.View
import burhanarifm.footballclubs.R
import burhanarifm.footballclubs.R.drawable.img_barca
import org.jetbrains.anko.*

class ClubUI : AnkoComponent<Context> {
    override fun createView(ui: AnkoContext<Context>): View = with(ui) {
        linearLayout {
            lparams(matchParent, wrapContent)
            padding = dip(16)

            imageView {
                id = R.id.image
                setImageResource(img_barca)
            }.lparams(width = dip(50), height = dip(50))

            textView {
                id = R.id.name
                text = "FC Barcelona"
            }.lparams(wrapContent, wrapContent) {
                gravity = Gravity.CENTER_VERTICAL
                margin = dip(10)
            }
        }
    }
}