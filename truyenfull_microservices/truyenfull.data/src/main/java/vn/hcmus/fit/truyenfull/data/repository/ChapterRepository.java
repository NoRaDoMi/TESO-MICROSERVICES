package vn.hcmus.fit.truyenfull.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.hcmus.fit.truyenfull.data.model.Chapter;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter,Long> {
    Chapter findByName(String name);
    Chapter findByNameAndId(String name, Long id);
}
