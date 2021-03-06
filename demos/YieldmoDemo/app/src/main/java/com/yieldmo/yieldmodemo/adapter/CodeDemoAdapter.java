package com.yieldmo.yieldmodemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.yieldmo.yieldmodemo.R;

public class CodeDemoAdapter extends BaseAdapter {

    Context context;
    View adViewToShow;

    public CodeDemoAdapter(Context ctx, View adView) {
        context = ctx;
        adViewToShow = adView;
    }

    @Override
    public int getCount() {
        return 40;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (position == 12) {
            convertView = adViewToShow;
        } else {
            convertView = LayoutInflater.from(context).inflate(R.layout.row, parent, false);
            TextView txt = (TextView) convertView.findViewById(R.id.value);
            txt.setText("Row " + position);
        }
        return convertView;
    }
}
