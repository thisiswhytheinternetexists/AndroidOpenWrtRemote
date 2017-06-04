
package com.thisiswhytheinternetexists.openwrtmanager.api;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Network implements Serializable, Parcelable
{

    @SerializedName("ifname")
    @Expose
    private String ifname;
    @SerializedName("disabled")
    @Expose
    private boolean disabled;
    @SerializedName("encryption")
    @Expose
    private String encryption;
    @SerializedName("bssid")
    @Expose
    private String bssid;
    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("quality")
    @Expose
    private int quality;
    @SerializedName("noise")
    @Expose
    private int noise;
    @SerializedName("ssid")
    @Expose
    private String ssid;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("txpoweroff")
    @Expose
    private int txpoweroff;
    @SerializedName("bitrate")
    @Expose
    private double bitrate;
    @SerializedName("txpower")
    @Expose
    private int txpower;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("channel")
    @Expose
    private int channel;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("signal")
    @Expose
    private int signal;
    @SerializedName("up")
    @Expose
    private boolean up;
    @SerializedName("frequency")
    @Expose
    private String frequency;
    public final static Parcelable.Creator<Network> CREATOR = new Creator<Network>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Network createFromParcel(Parcel in) {
            Network instance = new Network();
            instance.ifname = ((String) in.readValue((String.class.getClassLoader())));
            instance.disabled = ((boolean) in.readValue((boolean.class.getClassLoader())));
            instance.encryption = ((String) in.readValue((String.class.getClassLoader())));
            instance.bssid = ((String) in.readValue((String.class.getClassLoader())));
            instance.mode = ((String) in.readValue((String.class.getClassLoader())));
            instance.quality = ((int) in.readValue((int.class.getClassLoader())));
            instance.noise = ((int) in.readValue((int.class.getClassLoader())));
            instance.ssid = ((String) in.readValue((String.class.getClassLoader())));
            instance.link = ((String) in.readValue((String.class.getClassLoader())));
            instance.txpoweroff = ((int) in.readValue((int.class.getClassLoader())));
            instance.bitrate = ((double) in.readValue((double.class.getClassLoader())));
            instance.txpower = ((int) in.readValue((int.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.channel = ((int) in.readValue((int.class.getClassLoader())));
            instance.country = ((String) in.readValue((String.class.getClassLoader())));
            instance.signal = ((int) in.readValue((int.class.getClassLoader())));
            instance.up = ((boolean) in.readValue((boolean.class.getClassLoader())));
            instance.frequency = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Network[] newArray(int size) {
            return (new Network[size]);
        }

    }
    ;
    private final static long serialVersionUID = -2357541221890678343L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Network() {
    }

    /**
     * 
     * @param ifname
     * @param link
     * @param signal
     * @param frequency
     * @param up
     * @param country
     * @param mode
     * @param noise
     * @param bssid
     * @param txpoweroff
     * @param encryption
     * @param name
     * @param txpower
     * @param quality
     * @param ssid
     * @param bitrate
     * @param channel
     * @param disabled
     */
    public Network(String ifname, boolean disabled, String encryption, String bssid, String mode, int quality, int noise, String ssid, String link, int txpoweroff, double bitrate, int txpower, String name, int channel, String country, int signal, boolean up, String frequency) {
        super();
        this.ifname = ifname;
        this.disabled = disabled;
        this.encryption = encryption;
        this.bssid = bssid;
        this.mode = mode;
        this.quality = quality;
        this.noise = noise;
        this.ssid = ssid;
        this.link = link;
        this.txpoweroff = txpoweroff;
        this.bitrate = bitrate;
        this.txpower = txpower;
        this.name = name;
        this.channel = channel;
        this.country = country;
        this.signal = signal;
        this.up = up;
        this.frequency = frequency;
    }

    public String getIfname() {
        return ifname;
    }

    public void setIfname(String ifname) {
        this.ifname = ifname;
    }

    public Network withIfname(String ifname) {
        this.ifname = ifname;
        return this;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public Network withDisabled(boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    public String getEncryption() {
        return encryption;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    public Network withEncryption(String encryption) {
        this.encryption = encryption;
        return this;
    }

    public String getBssid() {
        return bssid;
    }

    public void setBssid(String bssid) {
        this.bssid = bssid;
    }

    public Network withBssid(String bssid) {
        this.bssid = bssid;
        return this;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Network withMode(String mode) {
        this.mode = mode;
        return this;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public Network withQuality(int quality) {
        this.quality = quality;
        return this;
    }

    public int getNoise() {
        return noise;
    }

    public void setNoise(int noise) {
        this.noise = noise;
    }

    public Network withNoise(int noise) {
        this.noise = noise;
        return this;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public Network withSsid(String ssid) {
        this.ssid = ssid;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Network withLink(String link) {
        this.link = link;
        return this;
    }

    public int getTxpoweroff() {
        return txpoweroff;
    }

    public void setTxpoweroff(int txpoweroff) {
        this.txpoweroff = txpoweroff;
    }

    public Network withTxpoweroff(int txpoweroff) {
        this.txpoweroff = txpoweroff;
        return this;
    }

    public double getBitrate() {
        return bitrate;
    }

    public void setBitrate(double bitrate) {
        this.bitrate = bitrate;
    }

    public Network withBitrate(double bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    public int getTxpower() {
        return txpower;
    }

    public void setTxpower(int txpower) {
        this.txpower = txpower;
    }

    public Network withTxpower(int txpower) {
        this.txpower = txpower;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Network withName(String name) {
        this.name = name;
        return this;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public Network withChannel(int channel) {
        this.channel = channel;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Network withCountry(String country) {
        this.country = country;
        return this;
    }

    public int getSignal() {
        return signal;
    }

    public void setSignal(int signal) {
        this.signal = signal;
    }

    public Network withSignal(int signal) {
        this.signal = signal;
        return this;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public Network withUp(boolean up) {
        this.up = up;
        return this;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Network withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(ifname);
        dest.writeValue(disabled);
        dest.writeValue(encryption);
        dest.writeValue(bssid);
        dest.writeValue(mode);
        dest.writeValue(quality);
        dest.writeValue(noise);
        dest.writeValue(ssid);
        dest.writeValue(link);
        dest.writeValue(txpoweroff);
        dest.writeValue(bitrate);
        dest.writeValue(txpower);
        dest.writeValue(name);
        dest.writeValue(channel);
        dest.writeValue(country);
        dest.writeValue(signal);
        dest.writeValue(up);
        dest.writeValue(frequency);
    }

    public int describeContents() {
        return  0;
    }

}
