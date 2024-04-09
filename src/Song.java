import java.util.ArrayList;

public class Song {
    //parameters
    private String title;
    private String artist;
    private ArrayList<String> listeners = new ArrayList<>();

    //constructor
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // methods
    // getters
    public String getTitle() {return title;}
    public String getArtist() {return artist;}
    // setters
    public void setTitle(String title) {this.title = title;}
    public void setArtist(String artist) {this.artist = artist;}
    // howMany
    public int howMany(ArrayList<String> names) {
        int newListeners = 0;
        for (String listener: names) {
            String lowercaseListener = listener.toLowerCase();

            if (!this.listeners.contains(listener.toLowerCase())) {
                listeners.add(lowercaseListener);
                newListeners ++;
            }

        }
        return newListeners;
        //        int count = listeners.size();
//        ArrayList<String> listeners1= listeners;
//        for (int i = 0; i < listeners.size(); i++) {
//            String temp1 = listeners.get(i).toLowerCase();
//            listeners1.add(temp1);
//        }
//        for (int j = 0; j < listeners1.size(); j++) {
//            for (int k = j; k < listeners1.size(); k++) {
//                String temp2 = listeners1.get(j);
//                String temp3 = listeners1.get(k);
//                if (temp3.equals(temp2)) count --;
//            }
//        }
//        return count;
    }
}
