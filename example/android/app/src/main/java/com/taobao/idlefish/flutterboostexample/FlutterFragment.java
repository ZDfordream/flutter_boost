package com.taobao.idlefish.flutterboostexample;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.taobao.idlefish.flutterboost.containers.BoostFlutterFragment;

import java.util.HashMap;
import java.util.Map;

import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class FlutterFragment extends BoostFlutterFragment {

    @Override
    public void setArguments(@Nullable Bundle args) {
        if(args == null) {
            args = new Bundle();
            args.putString("tag","");
        }
        super.setArguments(args);
    }

    public void setTabTag(String tag) {
        Bundle args = new Bundle();
        args.putString("tag",tag);
        super.setArguments(args);
    }

    @Override
    public String getContainerUrl() {
        return "flutterFragment";
    }

    @Override
    public Map getContainerUrlParams() {
        Map<String,String> params = new HashMap<>();
        params.put("tag",getArguments().getString("tag"));
        return params;
    }

    public static FlutterFragment instance(String tag){
        FlutterFragment fragment = new FlutterFragment();
        fragment.setTabTag(tag);
        return fragment;
    }
}
