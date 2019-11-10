package com.example.gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView1 = this.findViewById(R.id.text_view1);
        mTextView = this.findViewById(R.id.text_view);
        mTextView1.setText("测试测试测试");
        mTextView.setSingleLine(true);
        mTextView.setText("999999999966666666666666666666666666666999999999999");
        mTextView.setTextColor(2222222);
    }
}
