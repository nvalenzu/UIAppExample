package com.example.telematica.uiappexample.presenter;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.telematica.uiappexample.models.AdminSQLiteOpenHelper;
import com.example.telematica.uiappexample.models.Libro;
import com.example.telematica.uiappexample.presenter.Contract.LocalBD;

/**
 * Created by nicolas on 17-11-2016.
 */
public class LocalBDImpl implements LocalBD {

    int id, autor;
    String nombre, editorial, genero;
    Context context;

    public LocalBDImpl(Libro libro, Context context)
    {
        id = libro.getId();
        nombre = libro.getNombre();
        editorial = libro.getEditorial();
        genero = libro.getGenero();
        autor = libro.getAutor();
        this.context = context;
    }

    @Override
    public void SaveData() {

        AdminSQLiteOpenHelper LibrosBD = new AdminSQLiteOpenHelper(context,"LibrosBD", null, 1);
        SQLiteDatabase bd = LibrosBD.getWritableDatabase();

        ContentValues registro = new ContentValues();

        registro.put("id", id);
        registro.put("nombre", nombre);
        registro.put("editorial", editorial);
        registro.put("genero", genero);
        registro.put("autor", autor);
        bd.insert("", null, registro);
        bd.close();

    }


}
