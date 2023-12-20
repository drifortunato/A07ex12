package com.example.a07ex12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity() {
    private lateinit var mMap: GoogleMap
    private lateinit var map: MapView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        map = findViewById(R.id.map)
        map.onCreate(savedInstanceState)
        map.getMapAsync(this)
    }

    override fun onMapRead(googleMap: GoogleMap) {
        mMap = googleMap

        val sydney = LatLng(-34.0, 151.0)
        val ifsp = LatLng(-28.541093, -48.548993)
        val trabalho = LatLng(-28.541093, -48.548993)
        val casa = LatLng(-28.541093, -48.548993)

        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.addMarker(MarkerOptions().position(ifsp).title("Marker in IFSP"))

        mMap.moveCamera(CameraUpdateFactory.newLatLng(ifsp))
        mMap.setMinZoomPreference(15f)
    }

    override fun onResume() {
        super.onResume()
        map.onResume()
    }
}
