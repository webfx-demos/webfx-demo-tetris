// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.demo.tetris.application.application {

    // Direct dependencies modules
    requires java.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires webfx.extras.scalepane;
    requires webfx.kit.util.scene;
    requires webfx.platform.audio;
    requires webfx.platform.resource;
    requires webfx.platform.shutdown;
    requires webfx.platform.storage;
    requires webfx.platform.useragent;

    // Exported packages
    exports eu.hansolo.fx.tetris;

    // Resources packages
    opens eu.hansolo.fx.tetris;

    // Provided services
    provides javafx.application.Application with eu.hansolo.fx.tetris.Main;

}