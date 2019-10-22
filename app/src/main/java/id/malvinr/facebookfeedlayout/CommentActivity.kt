package id.malvinr.facebookfeedlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.MenuItem
import android.widget.EditText

import kotlinx.android.synthetic.main.activity_comment.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class CommentActivity : AppCompatActivity() {

    private lateinit var commentAdapter: CommentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comment)

        setupCommentData()
        setupRecyclerView()
    }

    // function to make list of comment
    private fun setupCommentData() {
        val listOfComment = listOf(
                Comment(R.drawable.abe, getString(R.string.first_comment_username), getString(R.string.first_comment_message)),
                Comment(R.drawable.dzaky, getString(R.string.second_comment_username), getString(R.string.second_comment_message)),
                Comment(R.drawable.abe, getString(R.string.first_comment_username), getString(R.string.first_comment_message)),
                Comment(R.drawable.dzaky, getString(R.string.second_comment_username), getString(R.string.second_comment_message)),
                Comment(R.drawable.abe, getString(R.string.first_comment_username), getString(R.string.first_comment_message)),
                Comment(R.drawable.dzaky, getString(R.string.second_comment_username), getString(R.string.second_comment_message)),
                Comment(R.drawable.abe, getString(R.string.first_comment_username), getString(R.string.first_comment_message)),
                Comment(R.drawable.dzaky, getString(R.string.second_comment_username), getString(R.string.second_comment_message))
        )

        commentAdapter = CommentAdapter(listOfComment)
        commentList.adapter = commentAdapter

    }

    // function to setup Recyclerview with layout manager
    private fun setupRecyclerView() {

        commentList.apply {
            layoutManager = LinearLayoutManager(this@CommentActivity)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}