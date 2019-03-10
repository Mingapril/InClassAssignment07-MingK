package com.example.android.inclassassignment07_mingk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class BooklistActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private EditText bookname;
    private EditText author;
    private CheckBox finishReading;
    private String genre;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklist);

        bookname = (EditText)findViewById(R.id.book_name);
        author = (EditText) findViewById(R.id.book_author);
        finishReading = (CheckBox) findViewById(R.id.finish_reading);
        add = (Button)findViewById(R.id.add_button);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.genre_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setOnItemSelectedListener(this);
        spinner.setAdapter(adapter);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String bookName = bookname.getText().toString();
                String bookAuthor = author.getText().toString();
                boolean finish;

                if (finishReading.isChecked()){
                    finish = true;
                } else {
                    finish = false;
                }

                Book book = new Book(bookName,bookAuthor,finish,genre);
                Intent intent = new Intent();
                intent.putExtra(Keys.BOOK,book);
                setResult(RESULT_OK,intent);
                finish();

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        genre = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }






    }



