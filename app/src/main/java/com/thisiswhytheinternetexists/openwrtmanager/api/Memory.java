
package com.thisiswhytheinternetexists.openwrtmanager.api;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Memory implements Serializable, Parcelable
{

    @SerializedName("buffered")
    @Expose
    private int buffered;
    @SerializedName("total")
    @Expose
    private int total;
    @SerializedName("shared")
    @Expose
    private int shared;
    @SerializedName("free")
    @Expose
    private int free;
    public final static Parcelable.Creator<Memory> CREATOR = new Creator<Memory>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Memory createFromParcel(Parcel in) {
            Memory instance = new Memory();
            instance.buffered = ((int) in.readValue((int.class.getClassLoader())));
            instance.total = ((int) in.readValue((int.class.getClassLoader())));
            instance.shared = ((int) in.readValue((int.class.getClassLoader())));
            instance.free = ((int) in.readValue((int.class.getClassLoader())));
            return instance;
        }

        public Memory[] newArray(int size) {
            return (new Memory[size]);
        }

    }
    ;
    private final static long serialVersionUID = -2567398820913209041L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Memory() {
    }

    /**
     * 
     * @param shared
     * @param total
     * @param buffered
     * @param free
     */
    public Memory(int buffered, int total, int shared, int free) {
        super();
        this.buffered = buffered;
        this.total = total;
        this.shared = shared;
        this.free = free;
    }

    public int getBuffered() {
        return buffered;
    }

    public void setBuffered(int buffered) {
        this.buffered = buffered;
    }

    public Memory withBuffered(int buffered) {
        this.buffered = buffered;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Memory withTotal(int total) {
        this.total = total;
        return this;
    }

    public int getShared() {
        return shared;
    }

    public void setShared(int shared) {
        this.shared = shared;
    }

    public Memory withShared(int shared) {
        this.shared = shared;
        return this;
    }

    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

    public Memory withFree(int free) {
        this.free = free;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(buffered);
        dest.writeValue(total);
        dest.writeValue(shared);
        dest.writeValue(free);
    }

    public int describeContents() {
        return  0;
    }

}
