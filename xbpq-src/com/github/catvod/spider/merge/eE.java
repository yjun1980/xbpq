/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class eE {
    public static eE l8 = new eE();

    public static String l8(String object) {
        object = new FutureTask<String>(new Callable<String>((String)object, new StringBuilder()){
            final StringBuilder S;
            final String l8;
            {
                this.l8 = string;
                this.S = stringBuilder;
            }

            /*
             * Loose catch block
             * WARNING - void declaration
             */
            public String l8() {
                void var1_6;
                block23: {
                    Object object;
                    InputStreamReader inputStreamReader;
                    block21: {
                        InputStreamReader inputStreamReader2;
                        block22: {
                            void var5_15;
                            Object object2;
                            block20: {
                                object2 = new URL(this.l8);
                                object2 = ((URL)object2).openConnection();
                                ((URLConnection)object2).connect();
                                inputStreamReader = new InputStreamReader(((URLConnection)object2).getInputStream());
                                object2 = new BufferedReader(inputStreamReader);
                                while (true) {
                                    object = object2;
                                    inputStreamReader2 = inputStreamReader;
                                    String string = ((BufferedReader)object2).readLine();
                                    if (string == null) break;
                                    object = object2;
                                    inputStreamReader2 = inputStreamReader;
                                    this.S.append(string);
                                    continue;
                                    break;
                                }
                                object = object2;
                                inputStreamReader2 = inputStreamReader;
                                System.out.println(this.S.toString());
                                ((BufferedReader)object2).close();
                                inputStreamReader.close();
                                catch (Exception exception) {
                                    break block20;
                                }
                                catch (Throwable throwable) {
                                    object = null;
                                    break block21;
                                }
                                catch (Exception exception) {
                                    object2 = null;
                                    break block20;
                                }
                                catch (Throwable throwable) {
                                    inputStreamReader = null;
                                    object = null;
                                    break block21;
                                }
                                catch (Exception exception) {
                                    inputStreamReader = null;
                                    object2 = null;
                                }
                            }
                            object = object2;
                            inputStreamReader2 = inputStreamReader;
                            var5_15.printStackTrace();
                            if (object2 == null) break block22;
                            ((BufferedReader)object2).close();
                            if (inputStreamReader == null) break block22;
                            try {
                                inputStreamReader.close();
                            }
                            catch (IOException iOException) {
                                iOException.printStackTrace();
                            }
                        }
                        return this.S.toString();
                        catch (Throwable throwable) {
                            inputStreamReader = inputStreamReader2;
                        }
                    }
                    if (object == null) break block23;
                    ((BufferedReader)object).close();
                    if (inputStreamReader == null) break block23;
                    try {
                        inputStreamReader.close();
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                    }
                }
                throw var1_6;
            }
        });
        new Thread((Runnable)object).start();
        try {
            object = (String)((FutureTask)object).get();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            object = null;
        }
        return object;
    }
}

