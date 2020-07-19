package com.example.moodbloom_;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<moodbloom> mymoodbloom=new ArrayList<>();

        moodbloom m1 = new moodbloom("ANGRY",R.drawable.angry,"quote:Try to manage your anger since people can't manage their stupidity");
        moodbloom m2 = new moodbloom("CONTENT",R.drawable.happy,"Remember to :Be thankful for what you have ; because you will end up having more");
        moodbloom m3 = new moodbloom("SHOCKED",R.drawable.shocked,"quote:Breathe it out,Visualize your calm");
        moodbloom m4 = new moodbloom("SAD",R.drawable.cry,"Remember to :Delete those sad quotes.Delete the negative people from your life.Just focus on the good and be happy .Enjoy every moment of this wonderful life");
        moodbloom m5 = new moodbloom("WORRIED",R.drawable.reading,"quote:you may be disapointed if you fail ,but you are doomed if you don't try");
        moodbloom m6 = new moodbloom("HAPPY",R.drawable.smile,"quote:give as much as you can , but dont allow yourself to be used . Listen to others cloely , but don't lose your own voice ");
        moodbloom m7 = new moodbloom("LUCKY",R.drawable.love,"Remember that:luck is what happens when preparation meets opportunity");


        mymoodbloom.add(m1);
        mymoodbloom.add(m2);
        mymoodbloom.add(m3);
        mymoodbloom.add(m4);
        mymoodbloom.add(m5);
        mymoodbloom.add(m6);
        mymoodbloom.add(m7);


        RecyclerView rv = findViewById(R.id.RecyclerView);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager Ln = new LinearLayoutManager(this);
        rv.setLayoutManager(Ln);

        myadapter adapter = new myadapter(mymoodbloom,this);
        rv.setAdapter(adapter);




    }
}