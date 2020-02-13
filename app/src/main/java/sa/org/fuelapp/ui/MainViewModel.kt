package sa.org.fuelapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel(val repository: MainRepository) : ViewModel() {


    init {
        getUsers()
    }

    private fun getUsers() {
        viewModelScope.launch {
            repository.getUser()
        }
    }


}