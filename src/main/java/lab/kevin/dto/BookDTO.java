package lab.kevin.dto;

import java.util.Objects;

public class BookDTO {
    private Integer id;
    private Integer authorId;
    private String title;
    private Integer publishedIn;
    private Integer languageId;

    public BookDTO(Integer id) {
        this.id = id;
    }

    public BookDTO(Integer id, Integer authorId, String title, Integer publishedIn, Integer languageId) {
        this.id = id;
        this.authorId = authorId;
        this.title = title;
        this.publishedIn = publishedIn;
        this.languageId = languageId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublishedIn() {
        return publishedIn;
    }

    public void setPublishedIn(Integer publishedIn) {
        this.publishedIn = publishedIn;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDTO bookDTO = (BookDTO) o;
        return Objects.equals(id, bookDTO.id) &&
                Objects.equals(authorId, bookDTO.authorId) &&
                Objects.equals(title, bookDTO.title) &&
                Objects.equals(publishedIn, bookDTO.publishedIn) &&
                Objects.equals(languageId, bookDTO.languageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, authorId, title, publishedIn, languageId);
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", authorId=" + authorId +
                ", title='" + title + '\'' +
                ", publishedIn=" + publishedIn +
                ", languageId=" + languageId +
                '}';
    }
}
