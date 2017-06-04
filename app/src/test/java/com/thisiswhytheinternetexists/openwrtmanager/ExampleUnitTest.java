package com.thisiswhytheinternetexists.openwrtmanager;

import com.google.gson.Gson;
import com.thisiswhytheinternetexists.openwrtmanager.api.OpenWRTStatus;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {


    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void OpenWrt_ParsesResponse() {
        String s = "{\n" +
                "  \"swap\": {\n" +
                "    \"free\": 0,\n" +
                "    \"total\": 0\n" +
                "  },\n" +
                "  \"conncount\": 527,\n" +
                "  \"leases\": [\n" +
                "    {\n" +
                "      \"expires\": 28212,\n" +
                "      \"macaddr\": \"01:23:45:67:89:AB\",\n" +
                "      \"ipaddr\": \"192.168.1.113\",\n" +
                "      \"hostname\": \"Felixs-MBP\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"leases6\": [],\n" +
                "  \"wan6\": {\n" +
                "    \"ifname\": \"6in4-wan6\",\n" +
                "    \"dns\": [],\n" +
                "    \"ip6addr\": \"2001:012:3456:789::2/64\",\n" +
                "    \"link\": \"/cgi-bin/luci/admin/network/network/wan6\",\n" +
                "    \"gw6addr\": \"::\",\n" +
                "    \"uptime\": 5367254\n" +
                "  },\n" +
                "  \"memory\": {\n" +
                "    \"buffered\": 1667072,\n" +
                "    \"total\": 128212992,\n" +
                "    \"shared\": 5787648,\n" +
                "    \"free\": 55984128\n" +
                "  },\n" +
                "  \"uptime\": 5367327,\n" +
                "  \"wifinets\": [\n" +
                "    {\n" +
                "      \"device\": \"radio0\",\n" +
                "      \"networks\": [\n" +
                "        {\n" +
                "          \"ifname\": \"wlan0\",\n" +
                "          \"disabled\": false,\n" +
                "          \"encryption\": \"WPA2 PSK (CCMP)\",\n" +
                "          \"bssid\": \"01:23:45:67:89:01\",\n" +
                "          \"mode\": \"Master\",\n" +
                "          \"quality\": 74,\n" +
                "          \"noise\": -108,\n" +
                "          \"ssid\": \"FliX 5GHz\",\n" +
                "          \"link\": \"/cgi-bin/luci/admin/network/wireless/radio0.network1\",\n" +
                "          \"assoclist\": {\n" +
                "            \"10:20:30:40:50:60\": {\n" +
                "              \"noise\": 0,\n" +
                "              \"rx_vht\": false,\n" +
                "              \"rx_mhz\": 20,\n" +
                "              \"tx_ht\": false,\n" +
                "              \"tx_vht\": false,\n" +
                "              \"tx_rate\": 6000,\n" +
                "              \"tx_packets\": 2283,\n" +
                "              \"tx_mhz\": 20,\n" +
                "              \"rx_packets\": 3360,\n" +
                "              \"inactive\": 0,\n" +
                "              \"rx_ht\": false,\n" +
                "              \"rx_rate\": 6000,\n" +
                "              \"signal\": -56\n" +
                "            }\n" +
                "          },\n" +
                "          \"txpoweroff\": 0,\n" +
                "          \"bitrate\": 6,\n" +
                "          \"txpower\": 20,\n" +
                "          \"name\": \"Master \\\"FliX 5GHz\\\"\",\n" +
                "          \"channel\": 149,\n" +
                "          \"country\": \"NZ\",\n" +
                "          \"signal\": -58,\n" +
                "          \"up\": true,\n" +
                "          \"frequency\": \"5.745\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"Generic 802.11ac Wireless Controller (radio0)\",\n" +
                "      \"up\": false\n" +
                "    },\n" +
                "    {\n" +
                "      \"device\": \"radio1\",\n" +
                "      \"networks\": [\n" +
                "        {\n" +
                "          \"ifname\": \"wlan1\",\n" +
                "          \"disabled\": false,\n" +
                "          \"encryption\": \"WPA2 PSK (CCMP)\",\n" +
                "          \"bssid\": \"01:23:45:67:89:02\",\n" +
                "          \"mode\": \"Master\",\n" +
                "          \"quality\": 82,\n" +
                "          \"noise\": -89,\n" +
                "          \"ssid\": \"FliX\",\n" +
                "          \"link\": \"/cgi-bin/luci/admin/network/wireless/radio1.network1\",\n" +
                "          \"assoclist\": {\n" +
                "            \"10:20:30:40:50:62\": {\n" +
                "              \"tx_mcs\": 5,\n" +
                "              \"noise\": -89,\n" +
                "              \"tx_ht\": true,\n" +
                "              \"rx_vht\": false,\n" +
                "              \"rx_mhz\": 20,\n" +
                "              \"tx_40mhz\": false,\n" +
                "              \"tx_short_gi\": false,\n" +
                "              \"tx_vht\": false,\n" +
                "              \"tx_rate\": 52000,\n" +
                "              \"tx_packets\": 11044,\n" +
                "              \"tx_mhz\": 20,\n" +
                "              \"rx_packets\": 13015,\n" +
                "              \"inactive\": 5150,\n" +
                "              \"rx_ht\": false,\n" +
                "              \"rx_rate\": 5500,\n" +
                "              \"signal\": -64\n" +
                "            }\n" +
                "          },\n" +
                "          \"txpoweroff\": 0,\n" +
                "          \"bitrate\": 121.3,\n" +
                "          \"txpower\": 13,\n" +
                "          \"name\": \"Master \\\"FliX\\\"\",\n" +
                "          \"channel\": 1,\n" +
                "          \"country\": \"NZ\",\n" +
                "          \"signal\": -52,\n" +
                "          \"up\": true,\n" +
                "          \"frequency\": \"2.412\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"Generic 802.11bgn Wireless Controller (radio1)\",\n" +
                "      \"up\": true\n" +
                "    }\n" +
                "  ],\n" +
                "  \"wan\": {\n" +
                "    \"proto\": \"dhcp\",\n" +
                "    \"ipaddr\": \"1.2.3.4\",\n" +
                "    \"link\": \"/cgi-bin/luci/admin/network/network/wan\",\n" +
                "    \"netmask\": \"255.255.254.0\",\n" +
                "    \"gwaddr\": \"1.2.3.1\",\n" +
                "    \"expires\": 75946,\n" +
                "    \"uptime\": 5367254,\n" +
                "    \"ifname\": \"eth0\",\n" +
                "    \"dns\": [\n" +
                "      \"8.8.8.8\",\n" +
                "      \"8.8.4.4\"\n" +
                "    ]\n" +
                "  },\n" +
                "  \"localtime\": \"Sun Jun  4 15:48:02 2017\",\n" +
                "  \"connmax\": 16384,\n" +
                "  \"loadavg\": [\n" +
                "    288,\n" +
                "    1888,\n" +
                "    0\n" +
                "  ]\n" +
                "}";

        Gson gson = new Gson();
        OpenWRTStatus status = gson.fromJson(s, OpenWRTStatus.class);

        assertEquals(5367327, status.getUptime());
        assertEquals(status.getLeases().size(), 1);
    }
}