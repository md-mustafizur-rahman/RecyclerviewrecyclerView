package playmusic.pegon.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.myrec);
        ArrayList<carry> carries =new ArrayList<>();
        carries.add(new carry("Hello", R.drawable.ic_baseline_person_pin_24));
        carries.add(new carry("Hello", R.drawable.ic_baseline_person_pin_24));
        carries.add(new carry("Hello", R.drawable.ic_baseline_person_pin_24));
        carries.add(new carry("Hello", R.drawable.ic_baseline_person_pin_24));
        carries.add(new carry("Hello", R.drawable.ic_baseline_person_pin_24));
        carries.add(new carry("Hello", R.drawable.ic_baseline_person_pin_24));


        RecyclerViewAdapter adepter=new RecyclerViewAdapter(this, carries);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adepter);
    }
}