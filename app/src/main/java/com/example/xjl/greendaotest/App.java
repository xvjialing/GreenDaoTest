package com.example.xjl.greendaotest;

import android.app.Application;

import com.example.xjl.greendaotest.gen.DaoMaster;
import com.example.xjl.greendaotest.gen.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * Created by xjl on 17-2-21.
 */

public class App extends Application {

    public static final boolean ENCRYPTED = true;

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, ENCRYPTED ? "notes-db-encrypted" : "notes-db");
        Database db = ENCRYPTED ? helper.getEncryptedWritableDb("super-secret") : helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
