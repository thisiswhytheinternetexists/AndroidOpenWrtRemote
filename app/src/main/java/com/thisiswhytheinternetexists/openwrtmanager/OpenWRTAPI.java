package com.thisiswhytheinternetexists.openwrtmanager;

import java.net.InetAddress;

/**
 * Created by flix on 28/06/16.
 */
public class OpenWRTAPI {
    public static boolean IsRunningOpenWRT(InetAddress ip) {
        int rspCode = HttpUtils.getStatusCode("http://" + ip.toString() + "/cgi-bin/luci");
        if(rspCode == 403 || rspCode == 200) {
            return true;
        } else {
            return false;
        }
    }
}
