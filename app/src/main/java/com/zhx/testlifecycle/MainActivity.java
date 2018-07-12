package com.zhx.testlifecycle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;



/**
 * Name: MainActivity
 * Author: zhouxue
 * Email: 194093798@qq.com
 * Comment: //TODO
 * Date: 2018-07-12 12:57
 */

public class MainActivity extends Activity{


        private String TAG = com.zhx.testlifecycle.MainActivity.class.getSimpleName();
        private static final int GETDATA = 1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.i(TAG, "onCreate!!!!!!!!!!!!!!!!!!!!!!!");
            Button jumBtn = (Button) findViewById(R.id.jump_activity);
            jumBtn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    startActivity(new Intent(getApplicationContext(),
                            TestActivity.class));

                }
            });

            Button finButton = (Button) findViewById(R.id.finish_activity);
            finButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    finish();

                }
            });

            Button intentbtn = (Button) findViewById(R.id.initent_data);
            intentbtn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    startActivityForResult(new Intent(getApplicationContext(),
                            TestActivity.class), GETDATA);

                }
            });
            Button back = (Button) findViewById(R.id.back);

            back.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    finish();
                }
            });

        }

        @Override
        protected void onResume() {
            // TODO Auto-generated method stub
            super.onResume();
            Log.i(TAG, "onResume!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        @Override
        protected void onStop() {
            // TODO Auto-generated method stub
            super.onStop();
            Log.i(TAG, "onStop!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        @Override
        protected void onRestart() {
            // TODO Auto-generated method stub
            super.onRestart();
            Log.i(TAG, "onRestart!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        @Override
        protected void onDestroy() {
            // TODO Auto-generated method stub
            super.onDestroy();
            Log.i(TAG, "onDestroy!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        @Override
        public void onWindowFocusChanged(boolean hasFocus) {
            // TODO Auto-generated method stub
            super.onWindowFocusChanged(hasFocus);

            Log.i(TAG, "onWindowFocusChanged!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            // TODO Auto-generated method stub
            super.onActivityResult(requestCode, resultCode, data);

            Log.i(TAG, "onActivityResult" + "   requestCode:  " + requestCode
                    + "    resultCode: " + resultCode);
        }

}
