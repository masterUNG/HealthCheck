package rtc.sasithon.jirawan.healthchack;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CheckActivity extends AppCompatActivity {

    //Explicit
    private ListView checkListView;
    private String[] checkStrings;
    private Context objContext;
    private TextView titleTextView;
    private String titleString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        //Bind Widget
        checkListView = (ListView) findViewById(R.id.listView2);
        titleTextView = (TextView) findViewById(R.id.textView5);

        //Show Title
        titleString = getIntent().getStringExtra("Title");
        titleTextView.setText(titleString);

        String[] checkStrings = getIntent().getStringArrayExtra("ListCheck");
        ArrayAdapter<String> objArrayAdapter = new ArrayAdapter<String>(this, R.layout.my_check_listview, checkStrings);
        checkListView.setAdapter(objArrayAdapter);
        checkListView.setItemsCanFocus(false);
        checkListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        checkListView.setOnItemClickListener(new CheckBoxClick());

    }   // Main Method


}   // Main Class
