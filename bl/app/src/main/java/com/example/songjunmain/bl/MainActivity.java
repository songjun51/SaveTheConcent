package com.example.songjunmain.bl;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {
private static final int REQUET_CONNECT_DEVICE = 1;
    private static final int REQUET_ENABLE_BT =2;
    private BluetoothAdapter mBluewtoothAdapter = null;
    private BluetoothChatService mChatService = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBluewtoothAdapter=BluetoothAdapter.getDefaultAdapter();

}
//    public void onStart() {
//        super.onStart();
//
//        if (mBluewtoothAdapter.isEnabled()) {
//            Intent enableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//            startActivityForResult(enableIntent, REQUET_ENABLE_BT);
//        } else {
//            if(mChatService==null) setupChat();
//        }
//    }
//    public void onActivityResult(int requestCode, int resultCode, Intent data){
//    switch (requesCode){
//        case REQUET_ENABLE_BT;
//            if(resultCode== Activity.RESULT_OK){
//                setupChat();
//            }else{
//                Toast
//            }
//    }
//    }
}