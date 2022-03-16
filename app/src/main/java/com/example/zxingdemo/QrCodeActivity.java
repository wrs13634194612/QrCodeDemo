package com.example.zxingdemo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class QrCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);
        ImageView ad_iv_qrcode = findViewById(R.id.ad_iv_qrcode);
        Gson gson = new Gson();
        ScanBean mScanBean = new ScanBean();
        mScanBean.setName("赵信");
        mScanBean.setAge(18);
        mScanBean.setEmail("2494075190@qq.com");
        mScanBean.setIsDeveloper(true);
        String res = gson.toJson(mScanBean);
        Bitmap qrcode = CommonUtils.createQRCodeBitmap(res, 960, 960);
        ad_iv_qrcode.setImageBitmap(qrcode);
    }
}
