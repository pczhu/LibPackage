package pczhu.com.androidlibrary.module;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * 名称：LibGlobalVariables
 * 作用：库全局变量
 * 描述：
 * 作者：pczhu
 * 创建时间： 2017/3/8 上午11:26
 * 版本：V1.0
 * 修改历史：
 */

public class LibGlobalVariables implements Parcelable,Cloneable{
    
    private static Context mContext;
    private static LibGlobalVariables  mLibGlobalVariables= null;
    private LibGlobalVariables(){
        
    }
    public synchronized static LibGlobalVariables getInstance(Context context){
        LibGlobalVariables.mContext = context;
        if(mLibGlobalVariables == null){
            mLibGlobalVariables  = new LibGlobalVariables();
        }
        return mLibGlobalVariables;
    }


    
    protected LibGlobalVariables(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<LibGlobalVariables> CREATOR = new Creator<LibGlobalVariables>() {
        @Override
        public LibGlobalVariables createFromParcel(Parcel in) {
            return new LibGlobalVariables(in);
        }

        @Override
        public LibGlobalVariables[] newArray(int size) {
            return new LibGlobalVariables[size];
        }
    };
}
