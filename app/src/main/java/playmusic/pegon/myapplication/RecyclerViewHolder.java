package playmusic.pegon.myapplication;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RecyclerViewHolder extends RecyclerView.ViewHolder {
ImageView imageView;
TextView textView;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=(ImageView)itemView.findViewById(R.id.imageView);
        textView=(TextView)itemView.findViewById(R.id.textView);

    }
}
