// Generated code from Butter Knife. Do not modify!
package org.fossasia.phimpme.uploadhistory;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.fossasia.phimpme.R;

public class UploadHistory_ViewBinding implements Unbinder {
  private UploadHistory target;

  @UiThread
  public UploadHistory_ViewBinding(UploadHistory target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public UploadHistory_ViewBinding(UploadHistory target, View source) {
    this.target = target;

    target.uploadHistoryRecyclerView = Utils.findRequiredViewAsType(source, R.id.upload_history_recycler_view, "field 'uploadHistoryRecyclerView'", RecyclerView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.coordinatorLayout = Utils.findRequiredViewAsType(source, R.id.accounts, "field 'coordinatorLayout'", CoordinatorLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UploadHistory target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.uploadHistoryRecyclerView = null;
    target.toolbar = null;
    target.coordinatorLayout = null;
  }
}
