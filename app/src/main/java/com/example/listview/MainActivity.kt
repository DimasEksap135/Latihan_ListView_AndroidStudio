package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Ruby",   "Ruby is an open-source and fully object-oriented programming language.",   R.drawable.ruby  ))
        list.add(Model("Rails",   "Ruby on Rails is a server-side web application development framework written in Ruby language.",   R.drawable.rails  ))
        list.add(Model("Phyton", "Pyhton is interpreted scripting and obect-oriented pragamming language.", R.drawable.pyhton  ))
        list.add(Model("Java Script",  "JavaScript is an object-based scripting language.",  R.drawable.js  ))
        list.add(Model("PHP",  "PHP is an interpreted language, l.e., there is no need for compilation",  R.drawable.php  ))

        listView.adapter = MyListAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                Toast.makeText(this@MainActivity, "Anda memilih Ruby",   Toast.LENGTH_SHORT).show()
            }
            if (position==1){
                Toast.makeText(this@MainActivity, "Anda memilih Rails",   Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity, "Anda memilih Phyton", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity, "Anda memilih JavaScirpt",  Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity, "Anda mrmilih PHP",  Toast.LENGTH_SHORT).show()
            }

        }

    }
}
