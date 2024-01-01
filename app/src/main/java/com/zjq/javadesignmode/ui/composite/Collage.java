package com.zjq.javadesignmode.ui.composite;

import java.util.ArrayList;
import java.util.List;

public class Collage extends OrganizationComponent {
    List<OrganizationComponent> organizationComponents = new ArrayList<>();
    public Collage(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        super.add(organizationComponent);
        organizationComponents.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        super.remove(organizationComponent);
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void print() {
        System.out.println("-----------" + getName() + "-------------");
        for (OrganizationComponent component : organizationComponents) {
            component.print();
        }
    }
}
