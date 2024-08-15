package com.example.KTX;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.on_tap01.R;

import java.util.ArrayList;

public class Adapter_sinhvien extends BaseAdapter {

    LayoutInflater li;
    Context context;
    ArrayList<SinhVien> dssv;

    public Adapter_sinhvien(Context context, ArrayList<SinhVien> dssv) {
        this.context = context;
        this.dssv = dssv;
        this.li =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return dssv.size();
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
        convertView = li.inflate(R.layout.sinhvien_infomation, null);
        //tham chieu
        TextView name = convertView.findViewById(R.id.txt_name);
        TextView gpa = convertView.findViewById(R.id.txt_gpa );

        //lay du lieu
        SinhVien sv = dssv.get(position);
        name.setText("Name: " + sv.getName());
        gpa.setText("GPA: " + sv.getGpa());

        return convertView;
    }
}
