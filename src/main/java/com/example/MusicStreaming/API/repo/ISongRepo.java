package com.example.MusicStreaming.API.repo;

import com.example.MusicStreaming.API.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISongRepo extends JpaRepository<Song,Long> {

    List<Song> findAllBySongId(List<Long> songIds);
    Song findFirstBySongId(Long songId);
}
