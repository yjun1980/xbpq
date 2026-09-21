/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.utils.server;

import com.github.catvod.utils.server.Server;
import com.github.catvod.utils.server.ServerStart$Loader;

public class ServerStart {
    private Server a;
    private int b = 8877;

    public static ServerStart a() {
        return ServerStart$Loader.a;
    }

    public final int b() {
        return this.b;
    }

    public final void c() {
        if (this.a != null) {
            return;
        }
        while (true) {
            try {
                Server server;
                this.a = server = new Server(this.b);
                server.q();
            }
            catch (Exception exception) {
                ++this.b;
                this.a.r();
                this.a = null;
                if (this.b < 9999) continue;
            }
            break;
        }
    }
}

