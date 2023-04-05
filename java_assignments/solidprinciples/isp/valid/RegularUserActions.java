package solidprinciples.isp.valid;

public interface RegularUserActions {
    void post(String content);
    void reactToPost(int postId, String reaction);
}
