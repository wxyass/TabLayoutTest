package com.tablayout.fragment.fourth;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.tablayout.R;
import com.tablayout.SecondActivity;
import com.tablayout.base.BaseFragment;
import com.tablayout.base.BaseMainFragment;
import com.tablayout.fragment.fourth.child.RepwdFragment;


/**
 * 第四个导航页
 * <p>
 * Created by wxyass on 2018/8/17.
 */
public class SyssettingFragment extends BaseMainFragment implements View.OnClickListener {


    RelativeLayout repwd;
    RelativeLayout question;
    RelativeLayout exit;

    public SyssettingFragment() {
    }

    public static SyssettingFragment newInstance() {
        Bundle args = new Bundle();
        SyssettingFragment fragment = new SyssettingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_syssetting, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {

        repwd = (RelativeLayout) view.findViewById(R.id.dd_system_rl_repwd);
        question = (RelativeLayout) view.findViewById(R.id.dd_system_rl_question);
        exit = (RelativeLayout) view.findViewById(R.id.dd_system_rl_exit);

        repwd.setOnClickListener(this);
        question.setOnClickListener(this);
        exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dd_system_rl_repwd:// 修改密码
                ((BaseFragment) getParentFragment()).start(new RepwdFragment());
                break;
            case R.id.dd_system_rl_question:// 问题反馈
                _mActivity.startActivity(new Intent(_mActivity, SecondActivity.class));
                break;
            case R.id.dd_system_rl_exit:// 退出系统
                System.exit(0);
                break;
        }
    }


    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);

    }
}
