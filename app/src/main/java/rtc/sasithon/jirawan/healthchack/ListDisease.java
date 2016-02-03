package rtc.sasithon.jirawan.healthchack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class ListDisease extends AppCompatActivity {

    //Explicit
    private TextView showHeadTextView;
    private String[] showHeadStrings, titleStrings, detailStrings;
    private int[] iconInts;
    private ListView myListView;
    private int intIndex;

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
        iconInts[1] = R.drawable.icon_body;
        iconInts[2] = R.drawable.icon_button;

        //Receive from intent
        intIndex = getIntent().getIntExtra("Index", 0);

        //Show View
        showHeadTextView.setText(showHeadStrings[intIndex]);

        switch (intIndex) {
            case 0:
                titleStrings = getResources().getStringArray(R.array.head_1);
                detailStrings = getResources().getStringArray(R.array.head_detail);
                break;
            case 1:
                titleStrings = getResources().getStringArray(R.array.body_1);
                detailStrings = getResources().getStringArray(R.array.body_detail);
                break;
            case 2:
                titleStrings = getResources().getStringArray(R.array.botton_1);
                detailStrings = getResources().getStringArray(R.array.botton_detail);
                break;
            default:
                titleStrings = getResources().getStringArray(R.array.head_1);
                detailStrings = getResources().getStringArray(R.array.head_detail);
                break;


        }   // swift

        //Show ListView

        createListView();

    }   //onCreate

    private void createListView() {


        DiseaseAdapter objDiseaseAdapter = new DiseaseAdapter(ListDisease.this,
                iconInts[intIndex], titleStrings);

        myListView.setAdapter(objDiseaseAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent objIntent = new Intent(ListDisease.this, DetailActivity.class);
                objIntent.putExtra("Title", titleStrings[i]);
                objIntent.putExtra("Detail", detailStrings[i]);
                startActivity(objIntent);

            }   // event

        });

    }   // createListview



}   // Main Class
