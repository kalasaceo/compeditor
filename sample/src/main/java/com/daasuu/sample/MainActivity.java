package com.daasuu.sample;
import android.content.Intent;

import com.daasuu.camerarecorder.CameraHandler;
import com.daasuu.camerarecorder.CameraMainActivity;
import com.daasuu.camerarecorder.TrimMainActivity;
import com.daasuu.camerarecorder.TrimmerActivity;
import com.daasuu.camerarecorder.VideoProcessActivity;

import android.graphics.Camera;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private static final int CAMERA_PERMISSION_REQUEST_CODE = 88888;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, CameraMainActivity.class);
        startActivity(intent);
    }
}