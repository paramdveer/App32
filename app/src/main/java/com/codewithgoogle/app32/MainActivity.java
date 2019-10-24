package com.codewithgoogle.app32;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtview;
    EditText editText;
    AutoCompleteTextView autoCompleteTextView;
    MultiAutoCompleteTextView multiAutoCompleteTextView;
    String course[]={"Android Course","IOS Course","Java DEvelopment", "Kotlin","Python"};
    ArrayAdapter<String> adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtview=(TextView)findViewById(R.id.textView2);
        editText=(EditText)findViewById(R.id.editText2);
        autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        multiAutoCompleteTextView=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView);

        txtview.setText("Awesome !");
        txtview.setBackgroundColor(Color.BLUE);
        txtview.setOnClickListener(this);
        editText.setOnClickListener(this);
        adp=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,course);
        autoCompleteTextView.setAdapter(adp);

        //Setting multiautocompletetext view
        multiAutoCompleteTextView.setAdapter(adp);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.textView2:
                txtview.setTextColor(Color.RED);
                break;

            case R.id.editText2:
                txtview.setText(editText.getText().toString());
                break;

        }

    }
}
