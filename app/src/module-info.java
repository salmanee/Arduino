module app {
    requires commons.compress;
    requires apple;
    requires batik;
    requires batik.anim;
    requires batik.awt.util;
    requires batik.bridge;
    requires batik.css;
    requires batik.dom;
    requires batik.gvt;
    requires batik.parser;
    requires batik.rasterizer;
    requires batik.script;
    requires batik.squiggle;
    requires batik.svg.dom;
    requires batik.svgpp;
    requires batik.transcoder;
    requires batik.util;
    requires batik.xml;
    requires bcprov.jdk15on;
    requires commons.codec;
    requires commons.exec;
    requires commons.httpclient;
    requires commons.lang3;
    requires commons.logging;
    requires commons.net;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires bcpg.jdk15on;
    requires com.fasterxml.jackson.module.mrbean;
    requires java.semver;
    requires jmdns;
    // requires jna;
    // requires jna.platform;
    requires jsch;
    requires jssc;
    requires rsyntaxtextarea;
    requires slf4j.api;
    requires slf4j.simple;
    requires xml.apis.ext;
    requires xmlgraphics.commons;
    requires java.desktop;
    requires arduinocore;
    requires java.logging;
    // requires java.scripting;

    exports processing.app1.syntax to test;
    exports processing.app1 to test;
    exports processing.app1.tools to test;
    exports cc.arduino1.contributions.libraries to test;
    exports cc.arduino1.contributions to test;

    // requires java.base;
}
