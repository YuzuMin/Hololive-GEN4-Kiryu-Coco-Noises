package com.yuzumin.coconoises.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AlarmDao_Impl implements AlarmDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Alarm> __insertionAdapterOfAlarm;

  private final EntityDeletionOrUpdateAdapter<Alarm> __updateAdapterOfAlarm;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  public AlarmDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAlarm = new EntityInsertionAdapter<Alarm>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `alarm_table` (`alarmId`,`hour`,`minute`,`started`,`recurring`,`monday`,`tuesday`,`wednesday`,`thursday`,`friday`,`saturday`,`sunday`,`title`,`created`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Alarm value) {
        stmt.bindLong(1, value.getAlarmId());
        stmt.bindLong(2, value.getHour());
        stmt.bindLong(3, value.getMinute());
        final int _tmp;
        _tmp = value.isStarted() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isRecurring() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.isMonday() ? 1 : 0;
        stmt.bindLong(6, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.isTuesday() ? 1 : 0;
        stmt.bindLong(7, _tmp_3);
        final int _tmp_4;
        _tmp_4 = value.isWednesday() ? 1 : 0;
        stmt.bindLong(8, _tmp_4);
        final int _tmp_5;
        _tmp_5 = value.isThursday() ? 1 : 0;
        stmt.bindLong(9, _tmp_5);
        final int _tmp_6;
        _tmp_6 = value.isFriday() ? 1 : 0;
        stmt.bindLong(10, _tmp_6);
        final int _tmp_7;
        _tmp_7 = value.isSaturday() ? 1 : 0;
        stmt.bindLong(11, _tmp_7);
        final int _tmp_8;
        _tmp_8 = value.isSunday() ? 1 : 0;
        stmt.bindLong(12, _tmp_8);
        if (value.getTitle() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getTitle());
        }
        stmt.bindLong(14, value.getCreated());
      }
    };
    this.__updateAdapterOfAlarm = new EntityDeletionOrUpdateAdapter<Alarm>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `alarm_table` SET `alarmId` = ?,`hour` = ?,`minute` = ?,`started` = ?,`recurring` = ?,`monday` = ?,`tuesday` = ?,`wednesday` = ?,`thursday` = ?,`friday` = ?,`saturday` = ?,`sunday` = ?,`title` = ?,`created` = ? WHERE `alarmId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Alarm value) {
        stmt.bindLong(1, value.getAlarmId());
        stmt.bindLong(2, value.getHour());
        stmt.bindLong(3, value.getMinute());
        final int _tmp;
        _tmp = value.isStarted() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isRecurring() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.isMonday() ? 1 : 0;
        stmt.bindLong(6, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.isTuesday() ? 1 : 0;
        stmt.bindLong(7, _tmp_3);
        final int _tmp_4;
        _tmp_4 = value.isWednesday() ? 1 : 0;
        stmt.bindLong(8, _tmp_4);
        final int _tmp_5;
        _tmp_5 = value.isThursday() ? 1 : 0;
        stmt.bindLong(9, _tmp_5);
        final int _tmp_6;
        _tmp_6 = value.isFriday() ? 1 : 0;
        stmt.bindLong(10, _tmp_6);
        final int _tmp_7;
        _tmp_7 = value.isSaturday() ? 1 : 0;
        stmt.bindLong(11, _tmp_7);
        final int _tmp_8;
        _tmp_8 = value.isSunday() ? 1 : 0;
        stmt.bindLong(12, _tmp_8);
        if (value.getTitle() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getTitle());
        }
        stmt.bindLong(14, value.getCreated());
        stmt.bindLong(15, value.getAlarmId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM alarm_table";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM alarm_table WHERE alarmId = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Alarm alarm) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAlarm.insert(alarm);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Alarm alarm) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfAlarm.handle(alarm);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public void deleteById(final int AlarmID) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteById.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, AlarmID);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteById.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Alarm>> getAlarms() {
    final String _sql = "SELECT * FROM alarm_table ORDER BY created ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"alarm_table"}, false, new Callable<List<Alarm>>() {
      @Override
      public List<Alarm> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAlarmId = CursorUtil.getColumnIndexOrThrow(_cursor, "alarmId");
          final int _cursorIndexOfHour = CursorUtil.getColumnIndexOrThrow(_cursor, "hour");
          final int _cursorIndexOfMinute = CursorUtil.getColumnIndexOrThrow(_cursor, "minute");
          final int _cursorIndexOfStarted = CursorUtil.getColumnIndexOrThrow(_cursor, "started");
          final int _cursorIndexOfRecurring = CursorUtil.getColumnIndexOrThrow(_cursor, "recurring");
          final int _cursorIndexOfMonday = CursorUtil.getColumnIndexOrThrow(_cursor, "monday");
          final int _cursorIndexOfTuesday = CursorUtil.getColumnIndexOrThrow(_cursor, "tuesday");
          final int _cursorIndexOfWednesday = CursorUtil.getColumnIndexOrThrow(_cursor, "wednesday");
          final int _cursorIndexOfThursday = CursorUtil.getColumnIndexOrThrow(_cursor, "thursday");
          final int _cursorIndexOfFriday = CursorUtil.getColumnIndexOrThrow(_cursor, "friday");
          final int _cursorIndexOfSaturday = CursorUtil.getColumnIndexOrThrow(_cursor, "saturday");
          final int _cursorIndexOfSunday = CursorUtil.getColumnIndexOrThrow(_cursor, "sunday");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "created");
          final List<Alarm> _result = new ArrayList<Alarm>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Alarm _item;
            final int _tmpAlarmId;
            _tmpAlarmId = _cursor.getInt(_cursorIndexOfAlarmId);
            final int _tmpHour;
            _tmpHour = _cursor.getInt(_cursorIndexOfHour);
            final int _tmpMinute;
            _tmpMinute = _cursor.getInt(_cursorIndexOfMinute);
            final boolean _tmpStarted;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfStarted);
            _tmpStarted = _tmp != 0;
            final boolean _tmpRecurring;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfRecurring);
            _tmpRecurring = _tmp_1 != 0;
            final boolean _tmpMonday;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfMonday);
            _tmpMonday = _tmp_2 != 0;
            final boolean _tmpTuesday;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfTuesday);
            _tmpTuesday = _tmp_3 != 0;
            final boolean _tmpWednesday;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfWednesday);
            _tmpWednesday = _tmp_4 != 0;
            final boolean _tmpThursday;
            final int _tmp_5;
            _tmp_5 = _cursor.getInt(_cursorIndexOfThursday);
            _tmpThursday = _tmp_5 != 0;
            final boolean _tmpFriday;
            final int _tmp_6;
            _tmp_6 = _cursor.getInt(_cursorIndexOfFriday);
            _tmpFriday = _tmp_6 != 0;
            final boolean _tmpSaturday;
            final int _tmp_7;
            _tmp_7 = _cursor.getInt(_cursorIndexOfSaturday);
            _tmpSaturday = _tmp_7 != 0;
            final boolean _tmpSunday;
            final int _tmp_8;
            _tmp_8 = _cursor.getInt(_cursorIndexOfSunday);
            _tmpSunday = _tmp_8 != 0;
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final long _tmpCreated;
            _tmpCreated = _cursor.getLong(_cursorIndexOfCreated);
            _item = new Alarm(_tmpAlarmId,_tmpHour,_tmpMinute,_tmpTitle,_tmpCreated,_tmpStarted,_tmpRecurring,_tmpMonday,_tmpTuesday,_tmpWednesday,_tmpThursday,_tmpFriday,_tmpSaturday,_tmpSunday);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
