package rtc.sasithon.jirawan.healthchack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

public class ListDisease extends AppCompatActivity {

    //Explicit
    private TextView showHeadTextView;
    private String[] showHeadStrings;
    private int[] iconInts;
    private ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_disease);

        //Bind Widget
        showHeadTextView = (TextView) findViewById(R.id.textView);
        myListView = (ListView) findViewById(R.id.listView);

        //กำหนดหัวข้อที่จะแสดง
        showHeadStrings = new String[3];
        showHeadStrings[0] = "โรคเกี่ยวกับหัว";
        showHeadStrings[1] = "โรคเกี่ยวกับตัว";
        showHeadStrings[2] = "โรคเกี่ยวกับขา";

        //กำหนด icon
        iconInts = new int[3];
        iconInts[0] = R.drawable.icon_;
        iconInts[1] = R.drawable.icon_;
        iconInts[2] = R.drawable.icon_;

        //Receive from intent
        int intIndex = getIntent().getIntExtra("Index", 0);

        //Show View
        showHeadTextView.setText(showHeadStrings[intIndex]);


    }   // Main Method

}   // Main Class
