package mukesh.plantcallenge

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeVM : ViewModel() {
    public var selectedOption: MutableLiveData<Int> = MutableLiveData(1)
    fun clickChooseMenu(v: View, choosen: Int) {
        selectedOption.value = choosen
    }

    fun clickChoosePlant(v: View) {
        (v.context as HomeActivity).openProduct()
    }
}