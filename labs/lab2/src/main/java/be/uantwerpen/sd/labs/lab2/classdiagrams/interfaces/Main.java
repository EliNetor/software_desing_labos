package be.uantwerpen.sd.labs.lab2.classdiagrams.interfaces;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    public void run() {
        /*
            TODO: Create a UniversalRemote and add multiple devices (TV, Radio, CDPlayer). Call lowerVolume() and riseVolume() to verify polymorphism.
            TIP: Upcast to VolumeDevice when storing devices; verify that methods dispatch correctly.
        */
        VolumeDevice tv = new TV();
        VolumeDevice radio = new Radio();
        VolumeDevice cdPlayer = new CDPlayer();
        UniversalRemote remote = new UniversalRemote();

        remote.addDevice(tv);
        remote.addDevice(radio);
        remote.addDevice(cdPlayer);

        remote.lowerVolume();
        remote.lowerVolume();
        remote.riseVolume();
    }
}
