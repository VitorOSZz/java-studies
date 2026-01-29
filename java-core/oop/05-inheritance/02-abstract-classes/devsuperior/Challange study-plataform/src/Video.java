public class Video extends Lesson {

    private String url;
    private int seconds;

    public Video(String title, String url, int seconds) {
        super(title);
        this.url = url;
        this.seconds = seconds;
    }

    @Override
    public int duration() {
        return this.seconds;
    }
}
