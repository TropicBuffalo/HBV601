package com.example.notandi.hospitalwagons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class BarcodeScannerFunction extends AppCompatActivity {

    private ZXingScannerView scannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode_scanner_function);

    }
    public void scanPic(View view){
        scannerView = new ZXingScannerView(this);
        scannerView.setResultHandler(new ZXingScannerViewResultHandler());

        setContentView(scannerView);
        scannerView.startCamera();
    }

    // when it is not active to prevent it to be still running in tha backround
    @Override
    public void onPause(){
        super.onPause();
        scannerView.stopCamera();
    }
    class ZXingScannerViewResultHandler implements ZXingScannerView.ResultHandler{

        // Here the string from the barcode is feched into a string and dispalyed
        @Override
        public void handleResult(Result result) {
            String resultCode = result.getText();
            Toast.makeText(BarcodeScannerFunction.this, resultCode,Toast.LENGTH_SHORT).show();

            setContentView(R.layout.activity_barcode_scanner_function);
            scannerView.stopCamera();


        }

    }

}
