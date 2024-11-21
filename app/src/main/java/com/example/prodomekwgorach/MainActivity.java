package com.example.prodomekwgorach;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView licznik;
    private Button like;
    private Button zapisz;
    private Button deletew;
    private int likess;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        like = findViewById(R.id.like);
        zapisz = findViewById(R.id.zapisz);
        deletew = findViewById(R.id.deletew);
        licznik = findViewById(R.id.licznik);

        like.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                liked();
            }
        });

        deletew.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                deleted();
            }
        });
    }

    void liked() {
        likess++;
        licznik.setText(likess + " polubień.");
    }

    void deleted() {
        if (likess != 0) {
            likess--;
            licznik.setText(likess + " polubień.");

        }
    }
}