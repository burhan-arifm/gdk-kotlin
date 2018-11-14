package burhanarifm.footballclubs.ankos

import android.support.v7.widget.LinearLayoutManager
import burhanarifm.footballclubs.activities.MainActivity
import burhanarifm.footballclubs.utils.adapters.RecyclerViewAdapter
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainUI (val mAdapter : RecyclerViewAdapter) : AnkoComponent<MainActivity> {

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
       verticalLayout {
            lparams(matchParent, matchParent)

            recyclerView {
                lparams(matchParent, wrapContent)

                layoutManager = LinearLayoutManager(ctx)
                adapter = mAdapter
            }
        }
    }
}