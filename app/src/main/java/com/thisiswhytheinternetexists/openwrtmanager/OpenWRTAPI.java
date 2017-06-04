package com.thisiswhytheinternetexists.openwrtmanager;

import com.google.gson.Gson;
import com.thisiswhytheinternetexists.openwrtmanager.api.OpenWRTStatus;

import java.net.InetAddress;

/**
 * Created by flix on 28/06/16.
 */
public class OpenWRTAPI {

    public static boolean IsRunningOpenWRT(InetAddress ip) {
        return HttpUtils.getStatusCode("http:/" + ip.toString() + "/cgi-bin/luci") == 403;
    }

    public static OpenWRTStatus GetStatus(InetAddress ip, String token) {
        Gson gson = new Gson();
        String contents = HttpUtils.getContents("http:/" + ip.toString() + "/cgi-bin/luci/?status=1", token);
        return gson.fromJson(contents, OpenWRTStatus.class);
    }

}

