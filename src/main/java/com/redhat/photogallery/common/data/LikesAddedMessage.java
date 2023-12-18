package com.redhat.photogallery.common.data;

import java.util.Objects;

public record LikesAddedMessage(Long id, Integer likes) {
    public LikesAddedMessage {
        Objects.requireNonNull(id);
        Objects.requireNonNull(likes);
    }

    public Long getId() {
        return id;
    }

    public Integer getLikes() {
        return likes;
    }
}
