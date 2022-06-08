package com.adapter.classes;

import com.adapter.Adapter;

/**
 * @ClassName CurrAdapter
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/01/16:16
 * @Version 1.0
 **/
public class CurrAdapter extends Adapter implements Target {
    @Override
    public String getAdapetName() {
        return super.getName();
    }

    public static void main(String[] args) {
        CurrAdapter currAdapter = new CurrAdapter();
        System.out.println(currAdapter.getAdapetName());
        System.out.println("***********");
        Target target = new TargetImpl();
        System.out.println(target.getAdapetName());
    }
}
