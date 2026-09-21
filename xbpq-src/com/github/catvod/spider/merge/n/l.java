/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.textclassifier.TextClassificationManager
 *  android.view.textclassifier.TextClassifier
 *  android.widget.TextView
 *  androidx.core.util.Preconditions
 */
package com.github.catvod.spider.merge.n;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.Preconditions;

final class l {
    private TextView a;
    private TextClassifier b;

    l(TextView textView) {
        this.a = (TextView)Preconditions.checkNotNull((Object)textView);
    }

    public final TextClassifier a() {
        TextClassifier textClassifier;
        TextClassifier textClassifier2 = textClassifier = this.b;
        if (textClassifier == null) {
            textClassifier2 = (TextClassificationManager)this.a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassifier2 != null) {
                return textClassifier2.getTextClassifier();
            }
            textClassifier2 = TextClassifier.NO_OP;
        }
        return textClassifier2;
    }

    public final void b(TextClassifier textClassifier) {
        this.b = textClassifier;
    }
}

