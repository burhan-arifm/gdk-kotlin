package burhanarifm.footballclubs.ankos

import android.content.Intent
import android.graphics.Color
import android.view.Gravity
import burhanarifm.footballclubs.activities.DetailsActivity
import org.jetbrains.anko.*

class DetailsUI(private var intent: Intent) : AnkoComponent<DetailsActivity> {
    override fun createView(ui: AnkoContext<DetailsActivity>) = with(ui) {
        verticalLayout {
            lparams(matchParent, wrapContent)
            padding = dip(16)

            imageView {
                setImageResource(intent.getIntExtra("club_image", 0))
            }.lparams(width = dip(75), height = dip(75)) {
                gravity = Gravity.CENTER_HORIZONTAL
            }

            textView {
                text = intent.getStringExtra("club_name")
                textSize = sp(20).toFloat()
                textColor = Color.BLACK
            }.lparams(wrapContent, wrapContent) {
                gravity = Gravity.CENTER_HORIZONTAL
                margin = dip(10)
            }

            scrollView {
                textView {
                    text = intent.getStringExtra("club_desc")
                }
            }.lparams(wrapContent, wrapContent) {
                gravity = Gravity.CENTER_VERTICAL
                margin = dip(10)
            }
        }
    }
}
