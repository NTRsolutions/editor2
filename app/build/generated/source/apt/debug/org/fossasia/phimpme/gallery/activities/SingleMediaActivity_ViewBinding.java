// Generated code from Butter Knife. Do not modify!
package org.fossasia.phimpme.gallery.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.fossasia.phimpme.R;
import org.fossasia.phimpme.gallery.views.PagerRecyclerView;

public class SingleMediaActivity_ViewBinding implements Unbinder {
  private SingleMediaActivity target;

  @UiThread
  public SingleMediaActivity_ViewBinding(SingleMediaActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SingleMediaActivity_ViewBinding(SingleMediaActivity target, View source) {
    this.target = target;

    target.parentView = source.findViewById(R.id.PhotoPager_Layout);
    target.bottomBar = Utils.findOptionalViewAsType(source, R.id.toolbar_bottom, "field 'bottomBar'", ActionMenuView.class);
    target.imgView = Utils.findOptionalViewAsType(source, R.id.img, "field 'imgView'", ImageView.class);
    target.mViewPager = Utils.findOptionalViewAsType(source, R.id.photos_pager, "field 'mViewPager'", PagerRecyclerView.class);
    target.toolbar = Utils.findOptionalViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SingleMediaActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.parentView = null;
    target.bottomBar = null;
    target.imgView = null;
    target.mViewPager = null;
    target.toolbar = null;
  }
}
