package com.simplemobiletools.trinity.pro.activities

import android.os.Bundle

class PhotoActivity : PhotoVideoActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        mIsVideo = false
        super.onCreate(savedInstanceState)
    }
}
