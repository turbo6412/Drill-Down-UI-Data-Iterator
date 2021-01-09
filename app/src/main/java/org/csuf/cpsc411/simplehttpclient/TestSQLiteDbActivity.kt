package org.csuf.cpsc411.simplehttpclient

import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.io.File

class TestSQLiteDbActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //
        var dbFile : File = this.getDatabasePath("TestDb.sqlite")
        Log.d("Database", "+++ Embedded DB path : ${dbFile.getPath()}")
        var db = SQLiteDatabase.openOrCreateDatabase(dbFile.path, null)
        //
    }
}