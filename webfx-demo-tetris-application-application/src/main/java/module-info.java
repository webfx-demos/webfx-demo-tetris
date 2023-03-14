// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.demo.tetris.application.application {

    // Direct dependencies modules
    requires java.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.media;

    // Exported packages
    exports eu.hansolo.fx.tetris;

    // Resources packages
    opens eu.hansolo.fx.tetris;

    // Provided services
    provides javafx.application.Application with eu.hansolo.fx.tetris.Main;

}