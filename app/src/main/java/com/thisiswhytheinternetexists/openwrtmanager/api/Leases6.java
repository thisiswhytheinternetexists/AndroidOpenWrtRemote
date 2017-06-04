
package com.thisiswhytheinternetexists.openwrtmanager.api;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Leases6 implements Serializable, Parcelable
{

    @SerializedName("expires")
    @Expose
    private int expires;
    @SerializedName("hostname")
    @Expose
    private String hostname;
    @SerializedName("duid")
    @Expose
    private String duid;
    @SerializedName("ip6addr")
    @Expose
    private String ip6addr;
    public final static Parcelable.Creator<Leases6> CREATOR = new Creator<Leases6>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Leases6 createFromParcel(Parcel in) {
            Leases6 instance = new Leases6();
            instance.expires = ((int) in.readValue((int.class.getClassLoader())));
            instance.hostname = ((String) in.readValue((String.class.getClassLoader())));
            instance.duid = ((String) in.readValue((String.class.getClassLoader())));
            instance.ip6addr = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Leases6 [] newArray(int size) {
            return (new Leases6[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3313279945612627567L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Leases6() {
    }

    /**
     * 
     * @param ip6addr
     * @param duid
     * @param expires
     * @param hostname
     */
    public Leases6(int expires, String hostname, String duid, String ip6addr) {
        super();
        this.expires = expires;
        this.hostname = hostname;
        this.duid = duid;
        this.ip6addr = ip6addr;
    }

    public int getExpires() {
        return expires;
    }

    public void setExpires(int expires) {
        this.expires = expires;
    }

    public Leases6 withExpires(int expires) {
        this.expires = expires;
        return this;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Leases6 withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public String getDuid() {
        return duid;
    }

    public void setDuid(String duid) {
        this.duid = duid;
    }

    public Leases6 withDuid(String duid) {
        this.duid = duid;
        return this;
    }

    public String getIp6addr() {
        return ip6addr;
    }

    public void setIp6addr(String ip6addr) {
        this.ip6addr = ip6addr;
    }

    public Leases6 withIp6addr(String ip6addr) {
        this.ip6addr = ip6addr;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(expires);
        dest.writeValue(hostname);
        dest.writeValue(duid);
        dest.writeValue(ip6addr);
    }

    public int describeContents() {
        return  0;
    }

}
