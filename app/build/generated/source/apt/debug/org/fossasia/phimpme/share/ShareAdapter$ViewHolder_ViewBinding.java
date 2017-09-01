// Generated code from Butter Knife. Do not modify!
package org.fossasia.phimpme.share;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.fossasia.phimpme.R;

public class ShareAdapter$ViewHolder_ViewBinding implements Unbinder {
  private ShareAdapter.ViewHolder target;

  @UiThread
  public ShareAdapter$ViewHolder_ViewBinding(ShareAdapter.ViewHolder target, View source) {
    this.target = target;

    target.accountImage = Utils.findRequiredViewAsType(source, R.id.account_image, "field 'accountImage'", ImageView.class);
    target.accountName = Utils.findRequiredViewAsType(source, R.id.account_name, "field 'accountName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ShareAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.accountImage = null;
    target.accountName = null;
  }
}
