/*
 * at.tugraz.ist.ase.fm - A Maven package for feature models
 *
 * Copyright (c) 2021.
 *
 * @author: Viet-Man Le (vietman.le@ist.tugraz.at)
 */

package at.tugraz.ist.ase.fm.core;

import lombok.*;

/**
 * Represents a feature of a feature model
 */
@Builder
@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class Feature {

    /**
     * Name of feature
     */
    private @NonNull String name;

    /**
     * ID of feature
     */
    private String id;

    public boolean isIdDuplicate(@NonNull String id) {
        if (this.id == null) {
            return false;
        }
        return this.id.equals(id);
    }

    public boolean isNameDuplicate(@NonNull String name) {
        return this.name.equals(name);
    }

    public boolean isDuplicate(@NonNull Feature feature) {
        return isIdDuplicate(feature.id) && isNameDuplicate(feature.name);
    }

    /**
     * Returns the name of the feature.
     *
     * @return name of the feature
     */
    @Override
    public String toString() {
        return name;
    }
}
