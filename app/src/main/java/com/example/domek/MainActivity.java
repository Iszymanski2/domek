package com.example.domek;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int likeCount = 0;
    private TextView likeCountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button likeButton = findViewById(R.id.likeButton);
        Button removeButton = findViewById(R.id.removeButton);
        likeCountText = findViewById(R.id.likeCountText);

        updateLikeText();

        likeButton.setOnClickListener(v -> {
            likeCount++;
            updateLikeText();
        });

        removeButton.setOnClickListener(v -> {
            if (likeCount > 0) {
                likeCount--;
                updateLikeText();
            }
        });


    }

    private void updateLikeText() {
        likeCountText.setText(likeCount + " polubień");
    }
}
