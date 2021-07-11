package com.example.clean_architectures_simple_project.Gateway.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.clean_architectures_simple_project.Domain.Core.DB_CONST
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
//------------------------------------------------------------------------------
// <auto-generated>
//   name :saeed mohammed alabidi
//  Email:saeed1adm@gmail.com
//  Phone:00967-733122038
// </auto-generated>
//------------------------------------------------------------------------------


@Database(
    entities = [Users::class],
    version = 1
)

abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao(): userDao

}



fun buildDatabaseAsync(context: Context) =  GlobalScope.async{
      Room.databaseBuilder(context.applicationContext,
        UserDatabase::class.java, DB_CONST.NAME.Const)
        .build()
}
