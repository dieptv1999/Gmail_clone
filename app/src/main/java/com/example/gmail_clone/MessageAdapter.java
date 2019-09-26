package com.example.gmail_clone;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MessageAdapter extends BaseAdapter {

    Context context;
    List<Message> messages;

    public MessageAdapter(Context context, List<Message> messages) {
        this.context = context;
        this.messages = messages;
    }

    @Override
    public int getCount() {
        return messages.size();
    }

    @Override
    public Object getItem(int position) {
        return messages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return messages.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView==null){
            LayoutInflater inflater=((Activity)context).getLayoutInflater();
            convertView=inflater.inflate(R.layout.single_message,parent,false);
            holder=new ViewHolder();
            holder.imgAvatar=convertView.findViewById(R.id.imgAvatar);
            holder.textAddress=convertView.findViewById(R.id.textAddress);
            holder.textTitle=convertView.findViewById(R.id.textTitle);
            holder.textDescription=convertView.findViewById(R.id.textDescription);
            holder.textTimestamp=convertView.findViewById(R.id.textTimestamp);
            holder.btnSelected=convertView.findViewById(R.id.btnSelected);
        }else{
            holder =(ViewHolder) convertView.getTag();
        }
        final Message mess=messages.get(position);
        holder.imgAvatar.setImageResource(Message.getAvatar(mess.getAddress()));
        holder.textAddress.setText(mess.getAddress());
        holder.textTitle.setText(mess.getTitle());
        holder.textDescription.setText(mess.getDescription());
        holder.textTimestamp.setText(mess.getTimestamp());

        return convertView;
    }
    private class ViewHolder{
        ImageView imgAvatar;
        TextView textAddress;
        TextView textTitle;
        TextView textDescription;
        TextView textTimestamp;
        ImageButton btnSelected;
    }
}
