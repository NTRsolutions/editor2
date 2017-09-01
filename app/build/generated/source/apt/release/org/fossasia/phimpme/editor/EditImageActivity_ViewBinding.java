// Generated code from Butter Knife. Do not modify!
package org.fossasia.phimpme.editor;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.fossasia.phimpme.R;
import org.fossasia.phimpme.editor.view.CropImageView;
import org.fossasia.phimpme.editor.view.CustomPaintView;
import org.fossasia.phimpme.editor.view.RotateImageView;
import org.fossasia.phimpme.editor.view.StickerView;
import org.fossasia.phimpme.editor.view.TextStickerView;
import org.fossasia.phimpme.editor.view.imagezoom.ImageViewTouch;

public class EditImageActivity_ViewBinding implements Unbinder {
  private EditImageActivity target;

  @UiThread
  public EditImageActivity_ViewBinding(EditImageActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EditImageActivity_ViewBinding(EditImageActivity target, View source) {
    this.target = target;

    target.mainImage = Utils.findOptionalViewAsType(source, R.id.main_image, "field 'mainImage'", ImageViewTouch.class);
    target.parentLayout = source.findViewById(R.id.parentLayout);
    target.cancel = Utils.findOptionalViewAsType(source, R.id.edit_cancel, "field 'cancel'", ImageButton.class);
    target.save = Utils.findOptionalViewAsType(source, R.id.edit_save, "field 'save'", ImageButton.class);
    target.bef_aft = Utils.findOptionalViewAsType(source, R.id.edit_befaft, "field 'bef_aft'", ImageButton.class);
    target.undo = Utils.findOptionalViewAsType(source, R.id.edit_undo, "field 'undo'", ImageButton.class);
    target.redo = Utils.findOptionalViewAsType(source, R.id.edit_redo, "field 'redo'", ImageButton.class);
    target.progressBar = Utils.findOptionalViewAsType(source, R.id.progress_bar_edit, "field 'progressBar'", ProgressBar.class);
    target.mStickerView = Utils.findOptionalViewAsType(source, R.id.sticker_panel, "field 'mStickerView'", StickerView.class);
    target.mCropPanel = Utils.findOptionalViewAsType(source, R.id.crop_panel, "field 'mCropPanel'", CropImageView.class);
    target.mRotatePanel = Utils.findOptionalViewAsType(source, R.id.rotate_panel, "field 'mRotatePanel'", RotateImageView.class);
    target.mTextStickerView = Utils.findOptionalViewAsType(source, R.id.text_sticker_panel, "field 'mTextStickerView'", TextStickerView.class);
    target.mPaintView = Utils.findOptionalViewAsType(source, R.id.custom_paint_view, "field 'mPaintView'", CustomPaintView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EditImageActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mainImage = null;
    target.parentLayout = null;
    target.cancel = null;
    target.save = null;
    target.bef_aft = null;
    target.undo = null;
    target.redo = null;
    target.progressBar = null;
    target.mStickerView = null;
    target.mCropPanel = null;
    target.mRotatePanel = null;
    target.mTextStickerView = null;
    target.mPaintView = null;
  }
}
