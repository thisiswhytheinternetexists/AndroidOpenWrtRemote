
package com.thisiswhytheinternetexists.openwrtmanager.api;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wifinet implements Serializable, Parcelable
{

    @SerializedName("device")
    @Expose
    private String device;
    @SerializedName("networks")
    @Expose
    private List<Network> networks = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("up")
    @Expose
    private boolean up;
    public final static Parcelable.Creator<Wifinet> CREATOR = new Creator<Wifinet>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Wifinet createFromParcel(Parcel in) {
            Wifinet instance = new Wifinet();
            instance.device = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.networks, (com.thisiswhytheinternetexists.openwrtmanager.api.Network.class.getClassLoader()));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.up = ((boolean) in.readValue((boolean.class.getClassLoader())));
            return instance;
        }

        public Wifinet[] newArray(int size) {
            return (new Wifinet[size]);
        }

    }
    ;
    private final static long serialVersionUID = 2020220377162408335L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wifinet() {
    }

    /**
     * 
     * @param networks
     * @param name
     * @param device
     * @param up
     */
    public Wifinet(String device, List<Network> networks, String name, boolean up) {
        super();
        this.device = device;
        this.networks = networks;
        this.name = name;
        this.up = up;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Wifinet withDevice(String device) {
        this.device = device;
        return this;
    }

    public List<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(List<Network> networks) {
        this.networks = networks;
    }

    public Wifinet withNetworks(List<Network> networks) {
        this.networks = networks;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wifinet withName(String name) {
        this.name = name;
        return this;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public Wifinet withUp(boolean up) {
        this.up = up;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(device);
        dest.writeList(networks);
        dest.writeValue(name);
        dest.writeValue(up);
    }

    public int describeContents() {
        return  0;
    }

}
