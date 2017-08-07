#!/bin/bash
rm -rf dist
jlink --module-path app/target/app-1.0-SNAPSHOT.jar:client/target/client-1.0-SNAPSHOT.jar:client-needs/target/client-needs-1.0-SNAPSHOT.jar:simple-repo/target/simple-repo-1.0-SNAPSHOT.jar:/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/jmods\
 --add-modules io.crystalline.jigsaw.app\
 --output dist/jimage\
 --compress=2\
 --no-header-files\
 --no-man-pages\
 --launcher start=io.crystalline.jigsaw.app/io.crystalline.jigsaw.Application
