package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.notes.notesList.NoteAdapter;
import com.example.notes.notesList.NoteData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        NoteData[] noteData = new NoteData[] {
                new NoteData("Birthday party", "My birthday in this weekends and i want to party in my house", "00:40"),
                new NoteData("Birthday party", "My birthday in this weekends and i want to party in my house", "00:40"),
                new NoteData("Birthday party", "My birthday in this weekends and i want to party in my house", "00:40"),
                new NoteData("Birthday party", "My birthday in this weekends and i want to party in my house", "00:40"),
                new NoteData("Birthday party", "My birthday in this weekends and i want to party in my house", "00:40"),
                new NoteData("Birthday party", "My birthday in this weekends and i want to party in my house", "00:40"),
                new NoteData("Birthday party", "My birthday in this weekends and i want to party in my house", "00:40"),
                new NoteData("Birthday party", "My birthday in this weekends and i want to party in my house", "00:40"),
                new NoteData("Birthday party", "My birthday in this weekends and i want to party in my house", "00:40"),
                new NoteData("Birthday party", "My birthday in this weekends and i want to party in my house", "00:40"),
                new NoteData("Birthday party", "My birthday in this weekends and i want to party in my house", "00:40"),
                new NoteData("Birthday party", "My birthday in this weekends and i want to party in my house", "00:40"),
                new NoteData("New year 2023 party in my house", "On this party I need to buy alcohol, food and plates", "00:42")
        };

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        NoteAdapter noteAdapter = new NoteAdapter(this, noteData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(noteAdapter);

    }


}