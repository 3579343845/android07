package com.example.newslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    private List<News> mNewsData;//用于传递News对象列表
    private Context mContext;//context上下文用于NewsAdapter类中LayoutInflater加载布局时使用
    private int resourceId;//用于设置ListView每个Item项时的布局

    public NewsAdapter(Context context,int resourceId,List<News> data){
        super(context,resourceId,data);
        this.mContext = context;
        this.mNewsData = data;
        this.resourceId = resourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){//int position，当前Item对应的位置;View convertView，针对ListView中缓存的不可见的Item的View对象;ViewGroup parent，需要加载的View的父容器对象;
        News news = getItem(position);//通过position参数，可以使用getItem方法获取对应的News对象。
        View view;


        //在getView方法中调用LayoutInflater加载指定的resourceId布局，
        // 第二个参数则为加载的布局对应的父容器控件对象，
        // 第三个参数表示是否将加载的布局加入父容器控件中，在此情况下要选择false。
        view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

        TextView tvTitle = view.findViewById(R.id.tv_title);
        TextView tvAuthor = view.findViewById(R.id.tv_subtitle);
        ImageView ivImage = view.findViewById(R.id.iv_image);

        tvTitle.setText(news.getTitle());
        tvAuthor.setText(news.getAuthor());
        ivImage.setImageResource(news.getImageId());
        return view;
    }

}
