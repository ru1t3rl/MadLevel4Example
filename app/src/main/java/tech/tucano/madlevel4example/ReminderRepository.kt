package tech.tucano.madlevel4example

import android.content.Context
import android.provider.CalendarContract

class ReminderRepository(context: Context) {
    private var reminderDao: ReminderDao

    init{
        val reminderRoomDatabase = ReminderRoomDatabase.getDatabase(context)
        reminderDao = reminderRoomDatabase!!.reminderDao()
    }

    fun getAllReminders(): List<Reminder> {
        return reminderDao.getAllReminders()
    }

    fun insertReminder(reminder: Reminder){
        reminderDao.insertReminder(reminder)
    }

    fun deleteReminder(reminder: Reminder){
        reminderDao.deleteReminder(reminder)
    }

    fun updateReminder(reminder: Reminder){
        reminderDao.updateReminder(reminder)
    }
}