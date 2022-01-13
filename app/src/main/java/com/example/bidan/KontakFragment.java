package com.example.bidan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentActivity;
//
//import com.google.android.gms.maps.CameraUpdateFactory;
//import com.google.android.gms.maps.GoogleMap;
//import com.google.android.gms.maps.OnMapReadyCallback;
//import com.google.android.gms.maps.SupportMapFragment;
//import com.google.android.gms.maps.model.LatLng;
//import com.google.android.gms.maps.model.MarkerOptions;

//public class KontakFragment extends FragmentActivity implements OnMapReadyCallback {
public class KontakFragment extends Fragment{

//    GoogleMap map;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//
//        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
//                .findFragmentById(R.id.fragment_map);
//        mapFragment.getMapAsync(this);

        return inflater.inflate(R.layout.fragment_kontak, container, false);
    }

//    @Override
//    public void onMapReady(@NonNull GoogleMap googleMap) {
//        map = googleMap;
//
//        LatLng fapetJat = new LatLng(-6.924160620629346, 107.77215904535974);
//        map.addMarker(new MarkerOptions().position(fapetJat).title("Fakultas Peternakan Jatinangor"));
//        map.moveCamera(CameraUpdateFactory.newLatLng(fapetJat));
//
//    }
}
