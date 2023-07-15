package model;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.tbina.uas.databinding.ActivityModelBinding;

public class Handphone {
    private Integer id;
    private String nama;
    private String harga;
    public Handphone() {
        super();
    }
    public Handphone(Integer id, String nama, String harga
    ) {
        super();
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getHarga() {
        return harga;
    }
    public void setHarga(String harga) {
        this.harga = harga;
    }
}