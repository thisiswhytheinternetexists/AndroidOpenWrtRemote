
package com.thisiswhytheinternetexists.openwrtmanager.api;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OpenWRTStatus implements Serializable, Parcelable
{

    @SerializedName("swap")
    @Expose
    private Swap swap;
    @SerializedName("conncount")
    @Expose
    private int conncount;
    @SerializedName("leases")
    @Expose
    private List<Lease> leases = null;
    @SerializedName("leases6")
    @Expose
    private List<Leases6> leases6 = null;
    @SerializedName("wan6")
    @Expose
    private Wan6 wan6;
    @SerializedName("memory")
    @Expose
    private Memory memory;
    @SerializedName("uptime")
    @Expose
    private int uptime;
    @SerializedName("wifinets")
    @Expose
    private List<Wifinet> wifinets = null;
    @SerializedName("wan")
    @Expose
    private Wan wan;
    @SerializedName("localtime")
    @Expose
    private String localtime;
    @SerializedName("connmax")
    @Expose
    private int connmax;
    @SerializedName("loadavg")
    @Expose
    private List<Integer> loadavg = null;
    public final static Parcelable.Creator<OpenWRTStatus> CREATOR = new Creator<OpenWRTStatus>() {


        @SuppressWarnings({
            "unchecked"
        })
        public OpenWRTStatus createFromParcel(Parcel in) {
            OpenWRTStatus instance = new OpenWRTStatus();
            instance.swap = ((Swap) in.readValue((Swap.class.getClassLoader())));
            instance.conncount = ((int) in.readValue((int.class.getClassLoader())));
            in.readList(instance.leases, (com.thisiswhytheinternetexists.openwrtmanager.api.Lease.class.getClassLoader()));
            in.readList(instance.leases6, (com.thisiswhytheinternetexists.openwrtmanager.api.Leases6.class.getClassLoader()));
            instance.wan6 = ((Wan6) in.readValue((Wan6.class.getClassLoader())));
            instance.memory = ((Memory) in.readValue((Memory.class.getClassLoader())));
            instance.uptime = ((int) in.readValue((int.class.getClassLoader())));
            in.readList(instance.wifinets, (com.thisiswhytheinternetexists.openwrtmanager.api.Wifinet.class.getClassLoader()));
            instance.wan = ((Wan) in.readValue((Wan.class.getClassLoader())));
            instance.localtime = ((String) in.readValue((String.class.getClassLoader())));
            instance.connmax = ((int) in.readValue((int.class.getClassLoader())));
            in.readList(instance.loadavg, (java.lang.Integer.class.getClassLoader()));
            return instance;
        }

        public OpenWRTStatus[] newArray(int size) {
            return (new OpenWRTStatus[size]);
        }

    }
    ;
    private final static long serialVersionUID = 4475120196970575781L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OpenWRTStatus() {
    }

    /**
     * 
     * @param connmax
     * @param localtime
     * @param leases
     * @param wan
     * @param conncount
     * @param wan6
     * @param uptime
     * @param swap
     * @param wifinets
     * @param memory
     * @param loadavg
     * @param leases6
     */
    public OpenWRTStatus(Swap swap, int conncount, List<Lease> leases, List<Leases6> leases6, Wan6 wan6, Memory memory, int uptime, List<Wifinet> wifinets, Wan wan, String localtime, int connmax, List<Integer> loadavg) {
        super();
        this.swap = swap;
        this.conncount = conncount;
        this.leases = leases;
        this.leases6 = leases6;
        this.wan6 = wan6;
        this.memory = memory;
        this.uptime = uptime;
        this.wifinets = wifinets;
        this.wan = wan;
        this.localtime = localtime;
        this.connmax = connmax;
        this.loadavg = loadavg;
    }

    public Swap getSwap() {
        return swap;
    }

    public void setSwap(Swap swap) {
        this.swap = swap;
    }

    public OpenWRTStatus withSwap(Swap swap) {
        this.swap = swap;
        return this;
    }

    public int getConncount() {
        return conncount;
    }

    public void setConncount(int conncount) {
        this.conncount = conncount;
    }

    public OpenWRTStatus withConncount(int conncount) {
        this.conncount = conncount;
        return this;
    }

    public List<Lease> getLeases() {
        return leases;
    }

    public void setLeases(List<Lease> leases) {
        this.leases = leases;
    }

    public OpenWRTStatus withLeases(List<Lease> leases) {
        this.leases = leases;
        return this;
    }

    public List<Leases6> getLeases6() {
        return leases6;
    }

    public void setLeases6(List<Leases6> leases6) {
        this.leases6 = leases6;
    }

    public OpenWRTStatus withLeases6(List<Leases6> leases6) {
        this.leases6 = leases6;
        return this;
    }

    public Wan6 getWan6() {
        return wan6;
    }

    public void setWan6(Wan6 wan6) {
        this.wan6 = wan6;
    }

    public OpenWRTStatus withWan6(Wan6 wan6) {
        this.wan6 = wan6;
        return this;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public OpenWRTStatus withMemory(Memory memory) {
        this.memory = memory;
        return this;
    }

    public int getUptime() {
        return uptime;
    }

    public void setUptime(int uptime) {
        this.uptime = uptime;
    }

    public OpenWRTStatus withUptime(int uptime) {
        this.uptime = uptime;
        return this;
    }

    public List<Wifinet> getWifinets() {
        return wifinets;
    }

    public void setWifinets(List<Wifinet> wifinets) {
        this.wifinets = wifinets;
    }

    public OpenWRTStatus withWifinets(List<Wifinet> wifinets) {
        this.wifinets = wifinets;
        return this;
    }

    public Wan getWan() {
        return wan;
    }

    public void setWan(Wan wan) {
        this.wan = wan;
    }

    public OpenWRTStatus withWan(Wan wan) {
        this.wan = wan;
        return this;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    public OpenWRTStatus withLocaltime(String localtime) {
        this.localtime = localtime;
        return this;
    }

    public int getConnmax() {
        return connmax;
    }

    public void setConnmax(int connmax) {
        this.connmax = connmax;
    }

    public OpenWRTStatus withConnmax(int connmax) {
        this.connmax = connmax;
        return this;
    }

    public List<Integer> getLoadavg() {
        return loadavg;
    }

    public void setLoadavg(List<Integer> loadavg) {
        this.loadavg = loadavg;
    }

    public OpenWRTStatus withLoadavg(List<Integer> loadavg) {
        this.loadavg = loadavg;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(swap);
        dest.writeValue(conncount);
        dest.writeList(leases);
        dest.writeList(leases6);
        dest.writeValue(wan6);
        dest.writeValue(memory);
        dest.writeValue(uptime);
        dest.writeList(wifinets);
        dest.writeValue(wan);
        dest.writeValue(localtime);
        dest.writeValue(connmax);
        dest.writeList(loadavg);
    }

    public int describeContents() {
        return  0;
    }

}
