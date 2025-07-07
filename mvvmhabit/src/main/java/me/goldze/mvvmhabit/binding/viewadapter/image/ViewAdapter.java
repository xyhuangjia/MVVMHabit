package me.goldze.mvvmhabit.binding.viewadapter.image;

import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;

import androidx.databinding.BindingAdapter;

/**
 * Created by goldze on 2017/6/18.
 */
public final class ViewAdapter {
    @BindingAdapter(value = {"url", "placeholderRes", "round"}, requireAll = false)
    public static void setImageUri(ImageView imageView, String url, int placeholderRes,boolean round) {
        if (!TextUtils.isEmpty(url)) {
            //使用Glide框架加载图片
            if (round) {
                Glide.with(imageView.getContext())
                        .load(url)
                        .apply(new RequestOptions().placeholder(placeholderRes))
                        .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                        .into(imageView);
            } else {
                Glide.with(imageView.getContext())
                        .load(url)
                        .apply(new RequestOptions().placeholder(placeholderRes))
                        .into(imageView);
            }
        }
    }
}

