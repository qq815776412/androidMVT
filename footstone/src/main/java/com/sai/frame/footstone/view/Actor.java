package com.sai.frame.footstone.view;

import android.os.Bundle;
import android.view.ActionMode;

/**
 * Created by sai on 17/12/1.
 */

public abstract class Actor {

    Actor mActor;

    Actor(Actor actor){
        mActor = actor;
    }

    public void onCreate(PolymorphicActivity polymorphicActivity){
        if(mActor != null)
            mActor.onCreate(polymorphicActivity);

        executeCreate(polymorphicActivity);
    }

    public void onStart(PolymorphicActivity polymorphicActivity){
        if(mActor != null)
            mActor.onStart(polymorphicActivity);

        executeStart(polymorphicActivity);
    }

    public void onRestart(PolymorphicActivity polymorphicActivity){
        if(mActor != null)
            mActor.onRestart(polymorphicActivity);

        executeRestart(polymorphicActivity);
    }

    public void onResume(PolymorphicActivity polymorphicActivity){
        if(mActor != null)
            mActor.onResume(polymorphicActivity);

        executeResume(polymorphicActivity);
    }

    public void onPause(PolymorphicActivity polymorphicActivity){
        if(mActor != null)
            mActor.onPause(polymorphicActivity);

        executePause(polymorphicActivity);
    }

    public void onStop(PolymorphicActivity polymorphicActivity){
        if(mActor != null)
            mActor.onStop(polymorphicActivity);

        executeStop(polymorphicActivity);
    }

    public void onDestroy(PolymorphicActivity polymorphicActivity){
        if(mActor != null)
            mActor.onDestroy(polymorphicActivity);

        executeDestroy(polymorphicActivity);
    }

    public void onSaveInstanceState(PolymorphicActivity polymorphicActivity, Bundle outState){
        if(mActor != null)
            mActor.onSaveInstanceState(polymorphicActivity, outState);

        executeSaveInstanceState(polymorphicActivity, outState);
    }

    public void onRestoreInstanceState(PolymorphicActivity polymorphicActivity, Bundle savedInstanceState){
        if(mActor != null)
            mActor.onRestoreInstanceState(polymorphicActivity, savedInstanceState);

        executeRestoreInstanceState(polymorphicActivity, savedInstanceState);
    }

    public void onActionModeStarted(ActionMode mode) {
        if(mActor != null)
            mActor.onActionModeStarted(mode);

        executeActionModeStarted(mode);
    }

    public void onActionModeFinished(ActionMode mode) {
        if(mActor != null)
            mActor.onActionModeFinished(mode);

        executeActionModeFinished(mode);
    }

    public void onCommand(String command, Object info){
        if (mActor != null)
            mActor.onCommand(command, info);

        executeCommand(command, info);
    }

    public abstract void executeCreate(PolymorphicActivity polymorphicActivity);

    public abstract void executeStart(PolymorphicActivity polymorphicActivity);

    public abstract void executeRestart(PolymorphicActivity polymorphicActivity);

    public abstract void executeResume(PolymorphicActivity polymorphicActivity);

    public abstract void executePause(PolymorphicActivity polymorphicActivity);

    public abstract void executeStop(PolymorphicActivity polymorphicActivity);

    public abstract void executeDestroy(PolymorphicActivity polymorphicActivity);

    public abstract void executeSaveInstanceState(PolymorphicActivity polymorphicActivity, Bundle outState);

    public abstract void executeRestoreInstanceState(PolymorphicActivity polymorphicActivity, Bundle savedInstanceState);

    public abstract void executeCommand(String command, Object info);

    public abstract void executeActionModeStarted(ActionMode mode);

    public abstract void executeActionModeFinished(ActionMode mode);
}