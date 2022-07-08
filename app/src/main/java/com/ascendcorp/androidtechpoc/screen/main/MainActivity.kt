package com.ascendcorp.androidtechpoc.screen.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ascendcorp.androidtechpoc.R
import com.ascendcorp.androidtechpoc.databinding.ActivityMainBinding
import com.ascendcorp.androidtechpoc.screen.navgraph.NavGraphActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            ActivityMainBinding.inflate(layoutInflater)
                .apply { binding = this }
                .root
        )
        setupView()
    }

    private fun setupView() {
        binding.rvTopic.apply {
            adapter = TopicAdapter().apply { topics = getTopics() }
            layoutManager = LinearLayoutManager(context)
        }
    }

    private fun getTopics(): List<TopicUiModel> {
        return listOf(
            getNavigationComponentTopic()
        )
    }

    private fun getNavigationComponentTopic(): TopicUiModel {
        return TopicUiModel(
            titleRes = R.string.topic_navigation_component,
            listener = {
                startActivity(Intent(this, NavGraphActivity::class.java))
            }
        )
    }
}
