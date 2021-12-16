package org.example.Lab1.fabric;

public class FabricMethodService {
    public void exec() throws Exception{
        Configuration configuration = Configuration.initMob();
        Dialog dialog;
        switch(configuration.getPlatform()) {
            case ("WEB"):
                dialog = new WebDialog();
                break;
            case ("MOB"):
                dialog = new MobDialog();
                break;
            default:
                throw new Exception("Не известный тип платформы");
        }
        dialog.render();
    }
}
