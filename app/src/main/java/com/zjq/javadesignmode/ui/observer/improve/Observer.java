package com.zjq.javadesignmode.ui.observer.improve;

import java.nio.FloatBuffer;

public interface Observer {
    void update(float temperature,float pressure, float humidity);
}
