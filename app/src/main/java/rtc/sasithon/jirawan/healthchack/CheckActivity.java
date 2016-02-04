package rtc.sasithon.jirawan.healthchack;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.TextView;

public class CheckActivity extends AppCompatActivity {

    //Explicit
    private ListView checkListView;
    private String[] checkStrings;
    private Context objContext;
    private TextView titleTextView;
    private String titleString;
    private int scoreAnInt;

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

        checkStrings = getIntent().getStringArrayExtra("ListCheck");
        ArrayAdapter<String> objArrayAdapter = new ArrayAdapter<String>(this, R.layout.my_check_listview, checkStrings);
        checkListView.setAdapter(objArrayAdapter);
        checkListView.setItemsCanFocus(false);
        checkListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        //checkListView.setOnItemClickListener(new CheckBoxClick());
        checkListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                CheckedTextView objCheckedTextView = (CheckedTextView) view;

                if (objCheckedTextView.isChecked()) {
                    scoreAnInt += 1;
                } else {
                    scoreAnInt -= 1;
                }

                Log.d("check", "Score = " + scoreAnInt);

            }   // event
        });

    }   // Main Method

    public void clickHealthCheck(View view) {

        int intFullScore = checkStrings.length;

        AlertDialog.Builder objBuilder = new AlertDialog.Builder(this);
        objBuilder.setTitle("ความคาดหมาย");
        objBuilder.setMessage("คะแนนของคุณ = " + Integer.toString(scoreAnInt) + " / " + Integer.toString(intFullScore));
        objBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objBuilder.show();

    }   // clickHealthCheck


}   // Main Class
