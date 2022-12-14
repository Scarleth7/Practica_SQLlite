package com.example.practica_sqllite.db;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import androidx.annotation.Nullable;

public class dbContactos extends DBHelper{
    Context context;

    public dbContactos (@Nullable Context context){
        super(context);
        this.context = context;
    }


    public long insertarContactos(String nombre, String telefono, String correo){
        long id = 0;
        try {
            DBHelper dbHelper = new DBHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("nombre", nombre);
            values.put("telefono", telefono);
            values.put("correo", correo);

            id = db.insert(TABLE_CONTACTOS, null, values);
        }catch (Exception ex){
            ex.toString();
        }
        return id;
    }
}
