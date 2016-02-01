package rtc.sasithon.jirawan.healthchack;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by masterUNG on 2/1/16 AD.
 */
public class DiseaseAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private int iconAnInt;
    private String[] titleStrings;

    public DiseaseAdapter(Context objContext, int iconAnInt, String[] titleStrings) {
        this.objContext = objContext;
        this.iconAnInt = iconAnInt;
        this.titleStrings = titleStrings;
    }   // Constructor

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.disease_listview, parent, false);

        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imageView4);
        iconImageView.setImageResource(iconAnInt);

        TextView titleTextView = (TextView) objView1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[position]);

        return objView1;
    }
}   // Main Class
