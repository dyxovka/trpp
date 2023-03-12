package com.example.insense;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.insense.databinding.ActivityMainBindingImpl;
import com.example.insense.databinding.FragmentActivityBindingImpl;
import com.example.insense.databinding.FragmentBindingBindingImpl;
import com.example.insense.databinding.FragmentCalendarBindingImpl;
import com.example.insense.databinding.FragmentCategoriesBindingImpl;
import com.example.insense.databinding.FragmentCategoryBindingImpl;
import com.example.insense.databinding.FragmentExportBindingImpl;
import com.example.insense.databinding.FragmentImportBindingImpl;
import com.example.insense.databinding.FragmentLoginBindingImpl;
import com.example.insense.databinding.FragmentMainBindingImpl;
import com.example.insense.databinding.FragmentOccupationBindingImpl;
import com.example.insense.databinding.FragmentProfileBindingImpl;
import com.example.insense.databinding.FragmentRateOfOccupationBindingImpl;
import com.example.insense.databinding.FragmentSettingsBindingImpl;
import com.example.insense.databinding.FragmentStarterBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTACTIVITY = 2;

  private static final int LAYOUT_FRAGMENTBINDING = 3;

  private static final int LAYOUT_FRAGMENTCALENDAR = 4;

  private static final int LAYOUT_FRAGMENTCATEGORIES = 5;

  private static final int LAYOUT_FRAGMENTCATEGORY = 6;

  private static final int LAYOUT_FRAGMENTEXPORT = 7;

  private static final int LAYOUT_FRAGMENTIMPORT = 8;

  private static final int LAYOUT_FRAGMENTLOGIN = 9;

  private static final int LAYOUT_FRAGMENTMAIN = 10;

  private static final int LAYOUT_FRAGMENTOCCUPATION = 11;

  private static final int LAYOUT_FRAGMENTPROFILE = 12;

  private static final int LAYOUT_FRAGMENTRATEOFOCCUPATION = 13;

  private static final int LAYOUT_FRAGMENTSETTINGS = 14;

  private static final int LAYOUT_FRAGMENTSTARTER = 15;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(15);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.fragment_activity, LAYOUT_FRAGMENTACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.fragment_binding, LAYOUT_FRAGMENTBINDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.fragment_calendar, LAYOUT_FRAGMENTCALENDAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.fragment_categories, LAYOUT_FRAGMENTCATEGORIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.fragment_category, LAYOUT_FRAGMENTCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.fragment_export, LAYOUT_FRAGMENTEXPORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.fragment_import, LAYOUT_FRAGMENTIMPORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.fragment_occupation, LAYOUT_FRAGMENTOCCUPATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.fragment_rate_of_occupation, LAYOUT_FRAGMENTRATEOFOCCUPATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.fragment_settings, LAYOUT_FRAGMENTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.insense.R.layout.fragment_starter, LAYOUT_FRAGMENTSTARTER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTACTIVITY: {
          if ("layout/fragment_activity_0".equals(tag)) {
            return new FragmentActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBINDING: {
          if ("layout/fragment_binding_0".equals(tag)) {
            return new FragmentBindingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_binding is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCALENDAR: {
          if ("layout/fragment_calendar_0".equals(tag)) {
            return new FragmentCalendarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_calendar is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCATEGORIES: {
          if ("layout/fragment_categories_0".equals(tag)) {
            return new FragmentCategoriesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_categories is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCATEGORY: {
          if ("layout/fragment_category_0".equals(tag)) {
            return new FragmentCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_category is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXPORT: {
          if ("layout/fragment_export_0".equals(tag)) {
            return new FragmentExportBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_export is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTIMPORT: {
          if ("layout/fragment_import_0".equals(tag)) {
            return new FragmentImportBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_import is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTOCCUPATION: {
          if ("layout/fragment_occupation_0".equals(tag)) {
            return new FragmentOccupationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_occupation is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRATEOFOCCUPATION: {
          if ("layout/fragment_rate_of_occupation_0".equals(tag)) {
            return new FragmentRateOfOccupationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_rate_of_occupation is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTINGS: {
          if ("layout/fragment_settings_0".equals(tag)) {
            return new FragmentSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTARTER: {
          if ("layout/fragment_starter_0".equals(tag)) {
            return new FragmentStarterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_starter is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(15);

    static {
      sKeys.put("layout/activity_main_0", com.example.insense.R.layout.activity_main);
      sKeys.put("layout/fragment_activity_0", com.example.insense.R.layout.fragment_activity);
      sKeys.put("layout/fragment_binding_0", com.example.insense.R.layout.fragment_binding);
      sKeys.put("layout/fragment_calendar_0", com.example.insense.R.layout.fragment_calendar);
      sKeys.put("layout/fragment_categories_0", com.example.insense.R.layout.fragment_categories);
      sKeys.put("layout/fragment_category_0", com.example.insense.R.layout.fragment_category);
      sKeys.put("layout/fragment_export_0", com.example.insense.R.layout.fragment_export);
      sKeys.put("layout/fragment_import_0", com.example.insense.R.layout.fragment_import);
      sKeys.put("layout/fragment_login_0", com.example.insense.R.layout.fragment_login);
      sKeys.put("layout/fragment_main_0", com.example.insense.R.layout.fragment_main);
      sKeys.put("layout/fragment_occupation_0", com.example.insense.R.layout.fragment_occupation);
      sKeys.put("layout/fragment_profile_0", com.example.insense.R.layout.fragment_profile);
      sKeys.put("layout/fragment_rate_of_occupation_0", com.example.insense.R.layout.fragment_rate_of_occupation);
      sKeys.put("layout/fragment_settings_0", com.example.insense.R.layout.fragment_settings);
      sKeys.put("layout/fragment_starter_0", com.example.insense.R.layout.fragment_starter);
    }
  }
}
