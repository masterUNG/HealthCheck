package rtc.sasithon.jirawan.healthchack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView;
    private String strTitle;
    private int mainAnInt, submainAnInt;
    private String[] listCheckStrings;
    private int[] headInts = {R.array.head_check1, R.array.head_check2, R.array.head_check3,
            R.array.head_check4, R.array.head_check5, R.array.head_check6, R.array.head_check7,
            R.array.head_check8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //Receive
        mainAnInt = getIntent().getIntExtra("main", 0);
        submainAnInt = getIntent().getIntExtra("submain", 0);
        switch (mainAnInt) {
            case 0:
                listCheckStrings = getResources().getStringArray(headInts[submainAnInt]);
                break;
            case 1:
                break;
            case 2:
                break;
        }   // switch1


        //Show View
        showView();

    }   // Main Method

    public void clickCheck(View view) {
        Intent objIntent = new Intent(DetailActivity.this, CheckActivity.class);
        objIntent.putExtra("Title", strTitle);
        objIntent.putExtra("ListCheck", listCheckStrings);
        startActivity(objIntent);
    }

    public void clickBackDetail(View view) {
        finish();
    }

    private void showView() {
        strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        String strDetail = getIntent().getStringExtra("Detail");
        detailTextView.setText(strDetail);
    }   // showView

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.textView3);
        detailTextView = (TextView) findViewById(R.id.textView4);
    }

}   // Main Class
