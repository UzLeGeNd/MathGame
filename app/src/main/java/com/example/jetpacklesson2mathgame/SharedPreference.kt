package com.example.jetpacklesson2mathgame

import android.content.Context
import android.content.SharedPreferences
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.prefs.Preferences

class SharedPreferences( var context: Context) {
//companion object{
//    private val Context.dataStore:DataStore<Preferences> by preferencesDataStore("questionList")
//    var USER_QUESTION_KEY= stringPreferencesKey("listKey")
//}
//
//    val getEmail:Flow<String?> = context.dataStore.data
//            .map{preferences ->
//        preferences[USER_QUESTION_KEY] ?: ""
//            }
//
//    suspend fun saveEmail(name:String){
//        context.dataStore.edit { preferences ->
//            preferences[USER_QUESTION_KEY]=name
//        }
//
//    }
}
