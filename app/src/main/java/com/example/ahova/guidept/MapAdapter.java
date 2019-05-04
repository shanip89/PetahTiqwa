package com.example.ahova.guidept;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import javax.xml.transform.Result;

public class MapAdapter extends RecyclerView.Adapter<MapAdapter.ViewHolder> {

    private ArrayList<Map> mMapList;
    private LayoutInflater mLayoutInflater;
    Context mContext;



    public MapAdapter(Context context, ArrayList<Map> mapList) {
        this.mMapList = mapList;
        this.mContext = context;
        mLayoutInflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mLayoutInflater.inflate(R.layout.list_me, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        final Map c = mMapList.get(i);
        viewHolder.bind(c);
    }

    @Override
    public int getItemCount() {
        return mMapList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private ImageView mImageLogo;
        private TextView mTextInfo;
        private TextView mKnowthis;
        private ImageView mImageMap;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageLogo = itemView.findViewById(R.id.image_place);
            mTextInfo = itemView.findViewById(R.id.text_information);
            mKnowthis = itemView.findViewById(R.id.did_you_know);
            mImageMap = itemView.findViewById(R.id.image_map);
        }

        public void bind(final Map city){
            mImageLogo.setImageResource(city.getImageLogo());
            mTextInfo.setText(city.getTextInfo());
            mKnowthis.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(mContext, R.attr.alertDialogTheme);
                    builder.setTitle("Did you know?");
                    builder.setMessage(city.getKnowThis());
                    builder.setPositiveButton("Now I know!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    builder.show();
                }
            });
            mImageMap.setImageResource(city.getImageMap());
            mImageMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(city.getLinkMap()));
                    mContext.startActivity(intent);
                }
            });
        }

    }
}
