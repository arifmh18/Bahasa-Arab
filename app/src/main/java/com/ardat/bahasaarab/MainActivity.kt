package com.ardat.bahasaarab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.ardat.bahasaarab.Fragment.KosakataFragment
import com.ardat.bahasaarab.Fragment.MateriFragment
import com.ardat.bahasaarab.Fragment.MembacaKerasFragment
import com.ardat.bahasaarab.Fragment.UjianFragment
import com.ardat.bahasaarab.Object.BottomNavigationViewHelper
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    private var mainActivity: View? = null

    private var main_kosakata: BottomNavigationItemView? = null
    private var main_bacakeras: BottomNavigationItemView? = null
    private var main_materi: BottomNavigationItemView? = null
    private var main_utsUas: BottomNavigationItemView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = LayoutInflater.from(this)
        mainActivity = inflater.inflate(R.layout.activity_main, null)
        setContentView(mainActivity)

        main_kosakata = main_navigation?.findViewById(R.id.main_kosakata)
        main_bacakeras = main_navigation?.findViewById(R.id.main_bacakeras)
        main_materi = main_navigation?.findViewById(R.id.main_materi)
        main_utsUas = main_navigation?.findViewById(R.id.main_utsUas)

        BottomNavigationViewHelper.removeShiftMode(main_navigation)
        main_navigation.setOnNavigationItemSelectedListener(clickEventBottom)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val mainFragment = KosakataFragment()
        fragmentTransaction.add(R.id.main_frame, mainFragment)
        fragmentTransaction.commit()
    }

    private val clickEventBottom = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId){
            R.id.main_kosakata -> {
                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                val kosakataFragment = KosakataFragment()
                fragmentTransaction.replace(R.id.main_frame, kosakataFragment)
                fragmentTransaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.main_bacakeras -> {
                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                val membacaKerasFragment = MembacaKerasFragment()
                fragmentTransaction.replace(R.id.main_frame, membacaKerasFragment)
                fragmentTransaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.main_materi-> {
                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                val materiFragment = MateriFragment()
                fragmentTransaction.replace(R.id.main_frame, materiFragment)
                fragmentTransaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.main_utsUas -> {
                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                val ujianFragment = UjianFragment()
                fragmentTransaction.replace(R.id.main_frame, ujianFragment)
                fragmentTransaction.commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}