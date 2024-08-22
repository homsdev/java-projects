package animeExample.repository;

import animeExample.enums.AnimeType;
import animeExample.model.Anime;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class AnimeRepository {

    private List<Anime> animeList;

    private Optional<Anime> toAnimeEntity(String ln) {
        String[] data = ln.split(",");
        if (data.length < 4) return Optional.empty();
        String title = data[0];
        LocalDate date = LocalDate.parse(data[1]);
        AnimeType type = AnimeType.valueOf(data[2]);
        Anime anime = new Anime.Builder()
                .title(title)
                .aired(date)
                .type(type)
                .posterURI("TBA")
                .build();
        return Optional.of(anime);
    }

    public void getDataFromFile(String path) throws IOException {
        if (path == null) {
            System.out.println("Error: invalid path");
            return;
        }

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line;

        do {
            line = br.readLine();
            if (line != null) {
                Optional<Anime> animeEntity = toAnimeEntity(line);
                animeEntity.ifPresent(animeList::add);
            }
        } while (line != null);

    }

    public List<Anime> getAnimeList() {
        return animeList;
    }

    public void setAnimeList(List<Anime> animeList) {
        this.animeList = animeList;
    }
}
