package burhanarifm.footballclubs.utils.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import burhanarifm.footballclubs.utils.domains.Club
import com.bumptech.glide.Glide
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_list.*

class ClubHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
    LayoutContainer {

    fun bind(clubs: Club, listener: (Club) -> Unit) {
        name.text = clubs.name
        clubs.image?.let { Glide.with(itemView.context).load(it).into(image) }
        itemView.setOnClickListener {
            listener(clubs)
        }
    }
}