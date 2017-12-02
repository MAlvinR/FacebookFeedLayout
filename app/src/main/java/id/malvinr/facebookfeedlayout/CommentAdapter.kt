package id.malvinr.facebookfeedlayout

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.comment_item.view.*
import org.jetbrains.anko.imageResource

/**
 * Created by ASUS on 02/12/2017.
 */
class CommentAdapter(private val comments: List<Comment>
): RecyclerView.Adapter<CommentAdapter.CommentItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CommentItemViewHolder = CommentItemViewHolder(
            LayoutInflater.from(parent?.context).inflate(
                    R.layout.comment_item,
                    parent,
                    false)
    )

    override fun onBindViewHolder(holder: CommentItemViewHolder?, position: Int) {
        val comment = comments[holder?.adapterPosition ?: 0]
        holder?.bindView(comment)
    }

    override fun getItemCount(): Int = comments.size

    class CommentItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(comment: Comment) {
            with(comment) {
                itemView.commentName.text = comment.commentUsername
                itemView.commentMessage.text = comment.commentMessage
                itemView.commentPic.imageResource = comment.imageSource
            }
        }
    }
}