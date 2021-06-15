// Generated code from Butter Knife. Do not modify!
package com.yuzumin.amelianoises.activities;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yuzumin.amelianoises.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RingActivity_ViewBinding implements Unbinder {
  private RingActivity target;

  @UiThread
  public RingActivity_ViewBinding(RingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RingActivity_ViewBinding(RingActivity target, View source) {
    this.target = target;

    target.dismiss = Utils.findRequiredViewAsType(source, R.id.activity_ring_dismiss, "field 'dismiss'", CardView.class);
    target.snooze = Utils.findRequiredViewAsType(source, R.id.activity_ring_snooze, "field 'snooze'", CardView.class);
    target.image = Utils.findRequiredViewAsType(source, R.id.activity_ring_clock, "field 'image'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.dismiss = null;
    target.snooze = null;
    target.image = null;
  }
}
