package rtc.sasithon.jirawan.healthchack;

import android.content.Intent;
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


        //Bind Widget
        headImageView = (ImageView) findViewById(R.id.imageView);
        bodyImageView = (ImageView) findViewById(R.id.imageView2);
        buttonImageView = (ImageView) findViewById(R.id.imageView3);

        //set Controller to ImageView
        headImageView.setOnClickListener(this);
        bodyImageView.setOnClickListener(this);
        buttonImageView.setOnClickListener(this);

    }   // Main Method นี่คือ เมธอด

    @Override
    public void onClick(View view) {

        int intIndex = 0;

        switch (view.getId()) {
            case R.id.imageView:
                intIndex = 0;
                break;
            case R.id.imageView2:
                intIndex = 1;
                break;
            case R.id.imageView3:
                intIndex = 2;
                break;
        }   // switch

        Intent objIntent = new Intent(MainActivity.this, ListDisease.class);
        objIntent.putExtra("Index", intIndex);
        startActivity(objIntent);


    }   // onClick


}   // Main Class
