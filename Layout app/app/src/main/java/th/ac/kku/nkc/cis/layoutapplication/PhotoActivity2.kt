package th.ac.kku.nkc.cis.layoutapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PhotoActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo2)

        val buttonDatail = findViewById<Button>(R.id.buttonBack)
        buttonDatail.setOnClickListener { view ->
           finish()
        }
    }
}