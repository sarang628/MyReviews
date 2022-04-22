package com.sarang.screen_myreviews;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sarang.screen_myreviews.databinding.FragmentMyReviewsBindingImpl;
import com.sarang.screen_myreviews.databinding.ItemMyReviewBindingImpl;
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
  private static final int LAYOUT_FRAGMENTMYREVIEWS = 1;

  private static final int LAYOUT_ITEMMYREVIEW = 2;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(2);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sarang.screen_myreviews.R.layout.fragment_my_reviews, LAYOUT_FRAGMENTMYREVIEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sarang.screen_myreviews.R.layout.item_my_review, LAYOUT_ITEMMYREVIEW);
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
        case  LAYOUT_FRAGMENTMYREVIEWS: {
          if ("layout/fragment_my_reviews_0".equals(tag)) {
            return new FragmentMyReviewsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_my_reviews is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMYREVIEW: {
          if ("layout/item_my_review_0".equals(tag)) {
            return new ItemMyReviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_my_review is invalid. Received: " + tag);
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
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(3);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.example.torang_core.DataBinderMapperImpl());
    result.add(new com.sarang.torangimageloader.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "isLogin");
      sKeys.put(2, "review");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(2);

    static {
      sKeys.put("layout/fragment_my_reviews_0", com.sarang.screen_myreviews.R.layout.fragment_my_reviews);
      sKeys.put("layout/item_my_review_0", com.sarang.screen_myreviews.R.layout.item_my_review);
    }
  }
}
