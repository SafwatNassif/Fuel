package sa.org.fuelapp.di

import org.koin.dsl.module
import sa.org.fuelapp.ui.MainRepository

val repositoryModule = module {
    factory {
        MainRepository()
    }
}