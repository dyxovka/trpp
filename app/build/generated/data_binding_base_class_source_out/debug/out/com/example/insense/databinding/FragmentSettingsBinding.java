// Generated by data binding compiler. Do not edit!
package com.example.insense.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.insense.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSettingsBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton buttonBackSettings;

  @NonNull
  public final TextView textViewSettings;

  protected FragmentSettingsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton buttonBackSettings, TextView textViewSettings) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonBackSettings = buttonBackSettings;
    this.textViewSettings = textViewSettings;
  }

  @NonNull
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_settings, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSettingsBinding>inflateInternal(inflater, R.layout.fragment_settings, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_settings, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSettingsBinding>inflateInternal(inflater, R.layout.fragment_settings, null, false, component);
  }

  public static FragmentSettingsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentSettingsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSettingsBinding)bind(component, view, R.layout.fragment_settings);
  }
}
