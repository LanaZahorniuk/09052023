package org.example._2023_08_30.enumExample;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Teachers {
    private String name;
    private String lastName;
    private int experience;
    private TypeEnum teachers;

    public Teachers(String name, String lastName, int experience, TypeEnum teachers) {
        this.name = name;
        this.lastName = lastName;
        this.experience = experience;
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setExperience(int experience) {
        this.experience = experience;
    }

    public TypeEnum getTeachers() {
        return teachers;
    }

    public void setTeachers(TypeEnum teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return teachers + " Teachers name: " + name + " "+ lastName + ", experience - " + experience;
    }
}
