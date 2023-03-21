package solidprinciples.isp.invalid;

public interface SocialMediaUser {
    void post(String content);
    void reactToPost(int postId, String reaction);
    void createAd(String adContent);
    void promoteAd(int adId);
    void banUser(String userId);
}
