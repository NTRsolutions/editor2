// Generated code from Butter Knife. Do not modify!
package org.fossasia.phimpme.gallery.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.fossasia.phimpme.R;

public class SplashScreen_ViewBinding implements Unbinder {
  private SplashScreen target;

  @UiThread
  public SplashScreen_ViewBinding(SplashScreen target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SplashScreen_ViewBinding(SplashScreen target, View source) {
    this.target = target;

    target.parentView = Utils.findRequiredViewAsType(source, R.id.splash_bg, "field 'parentView'", RelativeLayout.class);
    target.logoView = Utils.findRequiredViewAsType(source, R.id.icon_my, "field 'logoView'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SplashScreen target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.parentView = null;
    target.logoView = null;
  }
}
