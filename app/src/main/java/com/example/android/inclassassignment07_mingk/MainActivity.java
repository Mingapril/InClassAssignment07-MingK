package com.example.android.inclassassignment07_mingk;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText = (TextView)findViewById(R.id.text_new_book);
    }

    public void addNewBook(View view){
        Intent intent = new Intent(this,BooklistActivity.class);
        startActivityForResult(intent,RequestCodes.ADD_BOOK);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent bookData){
        if (requestCode == RequestCodes.ADD_BOOK && resultCode ==RESULT_OK){
            Book book = (Book)bookData.getSerializableExtra(Keys.BOOK);
            displayText.setText("Name of the book: " + book.getName() + "\nAuthor: " +book.getAuthor() +"\nGenre: "+ book.getGenre()+ "\nFinish reading: " + book.getFinishReading() );
        }
    }





}
