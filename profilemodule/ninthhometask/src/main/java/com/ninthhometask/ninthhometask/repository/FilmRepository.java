package com.ninthhometask.ninthhometask.repository;

import com.ninthhometask.ninthhometask.model.Film;
import com.ninthhometask.ninthhometask.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
    @Query(nativeQuery = true, value = """
            select *
            from films right join orders on films.id = orders.id
            where (user_id = :userId) and (rent_date is not null) and (orders.purchase is true);
            """
    )
    List<Film> findAll(@Param(value = "userId") Long userId);

    @Query(nativeQuery = true, value = """
            select *
            from films
            where (title like %:title%) or (country like %:country%) or (genre like %:genre%);
            """
    )
    List<Film> findAll(@Param(value = "title") String title, @Param(value = "country") String country, @Param(value = "genre") Genre genre);

    List<Film> findByDirectors_Id(Long id);

    void deleteByDirectors_id(Long id);
}