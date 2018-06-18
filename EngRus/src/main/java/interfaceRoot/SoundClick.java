package interfaceRoot;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SoundClick
{
    public void soundClick() {
        // TODO делаем код для клика;
        // TODO добавить звуковые эффекты в базу данных если не получится сделать стандартными методами

        try {
            File soundFile = new File("click.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.setFramePosition(0);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }

    }
}
