package vizcarra.leobardo.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btn_ColdDrinks = findViewById(R.id.button_cold_drinks) as Button
        var btn_HotDrinks = findViewById(R.id.button_hot_drinks) as Button
        var btn_Sweets = findViewById(R.id.button_sweets) as Button
        var btn_Salties = findViewById(R.id.button_salties) as Button

        //var btn_Combos = findViewById(R.id.button_combos) as Button
        //var btn_Custom = findViewById(R.id.button_custom) as Button


        btn_ColdDrinks.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        btn_HotDrinks.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        btn_Sweets.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        btn_Salties.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        //btn_Combos.setOnClickListener {
        //    var intent: Intent = Intent(this, ProductosActivity::class.java)
        //    startActivity(intent)
        //}

        //btn_Custom.setOnClickListener {
        //    var intent: Intent = Intent(this, ProductosActivity::class.java)
        //    startActivity(intent)
        //}

    }
}