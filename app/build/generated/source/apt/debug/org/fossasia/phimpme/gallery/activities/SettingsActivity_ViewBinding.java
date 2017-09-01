// Generated code from Butter Knife. Do not modify!
package org.fossasia.phimpme.gallery.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.fossasia.phimpme.R;

public class SettingsActivity_ViewBinding implements Unbinder {
  private SettingsActivity target;

  @UiThread
  public SettingsActivity_ViewBinding(SettingsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SettingsActivity_ViewBinding(SettingsActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.scr = Utils.findRequiredViewAsType(source, R.id.settingAct_scrollView, "field 'scr'", ScrollView.class);
    target.txtGT = Utils.findRequiredViewAsType(source, R.id.general_setting_title, "field 'txtGT'", TextView.class);
    target.txtTT = Utils.findRequiredViewAsType(source, R.id.theme_setting_title, "field 'txtTT'", TextView.class);
    target.txtPT = Utils.findRequiredViewAsType(source, R.id.picture_setting_title, "field 'txtPT'", TextView.class);
    target.txtAT = Utils.findRequiredViewAsType(source, R.id.advanced_setting_title, "field 'txtAT'", TextView.class);
    target.parent = Utils.findRequiredView(source, R.id.setting_background, "field 'parent'");
  }

  @Override
  @CallSuper
  public void unbind() {
    SettingsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.scr = null;
    target.txtGT = null;
    target.txtTT = null;
    target.txtPT = null;
    target.txtAT = null;
    target.parent = null;
  }
}
