#!/bin/sh
source /etc/profile
logserver=`ps -ef |grep dev-app-1.0-SNAPSHOT.jar | grep -v grep | awk '{print $2}'`
kill -9 $logserver
cd