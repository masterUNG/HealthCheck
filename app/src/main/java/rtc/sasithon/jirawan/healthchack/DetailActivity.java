package rtc.sasithon.jirawan.healthchack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //Show View
        showView();

    }   // Main Method

    public void clickCheck(View view) {
        Intent objIntent = new Intent(DetailActivity.this, CheckActivity.class);
        startActivity(objIntent);
    }

    public void clickBackDetail(View view) {
        finish();
    }

    private void showView() {
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        String strDetail = getIntent().getStringExtra("Detail");
        detailTextView.setText(strDetail);
    }   // showView

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.textView3);
        detailTextView = (TextView) findViewById(R.id.textView4);
    }

}   // Main Class
