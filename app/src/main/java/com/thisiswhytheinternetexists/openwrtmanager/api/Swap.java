
package com.thisiswhytheinternetexists.openwrtmanager.api;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Swap implements Serializable, Parcelable
{

    @SerializedName("free")
    @Expose
    private int free;
    @SerializedName("total")
    @Expose
    private int total;
    public final static Parcelable.Creator<Swap> CREATOR = new Creator<Swap>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Swap createFromParcel(Parcel in) {
            Swap instance = new Swap();
            instance.free = ((int) in.readValue((int.class.getClassLoader())));
            instance.total = ((int) in.readValue((int.class.getClassLoader())));
            return instance;
        }

        public Swap[] newArray(int size) {
            return (new Swap[size]);
        }

    }
    ;
    private final static long serialVersionUID = 1307755192966914653L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Swap() {
    }

    /**
     * 
     * @param total
     * @param free
     */
    public Swap(int free, int total) {
        super();
        this.free = free;
        this.total = total;
    }

    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

    public Swap withFree(int free) {
        this.free = free;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Swap withTotal(int total) {
        this.total = total;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(free);
        dest.writeValue(total);
    }

    public int describeContents() {
        return  0;
    }

}
