class User {
    String username;   
    String email;      
    int followers;     

    void postPhoto(String photoDescription) {
        System.out.println(username + " posted a photo: " + photoDescription);
    }

    void likePost(String post) {
        System.out.println(username + " liked the post: " + post);
    }

    void follow(User otherUser) {
        System.out.println(username + " followed " + otherUser.username);
    }

    public static void main(String[] args) {
        User u1 = new User();    // no values assigned
        User u2 = new User();

        u1.postPhoto("Sunset");
        u1.likePost("Holiday Picture");
        u1.follow(u2);
    }
}
