package ru.netology.radio;
public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int soundVolume;
    private int currentRadioStation;

    public void increaseVolume() {
        if (soundVolume == maxVolume) {
            return;
        }
        soundVolume++;
    }

    public void decreaseVolume() {
        if (soundVolume == minVolume) {
            return;
        }
        soundVolume--;
    }

    public void increaseChannel() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        currentRadioStation++;
    }

    public void decreaseChannel() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation--;
    }


    public int getCurrentVolume() {
        return soundVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.soundVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.soundVolume = minVolume;
            return;
        }
        this.soundVolume = currentVolume;
    }


    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxRadioStation) {

            return;
        }
        if (currentChannel < minRadioStation) {

            return;
        }
        this.currentRadioStation = currentChannel;
    }

    public int getCurrentChannel() {
        return currentRadioStation;
    }
}