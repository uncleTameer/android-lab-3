package com.example.picturesanddeletetext;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private ImageView imageView;
    private int[] imageArray = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
    private int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextText);
        imageView = findViewById(R.id.imageView);
        Button clearTextButton = findViewById(R.id.button4);
        Button nextImageButton = findViewById(R.id.button5);

        // Set initial image
        imageView.setImageResource(imageArray[currentImageIndex]);

        // Set OnClickListener for the clear text button
        clearTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        // Set OnClickListener for the next image button
        nextImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentImageIndex = (currentImageIndex + 1) % imageArray.length;
                imageView.setImageResource(imageArray[currentImageIndex]);
            }
        });
    }
}
