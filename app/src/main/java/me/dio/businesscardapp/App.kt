package me.dio.businesscardapp

import android.app.Application
import me.dio.businesscardapp.data.AppDatabase
import me.dio.businesscardapp.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}