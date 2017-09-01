// Generated code from Butter Knife. Do not modify!
package org.fossasia.phimpme.opencamera.Camera;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageButton;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.fossasia.phimpme.R;

public class CameraActivity_ViewBinding implements Unbinder {
  private CameraActivity target;

  @UiThread
  public CameraActivity_ViewBinding(CameraActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CameraActivity_ViewBinding(CameraActivity target, View source) {
    this.target = target;

    target.increaseZoom = Utils.findRequiredViewAsType(source, R.id.increase_zoom, "field 'increaseZoom'", ImageButton.class);
    target.decreaseZoom = Utils.findRequiredViewAsType(source, R.id.decrease_zoom, "field 'decreaseZoom'", ImageButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CameraActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.increaseZoom = null;
    target.decreaseZoom = null;
  }
}
