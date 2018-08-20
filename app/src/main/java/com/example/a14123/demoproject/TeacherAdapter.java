package com.example.a14123.demoproject;

/**
 * Created by 14123 on 2018/8/14.
 */
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import  java.util.List;
import java.util.zip.Inflater;

public class TeacherAdapter extends ArrayAdapter<Teacher>{
    public TeacherAdapter(Context context,int resource,List<Teacher> objects){
        super(context,resource,objects);
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        //获取老师的数据
        final Teacher teacher = getItem(position);
        //创建布局
        View oneTeacherView = LayoutInflater.from(getContext()).inflate(R.layout.teacher_item,parent,false);
        //获取Imageview和textView
        ImageView imageView = (ImageView) oneTeacherView.findViewById(R.id.teacher_small_imageView);
        TextView  textView = (TextView) oneTeacherView.findViewById(R.id.teacher_name_textView);

        //根据老师户数设置imageView和TextView的展现
        imageView.setImageResource(teacher.getImageId());
        textView.setText(teacher.getName());

        oneTeacherView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //初始化跳转
                Intent intent = new Intent(getContext(),Main2Activity.class);
                //intent中传入相关数据
                intent.putExtra("teacher_image",teacher.getImageId());
                intent.putExtra("teacher_desc",teacher.getDesc());

                //准备跳转
                getContext().startActivity(intent);
            }
        });

        return oneTeacherView;

    }

}
