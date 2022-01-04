package mukesh.plantcallenge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import mukesh.plantcallenge.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var vm: HomeVM
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityHomeBinding.inflate(layoutInflater)
        vm = ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory(application)
        ).get(HomeVM::class.java)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        binding.apply {
            lifecycleOwner = this@HomeActivity
            viewModel = vm
        }

    }

    fun openProduct() {
        startActivity(Intent(this, PlantDetailActivity::class.java))
    }
}