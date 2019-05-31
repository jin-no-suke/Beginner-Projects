package com.example.splitbillapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText priceTextEdit;
    private EditText peopleTextEdit;
    private Button calcBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        peopleTextEdit = (EditText) findViewById(R.id.peopleTextEdit);
        priceTextEdit = (EditText) findViewById(R.id.priceTextEdit);
        calcBtn = (Button) findViewById(R.id.calcBtn);

        peopleTextEdit.addTextChangedListener(inputTextWatcher);
        priceTextEdit.addTextChangedListener(inputTextWatcher);
    }

    private TextWatcher inputTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String priceInput = priceTextEdit.getText().toString().trim();
            String peopleInput = peopleTextEdit.getText().toString().trim();

            calcBtn.setEnabled(!priceInput.isEmpty() && !peopleInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
