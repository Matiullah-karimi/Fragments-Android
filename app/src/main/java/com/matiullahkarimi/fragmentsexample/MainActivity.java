package com.matiullahkarimi.fragmentsexample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction transaction = fragmentManager.beginTransaction();

        Fragment2 fragment2 = new Fragment2();
        Fragment3 fragment3 = new Fragment3();
        Fragment4 fragment4 = new Fragment4();
        switch (view.getId()){

            case R.id.button1:

                Toast.makeText(MainActivity.this, "buttoni2", Toast.LENGTH_LONG).show();
                transaction.replace(R.id.linear2, fragment2);
                transaction.commit();

                break;
            case R.id.button2:

                transaction.replace(R.id.linear2, fragment3);
                transaction.commit();
                break;

            case R.id.button3:

                transaction.replace(R.id.linear2, fragment4);
                transaction.commit();
                break;
        }
    }
}
