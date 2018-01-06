package com.example.eventbuslibrarytutorial;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by aruna on 1/6/18.
 */

public class GlobalBus {

    private static EventBus sBus;
    public static EventBus getBus() {
        if (sBus == null)
            sBus = EventBus.getDefault();
        return sBus;
    }

}
