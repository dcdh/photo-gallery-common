package com.redhat.photogallery.common.data;

import java.util.Objects;

public record PhotoCreatedMessage(Long id, String name, String category) {
    public PhotoCreatedMessage {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        Objects.requireNonNull(category);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
