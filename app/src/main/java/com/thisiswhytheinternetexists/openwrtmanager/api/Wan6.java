
package com.thisiswhytheinternetexists.openwrtmanager.api;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wan6 implements Serializable, Parcelable
{

    @SerializedName("ifname")
    @Expose
    private String ifname;
    @SerializedName("dns")
    @Expose
    private List<Object> dns = null;
    @SerializedName("ip6addr")
    @Expose
    private String ip6addr;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("gw6addr")
    @Expose
    private String gw6addr;
    @SerializedName("uptime")
    @Expose
    private int uptime;
    public final static Parcelable.Creator<Wan6> CREATOR = new Creator<Wan6>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Wan6 createFromParcel(Parcel in) {
            Wan6 instance = new Wan6();
            instance.ifname = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.dns, (java.lang.Object.class.getClassLoader()));
            instance.ip6addr = ((String) in.readValue((String.class.getClassLoader())));
            instance.link = ((String) in.readValue((String.class.getClassLoader())));
            instance.gw6addr = ((String) in.readValue((String.class.getClassLoader())));
            instance.uptime = ((int) in.readValue((int.class.getClassLoader())));
            return instance;
        }

        public Wan6 [] newArray(int size) {
            return (new Wan6[size]);
        }

    }
    ;
    private final static long serialVersionUID = 7503553655602558513L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wan6() {
    }

    /**
     * 
     * @param ip6addr
     * @param ifname
     * @param link
     * @param uptime
     * @param dns
     * @param gw6addr
     */
    public Wan6(String ifname, List<Object> dns, String ip6addr, String link, String gw6addr, int uptime) {
        super();
        this.ifname = ifname;
        this.dns = dns;
        this.ip6addr = ip6addr;
        this.link = link;
        this.gw6addr = gw6addr;
        this.uptime = uptime;
    }

    public String getIfname() {
        return ifname;
    }

    public void setIfname(String ifname) {
        this.ifname = ifname;
    }

    public Wan6 withIfname(String ifname) {
        this.ifname = ifname;
        return this;
    }

    public List<Object> getDns() {
        return dns;
    }

    public void setDns(List<Object> dns) {
        this.dns = dns;
    }

    public Wan6 withDns(List<Object> dns) {
        this.dns = dns;
        return this;
    }

    public String getIp6addr() {
        return ip6addr;
    }

    public void setIp6addr(String ip6addr) {
        this.ip6addr = ip6addr;
    }

    public Wan6 withIp6addr(String ip6addr) {
        this.ip6addr = ip6addr;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Wan6 withLink(String link) {
        this.link = link;
        return this;
    }

    public String getGw6addr() {
        return gw6addr;
    }

    public void setGw6addr(String gw6addr) {
        this.gw6addr = gw6addr;
    }

    public Wan6 withGw6addr(String gw6addr) {
        this.gw6addr = gw6addr;
        return this;
    }

    public int getUptime() {
        return uptime;
    }

    public void setUptime(int uptime) {
        this.uptime = uptime;
    }

    public Wan6 withUptime(int uptime) {
        this.uptime = uptime;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(ifname);
        dest.writeList(dns);
        dest.writeValue(ip6addr);
        dest.writeValue(link);
        dest.writeValue(gw6addr);
        dest.writeValue(uptime);
    }

    public int describeContents() {
        return  0;
    }

}
