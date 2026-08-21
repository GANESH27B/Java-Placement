interface CameraFeature {
    void takePhoto();
}

interface MusicFeature {
    void playMusic();
}

class SmartPhone implements CameraFeature, MusicFeature {
    @Override
    public void takePhoto() {
        System.out.println("Photo captured");
    }

    @Override
    public void playMusic() {
        System.out.println("Music playing");
    }
}

public class MultipleInterfacesExample {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.takePhoto();
        phone.playMusic();
    }
}