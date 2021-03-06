package vn.hcmus.fit.truyenfull.crawler.model;


import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "comic")
public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @Column(unique = true)
    private String urlname;

    private String author;

    private String source;

    private String status;

    private double rating;

    private int vote_count;

    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "comic_id")
    private List<Chapter> chapterList = new ArrayList<>();

    //    Mapping voi Category
    @ManyToMany(cascade = {
            CascadeType.MERGE
    })
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinTable(name="comic_category",
            joinColumns = @JoinColumn(name = "comic_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categoryList = new ArrayList<>();

    @ManyToMany()
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinTable(name="comic_catalog",
            joinColumns = @JoinColumn(name = "comic_id"),
            inverseJoinColumns = @JoinColumn(name = "catalog_id"))
    private List<Catalog> catalogList = new ArrayList<>();


    public Comic() {
    }

    public Comic(String name, String urlname, String author, String source, String status, List<Chapter> chapterList, List<Category> categoryList) {
        this.name = name;
        this.urlname = urlname;
        this.author = author;
        this.source = source;
        this.status = status;
        this.chapterList = chapterList;
        this.categoryList = categoryList;
    }

    public void addChapter(Chapter chapter){
        chapterList.add(chapter);
        chapter.setComic(this);
    }
}
