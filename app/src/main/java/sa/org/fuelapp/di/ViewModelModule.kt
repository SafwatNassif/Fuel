package sa.org.fuelapp.di

import org.koin.dsl.module
import sa.org.fuelapp.ui.MainViewModel

val  viewModelModule  = module {


    factory {
        MainViewModel(get())
    }
}