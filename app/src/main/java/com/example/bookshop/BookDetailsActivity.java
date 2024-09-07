package com.example.bookshop;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BookDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);


        TextView bookDetails = findViewById(R.id.text_book_details);
        bookDetails.setText("Title: 1984\nAuthor: George Orwell\nPublished: 1949\nGenre: Dystopian Fiction");
    }
}

