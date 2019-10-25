package com.example.appsqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Note : AppCompatActivity() {
    var id: Int? = null
    var title: String? = null
    var content: String? = null

    constructor(id: Int, title: String, content: String) {
        this.id = id
        this.title = title
        this.content = content
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.note)
    }
}
