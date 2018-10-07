package com.example.apple.filewriter;

import android.os.Environment;
import android.provider.DocumentsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    public static final String file_name="Sdcard.txt";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File file = new File(Environment.getExternalStorageDirectory() + "/Internal Folder");
        File file2 = new File(Environment.getExternalStorageDirectory() + "/Internal Download Folder");

        boolean success = true;
        boolean success2 = true;
        if (!file.exists()) {
            Toast.makeText(getApplicationContext(), "Directory does not exists", Toast.LENGTH_SHORT).show();
        }
        if (success) {
            Toast.makeText(getApplication(), "Directory created", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Failed Error", Toast.LENGTH_SHORT).show();
        }
        if (!file2.exists()) {
            Toast.makeText(getApplicationContext(), "Directory does not exists", Toast.LENGTH_SHORT).show();
        }
        if (success2) {
            Toast.makeText(getApplication(), "Directory created", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Failed Error", Toast.LENGTH_SHORT).show();
        }



        String state=Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(state)){
            File root=Environment.getExternalStorageDirectory();
            File root2=Environment.getExternalStorageDirectory();
            File Dir=new File(root.getAbsolutePath()+"/SD Card Folder");
            File Dir2=new File(root.getAbsolutePath()+"/SD Card Folder");
            if(!Dir.exists()){
                Dir.mkdir();

            }
            if(!Dir2.exists()){
                Dir2.mkdir();
            }


        }
        else{
            Toast.makeText(getApplicationContext(),"SD card not found",Toast.LENGTH_SHORT).show();
        }


    }


    }


