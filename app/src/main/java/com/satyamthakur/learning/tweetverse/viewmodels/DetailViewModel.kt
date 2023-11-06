package com.satyamthakur.learning.tweetverse.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.satyamthakur.learning.tweetverse.models.TweetListItem
import com.satyamthakur.learning.tweetverse.repository.TweetRepository
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class DetailViewModel @Inject constructor(private val repository: TweetRepository) : ViewModel() {
    val tweets: StateFlow<List<TweetListItem>>
        get() = repository.tweet

    init {
        viewModelScope.launch {
            repository.getTweets("motivation")
        }
    }
}