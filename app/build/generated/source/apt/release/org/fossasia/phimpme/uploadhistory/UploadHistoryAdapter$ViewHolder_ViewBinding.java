// Generated code from Butter Knife. Do not modify!
package org.fossasia.phimpme.uploadhistory;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.fossasia.phimpme.R;

public class UploadHistoryAdapter$ViewHolder_ViewBinding implements Unbinder {
  private UploadHistoryAdapter.ViewHolder target;

  @UiThread
  public UploadHistoryAdapter$ViewHolder_ViewBinding(UploadHistoryAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.uploadAccountName = Utils.findRequiredViewAsType(source, R.id.upload_account_name, "field 'uploadAccountName'", TextView.class);
    target.uploadTime = Utils.findRequiredViewAsType(source, R.id.upload_time, "field 'uploadTime'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UploadHistoryAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.uploadAccountName = null;
    target.uploadTime = null;
  }
}
