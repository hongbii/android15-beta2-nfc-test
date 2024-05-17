package com.hb.nfctest;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static String TAG = "MainActivity";
    private NfcAdapter nfcAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nfcAdapter = NfcAdapter.getDefaultAdapter(this);
        if (nfcAdapter != null) {
            nfcAdapter.setDiscoveryTechnology(this, NfcAdapter.FLAG_READER_DISABLE, NfcAdapter.FLAG_LISTEN_NFC_PASSIVE_F);
            Log.v(TAG, "setDiscoveryTechnology FLAG_READER_DISABLE FLAG_LISTEN_NFC_PASSIVE_F\n");
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (nfcAdapter != null) {
            nfcAdapter.setDiscoveryTechnology(this, NfcAdapter.FLAG_READER_DISABLE, NfcAdapter.FLAG_LISTEN_NFC_PASSIVE_F);
            Log.v(TAG, "setDiscoveryTechnology FLAG_READER_DISABLE FLAG_LISTEN_NFC_PASSIVE_F\n");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

