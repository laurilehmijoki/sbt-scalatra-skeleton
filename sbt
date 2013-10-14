#!/bin/bash

export SBT_OPTS="-XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256M"
exec java -Xmx1024M ${SBT_OPTS} -jar project/sbt-launch-0.12.3.jar "$@"
