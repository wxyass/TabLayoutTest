package com.tablayout.fragment.fourth.child;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.tablayout.R;
import com.tablayout.base.BaseFragment;


/**
 *
 * Created by wxyass on 2018/8/17.
 */
public class RepwdFragment extends BaseFragment  implements View.OnClickListener{

    RelativeLayout uploadApk;
    RelativeLayout about;

    public RepwdFragment() {
    }

    // 接收传递过来的参数
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // 初始化控件
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_repwd,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        uploadApk = (RelativeLayout) view.findViewById(R.id.dd_system_rl_upload);
        about = (RelativeLayout) view.findViewById(R.id.dd_system_rl_about);

        uploadApk.setOnClickListener(this);
        about.setOnClickListener(this);
    }

    // 加载数据
    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        initData();
    }

    private void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dd_system_rl_upload:// 检查更新

                break;
            case R.id.dd_system_rl_about:// 关于系统
                break;
        }
    }

    // 监听返回键
    @Override
    public boolean onBackPressedSupport() {
        if (getFragmentManager().getBackStackEntryCount() > 1) {
            Toast.makeText(_mActivity,"测试返回键",Toast.LENGTH_SHORT).show();
            pop();
        } else {
            ActivityCompat.finishAfterTransition(_mActivity);
        }
        return true;
    }

}
