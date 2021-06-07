package com.ywlee.scenetransition.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ywlee.scenetransition.model.Image

class MainViewModel: BaseViewModel() {
    init {

    }

    private var _imageList: LiveData<Image> = MutableLiveData()
    val imageList: LiveData<Image>
        get() = _imageList

    fun getImageList() {

    }
}