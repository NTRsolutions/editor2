// Generated code from Butter Knife. Do not modify!
package org.fossasia.phimpme.opencamera.Camera;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.fossasia.phimpme.R;
import uk.co.senab.photoview.PhotoView;

public class PhotoActivity_ViewBinding implements Unbinder {
  private PhotoActivity target;

  @UiThread
  public PhotoActivity_ViewBinding(PhotoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PhotoActivity_ViewBinding(PhotoActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.parent = Utils.findRequiredView(source, R.id.parentLayout, "field 'parent'");
    target.imageView = Utils.findRequiredViewAsType(source, R.id.imageView, "field 'imageView'", PhotoView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PhotoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.parent = null;
    target.imageView = null;
  }
}
