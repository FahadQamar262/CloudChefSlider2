package com.example.dell.cloudchefslider;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Saif on 7/17/2017.
 */

public class Adapter extends ArrayAdapter<String> {
    String[] names;
    String[] des;
    int[] picID;
    Context mcontext;
    public Adapter(@NonNull Context context, String[] Names, String[] Des, int[] PicID) {
        super(context, R.layout.listview_item);
        this.names=Names;
        this.des=Des;
        this.picID=PicID;
        this.mcontext=context;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        viewholder mviewholder=new viewholder();

        if(convertView==null) {
            LayoutInflater mInflatr = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflatr.inflate(R.layout.listview_item, parent, false);
            mviewholder.mpicID = (ImageView) convertView.findViewById(R.id.imageView2);
            mviewholder.mnames = (TextView) convertView.findViewById(R.id.textView8);
            mviewholder.mdes = (TextView) convertView.findViewById(R.id.textView9);
            convertView.setTag(mviewholder);
        }else {
            mviewholder=(viewholder)convertView.getTag();
        }
        mviewholder.mpicID.setImageResource(picID[position]);
        mviewholder.mnames.setText(names[position]);
        mviewholder.mdes.setText(des[position]);

        return convertView;
    }
    static class viewholder{

        ImageView mpicID;
        TextView mnames;
        TextView mdes;

    }
}

