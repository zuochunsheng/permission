package com.chunsheng.mylib.test;

import androidx.appcompat.app.AppCompatActivity;
import android.Manifest;
import android.os.Bundle;
import android.widget.Toast;

import com.chunsheng.permission.IPermission;
import com.chunsheng.permission.PermissionUtil;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //工具类 使用方式
        PermissionUtil.getInstance(this)
                .requestRunTimePermission(new String[]{Manifest.permission.CALL_PHONE,
                                Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        new IPermission() {
                            @Override
                            public void onGranted() {
                                Toast.makeText(MainActivity.this,"所有权限都同意了",Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onDenied(List<String> deniedPermission) {
                                for (String permission :deniedPermission) {
                                    Toast.makeText(MainActivity.this,"被拒绝权限："  + permission,Toast.LENGTH_SHORT).show();
                                }

                            }
                        }
                );


    }
}
