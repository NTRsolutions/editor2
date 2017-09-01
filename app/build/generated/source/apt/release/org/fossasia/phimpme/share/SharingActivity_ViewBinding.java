// Generated code from Butter Knife. Do not modify!
package org.fossasia.phimpme.share;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.mikepenz.iconics.view.IconicsImageView;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.fossasia.phimpme.R;
import org.fossasia.phimpme.editor.view.imagezoom.ImageViewTouch;

public class SharingActivity_ViewBinding implements Unbinder {
  private SharingActivity target;

  @UiThread
  public SharingActivity_ViewBinding(SharingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SharingActivity_ViewBinding(SharingActivity target, View source) {
    this.target = target;

    target.parent = Utils.findRequiredView(source, R.id.share_layout, "field 'parent'");
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.shareImage = Utils.findRequiredViewAsType(source, R.id.share_image, "field 'shareImage'", ImageViewTouch.class);
    target.text_caption = Utils.findRequiredViewAsType(source, R.id.edittext_share_caption, "field 'text_caption'", TextView.class);
    target.shareAccountRecyclerView = Utils.findRequiredViewAsType(source, R.id.share_account, "field 'shareAccountRecyclerView'", RecyclerView.class);
    target.editFocus = Utils.findRequiredViewAsType(source, R.id.button_mic, "field 'editFocus'", IconicsImageView.class);
    target.captionLayout = Utils.findRequiredViewAsType(source, R.id.edit_text_caption_container, "field 'captionLayout'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SharingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.parent = null;
    target.toolbar = null;
    target.shareImage = null;
    target.text_caption = null;
    target.shareAccountRecyclerView = null;
    target.editFocus = null;
    target.captionLayout = null;
  }
}
