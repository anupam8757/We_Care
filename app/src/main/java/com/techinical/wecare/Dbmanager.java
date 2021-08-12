package com.techinical.wecare;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

class Dbmanager extends SQLiteOpenHelper {
    private static final  String dbname="StudentDecs.db";
    public Dbmanager(@Nullable Context context) {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String qry ="create table tb1_student(id integer primary key autoincrement, name text,email text,phone number,password text)" ;
        db.execSQL(qry);
        Log.d("table","Table Created");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS tb1_student");
        onCreate(db);
        Log.d("table","Oncreate");

    }
    public  String addRecord(String p1,String p2,String p3,String p4)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("name",p1);
        cv.put("email",p2);
        cv.put("phone",p3);
        cv.put("password",p4);
        long res=db.insert("tb1_student",null,cv);
        if(res==-1)
        {
            return "Failed";
        }
        else
        {
            return "Succuessfully Stored";
        }
    }
}
