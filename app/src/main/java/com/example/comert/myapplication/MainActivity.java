package com.example.comert.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int counter=0;
   int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.button);
        final ImageView image=(ImageView)findViewById(R.id.imageView);
        final ImageView image1=(ImageView)findViewById(R.id.imageView1);
        final ImageView image2=(ImageView)findViewById(R.id.imageView2);





        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                counter++;

                switch (counter)
                {
                    case 1:image.setVisibility(View.VISIBLE);
                           image1.setVisibility(View.INVISIBLE);
                         image2.setVisibility(View.INVISIBLE);
                        break;
                    case 2: image.setVisibility(View.INVISIBLE);
                            image1.setVisibility(View.VISIBLE);
                            image2.setVisibility(View.INVISIBLE);
                            break;
                    case 3:  image.setVisibility(View.INVISIBLE);
                        image1.setVisibility(View.INVISIBLE);
                        image2.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        counter=1;i++;
                        image.setVisibility(View.VISIBLE);
                        image1.setVisibility(View.INVISIBLE);
                        image2.setVisibility(View.INVISIBLE);


                switch (i)
                {
                    case 4:
                        counter=0;
                        image.setVisibility(View.INVISIBLE);
                        image1.setVisibility(View.INVISIBLE);
                        image2.setVisibility(View.INVISIBLE);
                        i=0;
                        break;


                }


                }






            }
        });







        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
