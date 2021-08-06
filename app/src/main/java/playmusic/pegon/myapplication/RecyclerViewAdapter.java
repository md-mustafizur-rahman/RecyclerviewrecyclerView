package playmusic.pegon.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    Context c;
    ArrayList<carry> Rvc;
    public RecyclerViewAdapter(Context c, ArrayList<carry> Rvc) {
        this.Rvc=Rvc;
        this.c=c;

    }
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(c).inflate(R.layout.row,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

    carry carry =Rvc.get(position);
    holder.textView.setText(carry.myText);
    holder.imageView.setImageResource(carry.myImg);
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(c,  carry.myText+": Click", Toast.LENGTH_SHORT).show();
        }
    });



    }

    @Override
    public int getItemCount() {
        return Rvc.size();
    }
}
