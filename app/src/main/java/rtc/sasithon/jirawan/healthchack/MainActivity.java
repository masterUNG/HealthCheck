package rtc.sasithon.jirawan.healthchack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit ประกาศตัวแปร
    private ImageView headImageView, bodyImageView, buttonImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set Controller to ImageView
        headImageView.setOnClickListener(this);
        bodyImageView.setOnClickListener(this);
        buttonImageView.setOnClickListener(this);

    }   // Main Method นี่คือ เมธอด

    @Override
    public void onClick(View view) {

    }   // onClick

}   // Main Class
