package rtc.sasithon.jirawan.healthchack;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckedTextView;

/**
 * Created by masterUNG on 2/4/16 AD.
 */
public class CheckBoxClick implements AdapterView.OnItemClickListener{


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        CheckedTextView objCheckedTextView = (CheckedTextView) view;

        if (objCheckedTextView.isChecked()) {
            Log.d("check", "Checked");
        } else {
            Log.d("check", "unChecked");
        }

    }   // onItemClick

}   // Main Class
