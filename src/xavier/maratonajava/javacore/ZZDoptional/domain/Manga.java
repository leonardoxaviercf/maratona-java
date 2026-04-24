package xavier.maratonajava.javacore.ZZDoptional.domain;

public class Manga {
    private String title;
    private Integer episodes;
    private Integer id;

    public Manga(String title, Integer episodes, Integer id) {
        this.title = title;
        this.episodes = episodes;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                ", id=" + id +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public Integer getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }
}
