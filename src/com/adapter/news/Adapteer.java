package com.adapter.news;

import com.adapter.Adapter;
import com.adapter.classes.Target;
import com.adapter.classes.TargetImpl;

/**
 * @ClassName Adapteer
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/06/11:19
 * @Version 1.0
 **/
public class Adapteer implements Target {

    private Adapter adapter;

    public Adapteer(Adapter adapter){
        this.adapter=adapter;
    }


    @Override
    public String getAdapetName() {
        return this.adapter.getName();
    }

    public static void main(String[] args) {
        TargetImpl target =new TargetImpl();
        System.out.println(target.getAdapetName());
        System.out.println("****************");
        Adapteer adapteer =new Adapteer(new Adapter());
        System.out.println(adapteer.getAdapetName());
    }


}
