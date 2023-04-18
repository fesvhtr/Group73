package entity;

import util.IdGenerator;


public class Module {
    private final String id;
    private String name;
    private String type;
    private String spec;
    private String description;
    private float mark;
    private float credit;

    public Module(String name, String type, String spec, String description) {
        this.name = name;
        this.type = type;
        this.spec = spec;
        this.description = description;
        id = "PRO" + IdGenerator.getCode();
    }

    public Module(String id, String name, String type, String spec, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.spec = spec;
        this.description = description;
    }

    public Module(String id, String name, String type, String spec, float mark, float credit, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.spec = spec;
        this.mark = mark;
        this.credit = credit;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSpec() {
        return spec;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public float getCredit() {return credit;}

    public void setCredit(float credit) {this.credit = credit;}

}
