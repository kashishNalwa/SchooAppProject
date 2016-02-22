package com.click_labs.kashishnalwa.schooappproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kashish nalwa on 31-01-2016.
 */
public class VivzAdapter extends RecyclerView.Adapter<VivzAdapter.MyViewHolder> {
    LayoutInflater inflater;
    List<StudentInformation> data = new ArrayList<>(15);
    StudentInformation current;
    public static final String EXTRA_MESSAGE = "com.click_labs.kashishnalwa.schooappproject.MESSAGE";

    VivzAdapter(Context context, List<StudentInformation> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.custom_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        current = data.get(position);
        holder.pos = position;
        holder.showImageOfStudent.setImageResource(current.studentImage);
        holder.showNameofStudent.setText(current.studentName);
        holder.showRollNoOfStudent.setText(current.studentRollNo);
        holder.itemView.setTag(holder);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyViewHolder holder = (MyViewHolder) v.getTag();
                current = data.get(holder.pos);
                Intent intent = new Intent(v.getContext(), StudentData.class);
                intent.putExtra(EXTRA_MESSAGE, current);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder  {
        ImageView showImageOfStudent;
        TextView showNameofStudent;
        TextView showRollNoOfStudent;
        int pos;

        public MyViewHolder(final View itemView) {
            super(itemView);
            showImageOfStudent = (ImageView) itemView.findViewById(R.id.image_iv);
            showNameofStudent = (TextView) itemView.findViewById(R.id.student_name_enter_tv);
            showRollNoOfStudent = (TextView) itemView.findViewById(R.id.student_roll_no_enter_tv);



        }


    }
}
