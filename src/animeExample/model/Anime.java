package animeExample.model;

import animeExample.enums.AnimeType;

import java.time.LocalDate;
import java.util.Objects;

public class Anime {

    private String title;
    private LocalDate aired;
    private AnimeType type;
    private String posterURI;

    private Anime(Builder builder) {
        setTitle(builder.title);
        setAired(builder.aired);
        setType(builder.type);
        setPosterURI(builder.posterURI);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getAired() {
        return aired;
    }

    public void setAired(LocalDate aired) {
        this.aired = aired;
    }

    public AnimeType getType() {
        return type;
    }

    public void setType(AnimeType type) {
        this.type = type;
    }

    public String getPosterURI() {
        return posterURI;
    }

    public void setPosterURI(String posterURI) {
        this.posterURI = posterURI;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", aired=" + aired +
                ", type=" + type +
                ", posterURI='" + posterURI + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return Objects.equals(title, anime.title) && Objects.equals(aired, anime.aired) && type == anime.type && Objects.equals(posterURI, anime.posterURI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, aired, type, posterURI);
    }

    public static final class Builder {
        private String title;
        private LocalDate aired;
        private AnimeType type;
        private String posterURI;

        public Builder() {
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder aired(LocalDate aired) {
            this.aired = aired;
            return this;
        }

        public Builder type(AnimeType type) {
            this.type = type;
            return this;
        }

        public Builder posterURI(String posterURI) {
            this.posterURI = posterURI;
            return this;
        }

        public Anime build() {
            return new Anime(this);
        }
    }
}
