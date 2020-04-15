package com.hjq.tinker;

import android.app.Application;
import android.content.Context;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

import androidx.multidex.MultiDex;

/**
 * @Describe：
 * @Date：2020-04-14
 */
public class MyApplication extends TinkerApplication {

    public MyApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.hjq.tinker.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
