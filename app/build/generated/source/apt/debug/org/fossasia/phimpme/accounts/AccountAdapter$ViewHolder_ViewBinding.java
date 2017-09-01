// Generated code from Butter Knife. Do not modify!
package org.fossasia.phimpme.accounts;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.fossasia.phimpme.R;

public class AccountAdapter$ViewHolder_ViewBinding implements Unbinder {
  private AccountAdapter.ViewHolder target;

  @UiThread
  public AccountAdapter$ViewHolder_ViewBinding(AccountAdapter.ViewHolder target, View source) {
    this.target = target;

    target.accountAvatar = Utils.findRequiredViewAsType(source, R.id.account_avatar, "field 'accountAvatar'", ImageView.class);
    target.accountLogoIndicator = Utils.findRequiredViewAsType(source, R.id.account_logo_indicator, "field 'accountLogoIndicator'", ImageView.class);
    target.accountName = Utils.findRequiredViewAsType(source, R.id.account_username, "field 'accountName'", TextView.class);
    target.signInSignOutSwitch = Utils.findRequiredViewAsType(source, R.id.sign_in_sign_out_switch, "field 'signInSignOutSwitch'", SwitchCompat.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AccountAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.accountAvatar = null;
    target.accountLogoIndicator = null;
    target.accountName = null;
    target.signInSignOutSwitch = null;
  }
}
