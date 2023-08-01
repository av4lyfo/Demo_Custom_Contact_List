package sg.edu.rp.c346.id22013834.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_Context;
    int layoutId;

    ListView lvContact;
    ArrayList<Contact> contactList;
    CustomAdapter caContact;

    public CustomAdapter(Context context, int resource, ArrayList<Contact> objects) {

        super(context, resource, objects);

        parent_Context = context;

        layoutId = resource;

        contactList = objects;

    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_Context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layoutId, parent,false);

        ImageView ivGender = rowView.findViewById(R.id.imageViewGender);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCode = rowView.findViewById(R.id.textViewCountryCode);
        TextView tvNum = rowView.findViewById(R.id.textViewPhoneNum);

        Contact currentItem = contactList.get(position);

        tvName.setText(currentItem.getName());
        tvCode.setText("+" + currentItem.getCountryCode());
        tvNum.setText(currentItem.getPhoneNumber() + "");
        char gender = currentItem.getGender();


        if(gender == 'F' || gender == 'f')
        {
            ivGender.setImageResource(R.drawable.female);
        }
        else if (gender == 'M' || gender == 'm')
        {
            ivGender.setImageResource(R.drawable.male);
        }
        else
        {
            ivGender.setVisibility(View.INVISIBLE);
        }


        return rowView;

    }
}
