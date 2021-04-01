package com.example.gridview_hinhanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvhinhanh;
    ArrayList<hinhanh> arrayimage;
    hinhanhadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Anhxa();
        adapter = new hinhanhadapter(this,R.layout.donghinhanh,arrayimage);
        gvhinhanh.setAdapter(adapter);
    }

    private void Anhxa()
    {
        gvhinhanh = (GridView) findViewById(R.id.gridviewhinhanh);
        arrayimage = new ArrayList<>();
        arrayimage.add(new hinhanh("Hình 1",R.drawable.hinh1));
        arrayimage.add(new hinhanh("Hình 2",R.drawable.hinh2));
        arrayimage.add(new hinhanh("Hình 3",R.drawable.hinh3));
        arrayimage.add(new hinhanh("Hình 4",R.drawable.hinh4));
        arrayimage.add(new hinhanh("Hình 5",R.drawable.hinh5));
        arrayimage.add(new hinhanh("Hình 6",R.drawable.hinh6));
        arrayimage.add(new hinhanh("Hình 7",R.drawable.hinh7));
        arrayimage.add(new hinhanh("Hình 8",R.drawable.hinh8));
        arrayimage.add(new hinhanh("Hình 9",R.drawable.hinh9));
        arrayimage.add(new hinhanh("Hình 10",R.drawable.hinh10));
        arrayimage.add(new hinhanh("Hình 12",R.drawable.hinh11));
        arrayimage.add(new hinhanh("Hình 13",R.drawable.hinh12));

    }
}