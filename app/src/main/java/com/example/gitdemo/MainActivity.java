package com.example.gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private TextView mTextView3;
    private TextView mTextView2;
    private TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView1 = this.findViewById(R.id.text_view1);
        mTextView3 = this.findViewById(R.id.text_view3);
        mTextView2 = this.findViewById(R.id.text_view2);
        mTextView = this.findViewById(R.id.text_view);
        mTextView1.setText("测试测试测试");
        mTextView2.setSingleLine(true);
        mTextView3.setText("77777777777777777777777");
        mTextView2.setText("6666666666666666666666");
        mTextView.setSingleLine(true);
        mTextView.setText("55555555555555555555555");
        mTextView.setTextColor(2222222);
    }
}
