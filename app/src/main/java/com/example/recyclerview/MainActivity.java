package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // קישור לקובץ ה-XML למעלה

        // 1. השגת הרפרנס לפי ה-ID שהגדרנו ב-XML
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // 2. יצירת רשימת נתונים (דמו)
        List<Student> students = new ArrayList<>();
        students.add(new Student("דני", 17));
        students.add(new Student("יעל", 18));
        // ... דמיינו עוד 100 תלמידים

        // 3. יצירת האדפטר
        StudentAdapter adapter = new StudentAdapter(students);

        // 4. חיבור הכל ביחד
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}