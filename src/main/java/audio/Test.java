package audio;

import audio.AudioMaster;
import audio.Source;
import com.gtranslate.utils.WebUtils;
import marytts.client.MaryClient;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Test {
    public static void main(final String[] arg) throws IOException, InterruptedException {
        //text to speech
        AudioMaster.init();
        AudioMaster.setListenerData(0, 0, 0);


//
//
        //get the links
        audio.WebUtils.connectToWebsite("http://projectaudioforbengurion.000webhostapp.com/");
        ArrayList<String> tags = audio.WebUtils.getItems();

        createWavFiles(tags);
        playTags(tags);

//        final int buffer = AudioMaster.loadSound("audio/dani.wav");
//        final Source source = new Source();
////
////        final int buffer2 = AudioMaster.loadSound("audio/footsteps.wav");
////        final Source source2 = new Source();
////
////        source2.setLooping(true);
////        source2.play(buffer2);
////
//        source.setLooping(true);
//        source.play(buffer);
////
//        float xPos = 15;
//        source.setPosition(xPos, 0, 2);
////
////        float xPos2 = -15;
////        source2.setPosition(xPos2,0,2);
////
//        // Added non-blocking input to neatly finish close the app.
//        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String c = "";
//        while (!"q".equals(c))
//        {
//            if (bufferedReader.ready())
//            {
//                c = bufferedReader.readLine();
//            }
//            xPos -= 0.03f;
//            if (xPos < -8f)
//            {
//                xPos = 8;
//            }
//            source.setPosition(xPos, 0, 2);
//            Thread.sleep(10);
//        }
//
//        source.delete();

        AudioMaster.cleanUp();
    }

    private static void createWavFiles(ArrayList<String> tags) {
        for (int i = 0; i < 4; i++) {
            TextToSpeech tts = new TextToSpeech();
            tts.setVoice("cmu-rms-hsmm");
            tts.speak(tags.get(i), 1.0f, false, false, tags.get(i));
        }
    }

    private static void playTags(ArrayList<String> tags) {

        //        final int buffer = AudioMaster.loadSound("audio/dani.wav");
//        final Source source = new Source();

        ArrayList<Integer> bufferList = new ArrayList<Integer>();
        ArrayList<Source> sourceList = new ArrayList<Source>();

//        for (int i = 0; i < 4; i++) {
            System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());
            final int buffer = AudioMaster.loadSound(  "/audio/Home");
            final Source source = new Source();
            //source.setLooping(true);
            source.setPosition(0, 0, 0);
            source.play(buffer);
//            source.delete();
            //            sourceList.add(source);
//        }


    }
}