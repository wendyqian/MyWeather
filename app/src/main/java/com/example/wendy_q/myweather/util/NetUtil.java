package com.example.wendy_q.myweather.util;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo.State;

/**
 * Created by Wendy_Q on 2015/3/24.
 */
public class NetUtil {
    public static final int NETWORK_NONE=0;
    public static final int NETWORK_WIFI=1;
    public static final int NETWORK_MOBILE=2;
    public static int getNetworkState(Context context){
        ConnectivityManager connManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        State state =connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState();
        if (state == State.CONNECTED||state == State.CONNECTING){
            return NETWORK_MOBILE;
        }
        return NETWORK_NONE;

    }
}
