package com.example.gridview_hinhanh;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import org.xmlpull.v1.XmlPullParser;

import java.util.List;

public class hinhanhadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<hinhanh> hinhanhlist;

    public hinhanhadapter(Context context, int layout, List<hinhanh> hinhanhlist) {
        this.context = context;
        this.layout = layout;
        this.hinhanhlist = hinhanhlist;
    }

    @Override
    public int getCount() {
        return hinhanhlist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class  ViewHodler
    {
        ImageView imghinh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHodler holder;
        if(convertView == null)
        {
            holder = new ViewHodler();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            //anhxa
            holder.imghinh = (ImageView) convertView.findViewById(R.id.imagehinhanh);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHodler) convertView.getTag();
        }
        //lay vi tri
        hinhanh hinhAnh = hinhanhlist.get(position);
        // gasn gias tri vao vitri o tren
        holder.imghinh.setImageResource(hinhAnh.getImg());

        return convertView;


    }
}
