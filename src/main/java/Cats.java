import com.fasterxml.jackson.annotation.JsonProperty;

public class Cats {

    protected String id;
    protected String text;
    protected String type;
    protected String user;
    protected String upvotes;

    public Cats (@JsonProperty("id") String id,
                 @JsonProperty("text") String text,
                 @JsonProperty("type") String type,
                 @JsonProperty("user") String user,
                 @JsonProperty("upvotes") String upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String toString () {
        return "Cat: " + "\n" + "{" + "\n" + "id: " + id + "\n" + " text: " + text + "\n"
                + " type: " + type + "\n" + " user: " + user + "\n"
                + " upvotes: " + upvotes + "\n" + "}";
    }

    public String getUpvotes () {
        return upvotes;
    }
}
