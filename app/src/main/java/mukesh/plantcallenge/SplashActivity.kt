package mukesh.plantcallenge

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        findViewById<VerticalTextView>(R.id.textPlantName).setShadowGradientStyle()
        findViewById<View>(R.id.getStartedLayout).setOnClickListener {
            startActivity(Intent(this@SplashActivity, HomeActivity::class.java))
            finish()
        }
    }
}