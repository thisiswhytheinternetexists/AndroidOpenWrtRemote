
package com.thisiswhytheinternetexists.openwrtmanager.api;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wan implements Serializable, Parcelable
{

    @SerializedName("proto")
    @Expose
    private String proto;
    @SerializedName("ipaddr")
    @Expose
    private String ipaddr;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("netmask")
    @Expose
    private String netmask;
    @SerializedName("gwaddr")
    @Expose
    private String gwaddr;
    @SerializedName("expires")
    @Expose
    private int expires;
    @SerializedName("uptime")
    @Expose
    private int uptime;
    @SerializedName("ifname")
    @Expose
    private String ifname;
    @SerializedName("dns")
    @Expose
    private List<String> dns = null;
    public final static Parcelable.Creator<Wan> CREATOR = new Creator<Wan>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Wan createFromParcel(Parcel in) {
            Wan instance = new Wan();
            instance.proto = ((String) in.readValue((String.class.getClassLoader())));
            instance.ipaddr = ((String) in.readValue((String.class.getClassLoader())));
            instance.link = ((String) in.readValue((String.class.getClassLoader())));
            instance.netmask = ((String) in.readValue((String.class.getClassLoader())));
            instance.gwaddr = ((String) in.readValue((String.class.getClassLoader())));
            instance.expires = ((int) in.readValue((int.class.getClassLoader())));
            instance.uptime = ((int) in.readValue((int.class.getClassLoader())));
            instance.ifname = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.dns, (java.lang.String.class.getClassLoader()));
            return instance;
        }

        public Wan[] newArray(int size) {
            return (new Wan[size]);
        }

    }
    ;
    private final static long serialVersionUID = 201363982516437587L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wan() {
    }

    /**
     * 
     * @param gwaddr
     * @param ifname
     * @param expires
     * @param ipaddr
     * @param link
     * @param dns
     * @param uptime
     * @param netmask
     * @param proto
     */
    public Wan(String proto, String ipaddr, String link, String netmask, String gwaddr, int expires, int uptime, String ifname, List<String> dns) {
        super();
        this.proto = proto;
        this.ipaddr = ipaddr;
        this.link = link;
        this.netmask = netmask;
        this.gwaddr = gwaddr;
        this.expires = expires;
        this.uptime = uptime;
        this.ifname = ifname;
        this.dns = dns;
    }

    public String getProto() {
        return proto;
    }

    public void setProto(String proto) {
        this.proto = proto;
    }

    public Wan withProto(String proto) {
        this.proto = proto;
        return this;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public Wan withIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Wan withLink(String link) {
        this.link = link;
        return this;
    }

    public String getNetmask() {
        return netmask;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    public Wan withNetmask(String netmask) {
        this.netmask = netmask;
        return this;
    }

    public String getGwaddr() {
        return gwaddr;
    }

    public void setGwaddr(String gwaddr) {
        this.gwaddr = gwaddr;
    }

    public Wan withGwaddr(String gwaddr) {
        this.gwaddr = gwaddr;
        return this;
    }

    public int getExpires() {
        return expires;
    }

    public void setExpires(int expires) {
        this.expires = expires;
    }

    public Wan withExpires(int expires) {
        this.expires = expires;
        return this;
    }

    public int getUptime() {
        return uptime;
    }

    public void setUptime(int uptime) {
        this.uptime = uptime;
    }

    public Wan withUptime(int uptime) {
        this.uptime = uptime;
        return this;
    }

    public String getIfname() {
        return ifname;
    }

    public void setIfname(String ifname) {
        this.ifname = ifname;
    }

    public Wan withIfname(String ifname) {
        this.ifname = ifname;
        return this;
    }

    public List<String> getDns() {
        return dns;
    }

    public void setDns(List<String> dns) {
        this.dns = dns;
    }

    public Wan withDns(List<String> dns) {
        this.dns = dns;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(proto);
        dest.writeValue(ipaddr);
        dest.writeValue(link);
        dest.writeValue(netmask);
        dest.writeValue(gwaddr);
        dest.writeValue(expires);
        dest.writeValue(uptime);
        dest.writeValue(ifname);
        dest.writeList(dns);
    }

    public int describeContents() {
        return  0;
    }

}
