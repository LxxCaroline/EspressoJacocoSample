package com.example.hzlinxuanxuan.espressojacocosample;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by hzlinxuanxuan on 2015/11/2.
 */
public class JUnitJacocoTestRunner extends AndroidJUnitRunner {

    static {
        final String path = "/data/data/" + BuildConfig.APPLICATION_ID + "/coverage.ec";
        System.setProperty("jacoco-agent.destfile", path);
    }

    @Override
    public void finish(int resultCode, Bundle results) {
        try {
            Class rt = Class.forName("org.jacoco.agent.rt.RT");
            Method getAgent = rt.getMethod("getAgent");
            Method dump = getAgent.getReturnType().getMethod("dump", boolean.class);
            Object agent = getAgent.invoke(null);
            dump.invoke(agent, false);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        super.finish(resultCode,results);
    }
}
