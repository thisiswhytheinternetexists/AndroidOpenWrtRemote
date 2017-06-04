
package com.thisiswhytheinternetexists.openwrtmanager.api;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lease implements Serializable, Parcelable
{

    @SerializedName("expires")
    @Expose
    private int expires;
    @SerializedName("macaddr")
    @Expose
    private String macaddr;
    @SerializedName("ipaddr")
    @Expose
    private String ipaddr;
    @SerializedName("hostname")
    @Expose
    private String hostname;
    public final static Parcelable.Creator<Lease> CREATOR = new Creator<Lease>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Lease createFromParcel(Parcel in) {
            Lease instance = new Lease();
            instance.expires = ((int) in.readValue((int.class.getClassLoader())));
            instance.macaddr = ((String) in.readValue((String.class.getClassLoader())));
            instance.ipaddr = ((String) in.readValue((String.class.getClassLoader())));
            instance.hostname = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Lease[] newArray(int size) {
            return (new Lease[size]);
        }

    }
    ;
    private final static long serialVersionUID = -7640329061916562186L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Lease() {
    }

    /**
     * 
     * @param macaddr
     * @param ipaddr
     * @param expires
     * @param hostname
     */
    public Lease(int expires, String macaddr, String ipaddr, String hostname) {
        super();
        this.expires = expires;
        this.macaddr = macaddr;
        this.ipaddr = ipaddr;
        this.hostname = hostname;
    }

    public int getExpires() {
        return expires;
    }

    public void setExpires(int expires) {
        this.expires = expires;
    }

    public Lease withExpires(int expires) {
        this.expires = expires;
        return this;
    }

    public String getMacaddr() {
        return macaddr;
    }

    public void setMacaddr(String macaddr) {
        this.macaddr = macaddr;
    }

    public Lease withMacaddr(String macaddr) {
        this.macaddr = macaddr;
        return this;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public Lease withIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
        return this;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Lease withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(expires);
        dest.writeValue(macaddr);
        dest.writeValue(ipaddr);
        dest.writeValue(hostname);
    }

    public int describeContents() {
        return  0;
    }

}
