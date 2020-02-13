package sa.org.fuelapp

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import sa.org.fuelapp.di.repositoryModule
import sa.org.fuelapp.di.viewModelModule

class AppInstance : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            printLogger(Level.INFO)
            androidContext(this@AppInstance)
            modules(listOf(repositoryModule, viewModelModule))
        }
    }
}