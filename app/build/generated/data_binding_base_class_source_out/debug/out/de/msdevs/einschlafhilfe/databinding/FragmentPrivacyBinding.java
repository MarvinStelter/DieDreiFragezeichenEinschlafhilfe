// Generated by view binder compiler. Do not edit!
package de.msdevs.einschlafhilfe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import de.msdevs.einschlafhilfe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPrivacyBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView tvPrivacy;

  @NonNull
  public final WebView webview;

  private FragmentPrivacyBinding(@NonNull RelativeLayout rootView, @NonNull TextView tvPrivacy,
      @NonNull WebView webview) {
    this.rootView = rootView;
    this.tvPrivacy = tvPrivacy;
    this.webview = webview;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPrivacyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPrivacyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_privacy, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPrivacyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_privacy;
      TextView tvPrivacy = ViewBindings.findChildViewById(rootView, id);
      if (tvPrivacy == null) {
        break missingId;
      }

      id = R.id.webview;
      WebView webview = ViewBindings.findChildViewById(rootView, id);
      if (webview == null) {
        break missingId;
      }

      return new FragmentPrivacyBinding((RelativeLayout) rootView, tvPrivacy, webview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}