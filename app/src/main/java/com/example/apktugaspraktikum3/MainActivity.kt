package com.example.apktugaspraktikum3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: ClsAdapter
    lateinit var listData: ArrayList<Datapeserta>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycle = findViewById(R.id.idrecycle)
        listData = ArrayList()

        val layoutManager = GridLayoutManager(this, 1)
        recycle.layoutManager = layoutManager
        recycleAdapter = ClsAdapter(listData, this)

        recycle.adapter = recycleAdapter
        listData.add(Datapeserta("Doctor Strange", "210441100119", "17 Tahun", R.drawable.doctor))
        listData.add(Datapeserta("Groot", "210441100119", "17 tahun", R.drawable.groot))
        listData.add(Datapeserta("Hulk", "210441100119", "17 tahun", R.drawable.hulk))
        listData.add(Datapeserta("Ironman", "210441100119", "17 tahun", R.drawable.iron))
        listData.add(Datapeserta("Lord", "210441100119", "16 tahun", R.drawable.lord))
        listData.add(Datapeserta("Man", "210441100119", "17 tahun", R.drawable.man))
        listData.add(Datapeserta("Panther", "210441100119", "17 tahun", R.drawable.panther))
        listData.add(Datapeserta("Penyihir", "210441100119", "40 tahun", R.drawable.penyihir))
        listData.add(Datapeserta("Spider", "210441100119", "16 tahun", R.drawable.spider))
        listData.add(Datapeserta("Thor", "210441100119", "28 tahun", R.drawable.thor))
        listData.add(Datapeserta("Naruto", "210441100119", "27 tahun", R.drawable.naruto))
        listData.add(Datapeserta("Boruto", "210441100119", "18 tahun", R.drawable.boruto))
        listData.add(Datapeserta("Guy", "210441100119", "23 tahun", R.drawable.guy))
        listData.add(Datapeserta("Hitachi", "210441100119", "28 tahun", R.drawable.itaci))
        listData.add(Datapeserta("Jiraiya", "210441100119", "35 tahun", R.drawable.jiraiya))
        listData.add(Datapeserta("Khakasi", "210441100119", "28 tahun", R.drawable.kakasi))
        listData.add(Datapeserta("Rocklee", "210441100119", "18 tahun", R.drawable.lee))
        listData.add(Datapeserta("Nedji", "210441100119", "28 tahun", R.drawable.neji))
        listData.add(Datapeserta("Orochimaru", "210441100119", "28 tahun", R.drawable.orocimaru))
        listData.add(Datapeserta("Sakura", "210441100119", "22 tahun", R.drawable.sakura))

    }


        override fun onCreateOptionsMenu(menu: Menu?): Boolean {

            val inflater: MenuInflater = menuInflater
            inflater.inflate(R.menu.main_menu,menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            return when(item.itemId){
                R.id.list ->{
                    startActivity(Intent(this@MainActivity, MainActivity2::class.java))
                    true
                }
                R.id.grid ->{
                    startActivity(Intent(this@MainActivity, grid::class.java))
                    true
                }

                else -> return super.onOptionsItemSelected(item)

            }
        }
}