package com.chunsheng.permission;

import java.util.List;

/**
 * authr : zcs on 2017/11/22  下午3:49
 * describe ：
 */
public interface IPermission {
    void onGranted();

    void onDenied(List<String> deniedPermission);
}
