// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.jazzylistview.effects;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import com.nineoldandroids.view.ViewPropertyAnimator;
import com.twotoasters.jazzylistview.JazzyEffect;

public class ReverseFlyEffect
    implements JazzyEffect
{

    private static final int a = 135;

    public ReverseFlyEffect()
    {
    }

    public void initView(View view, int i, int j)
    {
        ViewHelper.setPivotX(view, view.getWidth() / 2);
        ViewHelper.setPivotY(view, view.getHeight() / 2);
        ViewHelper.setRotationX(view, j * 135);
        ViewHelper.setTranslationY(view, j * (2 * -view.getHeight()));
    }

    public void setupAnimation(View view, int i, int j, ViewPropertyAnimator viewpropertyanimator)
    {
        viewpropertyanimator.rotationXBy(j * -135).translationYBy(j * (2 * view.getHeight()));
    }
}
