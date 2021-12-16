package org.example.Lab1.fabric;

public class Configuration {
    public final static String WEB = "WEB";
    public final static String MOB = "MOB";
    private String platform;
    public String getPlatform() {
        return platform;
    }
    public Configuration setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public static Configuration initWeb() {
        return new Configuration().setPlatform(WEB);
    }
    public static Configuration initMob() {
        return new Configuration().setPlatform(MOB);
    }
}
