package ma.henceforth.mypfeproject;


public class Ip {
    private String mName;
    private String mIp;

    Ip(String name,String ip){
        mName = name;
        mIp = ip;
    }
    public String getDevice(){
        return mName;
    }
    public String getIp(){
        return mIp;
    }
}

