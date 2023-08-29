package com.example.calllist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.calllist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val callList = arrayListOf(
            CallProfiles(R.drawable.user, "안드로이드", "010-1234-2345", true),
            CallProfiles(R.drawable.user, "김드로이드", "010-3845-5739", true),
            CallProfiles(R.drawable.user, "이드로이드", "02-9876-5432", true),
            CallProfiles(R.drawable.user, "박드로이드", "032-444-2222", true),
            CallProfiles(R.drawable.user, "주드로이드", "070-1111-3333", true),
            CallProfiles(R.drawable.user, "정드로이드", "031-555-8888", false),
            CallProfiles(R.drawable.user, "서드로이드", "010-1234-5678", false),
            CallProfiles(R.drawable.user, "문드로이드", "051-7777-9999", false),
            CallProfiles(R.drawable.user, "단드로이드", "053-666-1111",false),
            CallProfiles(R.drawable.user, "윤드로이드", "054-3333-6666",false),
            CallProfiles(R.drawable.user, "당드로이드", "010-3849-6239", false),
            CallProfiles(R.drawable.user, "나드로이드", "054-578-2033", false),
            CallProfiles(R.drawable.user, "다드로이드", "054-583-1532", false),
            CallProfiles(R.drawable.user, "소드로이드", "054-5739-2083", false),
            CallProfiles(R.drawable.user, "하드로이드", "054-3334-8475", false),
            CallProfiles(R.drawable.user, "포드로이드", "054-1074-5729", false),
            CallProfiles(R.drawable.user, "나드로이드", "054-1735-6243", false),
            CallProfiles(R.drawable.user, "교드로이드", "054-2534-5823", false),
            CallProfiles(R.drawable.user, "바드로이드", "054-4892-4824", false),
            CallProfiles(R.drawable.user, "우드로이드", "054-7734-3333", false)
        )

        //val content_list = findViewById<RecyclerView>(R.id.content_list)
        val content_list = binding.contentList
        content_list.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        content_list.setHasFixedSize(true)

        content_list.adapter = CallProAdapter(callList)
    }
}