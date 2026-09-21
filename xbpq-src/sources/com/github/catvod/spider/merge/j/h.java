package com.github.catvod.spider.merge.j;

import android.app.AlertDialog;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        Button button;
        AlertDialog alertDialog;
        WebView webView;
        WebView webView2;
        boolean z3;
        Button button2;
        z = k.m;
        if (z) {
            z3 = k.m;
            boolean unused = k.m = !z3;
            button2 = k.g;
            button2.setText(cYh.d("85C6E1"));
            k.z();
        } else {
            z2 = k.m;
            boolean unused2 = k.m = !z2;
            button = k.g;
            button.setText(cYh.d("84D3FD"));
            alertDialog = k.f;
            alertDialog.getWindow().setLayout(-1, -1);
        }
        webView = k.c;
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        webView2 = k.c;
        webView2.requestFocus();
    }
}
