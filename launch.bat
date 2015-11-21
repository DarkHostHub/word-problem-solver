@echo off

mode con: cols=130 lines=50
java -Xms512M -Xms512M -jar wps.jar -o true
PAUSE
