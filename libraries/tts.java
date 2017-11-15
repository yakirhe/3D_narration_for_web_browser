package audio;

import java.util.Arrays;
import java.util.List;

import audio.TextToSpeech;
import marytts.modules.synthesis.Voice;
import marytts.signalproc.effects.JetPilotEffect;
import marytts.signalproc.effects.LpcWhisperiserEffect;
import marytts.signalproc.effects.RobotiserEffect;
import marytts.signalproc.effects.StadiumEffect;
import marytts.signalproc.effects.VocalTractLinearScalerEffect;
import marytts.signalproc.effects.VolumeEffect;


public class tts {
    public static void main(String[] args) {
        TextToSpeech tts = new TextToSpeech();

        //show available voices
        Voice.getAvailableVoices().stream().forEach(System.out::println );
        //chose a voice
        tts.setVoice("cmu-rms-hsmm");
        //speak(main function) ,the firs input is the text , second the voice ,three and four i don't know
        tts.speak("hello my friends" , 1.0f , false , false);



    }
}

