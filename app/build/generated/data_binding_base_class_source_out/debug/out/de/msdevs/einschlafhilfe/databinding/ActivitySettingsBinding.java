// Generated by view binder compiler. Do not edit!
package de.msdevs.einschlafhilfe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import de.msdevs.einschlafhilfe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySettingsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final SwitchCompat swUpdateList;

  @NonNull
  public final SwitchCompat swUseSpotify;

  @NonNull
  public final TextView tvSpotify;

  @NonNull
  public final TextView tvUpdateList;

  private ActivitySettingsBinding(@NonNull RelativeLayout rootView,
      @NonNull SwitchCompat swUpdateList, @NonNull SwitchCompat swUseSpotify,
      @NonNull TextView tvSpotify, @NonNull TextView tvUpdateList) {
    this.rootView = rootView;
    this.swUpdateList = swUpdateList;
    this.swUseSpotify = swUseSpotify;
    this.tvSpotify = tvSpotify;
    this.tvUpdateList = tvUpdateList;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.sw_update_list;
      SwitchCompat swUpdateList = ViewBindings.findChildViewById(rootView, id);
      if (swUpdateList == null) {
        break missingId;
      }

      id = R.id.sw_use_spotify;
      SwitchCompat swUseSpotify = ViewBindings.findChildViewById(rootView, id);
      if (swUseSpotify == null) {
        break missingId;
      }

      id = R.id.tv_spotify;
      TextView tvSpotify = ViewBindings.findChildViewById(rootView, id);
      if (tvSpotify == null) {
        break missingId;
      }

      id = R.id.tv_update_list;
      TextView tvUpdateList = ViewBindings.findChildViewById(rootView, id);
      if (tvUpdateList == null) {
        break missingId;
      }

      return new ActivitySettingsBinding((RelativeLayout) rootView, swUpdateList, swUseSpotify,
          tvSpotify, tvUpdateList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}