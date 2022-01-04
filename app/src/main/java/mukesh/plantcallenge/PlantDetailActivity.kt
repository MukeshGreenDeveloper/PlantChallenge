package mukesh.plantcallenge

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class PlantDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_detail)
        findViewById<VerticalTextView>(R.id.textPlantName).setShadowGradientStyle()
        findViewById<View>(R.id.hamBurgerIcon).setOnClickListener {
            finish()
        }
    }
}