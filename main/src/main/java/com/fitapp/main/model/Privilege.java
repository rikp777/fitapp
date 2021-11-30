package com.fitapp.main.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Table(name = "privileges")
public class Privilege extends Base {

    private String name;

    @ManyToMany(mappedBy = "privileges")
    private Set<Role> roles = new HashSet<>();
}
