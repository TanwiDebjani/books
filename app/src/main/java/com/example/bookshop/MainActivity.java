package com.example.bookshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView bookTitle = findViewById(R.id.text_book_title);
        ImageView bookCover = findViewById(R.id.image_book_cover);
        Button buttonRead = findViewById(R.id.button_read);
        Button buttonDetails = findViewById(R.id.button_details);


        bookTitle.setText("Book: 1984 by George Orwell");
        bookCover.setImageResource(R.drawable.img);


        buttonRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomToast("Reading 1984...");
            }
        });


        buttonDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BookDetailsActivity.class);
                startActivity(intent);
            }
        });
    }


    private void showCustomToast(String message) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, findViewById(R.id.custom_toast_container));


        TextView toastText = layout.findViewById(R.id.text_toast);
        toastText.setText(message);


        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 200);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}

