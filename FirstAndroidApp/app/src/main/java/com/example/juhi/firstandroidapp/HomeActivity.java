package com.example.juhi.firstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    Button clickMeButton;

    @BindView(R.id.butter_button) Button butterButton;
    @BindView(R.id.butter_knife_text_view_id) TextView butterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);

        clickMeButton = (Button) findViewById(R.id.click_me_button);

        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "did it!!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onNextScreenButtonClicked(View view) {
        Toast.makeText(this, "Did it again!!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.butter_button)
    public void onButterButtonClicked() {

        Toast.makeText(this, "Did it again", Toast.LENGTH_SHORT).show();

        if (butterTextView.isShown()) {
            butterTextView.setVisibility(View.GONE);
        } else {
            butterTextView.setVisibility(View.VISIBLE);
        }
    }
}
