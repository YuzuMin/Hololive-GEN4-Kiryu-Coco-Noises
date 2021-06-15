// Generated code from Butter Knife. Do not modify!
package com.yuzumin.coconoises.createalarm;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TimePicker;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yuzumin.coconoises.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CreateAlarmFragment_ViewBinding implements Unbinder {
  private CreateAlarmFragment target;

  @UiThread
  public CreateAlarmFragment_ViewBinding(CreateAlarmFragment target, View source) {
    this.target = target;

    target.timePicker = Utils.findRequiredViewAsType(source, R.id.fragment_createalarm_timePicker, "field 'timePicker'", TimePicker.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.fragment_createalarm_title, "field 'title'", EditText.class);
    target.scheduleAlarm = Utils.findRequiredViewAsType(source, R.id.fragment_createalarm_scheduleAlarm, "field 'scheduleAlarm'", CardView.class);
    target.recurring = Utils.findRequiredViewAsType(source, R.id.fragment_createalarm_recurring, "field 'recurring'", CheckBox.class);
    target.mon = Utils.findRequiredViewAsType(source, R.id.fragment_createalarm_checkMon, "field 'mon'", CheckBox.class);
    target.tue = Utils.findRequiredViewAsType(source, R.id.fragment_createalarm_checkTue, "field 'tue'", CheckBox.class);
    target.wed = Utils.findRequiredViewAsType(source, R.id.fragment_createalarm_checkWed, "field 'wed'", CheckBox.class);
    target.thu = Utils.findRequiredViewAsType(source, R.id.fragment_createalarm_checkThu, "field 'thu'", CheckBox.class);
    target.fri = Utils.findRequiredViewAsType(source, R.id.fragment_createalarm_checkFri, "field 'fri'", CheckBox.class);
    target.sat = Utils.findRequiredViewAsType(source, R.id.fragment_createalarm_checkSat, "field 'sat'", CheckBox.class);
    target.sun = Utils.findRequiredViewAsType(source, R.id.fragment_createalarm_checkSun, "field 'sun'", CheckBox.class);
    target.recurringOptions = Utils.findRequiredViewAsType(source, R.id.fragment_createalarm_recurring_options, "field 'recurringOptions'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CreateAlarmFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.timePicker = null;
    target.title = null;
    target.scheduleAlarm = null;
    target.recurring = null;
    target.mon = null;
    target.tue = null;
    target.wed = null;
    target.thu = null;
    target.fri = null;
    target.sat = null;
    target.sun = null;
    target.recurringOptions = null;
  }
}
